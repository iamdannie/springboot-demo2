package com.launchcode.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
    @GetMapping()
    public String homePage() {
        return "index";
    }
    @GetMapping("hello")
//    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String displayUserInfoForm() {
        return "user-info";
    }
    @PostMapping("hello")
    public String processUserInfoForm(Model model, @RequestParam String name/*int age*/){
        model.addAttribute("name", name);
//        model.addAttribute("age", age);
        return "redirect:";
    }

}
