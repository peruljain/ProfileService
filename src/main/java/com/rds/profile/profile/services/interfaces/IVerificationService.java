package com.rds.profile.profile.services.interfaces;

import com.rds.profile.profile.dtos.VerificationRequest;
import com.rds.profile.profile.dtos.VerificationResponse;

public interface IVerificationService {
    public VerificationResponse verify(VerificationRequest request);
}
