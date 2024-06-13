package compare_many_fields;

import java.util.Comparator;

// Class 1
// Helper class representing a Student
class Student {

    // Attributes of student
    String Name;
    int Age;

    // Parameterized constructor
    public Student(String Name, Integer Age)
    {

        // This keyword refers to current instance itself
        this.Name = Name;
        this.Age = Age;
    }

    // Getter setter methods
    public String getName() { return Name; }

    public void setName(String Name) { this.Name = Name; }

    public Integer getAge() { return Age; }

    public void setAge(Integer Age) { this.Age = Age; }

    // Method
    // Overriding toString() method
    @Override public String toString()
    {
        return "Customer{"
                + "Name=" + Name + ", Age=" + Age + '}';
    }
}

// Class 2
// Helper class implementing Comparator interface
class CustomerSortingComparator
        implements Comparator<Student> {

    // Method 1
    // To compare customers
    @Override
    public int compare(Student customer1, Student customer2)
    {

        // Comparing customers
        int NameCompare = customer1.getName().compareTo(
                customer2.getName());

        int AgeCompare = customer1.getAge().compareTo(
                customer2.getAge());

        // 2nd level comparison
        return (NameCompare == 0) ? AgeCompare
                : NameCompare;
    }
}