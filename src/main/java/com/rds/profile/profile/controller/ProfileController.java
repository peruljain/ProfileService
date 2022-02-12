package com.rds.profile.profile.controller;

import com.rds.profile.profile.dtos.ProfileResponse;
import com.rds.profile.profile.services.interfaces.IProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfileController {

    @Autowired
    private IProfileService profileService;

    @GetMapping("/profile")
    public ResponseEntity<ProfileResponse> getProfile() {
        ProfileResponse profileResponse = profileService.getProfile();
        return new ResponseEntity<ProfileResponse>(profileResponse, HttpStatus.OK);
    }
}
