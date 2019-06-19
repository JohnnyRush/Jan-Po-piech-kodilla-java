package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculatorStatisticTestSuit {

    @Test
    public void testCalculateAdvStatistics1() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> listOfUser = new ArrayList<>();
        for(int i = 1; i < 854; i++){
            listOfUser.add("User " + i);
        }

        when(statisticsMock.usersNames()).thenReturn(listOfUser);
        when(statisticsMock.postsCount()).thenReturn(15680);
        when(statisticsMock.commentsCount()).thenReturn(25478);

        StatisticsCalculator calculator = new StatisticsCalculator();

        //When
        calculator.calculateAdvStatistics(statisticsMock);
        double adv = calculator.aveNCOP;
        double adv2 = calculator.aveNCOU;
        double adv3 = calculator.aveNPOU;

        //Then
        Assert.assertTrue(adv > 0 && adv2 > 0 && adv3 > 0 );

        calculator.showStatistics();
    }

    @Test
    public void testCalculateAdvStatistics2() {
        // posts = 1000,  comments = 0, comments < posts, number of users = 100
        // Given
        Statistics statisticsMock2 = mock(Statistics.class);

        List<String> listOfUser = new ArrayList<>();
        for(int i = 1; i < 101; i++){
            listOfUser.add("User " + i);
        }

        when(statisticsMock2.usersNames()).thenReturn(listOfUser);
        when(statisticsMock2.postsCount()).thenReturn(1000);
        when(statisticsMock2.commentsCount()).thenReturn(0);

        StatisticsCalculator calculator = new StatisticsCalculator();

        //When
        calculator.calculateAdvStatistics(statisticsMock2);
        double adv = calculator.aveNCOP;
        double adv2 = calculator.aveNCOU;
        double adv3 = calculator.aveNPOU;

        //Then
        Assert.assertTrue(adv > 0 && adv2 > 0 && adv3 > 0 );
    }

    @Test
    public void testCalculateAdvStatistics3() {
        // posts = 0,  comments = 5000, comments > posts, number of users = 0
        // Given
        Statistics statisticsMock3 = mock(Statistics.class);

        List<String> listOfUser2 = new ArrayList<>();

        when(statisticsMock3.usersNames()).thenReturn(listOfUser2);
        when(statisticsMock3.postsCount()).thenReturn(0);
        when(statisticsMock3.commentsCount()).thenReturn(500);

        StatisticsCalculator calculator = new StatisticsCalculator();

        //When
        calculator.calculateAdvStatistics(statisticsMock3);
        double adv = calculator.aveNCOP;
        double adv2 = calculator.aveNCOU;
        double adv3 = calculator.aveNPOU;

        //Then
        Assert.assertTrue(adv > 0 && adv2 > 0 && adv3 > 0 );
    }
}



