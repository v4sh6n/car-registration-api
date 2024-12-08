package com.example.car_registry.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Car {
    // The 'id' field acts as the primary key for the Car entity.
    // It uniquely identifies each record in the database.
    @Id
    // The 'GeneratedValue' annotation specifies the strategy for generating the value of the primary key.
    // In this case, GenerationType.IDENTITY indicates that the database will generate the primary key value.
    // The @GeneratedValue annotation specifies how the primary key should be generated.
// The 'GenerationType.IDENTITY' strategy allows the database to auto-increment the value of 'id'.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;
    private String model;
    private int year;
    private String plateNumber; 
    private String color;

    // Getters and Setters
    public Long getId() {
        return id;
    }   
    public void setId(Long id) {
        this.id = id;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }   
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getPlateNumber() {
        return plateNumber;
    }
    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }   
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }       
}
