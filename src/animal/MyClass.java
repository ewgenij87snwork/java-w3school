package animal;

public class MyClass {
    public static void main(String[] args) {
        Animal a1 = new Animal("Robby");
        Animal a2 = new Animal("Robby");
        System.out.println(a1 == a2);
        System.out.println(a1.name == a2.name);
    }
}
