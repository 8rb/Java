package com.mvn.trackingservicemvn.controller;

import com.mvn.trackingservicemvn.model.FlightLocation;
import com.mvn.trackingservicemvn.service.FlightLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController("FlightLocation")
@CrossOrigin
@RequestMapping("/api")
public class FlightLocationController {

    @Autowired
    private FlightLocationService flightLocationService;

    @GetMapping("/flight_location")
    public List<FlightLocation> getAllFlightLocation(){
        return flightLocationService.getAllFlightLocation();
    }

    @GetMapping("/flight_location/{id}")
    public FlightLocation getFlightLocationById(@PathVariable(name = "id") Long flightLocationId){
        return flightLocationService.getFlightLocationById(flightLocationId);
    }

    @PostMapping("/flight_location")
    public FlightLocation createFlightLocation(@Valid @RequestBody FlightLocation resource)  {
        return flightLocationService.createFlightLocation(resource);
    }

    @PutMapping("/flight_location/{id}")
    public FlightLocation updateFlightLocation(@PathVariable(name = "id") Long flightLocationId, @Valid @RequestBody FlightLocation resource) {
        return flightLocationService.updateFlightLocation(flightLocationId, resource);
    }

    @DeleteMapping("/flight_location/{id}")
    public ResponseEntity<?> deleteFlightLocation(@PathVariable(name = "id") Long flightLocationId) {
        return flightLocationService.deleteFlightLocation(flightLocationId);
    }
}
