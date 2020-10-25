package service;

import java.util.Objects;
import java.util.ResourceBundle;

public class TestDataReader {
    private static String env = System.getProperty("environment");

    private static ResourceBundle getProperties() {
        return ResourceBundle.getBundle(Objects.requireNonNullElse(env, "qa"));
    }

    public static String getTestData(String key) {
        return getProperties().getString(key);
    }
}
