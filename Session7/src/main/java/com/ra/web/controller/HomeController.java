package com.ra.web.controller;

import com.ra.web.entity.Computer;
import com.ra.web.repository.ComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/home")
public class HomeController {
    @Autowired
    private ComputerRepository computerRepository;

    @GetMapping(value = {"", "/index"})
    public String index(Model model) {
        List<Computer> data = computerRepository.findAll();
        List<Computer> data1 = computerRepository.findAllByNameContains("máy");
        List<Computer> data2 = computerRepository.findByComputerName("Máy 01");
        List<Computer> data3 = computerRepository.findAllByComputerNameContains("%01%");
        model.addAttribute("txt", "Hoàng Văn Trung");
        return "home/index";
    }
}
