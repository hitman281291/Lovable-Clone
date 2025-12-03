package com.springboot.project.lovable_clone.services;

import com.springboot.project.lovable_clone.dto.auth.AuthResponse;
import com.springboot.project.lovable_clone.dto.auth.LoginRequest;
import com.springboot.project.lovable_clone.dto.auth.SignupRequest;

public interface AuthService {
    String signUp(SignupRequest signupRequest);

   AuthResponse signup(SignupRequest request);

   AuthResponse login(LoginRequest request);
}
