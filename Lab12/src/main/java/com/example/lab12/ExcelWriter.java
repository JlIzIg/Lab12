package com.example.lab12;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;

public class ExcelWriter { //NOPMD - suppressed CommentRequired - TODO explain reason for suppression
    /**
     * поля класса
     **/
    HSSFWorkbook hssfWorkbook; //NOPMD - suppressed BeanMembersShouldSerialize - TODO explain reason for suppression
    HSSFSheet hssfSheet; //NOPMD - suppressed BeanMembersShouldSerialize - TODO explain reason for suppression
    DataBaseAnimals dataBaseAnimals; //NOPMD - suppressed BeanMembersShouldSerialize - TODO explain reason for suppression
    List<Animal> animalList; //NOPMD - suppressed BeanMembersShouldSerialize - TODO explain reason for suppression

    /**
     * конструктор класса
     **/

    public ExcelWriter() {
        initialize(); //NOPMD - suppressed ConstructorCallsOverridableMethod - TODO explain reason for suppression
    }

    /**
     * метод для заполнения HSSFSheet данными из List
     */

    private void createSheetHeader(HSSFSheet sheet, int rowNum, Animal animal) { //NOPMD - suppressed MethodArgumentCouldBeFinal - TODO explain reason for suppression //NOPMD - suppressed MethodArgumentCouldBeFinal - TODO explain reason for suppression //NOPMD - suppressed MethodArgumentCouldBeFinal - TODO explain reason for suppression

        Row row = sheet.createRow(rowNum); //NOPMD - suppressed LocalVariableCouldBeFinal - TODO explain reason for suppression
        row.createCell(0).setCellValue(animal.getId()); //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression
        row.createCell(1).setCellValue(animal.getName()); //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression
        row.createCell(2).setCellValue(animal.getLatinName()); //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression
        row.createCell(3).setCellValue(animal.getAnimalType()); //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression
        row.createCell(4).setCellValue(animal.getActiveTime()); //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression
        row.createCell(5).setCellValue(animal.getLenMin()); //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression
        row.createCell(6).setCellValue(animal.getLenMax()); //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression
        row.createCell(7).setCellValue(animal.getWgMin()); //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression
        row.createCell(8).setCellValue(animal.getWgMax()); //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression
        row.createCell(9).setCellValue(animal.getLifespan()); //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression
        row.createCell(10).setCellValue(animal.getHabitat()); //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression
        row.createCell(11).setCellValue(animal.getDiet()); //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression
        row.createCell(12).setCellValue(animal.getGeoRange()); //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression
        row.createCell(13).setCellValue(animal.getImageLink()); //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression
    }

    /**
     * инициализатор
     **/
    public void initialize() {
        hssfWorkbook = new HSSFWorkbook();
        hssfSheet = hssfWorkbook.createSheet("Sheet1");
        dataBaseAnimals = new DataBaseAnimals();
        dataBaseAnimals.dbConnection(Constants.SERVER + "/mydb", "root", "NoFear@Dinar2021");
        dataBaseAnimals.loadData();
        animalList = dataBaseAnimals.getData();
        try {
            dataBaseAnimals.close();
        } catch (SQLException |
                 RuntimeException e) { //NOPMD - suppressed AvoidCatchingGenericException - TODO explain reason for suppression
            Logger.getLogger(e.getMessage());

        }

    }

    /**
     * метод сохранения данных в файл
     */
    public void saveToFile(String filename) throws IOException, SQLException, RuntimeException { //NOPMD - suppressed AvoidUncheckedExceptionsInSignatures - TODO explain reason for suppression
        int rowNum = 0;
        HSSFRow firstRow = hssfSheet.createRow(rowNum); //NOPMD - suppressed LocalVariableCouldBeFinal - TODO explain reason for suppression
        firstRow.createCell(0).setCellValue("id"); //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression
        firstRow.createCell(1).setCellValue("name"); //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression
        firstRow.createCell(2).setCellValue("latinName"); //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression
        firstRow.createCell(3).setCellValue("animalType"); //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression
        firstRow.createCell(4).setCellValue("activeTime"); //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression
        firstRow.createCell(5).setCellValue("lenMin"); //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression
        firstRow.createCell(6).setCellValue("lenMax"); //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression
        firstRow.createCell(7).setCellValue("wgMin"); //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression
        firstRow.createCell(8).setCellValue("wgMax"); //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression
        firstRow.createCell(9).setCellValue("lifespan"); //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression
        firstRow.createCell(10).setCellValue("habitat"); //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression
        firstRow.createCell(11).setCellValue("diet"); //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression
        firstRow.createCell(12).setCellValue("geoRange"); //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression
        firstRow.createCell(13).setCellValue("imageLink"); //NOPMD - suppressed LawOfDemeter - TODO explain reason for suppression
        for (Animal animal : animalList) { //NOPMD - suppressed LocalVariableCouldBeFinal - TODO explain reason for suppression
            createSheetHeader(hssfSheet, rowNum++, animal);
        }
        try (FileOutputStream out = new FileOutputStream(filename)) { //NOPMD - suppressed AvoidFileStream - TODO explain reason for suppression
            hssfWorkbook.write(out);
        } catch (IOException e) {
            Logger.getLogger(e.getMessage());
        }


    }
}