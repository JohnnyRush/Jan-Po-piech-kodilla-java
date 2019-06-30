package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SkyScanner {

    public void findFlight(Flight flight) throws RouteNotFoundException{
        Map<String, Boolean> fligthList = new HashMap<>();
        fligthList.put("Berlin", false);
        fligthList.put("Moscow", true);
        fligthList.put("Paris", true);
        fligthList.put("London", false);


        if(fligthList.containsKey(flight.getArrivalAirport())){
                if(fligthList.get(flight.getArrivalAirport()) == true){
                    System.out.println("Flight found!");
                }else{
                    System.out.println("You can not fly there!");
                }
        }else{
            throw new RouteNotFoundException("Route not found.");
        }
    }


    public static void main(String[] args) {
        Flight flight1 = new Flight("Berlin" , "Sydney");
        SkyScanner skyScanner = new SkyScanner();

        try{
            skyScanner.findFlight(flight1);
        }catch (RouteNotFoundException e){
            System.out.println("Error: " + e);
        }finally {
            System.out.println("Search completed.");
        }

    }
}
