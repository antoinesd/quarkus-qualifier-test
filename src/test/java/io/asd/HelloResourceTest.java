package io.asd;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class HelloResourceTest {

    @Test
    public void testHelloLocalEndpoint() {
        given()
          .when().get("/hello/local")
          .then()
             .statusCode(200)
             .body(is("I'm local bean in group1"));
    }

    @Test
    public void testHelloHealthEndpoint() {
        given()
                .when().get("/hello/health")
                .then()
                .statusCode(200)
                .body(is("I'm health bean in group1"));
    }

}