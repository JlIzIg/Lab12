package com.example.lab12;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;

public class TxtWriter { //NOPMD - suppressed AtLeastOneConstructor - TODO explain reason for suppression
    //NOPMD - suppressed AtLeastOneConstructor - TODO explain reason for suppression

    /**
     * метод сохранения List<Animal> в файл TXT
     */
    public void saveToFile(String filename) throws IOException, SQLException { //NOPMD - suppressed MethodArgumentCouldBeFinal - TODO explain reason for suppression
        DataBaseAnimals dataBaseAnimals = new DataBaseAnimals(); //NOPMD - suppressed LocalVariableCouldBeFinal - TODO explain reason for suppression
        dataBaseAnimals.dbConnection(Constants.SERVER + "/mydb", "root", "NoFear@Dinar2021");
        dataBaseAnimals.loadData();
        List<Animal> animalArrayList = dataBaseAnimals.getData(); //NOPMD - suppressed LocalVariableCouldBeFinal - TODO explain reason for suppression

        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(Paths.get(filename), StandardCharsets.UTF_8)) {
            for (Animal animal : animalArrayList) { //NOPMD - suppressed LocalVariableCouldBeFinal - TODO explain reason for suppression
                try {
                    bufferedWriter.write(String.valueOf(animal.getId()));
                    bufferedWriter.write(System.lineSeparator());
                    bufferedWriter.write(String.valueOf(animal.getName()));
                    bufferedWriter.write(System.lineSeparator());
                    bufferedWriter.write(String.valueOf(animal.getLatinName()));
                    bufferedWriter.write(System.lineSeparator());
                    bufferedWriter.write(String.valueOf(animal.getAnimalType()));
                    bufferedWriter.write(System.lineSeparator());
                    bufferedWriter.write(String.valueOf(animal.getActiveTime()));
                    bufferedWriter.write(System.lineSeparator());
                    bufferedWriter.write(String.valueOf(animal.getLenMin()));
                    bufferedWriter.write(System.lineSeparator());
                    bufferedWriter.write(String.valueOf(animal.getLenMax()));
                    bufferedWriter.write(System.lineSeparator());
                    bufferedWriter.write(String.valueOf(animal.getWgMin()));
                    bufferedWriter.write(System.lineSeparator());
                    bufferedWriter.write(String.valueOf(animal.getWgMax()));
                    bufferedWriter.write(System.lineSeparator());
                    bufferedWriter.write(String.valueOf(animal.getLifespan()));
                    bufferedWriter.write(System.lineSeparator());
                    bufferedWriter.write(String.valueOf(animal.getHabitat()));
                    bufferedWriter.write(System.lineSeparator());
                    bufferedWriter.write(String.valueOf(animal.getDiet()));
                    bufferedWriter.write(System.lineSeparator());
                    bufferedWriter.write(String.valueOf(animal.getGeoRange()));
                    bufferedWriter.write(System.lineSeparator());
                    bufferedWriter.write(String.valueOf(animal.getImageLink()));
                    bufferedWriter.write(System.lineSeparator());
                } catch (IOException e) {
                    Logger.getLogger(e.getMessage());
                }
            }
        } catch (Exception e) //NOPMD - suppressed AvoidCatchingGenericException - TODO explain reason for suppression
        {
            Logger.getLogger(e.getMessage());
        }
        dataBaseAnimals.close();
    }

}