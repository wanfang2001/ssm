package com.zking.shiro;


import com.zking.model.Users;
import com.zking.service.IUsersMapperService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class ShiroRealm extends AuthorizingRealm {

    @Autowired
    private IUsersMapperService iUsersMapperService;

    /**
     * 授权认证
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
       //获取用户名
        String username =  principalCollection.getPrimaryPrincipal().toString();
        //得到用户角色名
        Set<String> role = iUsersMapperService.findRole(username);
        //得到用户权限信息
        Set<String> permission = iUsersMapperService.findPermission(username);
        //设置安全数据库中关于角色以及权限的内容
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        simpleAuthorizationInfo.setRoles(role);
        simpleAuthorizationInfo.setStringPermissions(permission);
        return simpleAuthorizationInfo;
    }


    /**
     * 身份认证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
       //获取账号
        String username = authenticationToken.getPrincipal().toString();
        //获取密码
        String password = authenticationToken.getCredentials().toString();
        //根据用户账号到数据库找到对应的用户信息
        Users users = iUsersMapperService.userLogin(username);
        //判断该用户是否存在
        if(null == users){
            throw  new RuntimeException("没有这个用户！！！！");
        }
        //将数据库的数据交给shiro进行匹配
        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(
                users.gettUsersName(),
                users.gettUsersPassword(),
                ByteSource.Util.bytes(users.gettUsersSale()),
                this.getName()
        );

        return simpleAuthenticationInfo;
    }
}
