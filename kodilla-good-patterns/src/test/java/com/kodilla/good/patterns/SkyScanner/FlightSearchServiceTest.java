package com.kodilla.good.patterns.SkyScanner;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FlightSearchServiceTest {
    private FlightSearchService underTest;
    private String s;

    @Before
    public void setUp(){
        underTest = new FlightSearchService();
    }
    @Test
    public void flightsFrom() {
        //Given
        String from = "KRK";
        //When
        List<Flight> result = underTest.flightsFrom(from);
        //Then
        assertEquals(3, result.size());
    }

    @Test
    public void flightsTo() {
        //Given
        String to = "KRK";
        //When
        List<Flight> result = underTest.flightsTo(to);
        //Then
        assertEquals(2, result.size());
    }

    @Test
    public void flightByCity() {
        //Given
        String from = "GDN";
        String via = "WAW";
        String to = "MIA";
        //When
        List<Flight> result = underTest.flightByCity(from, via, to);
        //Then
        assertEquals(2, result.size());

    }
}