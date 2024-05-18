package DataSets;

import apis.Apis;
import apis.Datasets.Knowlodge;
import com.shaft.driver.SHAFT;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataSetsTests {
    private SHAFT.API api;

    @Test
    public void EmptyDataset(){
        new Knowlodge(api).CreateEmptyDataSet("HI");
    }

    @BeforeMethod
    public void beforeMethod() {
        api = new SHAFT.API(Apis.apisBaseUrl);
        System.out.println(Apis.apisBaseUrl);}}

