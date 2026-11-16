Product Management API
Activité Pratique N°2 — ORM JPA, Hibernate & Spring Data
Project Information
Information	Details
Course	ORM JPA, Hibernate & Spring Data
Practical Work	Activité Pratique N°2
Instructor	Mohamed YOUSSFI
Student	[Your Full Name]
Institution	Mundiapolis University
Development Environment	IntelliJ IDEA Ultimate
Project Type	RESTful Web Application
1. Project Overview

This project focuses on the development of a Product Management REST API using the Spring Boot ecosystem.

The main objective is to implement object-relational mapping (ORM) with JPA and Hibernate, integrate a relational database using H2, and manage data persistence through Spring Data JPA.

The application provides a set of RESTful endpoints that allow clients to perform the fundamental CRUD operations (Create, Read, Update, Delete) on product records.

2. Technologies & Tools

The project is developed using the following technologies:

Technology	Purpose
Java 21	Core programming language
Spring Boot	Application framework
Spring Web	REST API development
Spring Data JPA	Data persistence and repository management
Hibernate	ORM implementation
H2 Database	Relational database management
Lombok	Reduction of boilerplate code
Swagger / OpenAPI	API documentation and testing
Maven	Dependency management and project build
IntelliJ IDEA Ultimate	Integrated development environment
3. Project Architecture

The application follows a layered architecture that separates data representation, persistence operations, and HTTP request handling.

text
demobdccspringdata/
│
├── src/
│   └── main/
│       ├── java/
│       │   └── me/mundiapolis/demobdccspringdata/
│       │       │
│       │       ├── entities/
│       │       │   └── Product.java
│       │       │
│       │       ├── repository/
│       │       │   └── ProductRepository.java
│       │       │
│       │       ├── web/
│       │       │   └── ProductRestController.java
│       │       │
│       │       └── DemoBdccSpringDataApplication.java
│       │
│       └── resources/
│           └── application.properties
│
├── pom.xml
└── README.md

Architectural Components
Entity Layer: Defines the persistent domain model.
Repository Layer: Handles database access through Spring Data JPA.
Web Layer: Exposes REST endpoints and processes HTTP requests.
Configuration Layer: Defines database and application settings.
4. Domain Model — Product

The Product entity represents the main business object of the application.

It is mapped to a relational database table using JPA annotations.

Entity Attributes
Attribute	Java Type	Description
id	Long	Unique product identifier
name	String	Product name
price	double	Product price
quantity	int	Available product quantity
Persistence Annotations
@Entity: Marks the class as a JPA entity.
@Id: Defines the primary key.
@GeneratedValue: Configures automatic identifier generation.

Lombok annotations are used to simplify the implementation by generating getters, setters, and constructors.

5. Database Configuration

The application uses H2, an embedded relational database, for data persistence.

Database configuration is defined in:

src/main/resources/application.properties

Hibernate manages the database schema based on the JPA entity definitions.

The H2 console can be accessed through:

http://localhost:8084/h2-console

Note: The database configuration determines whether data is stored in memory or persisted to disk.

6. Data Access Layer — Spring Data JPA

The ProductRepository interface extends:

JpaRepository<Product, Long>

This provides built-in persistence operations without requiring manual SQL queries.

Main Repository Operations
Method	Function
save()	Inserts or updates a product
findAll()	Retrieves all products
findById()	Retrieves a product by its identifier
findByNameContains()	Searches products by name
deleteById()	Deletes a product by its identifier

Spring Data JPA also supports derived query methods, allowing database queries to be generated from method names.

7. REST API — CRUD Operations

The ProductRestController exposes HTTP endpoints for interacting with product resources.

API Endpoint Documentation
HTTP Method	Endpoint	Description
GET	/products	Retrieve all products
GET	/products/{id}	Retrieve a product by ID
GET	/find/products?kw={keyword}	Search products by name
POST	/products	Create a new product
PUT	/products/{id}	Update an existing product
DELETE	/products/{id}	Delete a product
Example Request — Create a Product

HTTP Method: POST

Endpoint: /products

Request Body:

json
{
  "name": "Laptop",
  "price": 7500.00,
  "quantity": 10
}

Example Request — Retrieve All Products

HTTP Method: GET

Endpoint: /products

Example Request — Search Products

HTTP Method: GET

Endpoint: /find/products?kw=laptop

Example Request — Update a Product

HTTP Method: PUT

Endpoint: /products/1

Request Body:

json
{
  "name": "Updated Laptop",
  "price": 8000.00,
  "quantity": 15
}

Example Request — Delete a Product

HTTP Method: DELETE

Endpoint: /products/1

8. API Documentation & Testing

The project integrates Swagger UI through the Springdoc OpenAPI library.

Swagger provides an interactive interface for:

Discovering available REST endpoints.
Inspecting HTTP methods and request parameters.
Submitting JSON request bodies.
Executing API operations.
Inspecting HTTP responses.
Accessing Swagger UI

Start the Spring Boot application and navigate to:

http://localhost:8084/swagger-ui/index.html

OpenAPI Specification

The generated API specification is available at:

http://localhost:8084/v3/api-docs

9. Learning Outcomes

Through this practical assignment, the following concepts were explored and implemented:

Understanding the principles of Object-Relational Mapping (ORM).
Creating and configuring JPA entities.
Understanding the relationship between JPA and Hibernate.
Configuring an H2 relational database.
Implementing repository interfaces with Spring Data JPA.
Developing RESTful endpoints using Spring Web.
Implementing CRUD operations for persistent entities.
Testing and documenting REST APIs using Swagger/OpenAPI.
10. Conclusion

This practical assignment provided an opportunity to implement a complete data persistence workflow using the Spring Boot ecosystem.

The application demonstrates how JPA, Hibernate, and Spring Data JPA simplify database interaction through object-relational mapping and repository abstractions.

Furthermore, the implementation of RESTful endpoints illustrates how backend services can expose structured data operations to external clients.

The integration of H2 and Swagger/OpenAPI provides a convenient environment for database experimentation, API documentation, and functional testing.


Assignment: Activité Pratique N°2 — ORM JPA Hibernate Spring Data

Reference Video: https://www.youtube.com/watch?v=UXs39oVoaSs
