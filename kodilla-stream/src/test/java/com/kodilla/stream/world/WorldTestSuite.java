package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){

        //Given
        Country Poland = new Country("Poland", "38000000");
        Country Germany = new Country("Germany", "83000000");
        Country China = new Country("China", "1386000000");
        Country India = new Country("India", "1339000000");
        Country USA = new Country("USA", "327000000");
        Country Mexico = new Country("Mexico", "130000000");
        Country Brasil = new Country("Brasil", "209000000");
        Country Columbia = new Country("Columbia", "49000000");

        Continent Europe = new Continent();
        Continent Asia = new Continent();
        Continent northAmerica = new Continent();
        Continent southAAmerica = new Continent();

        Europe.addCountry(Poland);
        Europe.addCountry(Germany);
        Asia.addCountry(China);
        Asia.addCountry(India);
        northAmerica.addCountry(USA);
        northAmerica.addCountry(Mexico);
        southAAmerica.addCountry(Brasil);
        southAAmerica.addCountry(Columbia);

        World world = new World();
        world.addContinent(Europe);
        world.addContinent(Asia);
        world.addContinent(northAmerica);
        world.addContinent(southAAmerica);

        //When

        BigDecimal populationWorld = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPopulation = new BigDecimal("3561000000");
        Assert.assertEquals(expectedPopulation, populationWorld);

    }
}


