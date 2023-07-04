package ru.netology;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {
    @Test
    void PostmanEchoTest() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("ТЕРПЕНЬЕ И ТРУД ВСЁ ПЕРЕТРУТ")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("ТЕРПЕНЬЕ И ТРУД ВСЁ ПЕРЕТРУТ"));
    }
}