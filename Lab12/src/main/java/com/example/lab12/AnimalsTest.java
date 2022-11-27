package com.example.lab12;

import org.junit.Test;
import org.junit.jupiter.api.function.Executable;

import java.io.IOException;
import java.util.ArrayList;

import static java.time.Duration.ofMillis;
import static java.time.Duration.ofSeconds;
import static org.junit.jupiter.api.Assertions.assertTimeout;

public class AnimalsTest {

    @org.junit.Test(timeout = 300)
    public void getAnimals() {
        Animals animals = new Animals();
        animals.getAnimals();
    }

    @org.junit.Test(timeout = 300)
    public void setResults() {
        Animals animals = new Animals();
        ArrayList<Animal> animalArrayList = new ArrayList<>();
        animals.setResults(animalArrayList);
    }

    @org.junit.Test(timeout = 3000)
    public void loadByURL() throws IOException {
        Animals animals = new Animals();
        animals.loadByURL("https://zoo-animal-api.herokuapp.com/animals/rand/");
    }

    @org.junit.Test(timeout = 3000)
    public void getRandomAnimal() throws IOException {
        Animals animals = new Animals();
        animals.getRandomAnimal();
    }

    @Test
    public void whenAssertingTimeout_thenNotExceeded() {
        assertTimeout(
                ofMillis(3000),
                this::getRandomAnimal
        );
    }
}