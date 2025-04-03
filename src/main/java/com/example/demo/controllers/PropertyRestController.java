package com.example.demo.controllers;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/properties")
public class PropertyRestController {
    
    @GetMapping
    public List<String> getProperties() {
        return Arrays.asList(
            "Sale of home near Wanless Park",
            "Sale of home near Gage Park",
            "Sale of home near Chinguacousy Park",
            "Sale of home near Trinity Commons"
        );
    }
}
