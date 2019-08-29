package com.kodilla.patterns.social;

import com.kodilla.patterns.social.Publishers.SnapchatPublisher;

public class Millenials extends User {

    public Millenials(String name) {
        super(name);
        this.socialPublisher = new SnapchatPublisher();
    }
}
