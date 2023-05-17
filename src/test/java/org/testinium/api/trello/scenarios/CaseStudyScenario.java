package org.testinium.api.trello.scenarios;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.testinium.api.trello.base.BaseScenario;
import org.testinium.api.trello.functions.CaseStudyFunction;

public class CaseStudyScenario extends BaseScenario {
    CaseStudyFunction caseStudyFunction;

    @Before
    public void before(){
        caseStudyFunction = new CaseStudyFunction(getRequestSpecification());
    }

    @Test
    public void test(){
        caseStudyFunction
                .createBoard("Testinium");
    }

    @After
    public void after(){
        // tear down
    }
}
