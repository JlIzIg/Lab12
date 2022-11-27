package com.example.lab12;

import org.junit.Test;

import java.io.IOException;
import java.sql.SQLException;

import static org.junit.Assert.*;

public class ExcelWriterTest {

    @org.junit.Test(timeout = 1000)
    public void initialize() {
        ExcelWriter excelWriter = new ExcelWriter();
        excelWriter.initialize();
    }

    @org.junit.Test(timeout = 5000)
    public void saveToFile() throws SQLException, IOException {
        ExcelWriter excelWriter = new ExcelWriter();
        excelWriter.saveToFile("exelTest.xls");
    }
}