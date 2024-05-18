package Apps;

import apis.Apis;
import apis.ApisCreateApps;
import com.shaft.driver.SHAFT;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAppTest {

    // Variables
    private SHAFT.API api;
    private SHAFT.TestData.JSON testData;
    private String timeStamp;
    private String _id;
    @Test
    public void CreateNewApp(){
        new ApisCreateApps(api).NewApp("Mostafa","chat");
        _id=api.getResponseJSONValue("$.id");

    }

    @Test(dependsOnMethods = {"CreateNewApp"})
    public void DeleteApp(){
        new ApisCreateApps(api).DeleteApp("/"+_id);
    }
    @BeforeMethod
    public void beforeMethod() {
        api = new SHAFT.API(Apis.apisBaseUrl);
        System.out.println(Apis.apisBaseUrl);}}


