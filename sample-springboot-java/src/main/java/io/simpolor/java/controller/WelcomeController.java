package io.simpolor.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {

    @RequestMapping({"/", "/index", "/welcome"})
    @ResponseBody
    public String welcome() {
        return "Springboot Sample Java";
    }

    @RequestMapping({"/hello"})
    public String hello() {
        return "hello";
    }
}
