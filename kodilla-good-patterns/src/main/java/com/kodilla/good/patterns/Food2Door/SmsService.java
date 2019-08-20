package com.kodilla.good.patterns.Food2Door;

public class SmsService implements InformationService {

    @Override
    public void inform(Integer phoneNubmber) {
        System.out.println("I'm sending a message to the number: " + phoneNubmber);
    }
}
