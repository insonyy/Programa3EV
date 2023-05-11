package config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Configuration {

    public String loadPathProperties(){
        Properties properties = new Properties();
        try{
            InputStream input = getClass().getClassLoader().getResourceAsStream("config.properties");
            properties.load(input);
            return (String) properties.get("pathJson");
        }catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }
}
