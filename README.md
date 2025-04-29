# Employee Management System

This is a Java-based desktop application built using Apache NetBeans IDE.  
It is designed to manage employee records efficiently with a user-friendly interface.

## 🛠️ Technologies Used
- Java SE (Standard Edition)
- Java Swing (for GUI development)
- Apache NetBeans IDE
- MySQL (via XAMPP Control Panel)
- JDBC (Java Database Connectivity)

## 🚀 Features
- Add new employee records
- Edit existing employee details
- Delete employee records
- Search employees by ID or name
- Display employee list in a table
- Login authentication for admin/user

## 💾 Database Setup (XAMPP)
1. Open **XAMPP Control Panel**.
2. Start the **MySQL** service.
3. Open **phpMyAdmin** in your browser.
4. Create a new database (e.g., `employee_db`).
5. Create tables or import a `.sql` file if provided.
6. In your Java project, update your database connection settings:
   - **Host**: `localhost`
   - **Port**: `3306`
   - **Username**: `root`
   - **Password**: *(usually empty by default)*

Example JDBC connection string:
```java
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "");
