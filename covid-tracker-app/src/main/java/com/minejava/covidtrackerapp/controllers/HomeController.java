package com.minejava.covidtrackerapp.controllers;

import java.util.List;

import com.minejava.covidtrackerapp.models.LocationStats;
import com.minejava.covidtrackerapp.services.CoronaVirusDataService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @Autowired
    CoronaVirusDataService coronaVirusDataService;

    @GetMapping("/world/home")
    public String home(Model model) {
        List<LocationStats> allStats = coronaVirusDataService.getAllStats();
        int totalReportedCases = allStats.stream().mapToInt(stat -> stat.getLatestTotalCases()).sum();
        int totalNewCases = allStats.stream().mapToInt(stat -> stat.getDiffFromPrevDay()).sum();
        model.addAttribute("locationStats", allStats);
        model.addAttribute("totalReportedCases", totalReportedCases);
        model.addAttribute("totalNewCases", totalNewCases);

        return "world/home";
    }

    @GetMapping("/signup/signup")
    public String showSignUpForm() {
        return "signup/register";
    }
}
// https://github.com/codebyamir-zz/spring-boot-user-account-registration/blob/master/user-account-registration/src/main/resources/application.properties
