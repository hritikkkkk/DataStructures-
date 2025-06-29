package OOP;

import java.util.Arrays;

public class Pen {

    private static final String brand = "Nataraj";

    private boolean isShared = false;
    String color;
    int tip;
    int[] marks;

    // 1. Default constructor
    public Pen() {

        this("Black", 0); // Calls 2-arg constructor
        marks = new int[3];
        this.marks = marks;

        System.out.println("Default constructor called");
    }

    // 2. Main constructor
    public Pen(String color, int tip) {
        marks = new int[3];
        this.color = color;
        this.tip = tip;
        System.out.println("Parameterized constructor called");
    }

    // 3. shallow Copy constructor
//    public Pen(Pen other) {
//
//        this(other.color, other.tip); // Calls main constructor
//        marks = new int[3];
//        this.marks = other.marks;
//        System.out.println("Copy constructor called");
//
//    }


//    public Pen(Pen other) {  // deep copy constructor
//
//        this(other.color, other.tip); // Calls main constructor
//        marks = new int[3];
//        for (int i = 0; i < 3; i++) {
//            this.marks[i] = other.marks[i];
//        }
//        System.out.println("Copy constructor called");
//
//    }


    // lazy copy constructor  -- have to study

    public Pen(Pen other) {
        this.color = other.color;
        this.tip = other.tip;
        this.marks = other.marks;
        this.isShared = true; // initially shared
    }

    public void setMark(int index, int value) {
        if (isShared) {
            marks = marks.clone(); // deep copy on write
            isShared = false;
        }
        marks[index] = value;
    }

    @Override
    public String toString() {
        return "Pen {brand = " + brand + ", color = " + color + ", tip = " + tip + "}";
    }

    public static void main(String[] args) {
//        Pen p1 = new Pen();          // Uses default constructor
        Pen p1 = new Pen("Red", 5);  // Uses 2-arg constructor
        // Uses copy constructor
        p1.marks[0] = 100;
        p1.marks[1] = 200;
        p1.marks[2] = 300;
        Pen p3 = new Pen(p1);
        p3.marks[1] = 400;
        System.out.println(Arrays.toString(p3.marks));
        System.out.println(Arrays.toString(p1.marks));// parametrized and default constructor


//        System.out.println(p2);  //parametrized constructor
//        System.out.println(p3);  //parametrized and copy constructor

    }
}
