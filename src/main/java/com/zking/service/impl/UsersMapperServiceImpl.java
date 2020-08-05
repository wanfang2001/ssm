package com.zking.service.impl;

import com.zking.mapper.UsersMapper;
import com.zking.model.Users;
import com.zking.service.IUsersMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UsersMapperServiceImpl implements IUsersMapperService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public Users userLogin(String tUsersName) {
        return usersMapper.userLogin(tUsersName);
    }

    @Override
    public Set<String> findRole(String tUsersName) {
        return usersMapper.findRole(tUsersName);
    }

    @Override
    public Set<String> findPermission(String tUsersName) {
        return usersMapper.findPermission(tUsersName);
    }
}
