package org.testinium.api.trello.functions;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testinium.api.trello.base.BaseFunction;

import java.util.List;
import java.util.Map;

public class CaseStudyFunction extends BaseFunction {
    public CaseStudyFunction(RequestSpecification requestSpecification) {
        super(requestSpecification);
    }

    public CaseStudyFunction createBoard(String name){
        Response response = requestSpecification
                .queryParam("name",name)
                .body("")
                .when()
                .post("/1/boards/")
                .then()
                .extract()
                .response();
        System.out.println(response.getStatusCode());
        return this;
    }

    public CaseStudyFunction createCardWithBoardName(String boardName, String cardName){
        return this;
    }

    public CaseStudyFunction updateCardName(String currentCardName,String newCardName){
        return this;
    }
}
