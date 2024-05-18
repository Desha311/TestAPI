package Apps;

import apis.Apis;
import apis.ApisCreateApps;
import com.shaft.driver.SHAFT;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GetApps {

    // Variables
    private SHAFT.API api;
   private SHAFT.TestData.JSON testData;
    private String timeStamp;
    @Test
    public void GetAllAppsForTheAccount(){
        new ApisCreateApps(api).getAllApps();}
    @BeforeMethod
    public void beforeMethod() {
        api = new SHAFT.API(Apis.apisBaseUrl);
System.out.println(Apis.apisBaseUrl);}}


