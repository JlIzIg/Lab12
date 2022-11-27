package com.example.lab12;

import org.junit.Test;

import java.io.IOException;
import java.sql.SQLException;

import static org.junit.Assert.*;

public class SaveAnimalTest {

    @org.junit.Test(timeout = 5000)
    public void saveToTxt() throws SQLException, IOException {
        SaveAnimal saveAnimal = new SaveAnimal();
        saveAnimal.saveToTxt();
    }

    @org.junit.Test(timeout = 5000)
    public void saveToJson() throws SQLException, IOException {
        SaveAnimal saveAnimal = new SaveAnimal();
        saveAnimal.saveToJson();
    }

    @org.junit.Test(timeout = 5000)
    public void saveToExcel() throws SQLException, IOException {
        SaveAnimal saveAnimal = new SaveAnimal();
        saveAnimal.saveToExcel();
    }
}