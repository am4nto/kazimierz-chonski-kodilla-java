package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightFinder {
    HashMap<String, Boolean>foundFlights = new HashMap<String, Boolean>();

    public void findFilght (Flight flight){
        foundFlights.put(flight.getArrivalAirport(), true);
    }

    public void displayFlight(String airport) throws RouteNotFoundException {
        if (foundFlights.containsKey(airport)){
            System.out.println("U can fly to " + airport);
        }
        else throw new RouteNotFoundException("Airport not found");
    }

    public static void main(String args[]){
        Flight flight1 = new Flight("Warszawa", "Krakow");
        Flight flight2 = new Flight("Krakow", "Warszawa");
        Flight flight3 = new Flight("Warszawa", "Gdansk" );

        FlightFinder finder = new FlightFinder();
        finder.findFilght(flight1);
        finder.findFilght(flight2);
        finder.findFilght(flight3);

        try {
            finder.displayFlight("Warszawa");
            finder.displayFlight("Sosnowiec");
        }catch (Exception e) {
            System.out.println("Route not found: " + e);
        }finally {
            System.out.println("Have a nice flight");
        }
    }
}
