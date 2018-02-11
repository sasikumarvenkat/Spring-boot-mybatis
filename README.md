# Sample REST API Application with MyBatis
  This project is a best starter pack solution for developing the REST APIs with Java8, Spring Boot, Spring MVC and MyBatis. 
## Spring Boot & Spring MVC
   Spring Boot is ready-made collection of different frameworks to build an enterprise application. Spring Boot includes Spring Framework 5, Jersey(JAX-RS), Tomcat, Jetty, DB Connector and many. 
   Spring MVC allows to develop a web application with MVC(Model, View, Controller) Design Pattern. 
   To get familarized with Spring MVC Application, the following Spring annotations are useful.
   1. `@Controller` - This annotation defines the controller for the web application, model will communicate with the database and view for presenting the user interface through JSP or HTML.
   2. `@RestController` - This annotation defines the Contoller class with REST Enabled. So, we can able to write API methods inside it.
   3. `@Service` - This annotation defines the business logic part to be implemented in the web application.
   4. `@Component` - This annotation makes the class or interface as a Spring Component. 
   5. `@Autowired` - This annotation automatically wires the instance of either `@Component` or `@Service` classes. 
   6. `@RequestMapping` - This is Spring MVC annotation for specifying the path of the rest service. Example, `\api\v1\hello`
   7. `@RequestBody` - This is also a Spring MVC annotation for reading the body payload of the requested API method.
   8. `@RequestParam` - This is also a Spring MVC annotation for the query parameters or path parameters. Example, `\api\v1\user?id=sasi@gmail.com` or `\api\v1\user\{id}\profile`, where `{id}` is a path param.

## MyBatis and MySQL ##
MyBatis is an ORM (Object Relational Mapping) framework for performing CRUD( Create, Retrive, Update , Delete) operation with a database. 

Connect to MySQL database, with URL, `jdbc:mysql/localhost:3306/users_db?ssl=false` ,username and password as root and root respectively. 

### MySQL DDL Script ### 
```
create database users_db;
use users_db;

create table users(id int, name varchar(75), primary key(id));

select * from users;
```

## Build the Application ##
To build this project, use the following command.
```
gradle build
```

## Run the Application ##
To start the API service, use the following command.
```
gradle bootRun 
```
or 
```
java -jar build/libs/*.jar
```
