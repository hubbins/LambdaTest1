import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;


public class Hello {
    public String myHandler(int myCount, Context context) {
        LambdaLogger log = context.getLogger();
        //final Logger log = Logger.getLogger("Hello");
        String value = System.getenv("test");
        log.log("env: " + value);
        log.log("received : " + myCount);

        return "received : " + myCount + " env: " + value;
    }
}
