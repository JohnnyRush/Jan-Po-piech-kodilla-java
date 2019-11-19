package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost(){
        //Given
        PizzaOrder theOrder = new BasicPizza();
        //When
        BigDecimal cost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), cost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizza();
        //When
        String desc = theOrder.getDescription();
        //Then
        assertEquals("Basic dough + tomato sauce with cheese", desc);
    }
    @Test
    public void testPizzaOrderWith2IngredientsGetCost(){
        //Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new OnionDecorator(theOrder);
        theOrder = new AdditionalCheeseDecorator(theOrder);
        //When
        BigDecimal cost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(18), cost);
    }

    @Test
    public void testPizzaOrderWith2IngredientsGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new OnionDecorator(theOrder);
        theOrder = new AdditionalCheeseDecorator(theOrder);
        //When
        String desc = theOrder.getDescription();
        //Then
        assertEquals("Basic dough + tomato sauce with cheese + onion + additional cheese", desc);
    }
    @Test
    public void testPizzaOrderWithAllIngredientsGetCost(){
        //Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new OnionDecorator(theOrder);
        theOrder = new AdditionalCheeseDecorator(theOrder);
        theOrder = new ChickenDecotator(theOrder);
        theOrder = new CornDecorator(theOrder);
        theOrder = new CucumberDecorator(theOrder);
        //When
        BigDecimal cost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(26), cost);
    }

    @Test
    public void testPizzaOrderWithAllIngredientsGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new OnionDecorator(theOrder);
        theOrder = new AdditionalCheeseDecorator(theOrder);
        theOrder = new ChickenDecotator(theOrder);
        theOrder = new CornDecorator(theOrder);
        theOrder = new CucumberDecorator(theOrder);
        //When
        String desc = theOrder.getDescription();
        //Then
        assertEquals("Basic dough + tomato sauce with cheese + onion + additional cheese + chicken + corn + cucumber", desc);
    }

}