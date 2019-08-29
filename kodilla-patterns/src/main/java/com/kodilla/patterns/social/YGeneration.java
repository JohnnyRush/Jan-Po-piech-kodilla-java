package com.kodilla.patterns.social;

import com.kodilla.patterns.social.Publishers.FacebookPublisher;

public class YGeneration extends User {

    public YGeneration(String name) {
        super(name);
        this.socialPublisher = new FacebookPublisher();
    }
}
