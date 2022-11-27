package com.example.lab12;

import org.junit.Test;
import org.junit.rules.Timeout;

import static java.time.Duration.ofSeconds;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTimeout;

public class AnimalTest {
    @org.junit.Test(timeout = 300)
    public void createObject() {
        Animal animal = new Animal(1, "  Southern Copperhead  ", "Agkistrodon contortrix contortix", "Reptile", "Diurnal   ", 4.0, 4.5, 0.5, 0.75, 18.0, "Woodlands and rocky hillsides", "Small mammals, birds, frogs, and insects", "Central and Eastern United States", "https://upload.wikimedia.org/wikipedia/commons/c/ce/Copperhead_%28Agkistrodon_contortrix%29_photographed_in_Liberty_Co.%2C_Texas._W._L._Farr.jpg");
        assertEquals("Southern Copperhead", animal.getName());
        assertNotEquals(2, animal.getId());
        assertEquals("Southern Copperhead", animal.getName());
        assertEquals("Diurnal", animal.getActiveTime());
        assertNotEquals("Diurnal  ", animal.getActiveTime());
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

    @org.junit.Test(timeout = 300)
    public void getName() {
    }

    @org.junit.Test(timeout = 300)
    public void setName() {
        Animal animal = new Animal(1, "  Southern Copperhead  ", "Agkistrodon contortrix contortix", "Reptile", "Diurnal   ", 4.0, 4.5, 0.5, 0.75, 18.0, "Woodlands and rocky hillsides", "Small mammals, birds, frogs, and insects", "Central and Eastern United States", "https://upload.wikimedia.org/wikipedia/commons/c/ce/Copperhead_%28Agkistrodon_contortrix%29_photographed_in_Liberty_Co.%2C_Texas._W._L._Farr.jpg");
        animal.setName(" Southern Copperhead  ");
        assertEquals("Southern Copperhead", animal.getName());
        animal.setName("  Southern Copperhead  ");
        assertEquals("Southern Copperhead", animal.getName());
        animal.setName(" Southern Copperhead   ");
        assertEquals("Southern Copperhead", animal.getName());
    }

    @org.junit.Test(timeout = 300)
    public void getLatinName() {
    }

    @org.junit.Test(timeout = 300)
    public void setLatinName() {
        Animal animal = new Animal(1, "  Southern Copperhead  ", "  Agkistrodon contortrix contortix  ", "Reptile", "Diurnal   ", 4.0, 4.5, 0.5, 0.75, 18.0, "Woodlands and rocky hillsides", "Small mammals, birds, frogs, and insects", "Central and Eastern United States", "https://upload.wikimedia.org/wikipedia/commons/c/ce/Copperhead_%28Agkistrodon_contortrix%29_photographed_in_Liberty_Co.%2C_Texas._W._L._Farr.jpg");
        animal.setName(" Agkistrodon contortrix contortix  ");
        assertEquals("Agkistrodon contortrix contortix", animal.getLatinName());
        animal.setLatinName("  Agkistrodon contortrix contortix  ");
        assertEquals("Agkistrodon contortrix contortix", animal.getLatinName());
        animal.setLatinName(" Agkistrodon contortrix contortix   ");
        assertEquals("Agkistrodon contortrix contortix", animal.getLatinName());
    }

    @org.junit.Test(timeout = 300)
    public void getAnimalType() {
    }

    @org.junit.Test(timeout = 300)
    public void setAnimalType() {

        Animal animal = new Animal(1, "  Southern Copperhead  ", "  Agkistrodon contortrix contortix  ", "  Reptile", "Diurnal   ", 4.0, 4.5, 0.5, 0.75, 18.0, "Woodlands and rocky hillsides", "Small mammals, birds, frogs, and insects", "Central and Eastern United States", "https://upload.wikimedia.org/wikipedia/commons/c/ce/Copperhead_%28Agkistrodon_contortrix%29_photographed_in_Liberty_Co.%2C_Texas._W._L._Farr.jpg");
        animal.setAnimalType(" Reptile  ");
        assertEquals("Reptile", animal.getAnimalType());
        animal.setAnimalType("  Reptile  ");
        assertEquals("Reptile", animal.getAnimalType());
        animal.setAnimalType(" Reptile   ");
        assertEquals("Reptile", animal.getAnimalType());

    }

    @org.junit.Test(timeout = 300)
    public void getActiveTime() {
    }

    @org.junit.Test(timeout = 300)
    public void setActiveTime() {

        Animal animal = new Animal(1, "  Southern Copperhead  ", "  Agkistrodon contortrix contortix  ", "  Reptile", "  Diurnal   ", 4.0, 4.5, 0.5, 0.75, 18.0, "Woodlands and rocky hillsides", "Small mammals, birds, frogs, and insects", "Central and Eastern United States", "https://upload.wikimedia.org/wikipedia/commons/c/ce/Copperhead_%28Agkistrodon_contortrix%29_photographed_in_Liberty_Co.%2C_Texas._W._L._Farr.jpg");
        animal.setActiveTime(" Diurnal  ");
        assertEquals("Diurnal", animal.getActiveTime());
        animal.setActiveTime("  Diurnal  ");
        assertEquals("Diurnal", animal.getActiveTime());
        animal.setActiveTime(" Diurnal   ");
        assertEquals("Diurnal", animal.getActiveTime());
    }

    @org.junit.Test(timeout = 300)
    public void getLenMin() {
    }

    @org.junit.Test(timeout = 300)
    public void setLenMin() {
    }

    @org.junit.Test(timeout = 300)
    public void getLenMax() {
    }

    @org.junit.Test(timeout = 300)
    public void setLenMax() {
    }

    @org.junit.Test(timeout = 300)
    public void getWgMin() {
    }

    @org.junit.Test(timeout = 300)
    public void setWgMin() {
    }

    @org.junit.Test(timeout = 300)
    public void getWgMax() {
    }

    @org.junit.Test(timeout = 300)
    public void setWgMax() {
    }

    @org.junit.Test(timeout = 300)
    public void getLifespan() {
    }

    @org.junit.Test(timeout = 300)
    public void setLifespan() {
    }

    @org.junit.Test(timeout = 300)
    public void getHabitat() {
    }

    @org.junit.Test(timeout = 300)
    public void setHabitat() {
        Animal animal = new Animal(1, "  Southern Copperhead  ", "  Agkistrodon contortrix contortix  ", "  Reptile", "  Diurnal   ", 4.0, 4.5, 0.5, 0.75, 18.0, "  Woodlands and rocky hillsides   ", "Small mammals, birds, frogs, and insects", "Central and Eastern United States", "https://upload.wikimedia.org/wikipedia/commons/c/ce/Copperhead_%28Agkistrodon_contortrix%29_photographed_in_Liberty_Co.%2C_Texas._W._L._Farr.jpg");
        animal.setHabitat(" Woodlands and rocky hillsides  ");
        assertEquals("Woodlands and rocky hillsides", animal.getHabitat());
        animal.setHabitat("  Woodlands and rocky hillsides  ");
        assertEquals("Woodlands and rocky hillsides", animal.getHabitat());
        animal.setHabitat(" Woodlands and rocky hillsides   ");
        assertEquals("Woodlands and rocky hillsides", animal.getHabitat());
    }

    @org.junit.Test(timeout = 300)
    public void getDiet() {
    }

    @org.junit.Test(timeout = 300)
    public void setDiet() {
        Animal animal = new Animal(1, "  Southern Copperhead  ", "  Agkistrodon contortrix contortix  ", "  Reptile", "  Diurnal   ", 4.0, 4.5, 0.5, 0.75, 18.0, "  Woodlands and rocky hillsides   ", "  Small mammals, birds, frogs, and insects  ", "Central and Eastern United States", "https://upload.wikimedia.org/wikipedia/commons/c/ce/Copperhead_%28Agkistrodon_contortrix%29_photographed_in_Liberty_Co.%2C_Texas._W._L._Farr.jpg");
        animal.setDiet(" Small mammals, birds, frogs, and insects  ");
        assertEquals("Small mammals, birds, frogs, and insects", animal.getDiet());
        animal.setDiet("  Small mammals, birds, frogs, and insects  ");
        assertEquals("Small mammals, birds, frogs, and insects", animal.getDiet());
        animal.setDiet(" Small mammals, birds, frogs, and insects   ");
        assertEquals("Small mammals, birds, frogs, and insects", animal.getDiet());
    }

    @org.junit.Test(timeout = 300)
    public void getGeoRange() {
    }

    @org.junit.Test(timeout = 300)
    public void setGeoRange() {
        Animal animal = new Animal(1, "  Southern Copperhead  ", "  Agkistrodon contortrix contortix  ", "  Reptile", "  Diurnal   ", 4.0, 4.5, 0.5, 0.75, 18.0, "  Woodlands and rocky hillsides   ", "  Small mammals, birds, frogs, and insects  ", "Central and Eastern United States", "https://upload.wikimedia.org/wikipedia/commons/c/ce/Copperhead_%28Agkistrodon_contortrix%29_photographed_in_Liberty_Co.%2C_Texas._W._L._Farr.jpg");
        animal.setGeoRange(" Central and Eastern United States  ");
        assertEquals("Central and Eastern United States", animal.getGeoRange());
        animal.setGeoRange("  Central and Eastern United States  ");
        assertEquals("Central and Eastern United States", animal.getGeoRange());
        animal.setGeoRange(" Central and Eastern United States   ");
        assertEquals("Central and Eastern United States", animal.getGeoRange());
    }

    @org.junit.Test(timeout = 300)
    public void getImageLink() {
    }

    @org.junit.Test(timeout = 300)
    public void setImageLink() {
        Animal animal = new Animal(1, "  Southern Copperhead  ", "  Agkistrodon contortrix contortix  ", "  Reptile", "  Diurnal   ", 4.0, 4.5, 0.5, 0.75, 18.0, "  Woodlands and rocky hillsides   ", "  Small mammals, birds, frogs, and insects  ", "Central and Eastern United States", "https://upload.wikimedia.org/wikipedia/commons/c/ce/Copperhead_%28Agkistrodon_contortrix%29_photographed_in_Liberty_Co.%2C_Texas._W._L._Farr.jpg");
        animal.setImageLink(" https://upload.wikimedia.org/wikipedia/commons/c/ce/Copperhead_%28Agkistrodon_contortrix%29_photographed_in_Liberty_Co.%2C_Texas._W._L._Farr.jpg  ");
        assertEquals("https://upload.wikimedia.org/wikipedia/commons/c/ce/Copperhead_%28Agkistrodon_contortrix%29_photographed_in_Liberty_Co.%2C_Texas._W._L._Farr.jpg", animal.getImageLink());
        animal.setImageLink("  https://upload.wikimedia.org/wikipedia/commons/c/ce/Copperhead_%28Agkistrodon_contortrix%29_photographed_in_Liberty_Co.%2C_Texas._W._L._Farr.jpg  ");
        assertEquals("https://upload.wikimedia.org/wikipedia/commons/c/ce/Copperhead_%28Agkistrodon_contortrix%29_photographed_in_Liberty_Co.%2C_Texas._W._L._Farr.jpg", animal.getImageLink());
        animal.setImageLink(" https://upload.wikimedia.org/wikipedia/commons/c/ce/Copperhead_%28Agkistrodon_contortrix%29_photographed_in_Liberty_Co.%2C_Texas._W._L._Farr.jpg   ");
        assertEquals("https://upload.wikimedia.org/wikipedia/commons/c/ce/Copperhead_%28Agkistrodon_contortrix%29_photographed_in_Liberty_Co.%2C_Texas._W._L._Farr.jpg", animal.getImageLink());

    }

    @org.junit.Test(timeout = 300)
    public void getId() {
    }

    @org.junit.Test(timeout = 300)
    public void setId() {
    }
}