-- Example script to populate the 'car' table with test data.
-- This script inserts 20 vehicles with different brands, models, colors, and license plates.
-- It is intended for database initialization during development or testing.
-- Ensure that the 'car' table is already created before running this script.
INSERT INTO car (brand, model, manufacture_year, color, plate_number)
VALUES
  ('Toyota', 'Corolla', 2020, 'Blue', '1234-XYZ'),
  ('Ford', 'Focus', 2018, 'Red', '5678-ABC'),
  ('Honda', 'Civic', 2021, 'Black', '9101-DEF'),
  ('Chevrolet', 'Malibu', 2019, 'White', '2345-GHI'),
  ('Nissan', 'Altima', 2022, 'Gray', '3456-JKL'),
  ('Mazda', 'Mazda3', 2020, 'Silver', '4567-MNO'),
  ('Hyundai', 'Elantra', 2017, 'Blue', '5678-PQR'),
  ('Kia', 'Optima', 2021, 'Black', '6789-STU'),
  ('Volkswagen', 'Jetta', 2019, 'White', '7890-VWX'),
  ('Subaru', 'Impreza', 2018, 'Red', '8901-YZA'),
  ('BMW', '3 Series', 2020, 'Blue', '9012-ZBC'),
  ('Mercedes-Benz', 'C-Class', 2019, 'Gray', '1123-CDE'),
  ('Audi', 'A4', 2021, 'Silver', '2234-DEF'),
  ('Lexus', 'ES', 2022, 'Black', '3345-EFG'),
  ('Tesla', 'Model 3', 2021, 'White', '4456-FGH'),
  ('Volvo', 'S60', 2018, 'Gray', '5567-GHI'),
  ('Jeep', 'Cherokee', 2020, 'Red', '6678-HIJ'),
  ('Ford', 'Explorer', 2019, 'Blue', '7789-IJK'),
  ('Chevrolet', 'Tahoe', 2021, 'Black', '8890-JKL'),
  ('Toyota', 'Camry', 2022, 'White', '9901-KLM');