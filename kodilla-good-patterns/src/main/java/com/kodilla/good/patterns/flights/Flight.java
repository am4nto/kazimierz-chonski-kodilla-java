package com.kodilla.good.patterns.flights;

import java.util.List;
import java.util.Objects;

public final class Flight {
    private final String departureAirport;
    private final String arrivalAirport;
    private final List<String> throughAirports;

    public Flight(final String departureAirport, final String arrivalAirport, final List throughAirports) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.throughAirports = throughAirports;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {

        return arrivalAirport;
    }

    public List getThroughAirports() {

        return throughAirports;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(departureAirport, flight.departureAirport) &&
                Objects.equals(arrivalAirport, flight.arrivalAirport) &&
                Objects.equals(throughAirports, flight.throughAirports);
    }

    @Override
    public int hashCode() {

        return Objects.hash(departureAirport);
    }

    @Override
    public String toString() {
        if(throughAirports != null) {
            return "Lot z " + departureAirport + " do " + arrivalAirport + " przez: " + throughAirports;
        } else {
            return "Lot z " + departureAirport + " do " + arrivalAirport;
        }
    }
}
