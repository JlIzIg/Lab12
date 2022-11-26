package com.example.lab12;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class JSONWriter { //NOPMD - suppressed AtLeastOneConstructor - TODO explain reason for suppression

    /**
     * метод сохранения List<Animal> в файл JSON
     */
    public void saveToFile(String filename) throws IOException, SQLException { //NOPMD - suppressed MethodArgumentCouldBeFinal - TODO explain reason for suppression
        DataBaseAnimals dataBaseAnimals = new DataBaseAnimals(); //NOPMD - suppressed LocalVariableCouldBeFinal - TODO explain reason for suppression
        dataBaseAnimals.dbConnection(Constants.SERVER + "/mydb", "root", "NoFear@Dinar2021");
        dataBaseAnimals.loadData();
        List<Animal> animalArrayList = dataBaseAnimals.getData(); //NOPMD - suppressed LocalVariableCouldBeFinal - TODO explain reason for suppression
        new ObjectMapper().writeValue(new File(filename), animalArrayList);
        dataBaseAnimals.close();
    }
}