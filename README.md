# Employee Management System - Spring Boot

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [How to Use](#how-to-use)
- [Project Structure](#project-structure)
- [Contributing](#contributing)
- [License](#license)
- [Acknowledgements](#acknowledgements)

## Introduction

This is a simple Employee Management System built using Spring Boot. The goal of this project is to provide a basic system for managing employee data, with features such as adding new employees, viewing a list of all employees, and deleting employees from the system.

## Features

- **Add Employee:** Add new employees with details such as name and position.
- **View Employees:** View a list of all employees in the system.
- **Delete Employee:** Remove employees from the system.

## Technologies Used

- [Spring Boot](https://spring.io/projects/spring-boot): Simplifies the development of production-ready Spring applications.
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa): Provides easy data access using the Java Persistence API (JPA).
- [Thymeleaf](https://www.thymeleaf.org/): A modern server-side Java template engine for web and standalone environments.
- [H2 Database](https://www.h2database.com/): An in-memory database for development and testing.

## Getting Started

### Prerequisites

Make sure you have the following installed on your machine:

- Java JDK 8 or higher
- Maven

### Installation

1. **Clone the repository:**

    ```bash
    git clone https://github.com/your-username/employee-management-system.git
    ```

2. **Navigate to the project directory:**

    ```bash
    cd employee-management-system
    ```

3. **Build the project using Maven:**

    ```bash
    mvn clean install
    ```

4. **Run the Spring Boot application:**

    ```bash
    java -jar target/employee-management-system-0.0.1-SNAPSHOT.jar
    ```

    The application will be accessible at [http://localhost:8080](http://localhost:8080).

## How to Use

1. Open your browser and go to [http://localhost:8080](http://localhost:8080).
2. Use the provided form to add new employees.
3. View the list of employees on the main page.
4. Click the "Delete" button to remove an employee.

## Project Structure

The project follows a standard Spring Boot structure:

- **`src/main/java`:** Contains the Java source code.
  - `com.example.employeemanagementsystem`: Main package.
    - `controller`: Contains controllers handling HTTP requests.
    - `model`: Defines the data model (e.g., Employee entity).
    - `repository`: Spring Data JPA repositories.
    - `service`: Business logic and services.
    - `Application.java`: Main application class.
- **`src/main/resources`:** Contains application properties and Thymeleaf templates.

## Contributing

Contributions are welcome! If you find any issues or have improvements to suggest, please open an issue or create a pull request.

## License

This project is licensed under the [MIT License](LICENSE).

## Acknowledgements

- Thank you to the Spring Boot and Thymeleaf communities for providing excellent documentation and resources.
- Special thanks to contributors and users who help improve this project.
