package org.acme;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class GreetingEntity extends PanacheEntity {
    public String message;

    public GreetingEntity() {}
    public GreetingEntity(String message) {
        this.message = message;
    }
}