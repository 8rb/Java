package com.mvn.trackingservicemvn.service;

import com.mvn.trackingservicemvn.model.FlightLocation;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface FlightLocationService {
    FlightLocation getFlightLocationById(Long flightLocationId);
    FlightLocation createFlightLocation(FlightLocation flightLocation);
    FlightLocation updateFlightLocation(Long flightLocationId, FlightLocation flightLocationRequest);
    ResponseEntity<?> deleteFlightLocation(Long flightLocationId);
    List<FlightLocation> getAllFlightLocation();
}
