package com.kodilla.patterns.social;

import com.kodilla.patterns.social.Publishers.FacebookPublisher;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User john = new Millenials("John");
        User tom = new YGeneration("Tom");
        User monica = new ZGeneration("Monica");

        //When
        String johnPublicatedBy = john.share();
        System.out.println("John: " + johnPublicatedBy);
        String tomPublicatedBy = tom.share();
        System.out.println("Tom: " + tomPublicatedBy);
        String monicaPublicatedBy = monica.share();
        System.out.println("Monica: " + monicaPublicatedBy);

        //Then
        Assert.assertEquals("Publicated by Snapchat", johnPublicatedBy);
        Assert.assertEquals("Publicated by Facebook", tomPublicatedBy);
        Assert.assertEquals("Publicated by Twitter", monicaPublicatedBy);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User john = new Millenials("John");

        //When
        String johnPublicatedBy = john.share();
        System.out.println("John: " + johnPublicatedBy);
        john.setSocialPublisher(new FacebookPublisher());
        johnPublicatedBy = john.share();
        System.out.println("John: " + johnPublicatedBy);

        //Then
        Assert.assertEquals("Publicated by Facebook", johnPublicatedBy);
    }
}
