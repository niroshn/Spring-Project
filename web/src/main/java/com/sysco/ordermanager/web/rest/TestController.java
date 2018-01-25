package com.sysco.ordermanager.web.rest;

import com.sysco.ordermanager.user.Model.User;
import com.sysco.ordermanager.user.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    UserService userService;

    @RequestMapping(value="/abc", method= RequestMethod.GET)
    public String check() {

        userService.saveUser(new User());

        return "abxxxx";
    }
}
