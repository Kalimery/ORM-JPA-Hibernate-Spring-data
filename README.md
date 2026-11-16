
# Product Management API
## Activité Pratique N°2 — ORM JPA, Hibernate & Spring Data

---

## Project Information

| Information | Details |
|---|---|
| Course | ORM JPA, Hibernate & Spring Data |
| Practical Work | Activité Pratique N°2 |
| Instructor | Mohamed YOUSSFI |
| Student | Your Full Name |
| Institution | Mundiapolis University |
| Language | Java 21 |
| Framework | Spring Boot |

---

## 1. Project Overview

This project consists of developing a Product Management REST API using the Spring Boot ecosystem.

The main objective is to understand and implement Object-Relational Mapping (ORM) using JPA and Hibernate, integrate an H2 relational database, and manage data persistence through Spring Data JPA.

The application provides RESTful endpoints to perform CRUD operations (Create, Read, Update, Delete) on product records.

## 2. Technologies & Tools

| Technology | Purpose |
|---|---|
| Java 21 | Programming language |
| Spring Boot | Application framework |
| Spring Web | REST API development |
| Spring Data JPA | Data persistence |
| Hibernate | ORM implementation |
| H2 Database | Relational database |
| Lombok | Boilerplate code reduction |
| Swagger / OpenAPI | API documentation and testing |
| Maven | Dependency management |
| IntelliJ IDEA Ultimate | Development environment |

## 3. Project Architecture

The application follows a layered architecture:

```text
demobdccspringdata/
│
├── src/
│   └── main/
│       ├── java/
│       │   └── me/mundiapolis/demobdccspringdata/
│       │       ├── entities/
│       │       │   └── Product.java
│       │       ├── repository/
│       │       │   └── ProductRepository.java
│       │       ├── web/
│       │       │   └── ProductRestController.java
│       │       └── DemoBdccSpringDataApplication.java
│       │
│       └── resources/
│           └── application.properties
│
├── pom.xml
└── README.md
```

### Main Components

- **Entity Layer:** Defines the Product entity.
- **Repository Layer:** Handles database operations using Spring Data JPA.
- **Web Layer:** Exposes REST API endpoints.
- **Configuration:** Manages database and application settings.

## 4. Product Entity

The `Product` entity represents a product stored in the database.

### Attributes

| Attribute | Type | Description |
|---|---|---|
| id | Long | Unique product identifier |
| name | String | Product name |
| price | double | Product price |
| quantity | int | Product quantity |

### JPA Annotations

- `@Entity`: Maps the Java class to a database table.
- `@Id`: Defines the primary key.
- `@GeneratedValue`: Automatically generates the identifier.

Lombok is used to generate getters, setters, and constructors.

## 5. Database Configuration

The application uses the H2 in-memory relational database.

Database configuration is defined in:

`src/main/resources/application.properties`

Hibernate automatically manages the database schema based on the JPA entity definitions.

H2 Console:

`http://localhost:8084/h2-console`

## 6. Spring Data JPA Repository

The `ProductRepository` interface extends:

`JpaRepository<Product, Long>`

It provides built-in database operations without requiring manual SQL queries.

### Repository Methods

| Method | Description |
|---|---|
| `save()` | Insert or update a product |
| `findAll()` | Retrieve all products |
| `findById()` | Find a product by ID |
| `findByNameContains()` | Search products by name |
| `deleteById()` | Delete a product by ID |

## 7. REST API — CRUD Operations

The `ProductRestController` exposes the following endpoints:

| HTTP Method | Endpoint | Description |
|---|---|---|
| GET | `/products` | Retrieve all products |
| GET | `/products/{id}` | Retrieve a product by ID |
| GET | `/find/products?kw={keyword}` | Search products |
| POST | `/products` | Add a new product |
| PUT | `/products/{id}` | Update a product |
| DELETE | `/products/{id}` | Delete a product |

### Example: Add a Product

**Method:** POST

**Endpoint:** `/products`

Request Body:

```json
{
  "name": "Laptop",
  "price": 7500.00,
  "quantity": 10
}
```

### Example: Retrieve All Products

**Method:** GET

**Endpoint:** `/products`

### Example: Retrieve a Product

**Method:** GET

**Endpoint:** `/products/1`

### Example: Search Products

**Method:** GET

**Endpoint:** `/find/products?kw=laptop`

### Example: Update a Product

**Method:** PUT

**Endpoint:** `/products/1`

Request Body:

```json
{
  "name": "Updated Laptop",
  "price": 8000.00,
  "quantity": 15
}
```

### Example: Delete a Product

**Method:** DELETE

**Endpoint:** `/products/1`

## 8. API Documentation & Testing

Swagger UI is integrated using the Springdoc OpenAPI library.

It provides an interactive interface to:

- Visualize available REST endpoints.
- Inspect HTTP methods and parameters.
- Submit JSON request bodies.
- Execute API requests.
- View server responses.

### Swagger UI

`http://localhost:8084/swagger-ui/index.html`

### OpenAPI Specification

`http://localhost:8084/v3/api-docs`

## 9. Learning Outcomes

This practical assignment provided hands-on experience with:

1. Understanding Object-Relational Mapping (ORM).
2. Creating and configuring JPA entities.
3. Working with Hibernate as a JPA implementation.
4. Configuring an H2 relational database.
5. Implementing Spring Data JPA repositories.
6. Developing REST APIs using Spring Web.
7. Performing CRUD operations.
8. Documenting and testing APIs using Swagger.

## 10. Conclusion

This practical assignment provided an opportunity to develop a RESTful backend application using Spring Boot, JPA, Hibernate, and Spring Data.

It demonstrated how ORM simplifies database interactions, how Spring Data JPA facilitates data persistence, and how REST APIs expose application functionality.

The integration of H2 and Swagger provides an efficient environment for database management, API documentation, and functional testing.

---

## Academic Reference

- **Instructor:** Mohamed YOUSSFI
- **Assignment:** Activité Pratique N°2 — ORM JPA Hibernate Spring Data
- **Reference Video:** https://www.youtube.com/watch?v=UXs39oVoaSs
