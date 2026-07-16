package Java_Fundamentals.Collections.Set;

import java.util.TreeSet;

public class CountryTreeSet {

    TreeSet<String> countries = new TreeSet<>();

    // Add country names
    public TreeSet<String> saveCountryNames(String countryName) {
        countries.add(countryName);
        return countries;
    }

    // Search for a country
    public String getCountry(String countryName) {
        for (String country : countries) {
            if (country.equals(countryName)) {
                return country;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        CountryTreeSet obj = new CountryTreeSet();

        obj.saveCountryNames("India");
        obj.saveCountryNames("USA");
        obj.saveCountryNames("Japan");

        System.out.println("Search Result:");
        System.out.println("USA   : " + obj.getCountry("USA"));
        System.out.println("China : " + obj.getCountry("China"));
    }
}