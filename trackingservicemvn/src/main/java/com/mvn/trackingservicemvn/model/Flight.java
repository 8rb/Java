package com.mvn.trackingservicemvn.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "flights")
@Data
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotBlank
    @Size(max = 30)
    private String name;

    @NotNull
    @NotBlank
    @Size(max = 30)
    private String code;

    @NotNull
    @Size(max = 10)
    private int passengers;

    @OneToOne(mappedBy = "flight")
    private FlightLocation flightLocation;

    @OneToOne(mappedBy = "flight")
    private FlightStatus flightStatus;
}
