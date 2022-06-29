package com.javatechie.spring.validate.api.controller;

import com.javatechie.spring.validate.api.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class FormController {

    @GetMapping("/")
    public String showForm(Person person) {
        return "register";
    }

    @PostMapping("/")
    public String register(@Valid Person person, Errors errors, Model model) {
        if (errors.hasErrors()) {
            return "register";
        } else {
            model.addAttribute("message", "Registration successfully...");
            return "register";
        }

    }
}
