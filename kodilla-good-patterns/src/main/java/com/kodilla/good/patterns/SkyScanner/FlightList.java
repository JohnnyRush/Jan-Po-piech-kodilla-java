package com.kodilla.good.patterns.SkyScanner;

import java.util.ArrayList;

public class FlightList {

    public static ArrayList<Flight> getFlightsList() {
        ArrayList<Flight> flightsList = new ArrayList<>();
        flightsList.add(new Flight("KRK","WAW"));
        flightsList.add(new Flight("KRK","MIA"));
        flightsList.add(new Flight("GDN","WAW"));
        flightsList.add(new Flight("GDN","KRK"));
        flightsList.add(new Flight("WAW","TBS"));
        flightsList.add(new Flight("WAW","GDN"));
        flightsList.add(new Flight("WAW","MIA"));
        flightsList.add(new Flight("MIA","WAW"));
        flightsList.add(new Flight("MIA","KRK"));
        flightsList.add(new Flight("TBS","GDN"));
        flightsList.add(new Flight("KRK","TBS"));

        return flightsList;
    }
}
