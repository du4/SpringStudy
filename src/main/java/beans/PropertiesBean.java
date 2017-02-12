package beans;

import java.util.Properties;

public class PropertiesBean {
    Properties properties;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "PropertiesBean{" +
                "properties=" + properties +
                '}';
    }
}
