package com.kodilla.patterns.social.Publishers;

import com.kodilla.patterns.social.SocialPublisher;

public class TwitterPublisher implements SocialPublisher {

    @Override
    public String share() {
        return "Publicated by Twitter";
    }
}
