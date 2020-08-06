package com.zking.controller;

import com.zking.model.Users;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller
@RequestMapping("users")
public class UsersController {
  @RequestMapping(value="/Login")
  @ResponseBody
  public String userLogin(Users users, Model model){
    //拿到shiro的主体对象
    Subject subject = SecurityUtils.getSubject();
    //将前端传递过来的用户账号和密码封装到令牌中准备验证
    UsernamePasswordToken token = new UsernamePasswordToken(
      users.gettUsersName(),
      users.gettUsersPassword()
    );
      /*  String msg = null;
        try {
           subject.login(token);
        } catch (AccountException e) {
            msg="账号错误！！！";
        }catch (IncorrectCredentialsException e){
            msg="密码错误！！！";
        }catch (Exception e){
            msg="报错了！！！";
        }
        if(null == msg){
            return "index";
        }else {
            model.addAttribute("msg",msg);
            return "login";
        }*/
    try{
      subject.login(token);
    }catch(Exception e){
//        System.out.println("登录失败：" + e.getMessage());
      return  "0";
    }
    return "1";
  }

}
