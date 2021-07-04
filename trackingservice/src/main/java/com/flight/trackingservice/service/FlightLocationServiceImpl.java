package com.flight.trackingservice.service;

import com.flight.trackingservice.exception.ResourceNotFoundException;
import com.flight.trackingservice.model.FlightLocation;
import com.flight.trackingservice.repository.FlightLocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("FlightLocationServiceImpl")
public class FlightLocationServiceImpl implements FlightLocationService {

    @Autowired
    private FlightLocationRepository flightLocationRepository;

    @Override
    public FlightLocation getFlightLocationById(Long flightLocationId) {
        return flightLocationRepository.findById(flightLocationId).orElseThrow(() -> new ResourceNotFoundException("FlightLocation", "Id", flightLocationId));
    }

    @Override
    public FlightLocation createFlightLocation(FlightLocation flightLocation) {
        return flightLocationRepository.save(flightLocation);
    }

    @Override
    public FlightLocation updateFlightLocation(Long flightLocationId, FlightLocation flightLocationRequest) {
        FlightLocation flightLocation = flightLocationRepository.findById(flightLocationId)
                .orElseThrow(() -> new ResourceNotFoundException("FlightLocation", "Id", flightLocationId));
        flightLocation.setActualCoordinates(flightLocationRequest.getActualCoordinates());
        flightLocation.setDepartureCoordinates(flightLocationRequest.getDepartureCoordinates());
        flightLocation.setArrivalCoordinates(flightLocationRequest.getArrivalCoordinates());
        return flightLocationRepository.save(flightLocation);
    }

    @Override
    public ResponseEntity<?> deleteFlightLocation(Long flightLocationId) {
        FlightLocation flightLocation = flightLocationRepository.findById(flightLocationId)
                .orElseThrow(() -> new ResourceNotFoundException("FlightLocation", "Id", flightLocationId));
        flightLocationRepository.delete(flightLocation);
        return ResponseEntity.ok().build();
    }

    @Override
    public List<FlightLocation> getAllFlightLocation() {
        return flightLocationRepository.findAll();
    }
}
