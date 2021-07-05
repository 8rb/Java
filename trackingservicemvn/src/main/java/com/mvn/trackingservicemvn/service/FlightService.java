package com.mvn.trackingservicemvn.service;

import com.mvn.trackingservicemvn.model.Flight;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface FlightService {
    Flight getFlightById(Long flightId);
    Flight createFlight(Flight flight);
    Flight updateFlight(Long flightId, Flight flightRequest);
    ResponseEntity<?> deleteFlight(Long flightId);
    List<Flight> getAllFlight();
}
