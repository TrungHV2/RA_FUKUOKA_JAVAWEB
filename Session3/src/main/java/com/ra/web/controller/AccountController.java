package com.ra.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AccountController {
    /**
     * Form đăng ký tài khoản
     * @return
     */
    @GetMapping
    public String register() {
        return "";
    }

    /**
     * Đăng ký tài khoản người dùng gồm các thông tin:
     *  username: Không bỏ trống, 6-12 kí tự
     *  password: Không bỏ trống, 8-12 kí tự
     *  phone: Không bỏ trống, đúng định dạng SĐT Việt Nam
     *  birthday: Không bỏ trống, phải trên 18 tuổi
     * @param modelMap
     * @return
     */
    @PostMapping
    public String register(ModelMap modelMap) {
        return "";
    }
}
