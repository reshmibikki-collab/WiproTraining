package Java_Fundamentals.Collections.Map;

import java.util.Map;
import java.util.TreeMap;

public class CountryTreeMap {

    TreeMap<String, String> M1 = new TreeMap<>();

    // Save country and capital
    public void saveCountryCapital(String country, String capital) {
        M1.put(country, capital);
    }

    // Get capital by country
    public String getCapital(String country) {
        return M1.get(country);
    }

    // Get country by capital
    public String getCountry(String capital) {
        for (Map.Entry<String, String> e : M1.entrySet()) {
            if (e.getValue().equals(capital)) {
                return e.getKey();
            }
        }
        return null;
    }

    public static void main(String[] args) {

        CountryTreeMap obj = new CountryTreeMap();

        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");
        obj.saveCountryCapital("USA", "Washington D.C.");

        System.out.println("Capital of India : " + obj.getCapital("India"));
        System.out.println("Country of Tokyo : " + obj.getCountry("Tokyo"));

        System.out.println("\nTreeMap Contents:");
        System.out.println(obj.M1);
    }
}