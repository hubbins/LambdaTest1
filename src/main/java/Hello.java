import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

import java.util.Map;


public class Hello {
    public String myHandler(Map<String, String> params, Context context) {
        LambdaLogger log = context.getLogger();
        //final Logger log = Logger.getLogger("Hello");
        String value = System.getenv("test");
        log.log("env: " + value);
        log.log("received : " + params.get("test"));

        return "received : " + params.get("test") + " env: " + value;
    }
}
