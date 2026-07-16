package Java_Fundamentals.Collections.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountryMap {

    HashMap<String, String> M1 = new HashMap<>();

    // Save country and capital
    public HashMap<String, String> saveCountryCapital(String countryName, String capital) {
        M1.put(countryName, capital);
        return M1;
    }

    // Get capital by country
    public String getCapital(String countryName) {
        return M1.get(countryName);
    }

    // Get country by capital
    public String getCountry(String capitalName) {
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            if (entry.getValue().equals(capitalName)) {
                return entry.getKey();
            }
        }
        return null;
    }

    // Swap keys and values
    public HashMap<String, String> swapKeyValue() {
        HashMap<String, String> M2 = new HashMap<>();

        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }

        return M2;
    }

    // Convert keys to ArrayList
    public ArrayList<String> toArrayList() {
        return new ArrayList<>(M1.keySet());
    }

    public static void main(String[] args) {

        CountryMap obj = new CountryMap();

        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");
        obj.saveCountryCapital("USA", "Washington D.C.");

        System.out.println("Capital of India : " + obj.getCapital("India"));
        System.out.println("Country of Tokyo : " + obj.getCountry("Tokyo"));
        System.out.println("Swapped Map      : " + obj.swapKeyValue());
        System.out.println("Country List     : " + obj.toArrayList());
    }
}