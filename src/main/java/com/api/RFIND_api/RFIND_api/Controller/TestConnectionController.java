package com.api.RFIND_api.RFIND_api.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test-connection")
public class TestConnectionController {

    @GetMapping
    public String testConnection(){
        return "The API is Online!";
    }
}
