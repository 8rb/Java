package com.fastinventory.stockservice.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "daily_stocks")
@Data
public class DailyStock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(max = 10)
    private int quantity;

    @NotNull
    @NotBlank
    @Size(max = 100)
    private String date;
}