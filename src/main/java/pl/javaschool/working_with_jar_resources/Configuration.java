package pl.javaschool.working_with_jar_resources;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Configuration {
    private static Configuration instance;
    private Properties properties;

    private Configuration() {
        properties = new Properties();
        InputStream inputStream = Configuration.class.getResourceAsStream("/resources/application.properties");
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Configuration getInstance() {
        if (instance == null) {
            instance = new Configuration();
        }
        return instance;
    }

    public String getProperty(String key) {
        return properties.getProperty(key, "");
    }
}
