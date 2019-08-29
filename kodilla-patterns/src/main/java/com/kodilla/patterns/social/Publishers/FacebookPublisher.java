package com.kodilla.patterns.social.Publishers;

import com.kodilla.patterns.social.SocialPublisher;

public class FacebookPublisher implements SocialPublisher {

    @Override
    public String share() {
        return "Publicated by Facebook";
    }
}
