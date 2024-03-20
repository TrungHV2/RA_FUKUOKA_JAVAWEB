package com.ra.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/computers")
public class ComputersController {
    @GetMapping(value = {"", "/index"})
    public String index() {
        return "computers/index";
    }
}
