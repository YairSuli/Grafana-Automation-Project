package api;

import com.google.gson.JsonObject;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ApiActions {
    private final RequestSpecification httpRequest;

    public ApiActions(RequestSpecification httpRequest) {
        this.httpRequest = httpRequest;
    }

    @Step("Get Data From Server")
    public Response get(String paraValues) {
        Response response = httpRequest.get(paraValues);
        System.out.println(response.prettyPrint());
        return response;
    }

    @Step("Post Data From Server")
    public Response post(JsonObject params, String resource) {
        httpRequest.body(params.toString());
        Response response = httpRequest.post(resource);
        System.out.println(response.prettyPrint());
        return response;
    }

    @Step("Update Data in Server")
    public void put(JsonObject params, String resource) {
        httpRequest.body(params.toString());
        Response response = httpRequest.put(resource);
        System.out.println(response.prettyPrint());
    }

    @Step("Delete Data From Server")
    public void delete(String resource) {
        Response response = httpRequest.delete(resource);
        System.out.println(response.prettyPrint());
    }
}
