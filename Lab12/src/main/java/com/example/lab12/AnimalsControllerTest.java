package com.example.lab12;

import javafx.collections.ObservableList;
import org.junit.Test;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.*;

public class AnimalsControllerTest {

    @Test
    public void setTable1() throws SQLException {
        DataBaseAnimals dataBaseAnimals = new DataBaseAnimals();
        dataBaseAnimals.dbConnection(Constants.SERVER + "/mydb", "root", "NoFear@Dinar2021");
        dataBaseAnimals.loadData();
        ObservableList<Animal> animals = dataBaseAnimals.getData();
        dataBaseAnimals.close();
    }

    @Test
    public void initialize() {

    }

    @org.junit.Test(timeout = 500000)
    public void getAction() throws SQLException {
        DataBaseAnimals dataBaseAnimals = new DataBaseAnimals();
        dataBaseAnimals.dbConnection(Constants.SERVER + "/mydb", "root", "NoFear@Dinar2021");
        dataBaseAnimals.loadData();
        List<Animal> animalList = dataBaseAnimals.getData();
        dataBaseAnimals.addData();
        dataBaseAnimals.delete();
        assertEquals(animalList, dataBaseAnimals.getData());
        dataBaseAnimals.close();
    }

    @org.junit.Test(timeout = 300000)
    public void getFormat() throws SQLException, IOException {
        SaveAnimal saveAnimal = new SaveAnimal();
        saveAnimal.saveToTxt();
        saveAnimal.saveToJson();
        saveAnimal.saveToExcel();

    }

    @org.junit.Test(timeout = 5000)
    public void delete() throws SQLException {
        DataBaseAnimals dataBaseAnimals = new DataBaseAnimals();
        dataBaseAnimals.dbConnection(Constants.SERVER + "/mydb", "root", "NoFear@Dinar2021");
        dataBaseAnimals.delete();
    }
}