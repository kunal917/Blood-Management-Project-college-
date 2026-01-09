# 🩸 Blood Management System

## 📝 Project Overview

This project is a **Blood Management System** built using **Java Swing** for the frontend and **MySQL** for the backend database. It is designed to streamline and manage donor records, blood availability, and related administrative tasks for a blood donation center.

---

## 💡 Key Features

- ➕ **Add Donor** – Register new donors with personal and medical details  
- 🔍 **Search Donor** – Find donors by blood group or location  
- 🗂️ **Manage Donor Records** – View, update, or delete existing entries  
- 📦 **Blood Inventory Management** – Monitor and update available blood units  
- 💾 **Database Integration** – Persistent data storage with MySQL  
- 🖥️ **GUI Interface** – Built with Java Swing for easy user interaction

---

## 🛠️ Tech Stack

- **Java** (Swing) – Frontend GUI  
- **MySQL** – Backend relational database  
- **JDBC** – Java Database Connectivity for integration  
- **IDE Used:** IntelliJ / Eclipse / NetBeans (as preferred)

---

## 📁 Project Structure

```
blood-management-system/
├── src/
│   ├── AddDonor.java
│   ├── UpdateDonor.java
│   ├── SearchDonor.java
│   └── ... (other modules)
├── database/
│   └── bloodmanagementsystem.sql
├── assets/
│   └── logo.png (if any)
└── README.md
```

---

## 🧩 Database Details

**Database Name:** `bloodmanagementsystem`  
**Table:** `donors`

**Sample Fields:**
- `donor_id` (INT, AUTO_INCREMENT)  
- `full_name` (VARCHAR)  
- `father_name`, `mother_name`  
- `dob` (DATE)  
- `mobile_no`  
- `gender`, `blood_group`, `city`, `address`, `email`

---

## 🚀 How to Run

### ✅ Prerequisites

- Java JDK installed  
- MySQL installed and running  
- MySQL Connector/J JAR file added to classpath  

### 🔧 Steps

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/blood-management-system.git
   cd blood-management-system
   ```

2. Import the project into your preferred IDE.

3. Import the database:
   - Open MySQL and run the `bloodmanagementsystem.sql` file to create tables.

4. Configure your DB connection in Java:
   ```java
   Connection con = DriverManager.getConnection(
       "jdbc:mysql://localhost:3306/bloodmanagementsystem", "root", "your_password");
   ```

5. Run the `AddDonor.java` or main module.




