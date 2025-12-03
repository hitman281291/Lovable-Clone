package com.springboot.project.lovable_clone.services;

import com.springboot.project.lovable_clone.dto.subscription.PlanResponse;

import java.util.List;

public interface PlanService {
    List<PlanResponse> getAllActivePlans();
}
