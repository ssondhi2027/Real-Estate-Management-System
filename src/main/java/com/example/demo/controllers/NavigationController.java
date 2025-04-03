package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
// NavigationController handles the routing of various pages in the application.
 
@Controller
public class NavigationController {
    
    @GetMapping("/index")
    public String home() {
        return "index";  // Looks for index.html in src/main/resources/templates/
    }

    @GetMapping("/propertiesimages")
    public String propertiesImages() {
        return "propertiesimages"; // Looks for propertiesimages.html in src/main/resources/templates/
    }

    @GetMapping("/agents")
    public String agents() {
        return "agents"; // Ensure agents.html exists
    }

    @GetMapping("/pricing")
    public String pricing() {
        return "pricing"; // Ensure pricing.html exists
    }

    @GetMapping("/houseone")
    public String houseOne() {
        return "houseone"; // Ensure houseone.html exists
    }

    @GetMapping("/housetwo")
    public String houseTwo() {
        return "housetwo"; // Ensure housetwo.html exists
    }

    @GetMapping("/housethree")
    public String houseThree() {
        return "housethree"; // Ensure housethree.html exists
    }

    @GetMapping("/housefour")
    public String houseFour() {
        return "housefour"; // Ensure housefour.html exists
    }

    @GetMapping("/userform")
    public String userform() {
        return "userform"; // Ensure houseone.html exists
    }

    @PostMapping("/index")
    public String handleFormSubmission(@RequestParam String user_id, @RequestParam String name,
                                        @RequestParam String email, @RequestParam String phone,
                                        @RequestParam String role) {
        // Process the form data here
        return "index"; // Return the view name to render after submission
    }
}
