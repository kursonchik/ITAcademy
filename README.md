<h1>Test task - IT Практикум "Java developer"</h1>

## List of used technologies
● Spring Boot 2 ● Maven  ● MySQL 8 ● FlyWay
● Hibernate 5 ● Lombok ● Log4J ● jUnit 

## Getting Started

#### Clone the repository
  
>Intellij IDEA -> Git -> Clone -> Url -> https://github.com/kursonchik/ITAcademy

or

```console
git clone https://github.com/kursonchik/ITAcademy.git
```

### Create MySQL Database
![db](./DirectoryREADME/EER.png "db")

DDL operations are stored in src/main/resources/db/migration;

database connection settings in application.properties

### 1) Run BootcampApplication
Run Spring Boot application with command: mvn spring-boot:run.
users table will be automatically generated in Database.
![run](./DirectoryREADME/tests.png "test")
### 2) Run Postman
Now we can check operations with Postman.


![run](./DirectoryREADME/Untitled1.png "RUN")
---

## POST (Create some User)

![addUser](./DirectoryREADME/postmanAdd.png "addUser")

## GET (Get all Users)
![ListOfUsers1](./DirectoryREADME/get1.png "ListOfUsers1")
![ListOfUsers1](./DirectoryREADME/get2.png "ListOfUsers1")
![ListOfUsers1](./DirectoryREADME/get3.png "ListOfUsers1")
![ListOfUsers1](./DirectoryREADME/get4.png "ListOfUsers1")
rows 93-95
![ListOfUsers1](./DirectoryREADME/get5.png "ListOfUsers1")

![ListOfUsers1](./DirectoryREADME/1.png "ListOfUsers1")

![ListOfUsers2](./DirectoryREADME/2.png "ListOfUsers2")

