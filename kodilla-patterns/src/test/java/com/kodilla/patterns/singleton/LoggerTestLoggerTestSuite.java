package com.kodilla.patterns.singleton;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoggerTestLoggerTestSuite {

    @BeforeClass
    public static void addLog() {
        Logger.getInstance().log("access complete");;
    }

    @Test
    public void testGetLastLog() {
        //Given
        //When
        String log = Logger.getInstance().getLastLog();
        //Then
        assertEquals("access complete", log);
    }

}