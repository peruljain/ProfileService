package com.rds.profile.profile.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HealthController {

    @GetMapping(path = "/health")
    public ResponseEntity<String> checkHealth() {
        return new ResponseEntity<>("Service is running", HttpStatus.OK);
    }

}
