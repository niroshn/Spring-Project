package com.sysco.ordermanager.login.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping(value="/login", method= RequestMethod.GET)
    public String check() {
        return "login";
    }

    @RequestMapping(value="/", method= RequestMethod.GET)
    public String index() {
        return "index";
    }
}
