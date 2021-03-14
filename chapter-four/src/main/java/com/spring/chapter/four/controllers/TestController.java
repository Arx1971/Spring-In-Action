package com.spring.chapter.four.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class TestController {

    @RequestMapping(path = "/show", method = RequestMethod.GET)
    public String showHomePage(){
        return "This is your home page";
    }

}
