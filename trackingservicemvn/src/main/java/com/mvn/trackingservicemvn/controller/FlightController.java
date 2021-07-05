package com.mvn.trackingservicemvn.controller;

import com.mvn.trackingservicemvn.model.Flight;
import com.mvn.trackingservicemvn.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController("Flight")
@CrossOrigin
@RequestMapping("/api")
public class FlightController {

    @Autowired
    private FlightService flightService;

    @GetMapping("/flight")
    public List<Flight> getAllFlight(){
        return flightService.getAllFlight();
    }

    @GetMapping("/flight/{id}")
    public Flight getFlightById(@PathVariable(name = "id") Long flightId){
        return flightService.getFlightById(flightId);
    }

    @PostMapping("/flight")
    public Flight createFlight(@Valid @RequestBody Flight resource)  {
        return flightService.createFlight(resource);
    }

    @PutMapping("/flight/{id}")
    public Flight updateFlight(@PathVariable(name = "id") Long flightId, @Valid @RequestBody Flight resource) {
        return flightService.updateFlight(flightId, resource);
    }

    @DeleteMapping("/flight/{id}")
    public ResponseEntity<?> deleteFlight(@PathVariable(name = "id") Long flightId) {
        return flightService.deleteFlight(flightId);
    }
}
