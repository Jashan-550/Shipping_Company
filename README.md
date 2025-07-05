# Shipping Company - Backend Programming Homework

## Project Overview

This Java application calculates the shipping cost of liquid and liquefied gas products transported from Hamburg harbor to various European cities using tanker trucks of different sizes. The system considers material properties, risk factors, truck capacities, and distances to determine the best and most cost-effective shipping method.

---

## Features

- Supports 10 different materials (e.g., Oxygen, Hydrogen, Nitrogen, Propene, etc.) with associated risk factors.
- Three tanker truck sizes with specific dimensions for volume calculation.
- Calculates shipping cost based on:
  - Distance between Hamburg and destination city.
  - Risk factor for each material.
  - Shipping cost per gallon per kilometer.
  - Truck return trip cost (empty truck returning to Hamburg).
- Accepts orders with volume in gallons and outputs calculations in gallons and cubic meters.
- Finds the best combination of trucks to minimize cost for the shipment.
- Uses Object-Oriented Programming principles with appropriate package structure:
  - `tanks` package for `Item` and `Truck` classes.
  - `distance` package for calculations.
  - `calculation` package for shipping cost computations.
  - `main` package for running the application and user interaction.

---

## Usage

1. **Run the main program** which will prompt the user to input order details:
   - Material type (e.g., O2, H2)
   - Volume to ship (in gallons)
   - Destination city from the supported list or specify distance for other cities.

2. The program will:
   - Calculate total volume and weight.
   - Determine the best shipping method (truck combination).
   - Compute and display the total shipping cost.

---

## Package Structure

- **tanks**  
  Contains `Item` and `Truck` classes with methods to calculate volume and print info.

- **distance**  
  Contains calculation methods for distances and shipping-related computations.

- **calculation**  
  Implements shipping price calculation, best shipping strategy, and order handling.

- **main**  
  Entry point of the program, handles user input and output.

---

## Notes

- The program uses proper encapsulation (private variables) and OOP principles including inheritance and abstraction.
- Lists/arrays are used for storing items and orders.
- UTF-8 encoding is ensured.
- Detailed comments are included within the code for clarity.
- The program is designed to be modular and extendable.

---

## Author

Jashanpreet Singh Roop Rai  
Matriculation Number: 373**257   
Date of creation: 2025-06-07

---

## How to Run

1. Import the project into Eclipse or any Java IDE.
2. Compile all packages.
3. Run the `main` package class with the `main` method.
4. Follow the console prompts to place orders and view shipping cost results.

---

## License

This project is developed as part of Backend Programming homework for EU University Summer 2025.

---

*Good luck with your shipment calculations!*

