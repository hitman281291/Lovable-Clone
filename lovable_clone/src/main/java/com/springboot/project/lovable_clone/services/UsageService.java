package com.springboot.project.lovable_clone.services;

import com.springboot.project.lovable_clone.dto.subscription.UsageTodayResponse;
import com.springboot.project.lovable_clone.dto.subscription.PlanLimitsResponse;
import org.jspecify.annotations.Nullable;

public interface UsageService {
    UsageTodayResponse getTodayUsage(Long userId);

    PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId);
}
