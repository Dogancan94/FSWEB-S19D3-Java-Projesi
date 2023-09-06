package com.workintech.security.secureApp.controller;

import com.workintech.security.secureApp.dto.LoginRequest;
import com.workintech.security.secureApp.dto.LoginResponse;
import com.workintech.security.secureApp.dto.RegistrationMember;
import com.workintech.security.secureApp.entity.Member;
import com.workintech.security.secureApp.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private AuthenticationService authenticationService;

    @Autowired
    public AuthController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("/register")
    public Member register(@RequestBody RegistrationMember registrationMember){
        return authenticationService.register(registrationMember.getEmail(),
                registrationMember.getPassword());
    }

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest loginRequest){
        return authenticationService.login(loginRequest.getEmail(),
                loginRequest.getPassword());
    }
}
