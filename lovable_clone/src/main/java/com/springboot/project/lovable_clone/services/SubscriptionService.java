package com.springboot.project.lovable_clone.services;

import com.springboot.project.lovable_clone.dto.subscription.CheckoutRequest;
import com.springboot.project.lovable_clone.dto.subscription.CheckoutResponse;
import com.springboot.project.lovable_clone.dto.subscription.PortalResponse;
import com.springboot.project.lovable_clone.dto.subscription.SubscriptionResponse;
import org.jspecify.annotations.Nullable;

public interface SubscriptionService {

    SubscriptionResponse getCurrentSubscription(Long userId);

    CheckoutResponse createCheckoutSessionUrl(Long userId, CheckoutRequest request);

    PortalResponse openCustomerPortal(Long userId);
}
