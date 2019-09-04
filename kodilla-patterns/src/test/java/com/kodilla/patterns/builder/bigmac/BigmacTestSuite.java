package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BigmacTestSuite {
    @Test
    public void testPizzaNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredient("Onion")
                .ingredient("Cheese")
                .ingredient("Cucumber")
                .bun("Wholemeal")
                .burgers(2)
                .sauce("Spicy, 1000 Islands")
                .ingredient("Ham")
                .ingredient("Mushrooms")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(5, howManyIngredients);
    }

}