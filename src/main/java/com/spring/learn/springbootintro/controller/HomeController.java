package com.spring.learn.springbootintro.controller;

import com.spring.learn.springbootintro.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "Hello world";
    }

//    @RequestMapping(value = "/user", method = RequestMethod.POST)
    @GetMapping("/user")
    public User user(){
        User user = new User();
        user.setId("1");
        user.setName("Kundan");
        user.setEmailId("kundankumar@gmail.com");
        return user;
    }

    @GetMapping("/{id}")
    public String pathVariable( @PathVariable String id){
        return "The path variable is : " + id;
    }

    @GetMapping("/requestParam")
    public String requestParams(@RequestParam String name, @RequestParam(required = false) String email){
        return "The request params is : " + name + "email is : " + email;
    }

}
