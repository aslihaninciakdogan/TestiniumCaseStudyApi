package org.testinium.api.trello.base;

import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class BaseFunction {
    static final  String token = "ATTA7ef935c26abe57e9b85e503a0d2940d36008e205d3bd816e308a6a18ed5167e88E345E5A";
    static final  String key = "ff9c3785f4920de1473d9672a2c1234d";

    public RequestSpecification requestSpecification = null;
    public BaseFunction(RequestSpecification requestSpecification){
        this.requestSpecification =
                requestSpecification
                        .given()
                        .contentType(ContentType.JSON)
                        .queryParam("token",token)
                        .queryParam("key",key);
    }
}
