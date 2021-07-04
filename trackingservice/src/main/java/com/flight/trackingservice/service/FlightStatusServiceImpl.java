package com.flight.trackingservice.service;

import com.flight.trackingservice.exception.ResourceNotFoundException;
import com.flight.trackingservice.model.FlightStatus;
import com.flight.trackingservice.repository.FlightStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("FlightStatusServiceImpl")
public class FlightStatusServiceImpl implements FlightStatusService{

    @Autowired
    private FlightStatusRepository flightStatusRepository;

    @Override
    public FlightStatus getFlightStatusById(Long flightStatusId) {
        return flightStatusRepository.findById(flightStatusId).orElseThrow(() -> new ResourceNotFoundException("FlightStatus", "Id", flightStatusId));
    }

    @Override
    public FlightStatus createFlightStatus(FlightStatus flightStatus) {
        return flightStatusRepository.save(flightStatus);
    }

    @Override
    public FlightStatus updateFlightStatus(Long flightStatusId, FlightStatus flightStatusRequest) {
        FlightStatus flightStatus = flightStatusRepository.findById(flightStatusId)
                .orElseThrow(() -> new ResourceNotFoundException("FlightStatus", "Id", flightStatusId));
        flightStatus.setHasArrived(flightStatusRequest.getHasArrived());
        flightStatus.setDepartureTime(flightStatusRequest.getDepartureTime());
        flightStatus.setArrivalTime(flightStatusRequest.getArrivalTime());
        return flightStatusRepository.save(flightStatus);
    }

    @Override
    public ResponseEntity<?> deleteFlightStatus(Long flightStatusId) {
        FlightStatus flightStatus = flightStatusRepository.findById(flightStatusId)
                .orElseThrow(() -> new ResourceNotFoundException("FlightStatus", "Id", flightStatusId));
        flightStatusRepository.delete(flightStatus);
        return ResponseEntity.ok().build();
    }

    @Override
    public List<FlightStatus> getAllFlightStatus() {
        return flightStatusRepository.findAll();
    }
}
