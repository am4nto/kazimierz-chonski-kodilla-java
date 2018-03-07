package com.kodilla.good.patterns.flights;

import java.util.Set;
import java.util.stream.Collectors;

public class FindFlights {

    private Set<Flight>flights;

    public FindFlights(Set<Flight> flights) {
        this.flights = flights;
    }

    public String findFlightsFrom (String airport) {
        Set<Flight>foundFlights = flights.stream()
                .filter(flight -> flight.getDepartureAirport().equals(airport))
                .collect(Collectors.toSet());
        if (foundFlights.isEmpty()){
            return "Nie znaleziono lotu";
        } else {
            return foundFlights.toString();
        }
    }

    public String findFlightsTo (String airport) {
        Set<Flight>foundFlights = flights.stream()
                .filter(flight -> flight.getArrivalAirport().equals(airport))
                .collect(Collectors.toSet());
        if (foundFlights.isEmpty()){
            return "Nie znaleziono lotu";
        } else {
            return foundFlights.toString();
        }
    }

    public String findFlightsThrough (String departureAirport, String arrivalAirport, String throughAirport) {
        Set<Flight>foundFlights = flights.stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .filter(flight -> flight.getArrivalAirport().equals(arrivalAirport))
                .filter(flight -> flight.getThroughAirports().contains(throughAirport))
                .collect(Collectors.toSet());
        if (foundFlights.isEmpty()){
            return "Nie znaleziono lotu";
        } else {
            return foundFlights.toString();
        }

    }
}
