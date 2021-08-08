package com.example.demobackend.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
//@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TestController {

    @GetMapping
    public ResponseEntity getMessage(){

        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.CONTENT_TYPE, "application/json; charset=UTF-8");

        return ResponseEntity.ok()
                .body("Hello " + System.getenv("name"));
    }
}
