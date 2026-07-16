package Java_Fundamentals.Collections.Set;

import java.util.HashSet;

public class Country {

    HashSet<String> H1 = new HashSet<>();

    // Add country names to HashSet
    public HashSet<String> saveCountryNames(String countryName) {
        H1.add(countryName);
        return H1;
    }

    // Search for a country
    public String getCountry(String countryName) {
        for (String country : H1) {
            if (country.equals(countryName)) {
                return country;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        Country obj = new Country();

        obj.saveCountryNames("India");
        obj.saveCountryNames("USA");
        obj.saveCountryNames("Japan");

        System.out.println("Search Result:");
        System.out.println("India  : " + obj.getCountry("India"));
        System.out.println("Canada : " + obj.getCountry("Canada"));
    }
}