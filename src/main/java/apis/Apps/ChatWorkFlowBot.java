package apis.Apps;

import apis.Apis;
import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import io.restassured.http.ContentType;
import org.json.simple.JSONObject;

public class ChatWorkFlowBot {
    //workflow
    private SHAFT.API api;


    public ChatWorkFlowBot(SHAFT.API api) {
        this.api = api;
    }
    private static final String CreateApp_serviceName = "/apps";
    private static final String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2lkIjoiOGY0MjViZjUtMzE1Ni00Yjk1LWE4MTQtNzQwMTZjOWMwMWU0IiwiZXhwIjoxNzE3NTAyODQ4LCJpc3MiOiJDTE9VRCIsInN1YiI6IkNvbnNvbGUgQVBJIFBhc3Nwb3J0In0.QWhNnH_PhenP1lnVHqHQZ_qIvPVTBdCHYpv7SJ5QWx0";


    @Step("API Create WorkFlowBot")
    public ChatWorkFlowBot NewApp(String name, String mode) {
        JSONObject body = new JSONObject();
        body.put("name",name);
        body.put("mode",mode);

        api.post(CreateApp_serviceName)
                .addHeader("Authorization", "Bearer " + token)
                .setContentType("application/json")
                .setRequestBody(body)
                .setTargetStatusCode(Apis.Created)
                .perform();
        return this;

    }
    @Step("Get WorkFlow App")
    public ChatWorkFlowBot GetNewApp(String _id) {


        api.get(CreateApp_serviceName+_id)
                .addHeader("Authorization", "Bearer " + token)
                .setContentType("application/json")
                .setTargetStatusCode(Apis.SUCCESS)
                .perform();
        return this;

    }
    @Step("DeleteApp")
    public ChatWorkFlowBot DeleteApp(String _id){
        api.delete(CreateApp_serviceName+_id)
                .addHeader("Authorization", "Bearer " + token)
                .setContentType(ContentType.URLENC)
                .setTargetStatusCode(Apis.Deleted)
                .perform();
        return this;
    }



}


