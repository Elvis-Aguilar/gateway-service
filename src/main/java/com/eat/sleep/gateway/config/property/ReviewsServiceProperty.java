package com.eat.sleep.gateway.config.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("route.services.reviews")
public record ReviewsServiceProperty(
        String url
) {
}
