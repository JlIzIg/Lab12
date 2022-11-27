package com.example.lab12;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConstantsTest {

    @org.junit.Test(timeout = 100)
    public void createObject() {
        Constants constants = new Constants();
        assertEquals("localhost:3306", Constants.SERVER);
        assertEquals("mydb", Constants.DATABASE);
        assertEquals("jdbc:mysql://localhost:3306/mydb", Constants.URL);
    }

}