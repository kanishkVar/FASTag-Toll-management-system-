
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

2. Insert a test user (optional):
```sql
INSERT INTO users (username, password) VALUES ('admin', 'admin123');
```

## How to Run
1. Clone the repository:
```bash
git clone <your-repo-link>
```

2. Open the project in your IDE (Eclipse/IntelliJ).
3. Make sure you have MySQL running and the database created.
4. Update DB credentials in `DBConnection.java`.
5. Run `LoginForm.java` to launch the GUI.

## Contributors
- Kanishk Varshney
- Mayank kumar
- Rahul kumar
- Aashutosh kumar
