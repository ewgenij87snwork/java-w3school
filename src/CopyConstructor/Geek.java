package CopyConstructor;


class Geek {
    // data members of the class.
    String name;
    int id;

    // Parameterized Constructor
    Geek(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    // Copy Constructor
    Geek(Geek obj2)
    {
        this.name = obj2.name;
        this.id = obj2.id;
    }
}