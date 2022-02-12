package com.rds.profile.profile.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;


import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Data
@RequiredArgsConstructor
public class ProfileResponse {

    @NonNull
    @JsonProperty("first_name")
    private final String firstName;
    @JsonProperty("last_name")
    @NonNull
    private final String lastName;
    @NonNull
    @Email
    private final String email;
    @NonNull
    @Size(min = 10, max = 10, message = "phone length should be equal to 10")
    private final String phone;
    @NonNull
    private final Integer yoe;
    @NonNull
    private final String company;
    @NonNull
    private final String designation;
    @JsonProperty("github_id")
    @NonNull
    private final String githubId;
    @NonNull
    @JsonProperty("linkedin_id")
    private final String linkedinId;
    @NonNull
    @JsonProperty("twitter_id")
    private final String twitterId;
    @NonNull
    @JsonProperty("instagram_id")
    private final String instagramId;
    @NonNull
    private final String website;


}
