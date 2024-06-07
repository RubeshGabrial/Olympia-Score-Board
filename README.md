# Olympia Score Board Application

## Overview

The Olympia Score Board Application is a Spring Boot project designed to manage and track the details of various countries participating in an event, including the participants' medals and total expenses. The project utilizes MongoDB for data storage.

## Table of Contents

- [Overview](#overview)
- [Technologies Used](#technologies-used)
- [Endpoints](#endpoints)
  - [Add Country Details](#add-country-details)
  - [Get Country Details by Name](#get-country-details-by-name)
  - [Get All Country Details](#get-all-country-details)
  - [Calculate Total Expenses](#calculate-total-expenses)
- [JSON Formats and Postman Test Results](#json-formats-and-postman-test-results)
- [Setup and Running the Project](#setup-and-running-the-project)
- [Contributing](#contributing)
- [Contact](#contact)

## Technologies Used

- **Java 17**
- **Spring Boot**
- **Spring Data MongoDB**
- **MongoDB**
- **Maven**



## Endpoints

### Add Country Details

- **Endpoint:** `POST /api/myboard/addCountry`
- **Description:** Adds the details of a country, including participants and their medals.

### Get Country Details by Name

- **Endpoint:** `GET /api/myboard/getCountryDetails/{countryName}`
- **Description:** Retrieves the details of a specific country by its name.

### Get All Country Details

- **Endpoint:** `GET /api/myboard/getAllCountryDetails`
- **Description:** Retrieves the details of all countries.

### Calculate Total Expenses

- **Endpoint:** `GET /api/myboard/calculateTotalExpenses/{countryName}`
- **Description:** Calculates the total expenses for a specific country.

## JSON Formats and Postman Test Results

The attached Word document contains the JSON formats for all four methods and the test results from Postman.

## Setup and Running the Project

1. **Clone the repository:**

    ```sh
    git clone https://github.com/RubeshGabrial/myboard-application.git
    cd OlympiaScoreBoard-application
    ```

2. **Configure MongoDB:**

    Ensure MongoDB is running on your local machine or configure the connection in `src/main/resources/application.properties`:

    ```properties
    spring.data.mongodb.host=localhost
    spring.data.mongodb.port=27017
    spring.data.mongodb.database=myboard
    ```

3. **Build the project using Maven:**

    ```sh
    mvn clean install
    ```

4. **Run the application:**

    ```sh
    mvn spring-boot:run
    ```

5. **Test the endpoints using Postman or any other API testing tool.**

## Contributing

Contributions are welcome! Please open an issue or submit a pull request.

## Contact

For any queries, please contact me at: rubesh.gabrial1994@gmail.com
