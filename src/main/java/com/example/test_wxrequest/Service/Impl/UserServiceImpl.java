package com.example.test_wxrequest.Service.Impl;

import com.example.test_wxrequest.Service.IUserService;
import com.example.test_wxrequest.domain.Users;
import com.example.test_wxrequest.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public boolean login(String user_name, String user_pwds) {
        Users users = new Users();
        users.setUser_name(user_name);
        users.setUser_pwds(user_pwds);
        Users allUsers = this.usersMapper.findAllUsers(users);
        if (allUsers != null){
            return true;
        }
        return false;
    }

}
