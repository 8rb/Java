package com.mvn.trackingservicemvn.repository;

import com.mvn.trackingservicemvn.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
}
