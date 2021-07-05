package com.mvn.trackingservicemvn.repository;

import com.mvn.trackingservicemvn.model.FlightLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightLocationRepository extends JpaRepository<FlightLocation, Long> {

}
