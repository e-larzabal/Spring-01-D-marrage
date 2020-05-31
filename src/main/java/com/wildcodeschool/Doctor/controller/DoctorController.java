package com.wildcodeschool.Doctor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {

    // Route n°1 : mapping /doctor/1 : la page affiche "William Hartnell"
    @GetMapping("/doctor/1")
    @ResponseBody
    public String printDocto1() {
        return "William Hartnell";
    }

    // Route n°2 : mapping /doctor/10 : la page affiche "David Tennant"
    @GetMapping("/doctor/10")
    @ResponseBody
    public String printDocto10() {
        return "David Tennant";
    }

    // Route n°3 : mapping /doctor/13 : la page affiche "Jodie Whittaker"
    @GetMapping("/doctor/13")
    @ResponseBody
    public String printDocto13() {
        return "Jodie Whittaker";
    }

}
