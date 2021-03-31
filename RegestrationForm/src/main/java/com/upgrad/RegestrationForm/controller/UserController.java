package com.upgrad.RegestrationForm.controller;

import com.upgrad.RegestrationForm.model.User;
import com.upgrad.RegestrationForm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.*;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String login(Model model)
    {
        User user = new User();
        model.addAttribute("user", user);
        return "index";
    }


    @RequestMapping(method = RequestMethod.POST, value = "/users/registration")
    public String userRegistration(User user) {
        userService.registerUser(user);
        return "index";

    }

}
