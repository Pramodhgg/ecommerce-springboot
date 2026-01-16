package com.ecommerce.project.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "address_id")
    private Long addressId;

    @NotBlank
    @Size(min = 3, message = "Street name should me atleast 3 characters")
    private String street;

    @NotBlank
    @Size(min=3, message = "Building name should me atleast 3 characters")
    private String buildingName;

    @NotBlank
    @Size(min=3, message = "City name should me atleast 3 characters")
    private String city;

    @NotBlank
    @Size(min=3, message = "State name should me atleast 3 characters")
    private String state;

    @NotBlank
    @Size(min=2, message = "Country name should me atleast 3 characters")
    private String country;

    @NotBlank
    @Size(min=3, message = "Pincode name should me atleast 3 characters")
    private String pincode;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
