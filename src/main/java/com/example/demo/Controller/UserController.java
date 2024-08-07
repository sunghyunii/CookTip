package com.example.demo.Controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/CookTip")
@Log4j2

public class UserController {
    @GetMapping("/userRegist")
    public void userRegist() {
        log.info("userRegist.........");
    }
}
