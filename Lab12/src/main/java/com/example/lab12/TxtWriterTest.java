package com.example.lab12;

import org.junit.Test;

import java.io.IOException;
import java.sql.SQLException;

import static org.junit.Assert.*;

public class TxtWriterTest {

    @org.junit.Test(timeout = 5000)
    public void saveToFile() throws SQLException, IOException {
        TxtWriter txtWriter = new TxtWriter();
        txtWriter.saveToFile("txtTest.txt");
    }
}