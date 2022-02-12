package com.rds.profile.profile.controller;

import com.rds.profile.profile.dtos.VerificationRequest;
import com.rds.profile.profile.dtos.VerificationResponse;
import com.rds.profile.profile.services.interfaces.IVerificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.StreamingHttpOutputMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class VerificationController {

    @Autowired
    private IVerificationService verificationService;

    @PostMapping("/verify")
    public ResponseEntity<VerificationResponse> verify(@RequestBody VerificationRequest request) {
        VerificationResponse response = verificationService.verify(request);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
