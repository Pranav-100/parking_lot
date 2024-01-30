# Parking Lot Management System

This project implements a parking lot management system in Java.

## Features

- Parking lot creation with customizable capacity
- Car parking and leaving functionality
- Displaying current parking lot status
- Finding slot numbers based on car registration number
- Finding slot numbers for cars of a particular color
- Finding registration numbers for cars of a particular color

### Building the Project
1. Navigate to the project directory:
2. Build the project using Maven:

### Running the Application

1. After building the project, navigate to the target directory:
2. Run the application:
#### Interactive Mode

To run the application in interactive mode, execute the following commands in your terminal:
```bash
javac Main.java
java Main
```
#### Batch Mode
To run the application in batch mode, provide a text file containing commands as an argument. For example:

```bash
javac Main.java
java Main commands.txt
```

### Running Tests

To run tests using Maven, navigate to the root directory of your Maven project and run the following command:

```bash
mvn test
mvn -Dtest=MainTest test
```

## Usage

### Interactive Mode Commands

When running the application in interactive mode, you can enter the following commands:

- `create_parking_lot <capacity>`: Create a parking lot with the specified capacity.
- `park <registration_number> <color>`: Park a car with the given registration number and color.
- `leave <slot_number>`: Remove a car parked in the specified slot number.
- `status`: Display the current status of the parking lot.
- `registration_numbers_for_cars_with_colour <color>`: Retrieve registration numbers of cars with the specified color.
- `slot_numbers_for_cars_with_colour <color>`: Retrieve slot numbers of cars with the specified color.
- `slot_number_for_registration_number <registration_number>`: Retrieve the slot number for the car with the specified registration number.
- `exit`: Exit the application.

### Batch Mode Commands

When running the application in batch mode, provide a text file containing commands in the format specified above.
