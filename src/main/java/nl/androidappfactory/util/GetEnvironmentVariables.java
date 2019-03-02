package nl.androidappfactory.util;


import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;


public class GetEnvironmentVariables {

    private Logger logger = Logger.getLogger(getClass());

    public static String getEnvVar() {

        return System.getenv("TEST_ENV");
    }
}
