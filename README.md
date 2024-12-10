Project Description: Car Registration API
The Car Registration API is a basic project developed with Spring Boot, designed to manage a vehicle registration system. This project provides a REST API for performing the following operations:

Register cars with their brand, model, and license plate.
Retrieve a list of registered cars in the system.
The main goal of this project is to serve as a foundation for understanding fundamental backend development concepts with Spring Boot, including creating models, controllers, and repositories, as well as exposing RESTful endpoints.

Technologies Used:
Java 17: The main programming language.
Spring Boot: A framework for Java application development.
H2 Database: An in-memory database for simplicity and testing.
Maven: A build and dependency management tool.
Git: Version control system.
Project Structure:
Model: Represents the data (Car entity).
Repository: Handles database interactions.

## Database Initialization

The [`data.sql`](src/main/resources/data.sql) file contains an SQL script that initializes the `car` table with 20 example vehicles. This script is automatically executed when the application starts, thanks to the default Spring Boot configuration, which loads the `schema.sql` and `data.sql` files into the H2 database.

### Purpose of the Script

- Populate the database with sample data during development.
- Facilitate testing and validation of the system without requiring manual data entry.
- Ensure the database contains initial records to test queries and endpoints.

### Script Content

The file includes 20 entries with a variety of:
- Brands (e.g., Toyota, Ford, Honda).
- Models (e.g., Corolla, Focus, Civic).
- Colors (e.g., Blue, Red, Black).
- Unique license plates.

Feel free to use or modify this script to suit your specific development needs.
### Disclaimer
The license plates, vehicle data, and other information provided in this repository are entirely fictional. They are intended for educational and demonstration purposes only. Any resemblance to actual license plates, vehicles, or real-world data is purely coincidental.