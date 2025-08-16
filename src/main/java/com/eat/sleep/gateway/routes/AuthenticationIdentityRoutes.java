package com.eat.sleep.gateway.routes;

import static org.springframework.cloud.gateway.server.mvc.handler.GatewayRouterFunctions.route;
import static org.springframework.cloud.gateway.server.mvc.handler.HandlerFunctions.http;
import static org.springframework.cloud.gateway.server.mvc.predicate.GatewayRequestPredicates.path;


import com.eat.sleep.gateway.config.property.AuthIdentityServiceProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

@Configuration
public class AuthenticationIdentityRoutes {

    @Bean
    RouterFunction<ServerResponse> routeAuthenticationService(AuthIdentityServiceProperty servicesProperty) {
        return route()
                .route(path("/auth-entity/**"), http(servicesProperty.url()))
                .build();
    }
}
