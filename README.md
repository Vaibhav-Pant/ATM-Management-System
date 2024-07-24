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

| Log In Page |

![Capture1](https://github.com/user-attachments/assets/ea9b2326-e44e-4405-83e8-220641efecab)

| Sign Up Page 1 | 

![Capture2](https://github.com/user-attachments/assets/eeeec16b-5f60-4369-ba5e-6f2745a5cfe7)

| Sign Up Page 2 | 

![Capture3](https://github.com/user-attachments/assets/03a70739-1ea6-4b67-a280-98f597834f37)

| Sign Up Page 3 | 

![Capture4](https://github.com/user-attachments/assets/09283738-8aca-4519-a93a-2def108f67d7)

| Card Number and Pin |  

![pin](https://github.com/user-attachments/assets/42229044-5f61-41b8-b053-ca0c0f1506f0)

| ATM Dashboard |

![atm](https://github.com/user-attachments/assets/23389895-7e8f-42cf-9a7b-e1b40e301cb2)

| Mini Statement |

![statement](https://github.com/user-attachments/assets/8b773e4c-bb89-4a56-8f36-a1a04aa45566)

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

This project is licensed under the GNU License - see the [LICENSE](LICENSE) file for details.

---
