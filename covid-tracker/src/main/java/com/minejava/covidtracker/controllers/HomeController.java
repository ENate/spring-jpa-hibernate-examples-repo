package com.minejava.covidtracker.controllers;
import java.util.List;

import com.minejava.covidtracker.models.LocationStats;
import com.minejava.covidtracker.services.CovidDataService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller // Not as a rest controller
public class HomeController {

    // Autowire the allStats from the service class
    @Autowired
    CovidDataService covidDataService;

    /**
    @ModelAttribute("module")
    public String module() {
        return "welcome";
    } */

    @GetMapping("/")
    public String welcome(){
        return "welcome.html";
    }

    //Create home and render a home template. It maps to the home html file.
    // Specify the template : home via the / directory.
    // Add spring Model for rendering
    @GetMapping("/cases/allstats")
    public String home(Model model){
        // Do something
        List<LocationStats> allStats = covidDataService.getAllStats();
        int totalReportedCases = allStats.stream().mapToInt(stat -> stat.getLatestTotalCases()).sum();
        int totalNewCases = allStats.stream().mapToInt(stat -> stat.getDiffFromPrevDay()).sum();
        model.addAttribute("locationStats", allStats);
        model.addAttribute("totalReportedCases", totalReportedCases);
        model.addAttribute("totalNewCases", totalNewCases);
        return "cases/home";
    }

    @GetMapping("/recover/cases")
    public String recovered() {
        return "recover/recovered_cases";
    }
}
