# Spring Boot Application

Bootstrapped application using [Spring Initializer](https://start.spring.io/).
- **Build tool:** Gradle
- **Dependencies:** Web, API, Lombok, Spring Data JPA, and PostgreSQL Driver

## Database Configuration

Modified `application.properties` file in `src/main/resources/application.properties` by adding PostgreSQL connection details:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/todo
spring.datasource.username=<Your Username>
spring.datasource.password=<Your Password>
```

Repository Pattern
Implemented the repository pattern to separate the application into different layers:

Repository: Responsible for handling data access logic.
Service: Implements business logic and interacts with the repository.
Model: Defines the data entities.
Controller: Handles HTTP requests and calls the service layer.
In the controller, a service class with an implementation class is used to achieve better separation of concerns.

Project Structure
src
|-- main
|   |-- java
|   |   `-- com.example
|   |       |-- controller
|   |       |   `-- YourController.java
|   |       |-- model
|   |       |   `-- YourModel.java
|   |       |-- repository
|   |       |   `-- YourRepository.java
|   |       |-- service
|   |       |   |-- YourService.java
|   |       |   `-- YourServiceImpl.java
|   |       `-- Application.java
|   `-- resources
|       `-- application.properties


Testing
Testing is currently in progress. Stay tuned for updates.
