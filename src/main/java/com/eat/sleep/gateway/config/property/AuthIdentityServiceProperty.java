package com.eat.sleep.gateway.config.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("route.services.auth-identity")
public record AuthIdentityServiceProperty(
        String url
) {
}
