package com.kodilla.patterns.social.Publishers;

import com.kodilla.patterns.social.SocialPublisher;

public class SnapchatPublisher implements SocialPublisher {

    @Override
    public String share() {
        return "Publicated by Snapchat";
    }
}
