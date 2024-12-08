package com.example.car_registry.repository;
import com.example.car_registry.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {    
    // This interface extends JpaRepository, which provides CRUD operations for the Car entity.
    // The 'Car' type parameter specifies the entity type that this repository manages.
    // The 'Long' type parameter specifies the type of the entity's ID.  
    // Custom query methods can be added here if needed
    // For example:
    // Find cars by brand
    java.util.List<Car> findByBrand(String brand);
    
    // Find cars by model
    java.util.List<Car> findByModel(String model);
    
    // Find cars by year
    java.util.List<Car> findByYear(int year);
    
    // Find cars by plate number
    Car findByPlateNumber(String plateNumber);
    
    // Find cars by color
    java.util.List<Car> findByColor(String color);
    
    // Find cars by brand and model
    java.util.List<Car> findByBrandAndModel(String brand, String model);
    
    // Find cars by year greater than
    java.util.List<Car> findByYearGreaterThan(int year);
}

