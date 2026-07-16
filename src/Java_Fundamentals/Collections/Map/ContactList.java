package Java_Fundamentals.Collections.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ContactList {

    public static void main(String[] args) {

        HashMap<String, Integer> contacts = new HashMap<>();

        contacts.put("Reshmitha", 123456789);
        contacts.put("Sajid", 987654321);
        contacts.put("Rahul", 456789123);

        // Check key
        System.out.println("Contains Reshmitha: "
                + contacts.containsKey("Reshmitha"));

        // Check value
        System.out.println("Contains 987654321: "
                + contacts.containsValue(987654321));

        // Display contacts using Iterator
        System.out.println("\nContact List:");

        Iterator<Map.Entry<String, Integer>> it =
                contacts.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}