package com.aiwine.simple.interceptor.controller;

import com.aiwine.simple.interceptor.model.Home;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping
    public String getHome(@RequestAttribute("home") Home home) {

        return "home " + home.getName();
    }

}
