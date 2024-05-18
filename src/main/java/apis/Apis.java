package apis;

import com.shaft.driver.SHAFT;

public class Apis {
    private SHAFT.API api;

    // Constructor
    public Apis(SHAFT.API api) {
        this.api = api;
    }

    // Base URL
    public static String apisBaseUrl = "https://cloud.dify.ai/console/api";

    // Status Codes
    public static final int SUCCESS = 200;
    public static final int Created =201;
    public static final int Deleted=204;
}
