package api;

import api.flows.Flows;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;
import utilitiess.Config;

public class Api {

    protected RequestSpecification httpRequest;
    protected ApiActions apiActions;
    protected Flows flows;

    @BeforeClass
    public void BeforeClass() {
        RestAssured.baseURI = "http://localhost:3000/api";
        httpRequest = RestAssured.given().auth().preemptive().basic(Config.get("UserName"), Config.get("Password"));
        httpRequest.header("Content-Type", Config.get("ContentType"));
        initApiActions();
        initFlows();
    }

    private void initApiActions() {
        apiActions = new ApiActions(httpRequest);
    }

    private void initFlows() {
        flows = new Flows(apiActions);
    }
}
