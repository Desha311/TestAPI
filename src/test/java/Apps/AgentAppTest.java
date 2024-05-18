package Apps;

import apis.Apis;
import apis.Apps.AgentBot;
import com.shaft.driver.SHAFT;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AgentAppTest {
    private SHAFT.API api;

    private String _id;
    @Test
    public void CreateAgentBot(){
        new AgentBot(api).NewApp("Mostafa","agent-chat");
        _id=api.getResponseJSONValue("$.id");}

    @Test(dependsOnMethods = {"CreateAgentBot"})
    public void GetAgentApp(){
        new AgentBot(api).GetNewApp("/"+_id);
    }
    @Test(dependsOnMethods = {"GetAgentApp"})
    public void DeleteAgentApp(){
        new AgentBot(api).DeleteApp("/"+_id);
    }
    @BeforeMethod
    public void beforeMethod() {
        api = new SHAFT.API(Apis.apisBaseUrl);
        System.out.println(Apis.apisBaseUrl);}}




