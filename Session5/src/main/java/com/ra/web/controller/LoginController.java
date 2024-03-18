package com.ra.web.controller;

import com.ra.web.model.entity.User;
import com.ra.web.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    private UserService userService;

    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
    @PostMapping("/login")
    public String login(@RequestParam("email") String email, @RequestParam("password") String password, HttpServletRequest request) {
        User user = userService.findSingle(x -> x.getEmail().equals(email) && x.getPassword().equals(password));
        if (user != null) {
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            return "redirect:/home/index";
        }
        return "login";
    }
    @GetMapping("/logout")
    public String logout(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.removeAttribute("user");
        return "redirect:/login";
    }
}
