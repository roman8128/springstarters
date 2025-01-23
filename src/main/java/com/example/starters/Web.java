package com.example.starters;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Web {

    @GetMapping
    public String getTest(){
        return "port test in properties";
    }
}
