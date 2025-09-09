package com.example.laptop_shop.controller;

import com.example.laptop_shop.domain.User;
import com.example.laptop_shop.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//Mô hình MVC
@Controller
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @RequestMapping("/")
    public String getHomePage(Model model) {
        String test = this.userService.handleHello();
        model.addAttribute("minuce", test);
        model.addAttribute("hello", "met qua di mat");
        return "hello";
    }

    @RequestMapping("/admin/user")
    public String createAccount(Model model) {
        model.addAttribute("newUser", new User());
        return "admin/user/create";
    }

    @RequestMapping(value = "/admin/user/create1", method = RequestMethod.POST)
    public String create(Model model, @ModelAttribute("newUser") User minuce) {
        System.out.println(minuce);
        return "hello";
    }


}
