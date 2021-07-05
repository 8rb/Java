package com.fastinventory.stockservice.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "products")
@Data
public class Product {
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
    @NotBlank
    @Size(max = 100)
    private String description;

    @NotNull
    @Size(max = 10)
    private float price;
}
