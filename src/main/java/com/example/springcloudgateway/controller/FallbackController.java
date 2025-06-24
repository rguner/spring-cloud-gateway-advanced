package com.example.springcloudgateway.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@Slf4j
public class FallbackController {

    @GetMapping("/fallback-circuitbreaker")
    public Mono<String> fallbackCircuitBreaker() {

        log.info("Fallback triggered for circuit breaker");
        return Mono.just("Fallback: Service is temporarily unavailable.");
    }
}