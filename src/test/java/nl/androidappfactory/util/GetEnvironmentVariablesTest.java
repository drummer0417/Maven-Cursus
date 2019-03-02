package nl.androidappfactory.util;

import org.apache.log4j.Logger;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GetEnvironmentVariablesTest {

    Logger logger = Logger.getLogger(getClass());

    @Test
    public void getEnvVar() {

        logger.debug("envVar:   ::::::::::::: " + GetEnvironmentVariables.getEnvVar());
        assertTrue(true);
    }
}