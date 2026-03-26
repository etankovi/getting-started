package org.acme;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class GreetingService {

    @Transactional
    public GreetingEntity createGreeting(String message) {
        GreetingEntity greeting = new GreetingEntity(message);
        greeting.persist();
        return greeting;
    }
}