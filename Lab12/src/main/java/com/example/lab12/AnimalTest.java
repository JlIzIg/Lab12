package com.example.lab12;

import org.junit.Test;
import org.junit.rules.Timeout;

import static java.time.Duration.ofSeconds;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTimeout;

public class AnimalTest {
    @Test
    public void createObject()
    {
        Animal animal = new Animal(1, "  Southern Copperhead  ", "Agkistrodon contortrix contortix", "Reptile", "Diurnal   ", 4.0, 4.5,  0.5, 0.75, 18.0, "Woodlands and rocky hillsides","Small mammals, birds, frogs, and insects", "Central and Eastern United States", "https://upload.wikimedia.org/wikipedia/commons/c/ce/Copperhead_%28Agkistrodon_contortrix%29_photographed_in_Liberty_Co.%2C_Texas._W._L._Farr.jpg" );
        assertEquals("Southern Copperhead", animal.getName());
        assertNotEquals(2, animal.getId());
        assertEquals("Southern Copperhead", animal.getName());
        assertEquals("Diurnal", animal.getActiveTime());



    }

    @Test
    public void whenAssertingTimeout_thenNotExceeded() {
        assertTimeout(
                ofSeconds(2),
                () -> {
                    createObject();
                }
        );
    }

    @Test
    public void getName() {


    }

    @Test
    public void setName() {
        Animal animal = new Animal(1, "  Southern Copperhead  ", "Agkistrodon contortrix contortix", "Reptile", "Diurnal   ", 4.0, 4.5,  0.5, 0.75, 18.0, "Woodlands and rocky hillsides","Small mammals, birds, frogs, and insects", "Central and Eastern United States", "https://upload.wikimedia.org/wikipedia/commons/c/ce/Copperhead_%28Agkistrodon_contortrix%29_photographed_in_Liberty_Co.%2C_Texas._W._L._Farr.jpg" );
        animal.setName(" Southern Copperhead  ");
        assertEquals("Southern Copperhead", animal.getName());
        animal.setName("  Southern Copperhead  ");
        assertEquals("Southern Copperhead", animal.getName());
        animal.setName(" Southern Copperhead   ");
        assertEquals("Southern Copperhead", animal.getName());
    }

    @Test
    public void getLatinName() {
    }

    @Test
    public void setLatinName() {
        Animal animal = new Animal(1, "  Southern Copperhead  ", "  Agkistrodon contortrix contortix  ", "Reptile", "Diurnal   ", 4.0, 4.5,  0.5, 0.75, 18.0, "Woodlands and rocky hillsides","Small mammals, birds, frogs, and insects", "Central and Eastern United States", "https://upload.wikimedia.org/wikipedia/commons/c/ce/Copperhead_%28Agkistrodon_contortrix%29_photographed_in_Liberty_Co.%2C_Texas._W._L._Farr.jpg" );
        animal.setName(" Agkistrodon contortrix contortix  ");
        assertEquals("Agkistrodon contortrix contortix", animal.getLatinName());
        animal.setLatinName("  Agkistrodon contortrix contortix  ");
        assertEquals("Agkistrodon contortrix contortix", animal.getLatinName());
        animal.setLatinName(" Agkistrodon contortrix contortix   ");
        assertEquals("Agkistrodon contortrix contortix", animal.getLatinName());
    }

    @Test
    public void getAnimalType() {
    }

    @Test
    public void setAnimalType() {

        Animal animal = new Animal(1, "  Southern Copperhead  ", "  Agkistrodon contortrix contortix  ", "  Reptile", "Diurnal   ", 4.0, 4.5,  0.5, 0.75, 18.0, "Woodlands and rocky hillsides","Small mammals, birds, frogs, and insects", "Central and Eastern United States", "https://upload.wikimedia.org/wikipedia/commons/c/ce/Copperhead_%28Agkistrodon_contortrix%29_photographed_in_Liberty_Co.%2C_Texas._W._L._Farr.jpg" );
        animal.setAnimalType(" Reptile  ");
        assertEquals("Reptile", animal.getAnimalType());
        animal.setLatinName("  Agkistrodon contortrix contortix  ");
        assertEquals("Agkistrodon contortrix contortix", animal.getLatinName());
        animal.setLatinName(" Agkistrodon contortrix contortix   ");
        assertEquals("Agkistrodon contortrix contortix", animal.getLatinName());

    }

    @Test
    public void getActiveTime() {
    }

    @Test
    public void setActiveTime() {
    }

    @Test
    public void getLenMin() {
    }

    @Test
    public void setLenMin() {
    }

    @Test
    public void getLenMax() {
    }

    @Test
    public void setLenMax() {
    }

    @Test
    public void getWgMin() {
    }

    @Test
    public void setWgMin() {
    }

    @Test
    public void getWgMax() {
    }

    @Test
    public void setWgMax() {
    }

    @Test
    public void getLifespan() {
    }

    @Test
    public void setLifespan() {
    }

    @Test
    public void getHabitat() {
    }

    @Test
    public void setHabitat() {
    }

    @Test
    public void getDiet() {
    }

    @Test
    public void setDiet() {
    }

    @Test
    public void getGeoRange() {
    }

    @Test
    public void setGeoRange() {
    }

    @Test
    public void getImageLink() {
    }

    @Test
    public void setImageLink() {
    }

    @Test
    public void getId() {
    }

    @Test
    public void setId() {
    }
}