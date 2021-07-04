package com.flight.trackingservice.service;

import com.flight.trackingservice.model.Flight;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface FlightService {
    Flight getFlightById(Long flightId);
    Flight createFlight(Flight flight);
    Flight updateFlight(Long flightId, Flight flightRequest);
    ResponseEntity<?> deleteFlight(Long flightId);
    List<Flight> getAllFlight();
}
