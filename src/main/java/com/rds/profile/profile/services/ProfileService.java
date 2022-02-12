package com.rds.profile.profile.services;

import com.rds.profile.profile.dtos.ProfileResponse;
import com.rds.profile.profile.services.interfaces.IProfileService;
import org.springframework.stereotype.Service;

@Service
public class ProfileService implements IProfileService {
    @Override
    public ProfileResponse getProfile() {
        String firstName = "Perul";
        String lastName = "Jain";
        String email = "perul365@gmail.com";
        String phone = "789";
        Integer yoe = 1;
        String company = "salesforce";
        String designation = "AMTS";
        String githubId = "peruljain";
        String linkedId = "https://www.linkedin.com/in/perul-jain-55845b154/";
        String twitterId = "NIL";
        String instagramId = "NIL";
        String website = "https://criodo.github.io/Crio-Launch-Feb-2020-perul365/";
        try {
            ProfileResponse profileResponse = new ProfileResponse(firstName, lastName, email,
                    phone, yoe, company, designation, githubId, linkedId, twitterId, instagramId, website);
            return profileResponse;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;
    }
}
