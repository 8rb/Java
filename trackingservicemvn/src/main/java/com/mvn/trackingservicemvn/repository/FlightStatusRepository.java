package com.mvn.trackingservicemvn.repository;

import com.mvn.trackingservicemvn.model.FlightStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightStatusRepository extends JpaRepository<FlightStatus, Long> {
}
