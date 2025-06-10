
# FASTag Toll Management System

## Overview
A GUI-based Java application that allows users to log in to the FASTag system. This project demonstrates basic user management, database connectivity using JDBC, and a simple Swing-based UI.

## Features
- User login authentication
- MySQL database integration
- Clean and responsive Swing UI
- DAO and Model layers for modularity

## Tech Stack
- Java
- Swing (for GUI)
- MySQL
- JDBC

## Project Structure
```
FastagTollSystem/
├── src/
│   ├── dao/
│   │   └── UserDAO.java
│   ├── model/
│   │   └── User.java
│   ├── ui/
│   │   └── LoginForm.java
│   └── DBConnection.java
├── README.md
```

## Database Setup
1. Create a MySQL database:
```sql
CREATE DATABASE fastagdb;
USE fastagdb;
CREATE TABLE users (
    id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(50) NOT NULL
);
```
## 🔄 Review 2 Updates
- MySQL DB added (see /MySQL_DB/db_schema.sql)
- GUI validation and error handling
- Screenshots added
- PPT file linked

## Contributors
- Kanishk Varshney
- Mayank kumar
- Rahul kumar
- Aashutosh kumar
