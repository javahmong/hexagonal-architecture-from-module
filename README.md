# hexagonal-architecture-from-module

Simple project to introduce hexagonal architecture.

As I can not find what I want about Hexagonal Architecture in action, I have done a demo project.

Hope this will be useful !

Enjoy it

Project expose 2 Endpoints
- Add an employee 
- Get an employee by id

You will be able to get information about the endpoint via

http://localhost:8080/swagger-ui.html

GET

http://localhost:8080/employee/{employeeId}

POST

http://localhost:8080/employee


Finally, you will be able to dockerize the application.
In the root directory where the Dockerfile is, just execute

# docker build -t your_image_name:your_tag .

Then run:

# docker run -d -p 8080:8080 your_image_name:your_tag

#SpringBoot

#H2 DB

#Docker

#Maven

#Microservices

#OpenAPI
