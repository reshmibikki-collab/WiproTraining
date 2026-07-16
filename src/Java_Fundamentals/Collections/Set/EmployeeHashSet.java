package Java_Fundamentals.Collections.Set;

import java.util.HashSet;
import java.util.Iterator;

public class EmployeeHashSet {

    public static void main(String[] args) {

        HashSet<String> employees = new HashSet<>();

        employees.add("Reshmitha");
        employees.add("Sajid");
        employees.add("Rahul");
        employees.add("Priya");

        System.out.println("Employee Names:");

        Iterator<String> it = employees.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}