package com.rds.profile.profile.services;

import com.rds.profile.profile.dtos.VerificationRequest;
import com.rds.profile.profile.dtos.VerificationResponse;
import com.rds.profile.profile.services.interfaces.IVerificationService;
import com.rds.profile.profile.utils.Constants;
import com.rds.profile.profile.utils.Utils;
import org.springframework.stereotype.Service;

@Service
public class VerificationService implements IVerificationService {

    @Override
    public VerificationResponse verify(VerificationRequest request) {
        String salt = request.getSalt();
        String chainCode = Constants.chainCode;
        String hash = Utils.getHash(chainCode, salt);
        return new VerificationResponse(hash);
    }
}
