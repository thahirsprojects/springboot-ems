# 🧑‍💼 Employee Management System

A simple **Employee Management System** built using **Spring Boot**, **PostgreSQL**, and **Java SDK 21**. This project provides basic **CRUD operations** (Create, Read, Update, Delete) for managing employee records.

---

## 🛠️ Tech Stack

- **Java 21**
- **Spring Boot**
- **Spring Data JPA**
- **PostgreSQL**
- **Maven**
- **Lombok**
- **Spring Web**
- **Spring Boot DevTools**

---

## 📦 Features

- Add new employees
- View all employees
- View employee by id
- Update employee information
- Delete employees
- RESTful APIs for all operations

---


## Installation

### **Prerequisites**

- Java 21 installed
- PostgreSQL installed and running
- Maven installed
- IDE (like IntelliJ, Eclipse, or VS Code)

### Project Structure

```bash
springboot-ems/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/employee/ems/
│   │   │       ├── controller/
│   │   │       ├── model/
│   │   │       ├── repo/
│   │   │       └── service/
│   │   └── resources/
│   │       └── application.properties
├── pom.xml
```


### **Clone the repository**

```bash
git clone https://github.com/thahirsprojects/springboot-ems
cd springboot-ems
```
## Set up the PostgreSQL database

**Open your PostgreSQL client and run:**

```bash
CREATE DATABASE ems;
```

### Configure the database in **application.properties**

**Update this file at src/main/resources/application.properties:**

```bash
spring.application.name=project_name
spring.datasource.url=jdbc:postgresql://localhost:5432/ems
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
```


**Made with ❤️ by Thahir**
