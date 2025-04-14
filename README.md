# IPL Fantasy Website

## Description

IPL Fantasy is a Spring Boot application designed to manage player statistics for the Indian Premier League (IPL). This application allows users to view player details, including their performance metrics, and manage player data effectively.

## Features

-   View player statistics

-   Filter players by team, role, and country

-   Add, update, and delete player information


## Technologies Used

-   Java 21

-   Spring Boot 3.4.4

-   Spring Data JPA

-   PostgreSQL

-   Lombok

-   Maven

## Installation

### Prerequisites

-   Java 21 or higher

-   PostgreSQL database

-   Maven

### Steps

1.  **Clone the repository:**

    ```bash
    git clone https://github.com/yourusername/ipl-zone.git
    ```
    ```bash
    cd ipl-zone
    ```

2.  **Set up the PostgreSQL database:**

    -   Create a new database named `ipl_data`.

    -   Update the `src/main/resources/application.properties` file with your PostgreSQL credentials:

        ```bash
        spring.datasource.url=jdbc:postgresql://localhost:5434/ipl_data
        spring.datasource.username=your_username
        spring.datasource.password=your_password
        ```

3.  **Build the project:**

    ```bash
    mvn clean install
    ```

4.  **Run the application:**

    ```bash
    mvn spring-boot:run
    ```

## Usage


### API Endpoints

-   **Get all players:**

    -   `GET /api/v1/player`

-   **Get players by team:**

    -   `GET /api/v1/player?team={teamName}`

-   **Get players by name:**

    -   `GET /api/v1/player?name={searchText}`

-   **Get players by role:**

    -   `GET /api/v1/player?role={roleText}`

-   **Get players by country:**

    -   `GET /api/v1/player?country={countryName}`

-   **Add a new player:**

    -   `POST /api/v1/player`

    -   Request body:

        ```json
        {
          "player": "Player Name",
          "country": "Country",
          "team": "Team",
          "age": 30,
          "captaincyExp": "Yes",
          "payingRole": "Batsman",
          "soldPrice": 10.0,
          // other fields...
        }
        ```

-   **Update an existing player:**

    -   `PUT /api/v1/player`

    -   Request body:

        ```json
        {
          "player": "Player Name",
          "country": "Country",
          "team": "Team",
          "age": 31,
          "captaincyExp": "Yes",
          "payingRole": "Bowler",
          "soldPrice": 12.0,
          // other fields...
        }
        ```

-   **Delete a player:**

    -   `DELETE /api/v1/player/{playerName}`

### Sample Response

Here's an example of what the response might look like when you query the API for a player's information:

```json
{
  "player": "Virat Kohli",
  "country": "India",
  "team": "RCB",
  "age": 32,
  "captaincyExp": "Yes",
  "payingRole": "Batsman",
  "soldPrice": 12.0,
  // other fields...
}
```

Contributing
------------

Contributions are welcome! Please feel free to submit a pull request or open an issue for any suggestions or improvements.

License
-------

This project is licensed under the MIT License - see the <LICENSE> file for details.

Acknowledgments
---------------

-   Thanks to the Spring Boot community for their excellent documentation and support.

-   Special thanks to the IPL for providing an exciting platform for cricket fans.