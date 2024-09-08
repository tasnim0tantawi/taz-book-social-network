package com.tasnimt.taz_book_network_api.security;

import org.springframework.security.core.userdetails.UserDetails;

public class JwtService {
    public String generateToken(UserDetails userDetails) {
        return null;
    }

    public String getUsernameFromToken(String token) {
        return null;
    }

    public boolean validateToken(String token) {
        return false;
    }

}
