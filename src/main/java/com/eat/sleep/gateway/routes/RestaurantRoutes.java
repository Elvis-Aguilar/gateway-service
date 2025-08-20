package com.eat.sleep.gateway.routes;

import com.eat.sleep.gateway.config.property.RestaurantServiceProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

import static org.springframework.cloud.gateway.server.mvc.handler.GatewayRouterFunctions.route;
import static org.springframework.cloud.gateway.server.mvc.handler.HandlerFunctions.http;
import static org.springframework.cloud.gateway.server.mvc.predicate.GatewayRequestPredicates.path;

@Configuration
public class RestaurantRoutes {

    @Bean
    RouterFunction<ServerResponse> routeRestaurantService(RestaurantServiceProperty servicesProperty) {
        return route()
                .route(path("/restaurant/**"), http(servicesProperty.url()))
                .build();
    }
}
