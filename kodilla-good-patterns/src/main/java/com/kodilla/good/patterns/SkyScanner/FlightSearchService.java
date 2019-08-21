package com.kodilla.good.patterns.SkyScanner;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class FlightSearchService {


    public List<Flight> flightsFrom(String airport) {
        String s;
        List<Flight> result = FlightList
                .getFlightsList()
                .stream()
                .filter(f -> f.getDeparture().equals(airport))
                .collect(toList());

        if (result.size() > 0) {
            System.out.println("You can fly from " + airport + " to: ");
            for (Flight flight : result) {
                s = flight.getArrival();
                System.out.println(s);
            }
        } else {
            System.out.println("Sorry, we do not organize flights from " + airport);
        }

        return result;
    }

    public List<Flight> flightsTo(String airport) {
        String s;
        List<Flight> result = FlightList
                .getFlightsList()
                .stream()
                .filter(f -> f.getArrival().equals(airport))
                .collect(toList());
        if (result.size() > 0) {
            System.out.println("You can fly to " + airport + " from: ");
            for (Flight flight : result) {
                s = flight.getDeparture();
                System.out.println(s);
            }
        } else {
            System.out.println("Sorry, we do not organize flights to " + airport);
        }

        return result;
    }

    public List<Flight> flightByCity(String departureAirport, String transferAirport, String arrivalAirport) {
        String s;
        List<Flight> result = FlightList
                .getFlightsList()
                .stream()
                .filter(f -> f.getDeparture().equals(departureAirport))
                .filter(f -> f.getArrival().equals(transferAirport))
                .collect(toList());
        result.addAll(FlightList
                .getFlightsList()
                .stream()
                .filter(f -> f.getDeparture().equals(transferAirport))
                .filter(f -> f.getArrival().equals(arrivalAirport))
                .collect(toList()));

        if (result.size() > 1) {
            System.out.println("You can fly from " + departureAirport + " to " + arrivalAirport + " via " + transferAirport);
            for (Flight flight : result) {
                s = flight.getDeparture() + "-" + flight.getArrival();
                System.out.println(s);
            }
        } else {
            System.out.println("You can not fly from " + departureAirport + " to " + arrivalAirport + " via " + transferAirport);
        }

        return result;
    }
}
