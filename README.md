# eshop-server
Small eshop API created with Spring Boot and MongoDB.

To run it just type in following command (in project directory):

```sh
mvnw -Dmaven.test.skip=true spring:boot:run
```

API runs on `localhost:8080/api` while MongoDB can be found on default `localhost:27017` 
Also great MongoDB tool can be found on https://www.mongodb.com/try/download/compass

API is not complete, you can retrieve AnimalCategory enum and initial products (all, product by ID or search based by substring in product name).
