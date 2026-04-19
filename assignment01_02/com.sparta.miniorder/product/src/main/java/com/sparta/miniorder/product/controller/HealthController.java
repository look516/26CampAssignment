package com.sparta.miniorder.product.controller;

import jakarta.persistence.EntityManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    // Server Health Test
    @GetMapping("/health")
    public String health() {
        return "ok";
    }

    // DB Health Test
    @PostMapping("/test")
    public String test(EntityManager em) {
        return "ok";
    }
}
