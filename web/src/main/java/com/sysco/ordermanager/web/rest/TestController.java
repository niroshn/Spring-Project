package com.sysco.ordermanager.web.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @RequestMapping(value="/abc", method= RequestMethod.GET)
    public String check() {
        return "abxxxx";
    }
}
