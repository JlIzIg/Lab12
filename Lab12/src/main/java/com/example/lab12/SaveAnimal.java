package com.example.lab12;


import java.io.IOException;
import java.sql.SQLException;

public class SaveAnimal { //NOPMD - suppressed CommentRequired - TODO explain reason for suppression
    ExcelWriter excelWriter; //NOPMD - suppressed BeanMembersShouldSerialize - TODO explain reason for suppression
    JSONWriter jsonWriter; //NOPMD - suppressed BeanMembersShouldSerialize - TODO explain reason for suppression
    TxtWriter txtWriter; //NOPMD - suppressed BeanMembersShouldSerialize - TODO explain reason for suppression

    /***конструктор класса*/
    public SaveAnimal() {
        excelWriter = new ExcelWriter();
        jsonWriter = new JSONWriter();
        txtWriter = new TxtWriter();
    }

    /**
     * сохранение в формате txt
     */
    public void saveToTxt() throws IOException, SQLException {
        txtWriter.saveToFile("Animals.txt");
    }

    /**
     * сохранение в формате json
     */
    public void saveToJson() throws IOException, SQLException {
        jsonWriter.saveToFile("Animals.json");
    }

    /**
     * сохранение в формате xlsx
     */
    public void saveToExcel() throws IOException, SQLException, RuntimeException { //NOPMD - suppressed AvoidUncheckedExceptionsInSignatures - TODO explain reason for suppression
        excelWriter.saveToFile("Animals.xls");
    }


}