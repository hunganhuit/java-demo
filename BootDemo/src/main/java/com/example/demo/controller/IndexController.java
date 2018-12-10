package com.example.demo.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Controller
public class IndexController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping("/index")
    public String index2(final Model model) {
        model.addAttribute("message", "hello");
        return "index2";
    }

    @RequestMapping({"/dashboard", "/movies", "/detail/{id:\\w+}"})
    public String index3(final Model model) {
        return "forward:/index.html";
    }
    
    @RequestMapping({"/login"})
    public String index4(final Model model) {
        return "forward:/index.html";
    }

//    @RequestMapping(value = "/login", method = RequestMethod.GET)
//    public String login(final Model model, @RequestParam(value = "error", required = false) String error,
//            @RequestParam(value = "logout", required = false) String logout) {
//        System.out.println("ok");
//        if (error != null) {
//            model.addAttribute("msg", "Invalid username and password! Do you have account?");
//        }
//        if (logout != null) {
//            model.addAttribute("msg", "You've been logged out successfully.");
//        }
//        return "login";
//    }


    @RequestMapping("/welcome")
    public String welcome(final Model model) {
        model.addAttribute("title", "Welcome");
        model.addAttribute("message", "This is welcome page!");
        return "welcome";
    }

    @RequestMapping("/user")
    public String user(final Model model) {
        model.addAttribute("title", "Welcome");
        model.addAttribute("message", "This is admin page!");
        return "welcome";
    }

    @RequestMapping("/admin")
    public String admin(final Model model) {
        model.addAttribute("title", "Welcome");
        model.addAttribute("message", "This is admin page!");
        return "welcome";
    }

    @RequestMapping("/403")
    public String page403(final Model model, Principal principal) {
        model.addAttribute("title", "403");
        model.addAttribute("message", "Access denied");
        return "403";
    }

    @RequestMapping("/index1")
    public User index1(final Model model) {

        return userRepository.findByUsername("admin");
    }



}
