package com.springboot.project.lovable_clone.services;

import com.springboot.project.lovable_clone.dto.auth.UserProfileResponse;

public interface UserService {
    UserProfileResponse getProfile(Long userId);
}
