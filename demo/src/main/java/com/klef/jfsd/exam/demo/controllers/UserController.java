package com.klef.jfsd.exam.demo.controllers;

import com.klef.jfsd.exam.demo.entities.User;
import com.klef.jfsd.exam.demo.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public String userDashboard() {
        return "user-dashboard";
    }

    @PostMapping("/user/updateProfile")
    public String updateNutrientProfile(@RequestParam double calories, @RequestParam double protein,
                                        @RequestParam double carbs, @RequestParam double fats) {
        // Update logic here
        return "redirect:/user";
    }
}
