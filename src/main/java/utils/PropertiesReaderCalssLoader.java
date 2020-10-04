package utils;


import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesReaderCalssLoader {

    private static PropertiesReaderCalssLoader loadProperties = null;
    private static Properties properties = null;
    private static InputStream inputStream = null;

    private PropertiesReaderCalssLoader(String propertyFileName) {
        this.inputStream = ClassLoader.getSystemClassLoader().getResourceAsStream(propertyFileName);
    }

    public static PropertiesReaderCalssLoader getInstance() {
        if (loadProperties == null) {
            loadProperties = new PropertiesReaderCalssLoader("config.properties");
        }
        return loadProperties;
    }

    public String getValueFromProperty(String key) {
        if (properties == null) {
            properties = new Properties();
            try {
                properties.load(inputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return properties.getProperty(key);
    }


}

