package com.eat.sleep.gateway.config.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("route.services.finance")
public record FinanceServiceProperty(
        String url
) {
}
