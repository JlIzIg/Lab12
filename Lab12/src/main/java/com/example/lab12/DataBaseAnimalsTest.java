package com.example.lab12;

import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.*;

public class DataBaseAnimalsTest {

    @Test
    public void setConnection() {


    }

    @Test
    public void getData() {
    }

    @org.junit.Test(timeout = 500000)
    public void setData() throws SQLException {
        DataBaseAnimals dataBaseAnimals = new DataBaseAnimals();
        dataBaseAnimals.dbConnection(Constants.SERVER + "/mydb", "root", "NoFear@Dinar2021");
        dataBaseAnimals.loadData();
        List<Animal> animalList = dataBaseAnimals.getData();
        dataBaseAnimals.addData();
        dataBaseAnimals.delete();
        assertEquals(animalList, dataBaseAnimals.getData());
        dataBaseAnimals.close();
    }

    @org.junit.Test(timeout = 3000)
    public void dbConnection() throws SQLException {
        DataBaseAnimals dataBaseAnimals = new DataBaseAnimals();
        dataBaseAnimals.dbConnection(Constants.SERVER + "/mydb", "root", "NoFear@Dinar2021");
        dataBaseAnimals.close();

    }

    @org.junit.Test(timeout = 5000)
    public void loadData() throws SQLException {
        DataBaseAnimals dataBaseAnimals = new DataBaseAnimals();
        dataBaseAnimals.dbConnection(Constants.SERVER + "/mydb", "root", "NoFear@Dinar2021");
        dataBaseAnimals.loadData();
        dataBaseAnimals.close();
    }

    @org.junit.Test(timeout = 3000)
    public void delete() throws SQLException {
        DataBaseAnimals dataBaseAnimals = new DataBaseAnimals();
        dataBaseAnimals.dbConnection(Constants.SERVER + "/mydb", "root", "NoFear@Dinar2021");
        dataBaseAnimals.delete();
        dataBaseAnimals.close();
    }

    @org.junit.Test(timeout = 3000)
    public void addData() throws SQLException {
        DataBaseAnimals dataBaseAnimals = new DataBaseAnimals();
        dataBaseAnimals.dbConnection(Constants.SERVER + "/mydb", "root", "NoFear@Dinar2021");
        dataBaseAnimals.addData();
        dataBaseAnimals.close();
    }

    @org.junit.Test(timeout = 3000)
    public void close() throws SQLException {
        DataBaseAnimals dataBaseAnimals = new DataBaseAnimals();
        dataBaseAnimals.dbConnection(Constants.SERVER + "/mydb", "root", "NoFear@Dinar2021");
        dataBaseAnimals.close();
    }
}