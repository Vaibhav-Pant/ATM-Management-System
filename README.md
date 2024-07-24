<!-- # 🏦 ATM Management System

An ATM Management System implemented in Java with a graphical user interface using JSwing and AWT libraries. This project simulates an ATM interface, allowing users to sign up, log in, and perform various banking transactions.

## 🚀 Features

- **User Authentication**
  - Sign up with personal details
  - Secure login with card number and PIN

- **Banking Operations**
  - Deposit
  - Cash withdrawal
  - Fast Cash    
  - Mini Statement
  - Pin Change
  - Balance Enquiry

- **Database Integration**
  - MySQL database for storing user details and transaction history

## 🖼 Screenshots

| Sign Up Form | ATM Dashboard | Transaction History |
|--------------|---------------|---------------------|
| ![Sign Up Form](images/signup.png) | ![ATM Dashboard](images/dashboard.png) | ![Transaction History](images/transactions.png) |

## 🛠 Technology Stack

- **Java**: Core application logic
- **JSwing and AWT**: GUI components
- **MySQL**: Database for user and transaction data

## 📁 Project Structure

```
ATM-Management-System/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/atm/
│   │   │   │   ├── ATM.java          // Main application
│   │   │   │   ├── Login.java        // Login screen
│   │   │   │   ├── SignUp.java       // Sign up form
│   │   │   │   ├── Dashboard.java    // ATM dashboard
│   │   │   │   ├── Transaction.java  // Transaction processing
│   │   └── resources/
│   │       ├── images/               // UI images
│   │       ├── sql/                  // SQL scripts for database setup
│   ├── test/                         // Unit tests
```



## ⚙️ Setup and Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/yourusername/ATM-Management-System.git
   cd ATM-Management-System
   ```

2. **Database Setup:**
   - Import the provided SQL scripts in the `src/main/resources/sql/` directory into your MySQL database to create the necessary tables.

3. **Run the Application:**
   - Compile the Java code and run the `ATM.java` main class.

## 📝 Usage

1. **Sign Up:**
   - New users can sign up by providing personal details across three forms.
   - Details include name, address, contact information, and initial deposit.

2. **Login:**
   - Use the card number and PIN provided during the sign-up process to log in.

3. **Banking Operations:**
   - Once logged in, users can perform various transactions like balance inquiry, cash withdrawal, and more.

## 🤝 Contributing

Contributions are welcome! Please fork the repository and create a pull request with your changes.

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🙏 Acknowledgements

Special thanks to [OpenAI](https://openai.com/) for assistance in creating this README template.

---

Feel free to customize this README template to better fit your project's specifics, such as adding more detailed descriptions, screenshots, or sections as needed. You can also enhance the visual appeal by using badges, more images, and additional formatting. -->


<!-- 

Here's an updated README that reflects the file structure you've provided: -->

---

# 🏦 ATM Management System

An ATM Management System implemented in Java with a graphical user interface using JSwing and AWT libraries. This project simulates an ATM interface, allowing users to sign up, log in, and perform various banking transactions.

## 🚀 Features

- **User Authentication**
  - Sign up with personal details
  - Secure login with card number and PIN

- **Banking Operations**
  - Deposit
  - Cash withdrawal
  - Fast Cash    
  - Mini Statement
  - Pin Change
  - Balance Enquiry

- **Database Integration**
  - MySQL database for storing user details and transaction history
  - MySQL queries are provided in 'mysqlQueries.sql' to set up the database schema and initial data

## 🖼 Screenshots

| Log In Page | Sign Up Page 1 | Sign Up Page 2 | Sign Up Page 3 | Card Number and Pin |  ATM Dashboard | Mini Statement |
|--------------|---------------|---------------------|
| ![Log In Page](Outputs/Capture1.png) | ![Sign Up Form](Outputs/Capture2.png) | ![Sign Up Form](Outputs/Capture3.png) | ![Sign Up Form](Outputs/Capture4.png) | ![Pin number](Outputs/pin.png) | ![ATM Dashboard](Outputs/atm.png) | ![Mini Statement](Outputs/statement.png) |

## 🛠 Technology Stack

- **Java**: Core application logic
- **JSwing and AWT**: GUI components
- **MySQL**: Database for user and transaction data

## 📁 Project Structure

```
ATM-Management-System/
├── images/
│   ├── atm.jpg
│   ├── bank.png
│   └── bank1.png
├── BalanceEnq.java
├── FastCash.java
├── LoginPage.java
├── MiniStatement.java
├── PinChange.java
├── SignUp1.java
├── SignUp2.java
├── SignUp3.java
├── deposit.java
├── mysql-connector-java-8.0.28.jar
├── mysql.java
├── mysqlQueries.sql
├── transaction.java
└── withdraw.java

```

## ⚙️ Setup and Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/vaibhav-pant/ATM-Management-System.git
   cd ATM-Management-System
   ```

2. **Database Setup:**
   - Ensure MySQL is installed and running.
   - Add your MySQL username and password in 'mysql.java' file to connect to the MySQL.
   - Import the 'mysqlQueries.sql' file to set up the database schema and initial data.

3. **Run the Application:**
   - Compile the Java code using a Java compiler (e.g., `javac`).
   - Run the main application class (e.g., `LoginPage.java`).

## 📝 Usage

1. **Sign Up:**
   - New users can sign up by providing personal details across three forms.
   - Details include name, address, contact information, and many more.

2. **Login:**
   - Use the card number and PIN provided during the sign-up process to log in.

3. **Banking Operations:**
   - Once logged in, users can perform various transactions like balance inquiry, Pin change, and more.

## 🤝 Contributing

Contributions are welcome! Please fork the repository and create a pull request with your changes.
If you find any issues or have suggestions for improvements, please raise an issue in the GitHub repository. Don't forget to star the project if you found it helpful !


## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---
