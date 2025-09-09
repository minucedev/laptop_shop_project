package com.example.laptop_shop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "main";
    }
    @GetMapping("/user")
    public String userPage() {
        return "This is user page";
    }
    @GetMapping("/admin")
    public String adminPage() {
        return "This is admin page";
    }

}
