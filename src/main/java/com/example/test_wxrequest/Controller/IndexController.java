package com.example.test_wxrequest.Controller;

import com.example.test_wxrequest.Service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    //logintest小程序的后台

    @Autowired
    private IUserService userService;

    @RequestMapping("/login")
    public boolean login(String user_name,String user_pwds){
        System.out.println("用户名："+user_name+"  ....用户密码："+user_pwds);
        boolean login = this.userService.login(user_name, user_pwds);
        System.out.println(login);
        if (login){
            return true;
        }
        return false;
    }

    @RequestMapping("/count")
    public Integer count(Integer t1,Integer t2){
        Integer t3=t1+t2;
        System.out.println("a："+t1+"  ....b："+t2);
        return t3;
    }

}
