package Java_Fundamentals.Collections.Map;

import java.util.Iterator;
import java.util.Properties;

public class PropertiesDemo {

    public static void main(String[] args) {

        Properties p = new Properties();

        p.setProperty("Andhra Pradesh", "Amaravati");
        p.setProperty("Telangana", "Hyderabad");
        p.setProperty("Karnataka", "Bengaluru");
        p.setProperty("Tamil Nadu", "Chennai");

        System.out.println("State -> Capital");

        Iterator<Object> it = p.keySet().iterator();

        while (it.hasNext()) {
            String state = (String) it.next();
            System.out.println(state + " -> " + p.getProperty(state));
        }
    }
}