package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        Double val1 = calculator.add(2, 2);
        Double val2 = calculator.sub(2, 2);
        Double val3 = calculator.mul(2, 2);
        Double val4 = calculator.div(2, 2);
        //Then
        Assert.assertEquals(val1, 4, 00.1);
        Assert.assertEquals(val2, 0, 00.1);
        Assert.assertEquals(val3, 4, 00.1);
        Assert.assertEquals(val4, 1, 00.1);
    }
}