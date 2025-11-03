package org.example.config;

import java.io.InputStream;
import java.util.Properties;

public class Config
{
    private static final Properties props = new Properties();
    static {
        try (InputStream is = Config.class.getClassLoader().getResourceAsStream("config.properties")) {
            if (is != null) props.load(is);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String get(String key, String defaultVal) {
        return props.getProperty(key, defaultVal);
    }
}
