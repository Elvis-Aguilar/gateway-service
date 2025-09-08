package com.eat.sleep.gateway.routes;

import com.eat.sleep.gateway.config.property.FinanceServiceProperty;
import com.eat.sleep.gateway.config.property.PromotionServiceProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

import static org.springframework.cloud.gateway.server.mvc.handler.GatewayRouterFunctions.route;
import static org.springframework.cloud.gateway.server.mvc.handler.HandlerFunctions.http;
import static org.springframework.cloud.gateway.server.mvc.predicate.GatewayRequestPredicates.path;

@Configuration
public class PromotionRoutes {

    @Bean
    RouterFunction<ServerResponse> routePromotionService(PromotionServiceProperty promotionServiceProperty) {
        return route()
                .route(path("/promotion/**"), http(promotionServiceProperty.url()))
                .build();
    }

}
