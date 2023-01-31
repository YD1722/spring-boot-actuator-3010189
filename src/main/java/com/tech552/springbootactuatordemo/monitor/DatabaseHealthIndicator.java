package com.tech552.springbootactuatordemo.monitor;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class DatabaseHealthIndicator implements HealthIndicator {
    @Override
    public Health health() {
        if (isDBHealthy()) {
            return Health.up().withDetail("ext:h2", "UP").build();
        } else {
            return Health.down().withDetail("ext:h2", "down").build();
        }
    }

    private boolean isDBHealthy() {
        Random random = new Random();
        return random.nextBoolean();
    }
}
