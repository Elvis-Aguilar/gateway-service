package com.eat.sleep.gateway.routes;

import com.eat.sleep.gateway.config.property.FinanceServiceProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

import static org.springframework.cloud.gateway.server.mvc.handler.GatewayRouterFunctions.route;
import static org.springframework.cloud.gateway.server.mvc.handler.HandlerFunctions.http;
import static org.springframework.cloud.gateway.server.mvc.predicate.GatewayRequestPredicates.path;

@Configuration
public class FinanceRoutes {

    @Bean
    RouterFunction<ServerResponse> routeFinanceService(FinanceServiceProperty servicesProperty) {
        return route()
                .route(path("/finance/**"), http(servicesProperty.url()))
                .build();
    }
}
