package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryShopping(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shop = factory.makeTask(TaskFactory.SHOPPING_TASK);
        //Then
        Assert.assertEquals(true, shop.isTaskExecuted());
        Assert.assertEquals("Black Friday", shop.getTaskName());
    }
    @Test
    public void testFactoryDriving(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driver = factory.makeTask(TaskFactory.DRIVING_TASK);
        //Then
        Assert.assertNotEquals(true, driver.isTaskExecuted());
    }
    @Test
    public void testFactoryPainting(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paint = factory.makeTask(TaskFactory.PAINTING_TASK);
        //Then
        Assert.assertEquals(true, paint.isTaskExecuted());
    }
}