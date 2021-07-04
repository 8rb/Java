package com.flight.trackingservice.service;
import com.flight.trackingservice.model.FlightStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface FlightStatusService {
    FlightStatus getFlightStatusById(Long flightStatusId);
    FlightStatus createFlightStatus(FlightStatus flightStatus);
    FlightStatus updateFlightStatus(Long flightStatusId, FlightStatus flightStatusRequest);
    ResponseEntity<?> deleteFlightStatus(Long flightStatusId);
    List<FlightStatus> getAllFlightStatus();
}
