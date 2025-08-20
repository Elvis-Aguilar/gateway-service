package com.eat.sleep.gateway.config.property;

import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties("route.services.hotel")
public record HotelServiceProperty(
        String url
) {
}