package com.example.car_registry.controller;

import com.example.car_registry.model.Car;
import com.example.car_registry.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    @Autowired
    private CarRepository carRepository;

    // List all cars
    @GetMapping
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    // Create a new car
    @PostMapping
    public ResponseEntity<Car> createCar(@RequestBody Car car) {
        Car savedCar = carRepository.save(car);
        return ResponseEntity.status(201).body(savedCar);
    }

    // Update a car
    @PutMapping("/{id}")
    public ResponseEntity<Car> updateCar(@PathVariable Long id, @RequestBody Car carDetails) {
        Car car = carRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Car not found"));

        car.setBrand(carDetails.getBrand());
        car.setModel(carDetails.getModel());
        car.setPlateNumber(carDetails.getPlateNumber());
        car.setColor(carDetails.getColor());
        car.setManufactureYear(carDetails.getManufactureYear());

        Car updatedCar = carRepository.save(car);   
        return ResponseEntity.ok(updatedCar);
    }

    // Delete a car
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCar(@PathVariable Long id) {
        carRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
