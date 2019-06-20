package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculatorStatisticTestSuit {

    @Test
    public void testCalculateAdvStatisticsNormalCase() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> listOfUser = new ArrayList<>();
        for(int i = 1; i < 101; i++){
            listOfUser.add("User " + i);
        }

        when(statisticsMock.usersNames()).thenReturn(listOfUser);
        when(statisticsMock.postsCount()).thenReturn(200);
        when(statisticsMock.commentsCount()).thenReturn(200);

        StatisticsCalculator calculator = new StatisticsCalculator();

        //When
        calculator.calculateAdvStatistics(statisticsMock);
        double adv = calculator.aveNCOP;
        double adv2 = calculator.aveNCOU;
        double adv3 = calculator.aveNPOU;

        //Then
        Assert.assertEquals(1, adv, 0.001);
        Assert.assertEquals(2, adv2, 0.001);
        Assert.assertEquals(2, adv3, 0.001);

        calculator.showStatistics();
    }

    @Test
    public void testCalculateAdvStatistics1() {
        // number post = 0
        // Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> listOfUser = new ArrayList<>();
        for(int i = 1; i < 101; i++){
            listOfUser.add("User " + i);
        }

        when(statisticsMock.usersNames()).thenReturn(listOfUser);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(100);

        StatisticsCalculator calculator = new StatisticsCalculator();

        //When
        calculator.calculateAdvStatistics(statisticsMock);
        double adv = calculator.aveNCOP;
        double adv2 = calculator.aveNCOU;
        double adv3 = calculator.aveNPOU;

        //Then
        Assert.assertEquals(0, adv, 0.001);
        Assert.assertEquals(1, adv2, 0.001);
        Assert.assertEquals(0, adv3, 0.001);
    }

    @Test
    public void testCalculateAdvStatistics2() {
        // posts = 1000
        // Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> listOfUser = new ArrayList<>();
        for(int i = 1; i < 101; i++){
            listOfUser.add("User " + i);
        }

        when(statisticsMock.usersNames()).thenReturn(listOfUser);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        StatisticsCalculator calculator = new StatisticsCalculator();

        //When
        calculator.calculateAdvStatistics(statisticsMock);
        double adv = calculator.aveNCOP;
        double adv2 = calculator.aveNCOU;
        double adv3 = calculator.aveNPOU;

        //Then
        Assert.assertEquals(1, adv, 0.001);
        Assert.assertEquals(10, adv2, 0.001);
        Assert.assertEquals(10, adv3, 0.001);
    }
    @Test
    public void testCalculateAdvStatistics3() {
        // comments = 0
        // Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> listOfUser = new ArrayList<>();
        for(int i = 1; i < 101; i++){
            listOfUser.add("User " + i);
        }

        when(statisticsMock.usersNames()).thenReturn(listOfUser);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);

        StatisticsCalculator calculator = new StatisticsCalculator();

        //When
        calculator.calculateAdvStatistics(statisticsMock);
        double adv = calculator.aveNCOP;
        double adv2 = calculator.aveNCOU;
        double adv3 = calculator.aveNPOU;

        //Then
        Assert.assertEquals(0, adv, 0.001);
        Assert.assertEquals(0, adv2, 0.001);
        Assert.assertEquals(10, adv3, 0.001);
    }
    @Test
    public void testCalculateAdvStatistics4() {
        // comments > posts
        // Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> listOfUser = new ArrayList<>();
        for(int i = 1; i < 101; i++){
            listOfUser.add("User " + i);
        }

        when(statisticsMock.usersNames()).thenReturn(listOfUser);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(500);

        StatisticsCalculator calculator = new StatisticsCalculator();

        //When
        calculator.calculateAdvStatistics(statisticsMock);
        double adv = calculator.aveNCOP;
        double adv2 = calculator.aveNCOU;
        double adv3 = calculator.aveNPOU;

        //Then
        Assert.assertEquals(5, adv, 0.001);
        Assert.assertEquals(5, adv2, 0.001);
        Assert.assertEquals(1, adv3, 0.001);
    }
    @Test
    public void testCalculateAdvStatistics5() {
        //comments < posts
        // Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> listOfUser = new ArrayList<>();
        for(int i = 1; i < 101; i++){
            listOfUser.add("User " + i);
        }

        when(statisticsMock.usersNames()).thenReturn(listOfUser);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);

        StatisticsCalculator calculator = new StatisticsCalculator();

        //When
        calculator.calculateAdvStatistics(statisticsMock);
        double adv = calculator.aveNCOP;
        double adv2 = calculator.aveNCOU;
        double adv3 = calculator.aveNPOU;

        //Then
        Assert.assertEquals(0.1, adv, 0.001);
        Assert.assertEquals(1, adv2, 0.001);
        Assert.assertEquals(10, adv3, 0.001);
    }
    @Test
    public void testCalculateAdvStatistics6() {
        // number of users = 0
        // Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> listOfUser = new ArrayList<>();

        when(statisticsMock.usersNames()).thenReturn(listOfUser);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        StatisticsCalculator calculator = new StatisticsCalculator();

        //When
        calculator.calculateAdvStatistics(statisticsMock);
        double adv = calculator.aveNCOP;
        double adv2 = calculator.aveNCOU;
        double adv3 = calculator.aveNPOU;

        //Then
        Assert.assertEquals(1, adv, 0.001);
        Assert.assertEquals(0, adv2, 0.001);
        Assert.assertEquals(0, adv3, 0.001);
    }@Test
    public void testCalculateAdvStatistics7() {
        // number of users = 100
        // Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> listOfUser = new ArrayList<>();
        for(int i = 1; i < 101; i++){
            listOfUser.add("User " + i);
        }

        when(statisticsMock.usersNames()).thenReturn(listOfUser);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(100);

        StatisticsCalculator calculator = new StatisticsCalculator();

        //When
        calculator.calculateAdvStatistics(statisticsMock);
        double adv = calculator.aveNCOP;
        double adv2 = calculator.aveNCOU;
        double adv3 = calculator.aveNPOU;

        //Then
        Assert.assertEquals(1, adv, 0.001);
        Assert.assertEquals(1, adv2, 0.001);
        Assert.assertEquals(1, adv3, 0.001);
    }

}



