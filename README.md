## API Learning w/ Spring Boot (Data, JPA, REST, MVC, Security, etc.)

### A. Getting Started
#### 1. Prerequisites
- [ ] Java 11 or 17
- [ ] Spring Boot `2.7.9-SNAPSHOT`
- [ ] IntelliJ, STS, Eclipse, etc.

#### 2. Running the Application
- To **RUN** the project
    ```mvn
    mvn spring-boot:run
    ```
- To **CLEAN** & remove any existing build artifacts: ( Note: Run when pom.xml is updated )
    ```mvn
    mvn clean 
    ```
- To **INSTALL** the project  ( Note: Run when pom.xml is updated )
   ```mvn
   mvn install 
   ```
- To download the **sources** for your project's dependencies, run the following command:
    ```mvn
    mvn dependency:sources
    ```
- To download the **documentation** for your project's dependencies, run the following command:
    ```mvn
    mvn dependency:resolve -Dclassifier=javadoc
    ```
### B. Tools

| App           | Link                                        |
|---------------|---------------------------------------------|
| `Spring Boot` | http://localhost:8080/users                 |
| `Swagger`     | http://localhost:8080/swagger-ui/index.html |
| `H2`          | http://localhost:8080/h2-console            |
|               | `url` : jdbc:h2:mem:testdb                  |
|               | `driver` : org.h2.Driver                    |
|               | `username` : sa                             |
|               | `password` :                                |

### C. Configurations Files
- [Swagger]()
- [application.properties](src/main/resources/application.properties)
- [pom.xml](pom.xml)

### D. Defined Requirements
| Step | Description                                      | Checkpoints                                                           |
|-----:|:-------------------------------------------------|:----------------------------------------------------------------------|
|    1 | Define the purpose and requirements of your API. | **User** (Login & Signup)                                             |
|    2 | Choose a framework.                              | `Springboot 3.0`, `Angular 14`                                        |
|    3 | Design your API endpoints.                       | `JPA` (GET, PUT, DELETE, POST)                                        |
|    4 | Define the data models.                          | **User**: <small>userId, firstName, lastName, email, password</small> |
|    5 | Develop and test the endpoints.                  | `Swagger`, `Postman`, `H2` (in-memory DB), `JUnit 5`                  |
|    6 | Implement authentication and authorization.      | -                                                                     |
|    7 | Document the API.                                | `Swagger`                                                             |
|    8 | Deploy the API.                                  | `AWS`                                                                 |

> **Note:** Subject to change as I learn more about API development.
