package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class StatisticsCalculator {

    List<String> usersList = new ArrayList<>();
    List<String> postsList = new ArrayList<>();
    List<String> commentList = new ArrayList<>();
    int numberUsers;
    int numberPosts;
    int numberComments;
    double advNPOU; // NPFU means: Number Posts On User
    double advNCOU; // Similar how higher
    double advNCOP; // Similar how higher




    void calculateAdvStatistics(Statistics statistics){
        numberUsers = usersList.size();
        numberPosts = postsList.size();
        numberComments = commentList.size();

    }
    void showStatistics(){}
}
