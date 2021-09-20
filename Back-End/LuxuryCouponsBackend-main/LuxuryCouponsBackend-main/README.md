Luxury Coupons Backend

# Welcome to my Luxury coupons project! Server side :+1:
I've built it with 2 other junior programmers as a final project for our course.

What is the goal of the project?
--------------------------------
To reflect my skills on the client side! :)
This is the client side of the LuxuryCoupons website,
We worked hard on every little bug and I learned A LOT of new things in the process (and it never stops).

How is the back end built?
--------------------------------
Java with Spring Boot framework, Maven, using spring.io, MySQL db.

dependencies?
--------------------------------
- Spring Web -> Includes us the REST (which is used for communication with the client) and the Tomcat server.
- Lombok -> Which makes the life easier when we want to write new classes;
- Spring Data JDBC -> persist our data to the MySQL db.
- Spring Data JPA -> includes Hibernate which implements the JPA to persist our data to the MySQL db.
- Swagger -> A tool that helps us test the REST controllers.
- JJWT -> Implements tokenization to check if the client is still logged.

how to find what?
--------------------------------
The server is very straightforward, implements MVC design pattern (the Rest controllers separate between the logic of the server to the client)
The main thing to notice is the Layers:
repo -> service -> controller.

Are there any things to notice?
--------------------------------
A. We handle exceptions with AOP to catch them after they throwed.
B. We have a thread that runs and checks the coupon expiration every day, if it is expired he deletes it.
C. Token communication through headers alone.

In conclusion:
--------------------------------
I enjoyed writing the logic of this code and learned a lot in the process, and hope you liked it too! 😃
