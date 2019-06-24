package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    private final String countryName;
    private final String peopleQ;

    public Country(String countryName, String peopleQ) {
        this.countryName = countryName;
        this.peopleQ = peopleQ;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getPeopleQ() {
        return peopleQ;
    }
    public BigDecimal getPeopleQuantity() {
        BigDecimal peopleQuantity = new BigDecimal(getPeopleQ());
        return peopleQuantity;
    }
}