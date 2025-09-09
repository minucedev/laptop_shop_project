package com.example.laptop_shop.controller;

import com.example.laptop_shop.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Mô hình MVC
//@Controller
//public class UserController {
//
//    @RequestMapping("/")
//    public String getHomePage() {
//        return "HOME PAGE";
//    }
//}

//Mô hình RestfulAPI
@RestController
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public String getHomePage() {
        return this.userService.handleHello();
    }
}