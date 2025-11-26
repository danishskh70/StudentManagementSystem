# Student Management System

A Java console application that manages student records using MySQL as the backend database.  
This project implements full CRUD operations: Create, Read, Update, and Delete students.  

---

## About

The Student Management System is a lightweight, console-based tool built with Java and JDBC.  
It allows users to:

- Add new students
- View all students
- Update existing student details
- Delete students from the database

The application separates database logic from UI logic using a DAO pattern, ensuring clean, maintainable code.  
All sensitive information such as database credentials is stored securely using environment variables, making it safe for deployment and version control.

---

## Tech Stack

- Language: Java 21
- Database: MySQL 9.5 (StudentDB)
- Connector: MySQL Connector/J 9.5
- Architecture: Console application with DAO design pattern

---

## Setup Instructions

1. Clone the Repository:
``` bash
git clone https://github.com/danishskh70/StudentManagementSystem.git
cd StudentManagementSystem
```
2. Install MySQL and create the database and table:

``` bash
CREATE DATABASE studentdb;
USE studentdb;

CREATE TABLE students (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    age INT,
    email VARCHAR(50),
    course VARCHAR(50)
);
```

3. Set Environment Variables for database credentials:

``` bash
set DB_URL=jdbc:mysql://localhost:3307/studentdb
set DB_USER=root
set DB_PASS=your_password_here
```

4. Compile and Run the Program:

``` bash
javac -cp lib\mysql-connector-j-9.5.0.jar src\*.java
java -cp lib\mysql-connector-j-9.5.0.jar;src Main

```
---

## Usage

- Launch the application and follow the menu prompts.  
- Add, view, update, or delete students interactively.  
- All operations are persisted in the MySQL database.

---

## Security

- Database credentials are never hardcoded.  
- Uses environment variables for secure storage.  
- Supports creating low-privilege MySQL users for safer deployment.

---

## License

This project is open-source. Feel free to fork and improve.
