# 📢 Subscription Notification Microservice (Spring Boot + PostgreSQL)

This is a backend microservice developed using **Spring Boot** and **PostgreSQL**.  
The goal of this project is to demonstrate how to build a RESTful API with validation, persistence, and clean layered architecture.

## 🚀 What this project does

✅ Provides REST API to register Users  
✅ Validates input using Spring Validation (`@NotBlank`, `@Email`, `@FutureOrPresent`)  
✅ Saves valid data into PostgreSQL database  
✅ Handles invalid input with proper error messages  
✅ Logs API requests and DB save events

## 📦 Technologies Used

- Java 17
- Spring Boot 3.x
- Spring Data JPA
- PostgreSQL
- Hibernate Validator
- Postman (for API testing)
- Git & GitHub (for source control)

## 🎯 Project Architecture

Controller -> Service -> Repository -> PostgreSQL DB

- **Controller:** Exposes REST API for user registration  
- **Service:** Handles business logic and validation  
- **Repository:** Interacts with PostgreSQL database

## 📌 Features

- Clean layered architecture
- Input validation for User data
- Exception handling
- Integration with PostgreSQL
- API tested via Postman
- Screen recorded demo included in LinkedIn post

## 🛠 How to Run

1. Clone the repository
2. Update PostgreSQL DB config in `application.properties`
3. Run the Spring Boot application
4. Use Postman to test `/users` POST API
5. Verify data in PostgreSQL `subscription_notification_db` database

## 📌 API Sample Request

POST /users
Content-Type: application/json

{
"name": "John Doe",
"email": "john.doe@example.com",
"subscriptionExpiryDate": "2025-11-30"
}
**
## 📽 Demo

Check the LinkedIn post for screen recording of the API demo.

👉 https://www.linkedin.com/in/a-divya-sde/

## 🚧 Future Scope

- Kafka Integration for notifications
- Dockerize the service
- Add Swagger/OpenAPI documentation
- Deploy to AWS/Azure

## 🙌 Contribution

If you find this project useful or have suggestions, feel free to open issues or contribute!
**
