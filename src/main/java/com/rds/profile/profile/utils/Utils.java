package com.rds.profile.profile.utils;

import org.springframework.security.core.parameters.P;
import org.springframework.security.crypto.bcrypt.BCrypt;

public class Utils {
    public static String getHash(String chainCode, String salt){
        try {
            String hash = BCrypt.hashpw(chainCode, salt);
            return hash;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
