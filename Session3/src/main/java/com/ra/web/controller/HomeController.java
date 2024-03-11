package com.ra.web.controller;

import com.ra.web.model.RegisterAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/home")
public class HomeController {
    @GetMapping("/index")
    public String index(HttpServletRequest request, Model model) {
        HttpSession session = request.getSession();
        if (session.getAttribute("user") == null) {
            return "redirect:/home/login";
        }
        model.addAttribute("key", "VALUE");
        return "home/index";
    }

    @GetMapping("/login")
    public String login() {
        return "home/login";
    }
    @PostMapping("/login")
    public String login(@RequestParam("user") String user, @RequestParam("pass") String pwd, HttpServletRequest request, Model model) {
        if (user.equals("admin") && pwd.equals("1234")) {
            request.getSession().setAttribute("user", user);
        } else {
            model.addAttribute("msg", "Sai tài khoản hoặc mật khẩu!");
            return "home/login";
        }
        return "redirect:/home/index";
    }

    @GetMapping("/about")
    public ModelAndView about(@RequestParam("val") String val, HttpServletRequest request, Model model) {
        ModelAndView view = new ModelAndView("home/about");
        System.out.println(val);
        view.addObject("key", request.getParameter("val"));

        return view;
    }

    @GetMapping("/details/{id}")
    public ModelAndView details(@PathVariable("id") String id) {
        ModelAndView view = new ModelAndView("home/details");
        view.addObject("id", id);
        view.addObject("acc", new RegisterAccount());
        return view;
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("acc") RegisterAccount account, Model model) {
        model.addAttribute("data", account);
        return "home/info";
    }
}
