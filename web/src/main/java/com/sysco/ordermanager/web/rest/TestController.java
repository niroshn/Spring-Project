package com.sysco.ordermanager.web.rest;

import com.sysco.ordermanager.user.model.User;
import com.sysco.ordermanager.user.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    UserService userService;

//    @RequestMapping(value="/abc", method= RequestMethod.GET)
//    public String check(@RequestParam("id") Integer id) {
//
//        userService.saveUser(new User(id));
//
//        return "abxxxx";
//    }

    @RequestMapping(value="/abc", method= RequestMethod.GET)
    public String check() {

        return String.valueOf(userService.findAllUsers());
    }


    @RequestMapping(value="/bbb", method= RequestMethod.GET)
    public String checkB(@RequestParam("id") Integer id) {

//        userService.saveUser(new User(id));

        return "abxxxx";
    }
}
