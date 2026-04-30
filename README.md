# 🚀 Redis User Cache Service (Spring Boot)

A high-performance **User Management API** built using **Spring Boot** and **Redis** as an in-memory data store.
This project demonstrates how to reduce database hits by caching user data using Redis Hash operations.

---

## 📌 Project Overview

This application provides REST APIs to:

* Create a user
* Fetch a user by ID
* Fetch all users
* Delete a user

Instead of storing data in a traditional database, this project uses **Redis** for ultra-fast data access.

---

## ⚙️ Tech Stack

* Java
* Spring Boot
* Spring Data Redis
* Redis (In-Memory Data Store)
* Maven

---

## 🧠 Key Concepts Used

* Redis Hash Operations (`opsForHash`)
* Serialization using `GenericJackson2JsonRedisSerializer`
* UUID-based unique user IDs
* RESTful API design
* Dependency Injection

---

## 🏗️ Architecture

Client → Controller → DAO → Redis

* **Controller** handles API requests
* **DAO** interacts with Redis
* **Redis** stores data in key-value format

---

## 🔑 Redis Data Structure

* Key: `USER123123`
* Value: Hash Map

  * Field: `userId`
  * Value: `User Object`

---

## 📡 API Endpoints

### ➤ Create User

POST `/user`

```
{
  "name": "Rishit",
  "phone": "1234567890",
  "email": "rishit@email.com"
}
```

---

### ➤ Get User by ID

GET `/user/{userId}`

---

### ➤ Get All Users

GET `/user`

---

### ➤ Delete User

DELETE `/user/{userId}`

---

## ⚡ Why Redis?

* Extremely fast (in-memory storage)
* Reduces database load
* Ideal for caching frequently accessed data
* Supports flexible data structures (Hash, List, Set)

---

## 🛠️ Setup Instructions

1. Install Redis locally or via Docker
2. Start Redis server:

   ```
   redis-server
   ```
3. Run Spring Boot application:

   ```
   mvn spring-boot:run
   ```

---

## 🚧 Future Improvements

* Add TTL (expiry) to cached data
* Integrate with MySQL (cache + DB hybrid)
* Add update API
* Add validation and exception handling
* Implement Redis Pub/Sub or Streams

---

## 🎯 Learning Outcomes

* Hands-on experience with Redis
* Understanding of caching strategies
* Building high-performance backend systems
* Working with Spring Boot + Redis integration

---

## 📬 Author

Rishit Koshta

---
