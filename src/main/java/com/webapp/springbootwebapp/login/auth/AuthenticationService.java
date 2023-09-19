package com.webapp.springbootwebapp.login.auth;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public AuthenticationService() {
    }

    public boolean authenticate(String username, String password){
        return username.equals("admin") && password.equals("admin");
    }
}
