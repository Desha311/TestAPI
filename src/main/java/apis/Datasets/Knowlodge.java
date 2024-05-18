package apis.Datasets;

import apis.Apis;
import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import io.restassured.http.ContentType;
import org.json.simple.JSONObject;

public class Knowlodge {

    private SHAFT.API api;
    private static final String CreateDataSet_serviceName = "/datasets";
    private static final String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2lkIjoiOGY0MjViZjUtMzE1Ni00Yjk1LWE4MTQtNzQwMTZjOWMwMWU0IiwiZXhwIjoxNzE3NTAyODQ4LCJpc3MiOiJDTE9VRCIsInN1YiI6IkNvbnNvbGUgQVBJIFBhc3Nwb3J0In0.QWhNnH_PhenP1lnVHqHQZ_qIvPVTBdCHYpv7SJ5QWx0";


    public Knowlodge(SHAFT.API api) {
        this.api = api;
    }

    @Step("Create New Empty Dataset")
    public Knowlodge CreateEmptyDataSet(String name){
        JSONObject body = new JSONObject();
        body.put("name",name);


        api.post(CreateDataSet_serviceName)
                .addHeader("Authorization", "Bearer " + token)
                .setContentType("application/json")
                .setRequestBody(body)
                .setTargetStatusCode(Apis.Created)
                .perform();
        return this;

    }
}
