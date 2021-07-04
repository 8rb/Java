package com.flight.trackingservice.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "flight_status")
@Data
public class FlightStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private int hasArrived;

    @NotNull
    @NotBlank
    @Size(max = 30)
    private String departureTime;

    @NotNull
    @NotBlank
    @Size(max = 30)
    private String arrivalTime;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "flight_id", referencedColumnName = "id")
    private Flight flight;
}
