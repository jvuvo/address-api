package org.vuvo;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class CountryStateResourceTest {

    @Test
    public void testCountries() {
        given()
          .when().get("/api/countries")
          .then()
             .statusCode(200);
    }

}