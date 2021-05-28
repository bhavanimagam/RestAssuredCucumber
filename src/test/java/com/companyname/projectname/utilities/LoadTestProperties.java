package com.companyname.projectname.utilities;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LoadTestProperties {
    private static String env = System.getProperty("env");
    private static final String DEFAULT_ENV= "local";
    private static Properties properties;

    static{
        if(env==null){
            env=DEFAULT_ENV;
        }
        try {
            properties = new Properties();
            InputStream inputStream =
                    LoadTestProperties.class.getClassLoader().getResourceAsStream(env + ".properties");
            assert inputStream!=null;
            properties.load(inputStream);
        }catch (IOException ioException){
            new RuntimeException("Unable to load properties "+ioException.getCause());
        }
    }

    public static String getProperty(String key){
       return  properties.getProperty(key);
    }

}
