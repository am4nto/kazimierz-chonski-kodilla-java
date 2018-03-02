package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightFinder {
    private HashMap<String, Boolean>flights;

    public FlightFinder(HashMap<String, Boolean> flights) {
        this.flights = flights;
    }

    public void findFilght (Flight flight) throws RouteNotFoundException{
        if (flights.containsKey(flight.getArrivalAirport())) {
            System.out.println("U can fly to " + flight.getArrivalAirport());
        } else throw new RouteNotFoundException("Airport not found");
    }

    public static void main(String args[]) {
        Flight flight1 = new Flight("Warszawa", "Krakow");
        Flight flight2 = new Flight("Krakow", "Warszawa");
        Flight flight3 = new Flight("Warszawa", "Gdansk" );

        HashMap<String, Boolean>flightsMap = new HashMap<String, Boolean>();
        flightsMap.put(flight1.getArrivalAirport(), true);
        flightsMap.put(flight2.getArrivalAirport(), true);
        flightsMap.put(flight3.getArrivalAirport(), true);

        FlightFinder finder = new FlightFinder(flightsMap);

        try {
            finder.findFilght(flight1);
            finder.findFilght(new Flight("Warszawa", "Sosnowiec"));
        }catch (Exception e) {
            System.out.println("Route not found: " + e);
        }finally {
            System.out.println("Have a nice flight");
        }
    }
}
