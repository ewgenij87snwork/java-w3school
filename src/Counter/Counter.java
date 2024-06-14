package Counter;
/*
Unlike instance variables, we can only have one copy
 of a static variable per class, irrespective
 of how many objects we create.

Static variables are created at the start
 of program execution and destroyed
 automatically when execution ends.
 */
public class Counter {
    public static int COUNT=0;
    Counter() {
        COUNT++;
    }
}
