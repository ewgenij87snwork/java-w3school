package Constructors;

class Geek {
    // constructor with one argument
    Geek(String name)
    {
        System.out.println("Constructor with one "
                + "argument - String : " + name);
    }

    // constructor with two arguments
    Geek(String name, int age)
    {

        System.out.println(
                "Constructor with two arguments : "
                        + " String and Integer : " + name + " " + age);
    }

    // Constructor with one argument but with different
    // type than previous..
    Geek(long id)
    {
        System.out.println(
                "Constructor with one argument : "
                        + "Long : " + id);
    }
}