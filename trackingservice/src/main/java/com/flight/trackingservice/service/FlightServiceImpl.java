package com.flight.trackingservice.service;

import com.flight.trackingservice.exception.ResourceNotFoundException;
import com.flight.trackingservice.model.Flight;
import com.flight.trackingservice.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("FlightServiceImpl")
public class FlightServiceImpl implements FlightService{

    @Autowired
    private FlightRepository flightRepository;

    @Override
    public Flight getFlightById(Long flightId) {
        return flightRepository.findById(flightId).orElseThrow(() -> new ResourceNotFoundException("Flight", "Id", flightId));
    }

    @Override
    public Flight createFlight(Flight flight) {
        return flightRepository.save(flight);
    }

    @Override
    public Flight updateFlight(Long flightId, Flight flightRequest) {
        Flight flight = flightRepository.findById(flightId)
                .orElseThrow(() -> new ResourceNotFoundException("Flight", "Id", flightId));
        flight.setName(flightRequest.getName());
        flight.setCode(flightRequest.getCode());
        flight.setPassengers(flightRequest.getPassengers());
        return flightRepository.save(flight);
    }

    @Override
    public ResponseEntity<?> deleteFlight(Long flightId) {
        Flight flight = flightRepository.findById(flightId)
                .orElseThrow(() -> new ResourceNotFoundException("Flight", "Id", flightId));
        flightRepository.delete(flight);
        return ResponseEntity.ok().build();
    }

    @Override
    public List<Flight> getAllFlight() {
        return flightRepository.findAll();
    }
}
