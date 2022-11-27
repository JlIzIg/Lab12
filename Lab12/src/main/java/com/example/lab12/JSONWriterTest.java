package com.example.lab12;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.*;

public class JSONWriterTest {

    @org.junit.Test(timeout = 5000)
    public void saveToFile() throws SQLException, IOException {
        JSONWriter jsonWriter = new JSONWriter();
        jsonWriter.saveToFile("JsonTest.json");
    }
}