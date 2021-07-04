package com.flight.trackingservice.repository;

import com.flight.trackingservice.model.FlightLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightLocationRepository extends JpaRepository<FlightLocation, Long> {

}
