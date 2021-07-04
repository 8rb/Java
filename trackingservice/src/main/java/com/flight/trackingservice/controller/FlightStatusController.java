package com.flight.trackingservice.controller;

import com.flight.trackingservice.model.FlightStatus;
import com.flight.trackingservice.service.FlightStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController("FlightStatus")
@CrossOrigin
@RequestMapping("/api")
public class FlightStatusController {
    @Autowired
    private FlightStatusService flightStatusService;

    @GetMapping("/flight_status")
    public List<FlightStatus> getAllFlightStatus(){
        return flightStatusService.getAllFlightStatus();
    }

    @GetMapping("/flight_status/{id}")
    public FlightStatus getFlightStatusById(@PathVariable(name = "id") Long flightStatusId){
        return flightStatusService.getFlightStatusById(flightStatusId);
    }

    @PostMapping("/flight_status")
    public FlightStatus createFlightStatus(@Valid @RequestBody FlightStatus resource)  {
        return flightStatusService.createFlightStatus(resource);
    }

    @PutMapping("/flight_status/{id}")
    public FlightStatus updateFlightStatus(@PathVariable(name = "id") Long flightStatusId, @Valid @RequestBody FlightStatus resource) {
        return flightStatusService.updateFlightStatus(flightStatusId, resource);
    }

    @DeleteMapping("/flight_status/{id}")
    public ResponseEntity<?> deleteFlightStatus(@PathVariable(name = "id") Long flightStatusId) {
        return flightStatusService.deleteFlightStatus(flightStatusId);
    }

}
