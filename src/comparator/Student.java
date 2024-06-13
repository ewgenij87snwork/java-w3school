package comparator;

import java.lang.*;
import java.util.*;

// Class 1
// A class to represent a Student
class Student {

    // Attributes of a student
    int rollno;
    String name, address;

    // Constructor
    public Student(int rollno, String name, String address)
    {

        // This keyword refers to current instance itself
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    // Method of Student class
    // To print student details in main()
    public String toString()
    {

        // Returning attributes of Student
        return this.rollno + " " + this.name + " "
                + this.address;
    }
}

// Class 2
// Helper class implementing Comparator interface
class Sortbyroll implements Comparator<Student> {

    // Method
    // Sorting in ascending order of roll number
    public int compare(Student a, Student b)
    {

        return a.rollno - b.rollno;
    }
}

// Class 3
// Helper class implementing Comparator interface
class Sortbyname implements Comparator<Student> {

    // Method
    // Sorting in ascending order of name
    public int compare(Student a, Student b)
    {

        return a.name.compareTo(b.name);
    }
}