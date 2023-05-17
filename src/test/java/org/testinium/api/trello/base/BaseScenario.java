package org.testinium.api.trello.base;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class BaseScenario {
    static RequestSpecification requestSpecification;
    @Before
    public void setUp() {
        RestAssured.baseURI="https://api.trello.com";
        requestSpecification = RestAssured.given();
    }

    public static RequestSpecification getRequestSpecification(){
        return requestSpecification;
    }

    public static void setRequestSpecification (RequestSpecification requestSpecification){
        BaseScenario.requestSpecification = requestSpecification;
    }
}
