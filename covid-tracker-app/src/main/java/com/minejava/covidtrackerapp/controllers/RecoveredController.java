package com.minejava.covidtrackerapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RecoveredController {

    // Define the landing page for the controller

    @GetMapping("cases/recovered")
    public String recovered(){
        return "recovered/recovered_cases";
    }
}
