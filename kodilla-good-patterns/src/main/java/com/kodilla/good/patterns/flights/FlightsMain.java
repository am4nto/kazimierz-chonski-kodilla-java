package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FlightsMain {
    public static void main(String args[]){
        List<String> throughAirports1 = new ArrayList<>();
        List<String> throughAirports2 = new ArrayList<>();

        throughAirports1.add("Warszawa");
        throughAirports1.add("Krakow");

        throughAirports2.add("Gdynia");
        throughAirports2.add("Warszawa");

        Flight flight1 = new Flight("Gdansk", "Katowice", throughAirports1);
        Flight flight2 = new Flight("Gdansk", "Katowice", throughAirports2);
        Flight flight3 = new Flight("Gdansk", "Czestochowa", null);
        Flight flight4 = new Flight("Szczecin", "Katowice", null);

        Set<Flight>flights = new HashSet<>();
        flights.add(flight1);
        flights.add(flight2);
        flights.add(flight3);
        flights.add(flight4);

        FindFlights findFlights = new FindFlights(flights);

            System.out.println("Loty z Gdanska: " + findFlights.findFlightsFrom("Gdansk"));
            System.out.println("Loty z Sosnowca: " + findFlights.findFlightsFrom("Sosnowiec"));
            System.out.println("Loty do Katowic: " + findFlights.findFlightsTo("Katowice"));
            System.out.println("Loty z Gdanska do Katowic przez Warszawe :" + findFlights.findFlightsThrough("Gdansk", "Katowice", "Warszawa"));
    }
}
