package com.auth.auth.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("api/v1")
public class Healthcheck {

    @GetMapping("healthcheck")
    public ResponseEntity healthcheck(){
        return ResponseEntity.ok("ok");
    }
}
