package com.example.lab12;

import org.junit.Test;
import org.junit.jupiter.api.function.Executable;

import static java.time.Duration.ofMillis;
import static java.time.Duration.ofSeconds;
import static org.junit.jupiter.api.Assertions.assertTimeout;

public class AnimalsTest {

    @Test
    public void getAnimals() {
    }

    @Test
    public void setResults() {
    }

    @Test
    public void loadByURL() {
    }
    @org.junit.Test(timeout = 10)
    public void getRandomAnimal() {

    }

    @Test
    public void whenAssertingTimeout_thenNotExceeded() {
        assertTimeout(
                ofMillis(10),
                () -> {
                    getRandomAnimal();
                }
        );
    }
}