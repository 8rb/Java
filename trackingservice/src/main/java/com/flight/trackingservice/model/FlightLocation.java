package com.flight.trackingservice.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "flight_locations")
@Data
public class FlightLocation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotBlank
    @Size(max = 30)
    private String actualCoordinates;

    @NotNull
    @NotBlank
    @Size(max = 30)
    private String departureCoordinates;

    @NotNull
    @NotBlank
    @Size(max = 30)
    private String arrivalCoordinates;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "flight_id", referencedColumnName = "id")
    private Flight flight;
}
