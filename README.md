📖 BOOK STORE USING SPRING MVC
===============================
A simple and clean Book Store web application built using Spring MVC framework, demonstrating core web development concepts with Java, Spring, JSP, and Hibernate. The project allows users to manage a collection of books with CRUD (Create, Read, Update, Delete) operations.

📌 Features
============
>> Add new books to the store 📚
>> View all available books in a list view
>>Update existing book details
>>Delete books from the collection
>>User-friendly web interface using JSP and Bootstrap
>>Backend powered by Spring MVC and Hibernate ORM

🛠️ Tech Stack
================
Java 8+
Spring MVC
Hibernate ORM
MySQL
JSP
Bootstrap
Maven

⚙️ Project Setup Instructions
===============================
🔽 Prerequisites:
Java 8+
Maven
MySQL
IDE (IntelliJ IDEA / Eclipse)

📥 Steps to Run:
==================
1.Clone the repository
  git clone https://github.com/surajsamanta2000/BOOK_STORE_USING_SPRING_MVC.git
2.Import the project into your IDE as a Maven project
3.Configure MySQL database

  >>Create a database named bookstore
  >>Update hibernate.cfg.xml with your DB username and password
  >>Run the Application
      ||
       ==>Run BookController.java on a server like Tomcat
  >>Access the Application
     http://localhost:8080/BOOK_STORE_USING_SPRING_MVC/

📂 Project Structure
======================

BOOK_STORE_USING_SPRING_MVC/
├── src/main/java
│   ├── controller
│   │   └── BookController.java
│   ├── dao
│   │   └── BookDao.java
│   ├── model
│   │   └── Book.java
│   └── service
│       └── BookService.java
├── src/main/webapp
│   ├── WEB-INF
│   │   ├── jsp
│   │   │   ├── add-book.jsp
│   │   │   ├── book-list.jsp
│   │   │   └── edit-book.jsp
│   │   └── web.xml
│   └── resources
│       └── hibernate.cfg.xml
├── pom.xml
└── README.md
