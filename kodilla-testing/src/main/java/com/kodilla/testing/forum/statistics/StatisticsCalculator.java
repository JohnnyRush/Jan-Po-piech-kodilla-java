package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class StatisticsCalculator {

    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    double aveNPOU; // aveNPFU means: average Number Posts On User
    double aveNCOU; // Similar how higher but C means comments
    double aveNCOP; // Number Comments On Post



    public void calculateAdvStatistics(Statistics statistics){
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        aveNPOU = numberOfPosts/numberOfUsers;
        aveNCOU = numberOfComments/numberOfUsers;
        aveNCOP = numberOfComments/numberOfPosts;
    }
    public void showStatistics(){
        System.out.println("Liczba użytkowników: " + numberOfUsers);
        System.out.println("Liczba postów: " + numberOfPosts);
        System.out.println("Liczba komentarzy: " + numberOfComments);
        System.out.println("Średnia liczba postów na użytkownika: " + aveNPOU);
        System.out.println("Średnia liczba komentarzy na użytkownika: " + aveNCOU);
        System.out.println("Średnia liczba komentarzy na post: " + aveNCOP);
    }
}
