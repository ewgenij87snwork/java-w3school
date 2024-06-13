package compare_many_fields;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Method 2
// Main driver method
class GFG {
    public static void main(String[] args)
    {

        // Create an empty ArrayList
        // to store Student
        List<Student> al = new ArrayList<>();

        // Create customer objects
        // using constructor initialization
        Student obj1 = new Student("Ajay", 27);
        Student obj2 = new Student("Sneha", 23);
        Student obj3 = new Student("Simran", 37);
        Student obj4 = new Student("Ajay", 22);
        Student obj5 = new Student("Ajay", 29);
        Student obj6 = new Student("Sneha", 22);

        // Adding customer objects to ArrayList
        // using add() method
        al.add(obj1);
        al.add(obj2);
        al.add(obj3);
        al.add(obj4);
        al.add(obj5);
        al.add(obj6);

        // Iterating using Iterator
        // before Sorting ArrayList
        Iterator<Student> custIterator = al.iterator();

        // Display message
        System.out.println("Before Sorting:\n");

        // Holds true till there is single element
        // remaining in List
        while (custIterator.hasNext()) {

            // Iterating using next() method
            System.out.println(custIterator.next());
        }

        // Sorting using sort method of Collections class
        Collections.sort(al,
                new CustomerSortingComparator());

        // Display message only
        System.out.println("\n\nAfter Sorting:\n");

        // Iterating using enhanced for-loop
        // after Sorting ArrayList
        for (Student customer : al) {
            System.out.println(customer);
        }
    }
}