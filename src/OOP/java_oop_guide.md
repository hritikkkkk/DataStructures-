# Java Object-Oriented Programming: Basic to Advanced
---

## Table of Contents

1. [Introduction to OOP](#introduction-to-oop)
2. [Basic OOP Concepts](#basic-oop-concepts)
3. [Classes and Objects - Deep Dive](#classes-and-objects-deep-dive)
4. [Constructors - Advanced Concepts](#constructors-advanced-concepts)
5. [Encapsulation - Theory and Practice](#encapsulation-theory-and-practice)
6. [Inheritance - Complete Coverage](#inheritance-complete-coverage)
7. [Polymorphism - Advanced Understanding](#polymorphism-advanced-understanding)
8. [Abstraction - Interfaces vs Abstract Classes](#abstraction-interfaces-vs-abstract-classes)
9. [Advanced OOP Topics](#advanced-oop-topics)
10. [Design Patterns in OOP](#design-patterns-in-oop)
11. [Memory Management in OOP](#memory-management-in-oop)
12. [Interview Questions and Answers](#interview-questions-and-answers)

---

## 1. Introduction to OOP

### What is Object-Oriented Programming? 

Object-Oriented Programming (OOP) is a programming paradigm 
that organizes software design around data (objects) rather than functions and logic.
It's based on the concept of "objects" which contain data (attributes) and code (methods).

### Why OOP?

**Traditional Programming Problems:**
- Code duplication
- Difficult maintenance
- Hard to scale
- Poor code organization
- Lack of security

**OOP Solutions:**
- Code reusability through inheritance
- Data security through encapsulation
- Flexibility through polymorphism
- Code organization through classes

### Real-World Analogy

Think of a **Car Manufacturing Company**:
- **Blueprint (Class)**: Car design specifications
- **Cars (Objects)**: Individual cars created from the blueprint
- **Properties**: Color, model, engine type
- **Behaviors**: Start, stop, accelerate, brake

---

## 2. Basic OOP Concepts

### 2.1 Classes and Objects

#### Class Definition
A class is a user-defined blueprint or template for creating objects.

```java
// Basic Class Structure
public class Car {
    // Fields (Attributes/Properties)
    private String brand;
    private String model;
    private int year;
    private double price;
    
    // Constructor
    public Car(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    
    // Methods (Behaviors)
    public void startEngine() {
        System.out.println(brand + " " + model + " engine started!");
    }
    
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
    }
    
    // Getter methods
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public double getPrice() { return price; }
    
    // Setter methods
    public void setBrand(String brand) { this.brand = brand; }
    public void setModel(String model) { this.model = model; }
    public void setYear(int year) { this.year = year; }
    public void setPrice(double price) { this.price = price; }
}
```

#### Object Creation and Usage

```java
public class CarDemo {
    public static void main(String[] args) {
        // Creating objects (instances) of Car class
        Car car1 = new Car("Toyota", "Camry", 2023, 25000.0);
        Car car2 = new Car("Honda", "Civic", 2022, 23000.0);
        
        // Using object methods
        car1.startEngine();
        car1.displayInfo();
        
        System.out.println("\n" + "=".repeat(30) + "\n");
        
        car2.startEngine();
        car2.displayInfo();
        
        // Modifying object state
        car1.setPrice(24000.0);
        System.out.println("\nUpdated price: $" + car1.getPrice());
    }
}
```

**Output:**
```
Toyota Camry engine started!
Brand: Toyota
Model: Camry
Year: 2023
Price: $25000.0

==============================

Honda Civic engine started!
Brand: Honda
Model: Civic
Year: 2022
Price: $23000.0

Updated price: $24000.0
```

---

## 3. Classes and Objects - Deep Dive

### 3.1 Instance vs Class Variables

```java
public class Student {
    // Class variable (shared by all instances)
    private static String schoolName = "Java High School";
    private static int totalStudents = 0;
    
    // Instance variables (unique to each object)
    private int studentId;
    private String name;
    private double gpa;
    
    // Constructor
    public Student(int studentId, String name, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.gpa = gpa;
        totalStudents++; // Increment class variable
    }
    
    // Instance method
    public void displayInfo() {
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("GPA: " + gpa);
        System.out.println("School: " + schoolName);
    }
    
    // Class method
    public static void displaySchoolInfo() {
        System.out.println("School: " + schoolName);
        System.out.println("Total Students: " + totalStudents);
    }
    
    // Static method to get total students
    public static int getTotalStudents() {
        return totalStudents;
    }
    
    // Getters and Setters
    public int getStudentId() { return studentId; }
    public String getName() { return name; }
    public double getGpa() { return gpa; }
    
    public void setName(String name) { this.name = name; }
    public void setGpa(double gpa) { this.gpa = gpa; }
}
```

#### Usage Example:

```java
public class StudentDemo {
    public static void main(String[] args) {
        // Display initial school info
        Student.displaySchoolInfo();
        
        // Create student objects
        Student student1 = new Student(101, "Alice", 3.8);
        Student student2 = new Student(102, "Bob", 3.6);
        Student student3 = new Student(103, "Charlie", 3.9);
        
        // Display individual student info
        student1.displayInfo();
        System.out.println();
        
        // Display updated school info
        Student.displaySchoolInfo();
        
        // Accessing static method through class name (recommended)
        System.out.println("Total Students: " + Student.getTotalStudents());
    }
}
```

### 3.2 Method Types and Access Modifiers

```java
public class AccessModifierDemo {
    public String publicField = "Accessible everywhere";
    protected String protectedField = "Accessible in package and subclasses";
    String defaultField = "Accessible in package"; // package-private
    private String privateField = "Accessible only in this class";
    
    // Public method - accessible everywhere
    public void publicMethod() {
        System.out.println("Public method called");
    }
    
    // Protected method - accessible in package and subclasses
    protected void protectedMethod() {
        System.out.println("Protected method called");
    }
    
    // Default method - accessible in package
    void defaultMethod() {
        System.out.println("Default method called");
    }
    
    // Private method - accessible only in this class
    private void privateMethod() {
        System.out.println("Private method called");
    }
    
    // Method that calls private method
    public void callPrivateMethod() {
        privateMethod(); // Can call private method within same class
    }
}
```

---

## 4. Constructors - Advanced Concepts

### 4.1 Types of Constructors

```java
public class Rectangle {
    private double length;
    private double width;
    private String color;
    
    // Default constructor
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
        this.color = "White";
        System.out.println("Default constructor called");
    }
    
    // Parameterized constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        this.color = "White"; // default color
        System.out.println("Parameterized constructor (2 params) called");
    }
    
    // Parameterized constructor with all fields
    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
        System.out.println("Parameterized constructor (3 params) called");
    }
    
    // Copy constructor
    public Rectangle(Rectangle other) {
        this.length = other.length;
        this.width = other.width;
        this.color = other.color;
        System.out.println("Copy constructor called");
    }
    
    // Methods
    public double getArea() {
        return length * width;
    }
    
    public double getPerimeter() {
        return 2 * (length + width);
    }
    
    public void displayInfo() {
        System.out.printf("Rectangle: %.2f x %.2f, Color: %s%n", 
                         length, width, color);
        System.out.printf("Area: %.2f, Perimeter: %.2f%n", 
                         getArea(), getPerimeter());
    }
    
    // Getters and Setters
    public double getLength() { return length; }
    public double getWidth() { return width; }
    public String getColor() { return color; }
    
    public void setLength(double length) { this.length = length; }
    public void setWidth(double width) { this.width = width; }
    public void setColor(String color) { this.color = color; }
}
```

### 4.2 Constructor Chaining

```java
public class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;
    
    // Constructor chaining using this()
    public Employee() {
        this(0, "Unknown"); // Calls constructor with 2 parameters
    }
    
    public Employee(int id, String name) {
        this(id, name, "General"); // Calls constructor with 3 parameters
    }
    
    public Employee(int id, String name, String department) {
        this(id, name, department, 0.0); // Calls constructor with 4 parameters
    }
    
    // Main constructor - all others chain to this
    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        System.out.println("Main constructor called");
    }
    
    public void displayInfo() {
        System.out.printf("Employee[ID: %d, Name: %s, Dept: %s, Salary: %.2f]%n",
                         id, name, department, salary);
    }
}
```

#### Constructor Demo:

```java
public class ConstructorDemo {
    public static void main(String[] args) {
        System.out.println("Creating rectangles with different constructors:");
        
        Rectangle rect1 = new Rectangle();
        rect1.displayInfo();
        System.out.println();
        
        Rectangle rect2 = new Rectangle(5.0, 3.0);
        rect2.displayInfo();
        System.out.println();
        
        Rectangle rect3 = new Rectangle(4.0, 6.0, "Blue");
        rect3.displayInfo();
        System.out.println();
        
        Rectangle rect4 = new Rectangle(rect3); // Copy constructor
        rect4.displayInfo();
        System.out.println();
        
        System.out.println("Creating employees with constructor chaining:");
        Employee emp1 = new Employee();
        emp1.displayInfo();
        
        Employee emp2 = new Employee(101, "Alice");
        emp2.displayInfo();
    }
}
```

---

## 5. Encapsulation - Theory and Practice

### 5.1 Understanding Encapsulation

Encapsulation is the bundling of data and methods that 
operate on that data within a single unit (class), and 
restricting access to the internal representation of an object.

**Benefits:**
- Data hiding and security
- Code maintainability
- Flexibility in implementation
- Controlled access to data

### 5.2 Advanced Encapsulation Example

```java
public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private boolean isActive;
    private static final double MINIMUM_BALANCE = 100.0;
    
    public BankAccount(String accountNumber, String accountHolderName, 
                      double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.isActive = true;
        
        if (initialBalance >= MINIMUM_BALANCE) {
            this.balance = initialBalance;
        } else {
            throw new IllegalArgumentException(
                "Initial balance must be at least $" + MINIMUM_BALANCE);
        }
    }
    
    // Controlled access to balance - only getter, no direct setter
    public double getBalance() {
        if (!isActive) {
            throw new IllegalStateException("Account is not active");
        }
        return balance;
    }
    
    // Controlled deposit method
    public boolean deposit(double amount) {
        if (!isActive) {
            System.out.println("Cannot deposit to inactive account");
            return false;
        }
        
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive");
            return false;
        }
        
        balance += amount;
        System.out.printf("Deposited $%.2f. New balance: $%.2f%n", 
                         amount, balance);
        return true;
    }
    
    // Controlled withdrawal method
    public boolean withdraw(double amount) {
        if (!isActive) {
            System.out.println("Cannot withdraw from inactive account");
            return false;
        }
        
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive");
            return false;
        }
        
        if (balance - amount < MINIMUM_BALANCE) {
            System.out.printf("Insufficient funds. Minimum balance of $%.2f required%n", 
                             MINIMUM_BALANCE);
            return false;
        }
        
        balance -= amount;
        System.out.printf("Withdrew $%.2f. New balance: $%.2f%n", 
                         amount, balance);
        return true;
    }
    
    // Account management methods
    public void deactivateAccount() {
        isActive = false;
        System.out.println("Account deactivated");
    }
    
    public void activateAccount() {
        isActive = true;
        System.out.println("Account activated");
    }
    
    // Read-only access to account info
    public String getAccountNumber() { return accountNumber; }
    public String getAccountHolderName() { return accountHolderName; }
    public boolean isActive() { return isActive; }
    
    // No setter for account number - should never change
    // Controlled setter for account holder name
    public void updateAccountHolderName(String newName) {
        if (newName != null && !newName.trim().isEmpty()) {
            this.accountHolderName = newName.trim();
            System.out.println("Account holder name updated to: " + this.accountHolderName);
        } else {
            System.out.println("Invalid name provided");
        }
    }
    
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.printf("Balance: $%.2f%n", balance);
        System.out.println("Status: " + (isActive ? "Active" : "Inactive"));
    }
}
```

#### Encapsulation Demo:

```java
public class EncapsulationDemo {
    public static void main(String[] args) {
        try {
            // Create bank account
            BankAccount account = new BankAccount("ACC001", "John Doe", 500.0);
            account.displayAccountInfo();
            System.out.println();
            
            // Test deposit
            account.deposit(200.0);
            account.deposit(-50.0); // Invalid amount
            System.out.println();
            
            // Test withdrawal
            account.withdraw(100.0);
            account.withdraw(600.0); // Would go below minimum balance
            System.out.println();
            
            // Test account deactivation
            account.deactivateAccount();
            account.withdraw(50.0); // Should fail - account inactive
            account.deposit(100.0); // Should fail - account inactive
            
            // Test account reactivation
            account.activateAccount();
            account.withdraw(50.0); // Should work now
            
            System.out.println("\nFinal account info:");
            account.displayAccountInfo();
            
        } catch (IllegalArgumentException e) {
            System.out.println("Error creating account: " + e.getMessage());
        }
    }
}
```

---

## 6. Inheritance - Complete Coverage

### 6.1 Basic Inheritance

```java
// Base class (Superclass/Parent class)
public class Animal {
    protected String name;
    protected int age;
    protected String species;
    
    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
        System.out.println("Animal constructor called");
    }
    
    public void eat() {
        System.out.println(name + " is eating");
    }
    
    public void sleep() {
        System.out.println(name + " is sleeping");
    }
    
    public void makeSound() {
        System.out.println(name + " makes a sound");
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Species: " + species);
    }
    
    // Getters and Setters
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getSpecies() { return species; }
    
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
}
```

### 6.2 Single Inheritance

```java
// Derived class (Subclass/Child class)
public class Dog extends Animal {
    private String breed;
    private boolean isTrained;
    
    public Dog(String name, int age, String breed, boolean isTrained) {
        super(name, age, "Canine"); // Call parent constructor
        this.breed = breed;
        this.isTrained = isTrained;
        System.out.println("Dog constructor called");
    }
    
    // Method overriding
    @Override
    public void makeSound() {
        System.out.println(name + " barks: Woof! Woof!");
    }
    
    // Additional methods specific to Dog
    public void fetch() {
        System.out.println(name + " is fetching the ball");
    }
    
    public void wagTail() {
        System.out.println(name + " is wagging tail happily");
    }
    
    // Override displayInfo to include dog-specific info
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call parent method
        System.out.println("Breed: " + breed);
        System.out.println("Trained: " + (isTrained ? "Yes" : "No"));
    }
    
    // Getters and Setters
    public String getBreed() { return breed; }
    public boolean isTrained() { return isTrained; }
    public void setTrained(boolean trained) { isTrained = trained; }
}
```

### 6.3 Multilevel Inheritance

```java
// Another level of inheritance
public class ServiceDog extends Dog {
    private String serviceType;
    private String certification;
    
    public ServiceDog(String name, int age, String breed, 
                     String serviceType, String certification) {
        super(name, age, breed, true); // Service dogs are always trained
        this.serviceType = serviceType;
        this.certification = certification;
        System.out.println("ServiceDog constructor called");
    }
    
    // Override makeSound for service dog behavior
    @Override
    public void makeSound() {
        System.out.println(name + " gives a controlled bark (service dog training)");
    }
    
    // Service dog specific methods
    public void performService() {
        System.out.println(name + " is performing " + serviceType + " service");
    }
    
    public void stayAlert() {
        System.out.println(name + " is staying alert and focused");
    }
    
    // Override displayInfo to include service dog info
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Service Type: " + serviceType);
        System.out.println("Certification: " + certification);
    }
    
    // Getters
    public String getServiceType() { return serviceType; }
    public String getCertification() { return certification; }
}
```

### 6.4 Hierarchical Inheritance

```java
// Another child class of Animal
public class Cat extends Animal {
    private int livesRemaining;
    private boolean isIndoor;
    
    public Cat(String name, int age, boolean isIndoor) {
        super(name, age, "Feline");
        this.livesRemaining = 9; // Cats have 9 lives!
        this.isIndoor = isIndoor;
        System.out.println("Cat constructor called");
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " meows: Meow! Meow!");
    }
    
    public void purr() {
        System.out.println(name + " is purring contentedly");
    }
    
    public void scratch() {
        System.out.println(name + " is scratching");
    }
    
    public void climb() {
        if (isIndoor) {
            System.out.println(name + " climbs the cat tree");
        } else {
            System.out.println(name + " climbs a real tree");
        }
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Lives Remaining: " + livesRemaining);
        System.out.println("Indoor Cat: " + (isIndoor ? "Yes" : "No"));
    }
    
    // Getters and Setters
    public int getLivesRemaining() { return livesRemaining; }
    public boolean isIndoor() { return isIndoor; }
    public void setIndoor(boolean indoor) { isIndoor = indoor; }
}
```

### 6.5 Inheritance Demo

```java
public class InheritanceDemo {
    public static void main(String[] args) {
        System.out.println("=== Creating Animals ===");
        
        // Create different animals
        Animal genericAnimal = new Animal("Generic", 5, "Unknown");
        Dog regularDog = new Dog("Buddy", 3, "Golden Retriever", true);
        ServiceDog serviceDog = new ServiceDog("Max", 4, "German Shepherd", 
                                              "Guide Dog", "CCI-2023");
        Cat cat = new Cat("Whiskers", 2, true);
        
        System.out.println("\n=== Animal Behaviors ===");
        
        // Demonstrate method calls
        genericAnimal.makeSound();
        regularDog.makeSound();
        serviceDog.makeSound();
        cat.makeSound();
        
        System.out.println("\n=== Specific Behaviors ===");
        
        regularDog.fetch();
        regularDog.wagTail();
        
        serviceDog.performService();
        serviceDog.stayAlert();
        
        cat.purr();
        cat.climb();
        
        System.out.println("\n=== Animal Information ===");
        
        System.out.println("Regular Dog Info:");
        regularDog.displayInfo();
        
        System.out.println("\nService Dog Info:");
        serviceDog.displayInfo();
        
        System.out.println("\nCat Info:");
        cat.displayInfo();
        
        System.out.println("\n=== Inheritance Hierarchy Demo ===");
        demonstratePolymorphism();
    }
    
    public static void demonstratePolymorphism() {
        // Array of Animal references pointing to different objects
        Animal[] animals = {
            new Dog("Rocky", 2, "Bulldog", false),
            new Cat("Mittens", 1, false),
            new ServiceDog("Luna", 5, "Labrador", "Therapy Dog", "TDI-2022")
        };
        
        System.out.println("All animals making sounds:");
        for (Animal animal : animals) {
            animal.makeSound(); // Polymorphic method call
        }
    }
}
```

---

## 7. Polymorphism - Advanced Understanding

### 7.1 Method Overloading (Compile-time Polymorphism)

```java
public class Calculator {
    
    // Method overloading with different number of parameters
    public int add(int a, int b) {
        System.out.println("Adding two integers");
        return a + b;
    }
    
    public int add(int a, int b, int c) {
        System.out.println("Adding three integers");
        return a + b + c;
    }
    
    // Method overloading with different data types
    public double add(double a, double b) {
        System.out.println("Adding two doubles");
        return a + b;
    }
    
    public String add(String a, String b) {
        System.out.println("Concatenating two strings");
        return a + b;
    }
    
    // Method overloading with different parameter order
    public void display(String message, int count) {
        System.out.println("Message: " + message + ", Count: " + count);
    }
    
    public void display(int count, String message) {
        System.out.println("Count: " + count + ", Message: " + message);
    }
    
    // Variable arguments (varargs)
    public int add(int... numbers) {
        System.out.println("Adding " + numbers.length + " numbers using varargs");
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}
```

### 7.2 Method Overriding (Runtime Polymorphism)

```java
// Base class for shapes
abstract class Shape {
    protected String color;
    protected boolean filled;
    
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    
    // Abstract method - must be overridden
    public abstract double getArea();
    public abstract double getPerimeter();
    
    // Concrete method that can be overridden
    public void displayInfo() {
        System.out.println("Shape - Color: " + color + 
                          ", Filled: " + (filled ? "Yes" : "No"));
    }
    
    // Getters and Setters
    public String getColor() { return color; }
    public boolean isFilled() { return filled; }
    public void setColor(String color) { this.color = color; }
    public void setFilled(boolean filled) { this.filled = filled; }
}

// Circle class
class Circle extends Shape {
    private double radius;
    
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("Circle - Radius: %.2f, Area: %.2f, Perimeter: %.2f%n",
                         radius, getArea(), getPerimeter());
    }
    
    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }
}

// Rectangle class
class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(double length, double width, String color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double getArea() {
        return length * width;
    }
    
    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("Rectangle - Length: %.2f, Width: %.2f, Area: %.2f, Perimeter: %.2f%n",
                         length, width, getArea(), getPerimeter());
    }
    
    public double getLength() { return length; }
    public double getWidth() { return width; }
    public void setLength(double length) { this.length = length; }
    public void setWidth(double width) { this.width = width; }
}

// Triangle class
class Triangle extends Shape {
    private double side1, side2, side3;
    
    public Triangle(double side1, double side2, double side3, 
                   String color, boolean filled) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    @Override
    public double getArea() {
        // Using Heron's formula
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    
    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("Triangle - Sides: [%.2f, %.2f, %.2f], Area: %.2f, Perimeter: %.2f%n",
                         side1, side2, side3, getArea(), getPerimeter());
    }
}
```

### 7.3 Polymorphism Demo

```java
public class PolymorphismDemo {
    public static void main(String[] args) {
        System.out.println("=== Method Overloading Demo ===");
        testMethodOverloading();
        
        System.out.println("\n=== Method Overriding Demo ===");
        testMethodOverriding();
        
        System.out.println("\n=== Dynamic Method Dispatch ===");
        testDynamicMethodDispatch();
    }
    
    public static void testMethodOverloading() {
        Calculator calc = new Calculator();
        
        // Different method signatures
        System.out.println("Result: " + calc.add(5, 3));
        System.out.println("Result: " + calc.add(5, 3, 2));
        System.out.println("Result: " + calc.add(5.5, 3.2));
        System.out.println("Result: " + calc.add("Hello", " World"));
        
        // Different parameter order
        calc.display("Test", 5);
        calc.display(10, "Demo");
        
        // Varargs
        System.out.println("Result: " + calc.add(1, 2, 3, 4, 5));
    }
    
    public static void testMethodOverriding() {
        Circle circle = new Circle(5.0, "Red", true);
        Rectangle rectangle = new Rectangle(4.0, 6.0, "Blue", false);
        Triangle triangle = new Triangle(3.0, 4.0, 5.0, "Green", true);
        
        circle.displayInfo();
        rectangle.displayInfo();
        triangle.displayInfo();
    }
    
    public static void testDynamicMethodDispatch() {
        // Array of Shape references pointing to different objects
        Shape[] shapes = {
            new Circle(3.0, "Yellow", true),
            new Rectangle(5.0, 7.0, "Purple", false),
            new Triangle(6.0, 8.0, 10.0, "Orange", true)
        };
        
        System.out.println("Calculating areas using polymorphism:");
        double totalArea = 0;
        
        for (Shape shape : shapes) {
            // Runtime polymorphism - correct method called based on actual object type
            double area = shape.getArea();
            totalArea += area;
            System.out.printf("Area: %.2f%n", area);
            shape.displayInfo();
            System.out.println();
        }
        
        System.out.printf("Total area of all shapes: %.2f%n", totalArea);
    }
}
```

---

## 8. Abstraction - Interfaces vs Abstract Classes

### 8.1 Abstract Classes

```java
// Abstract class representing a vehicle
public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected int year;
    protected double price;
    
    // Constructor in abstract class
    public Vehicle(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    
    // Abstract methods - must be implemented by subclasses
    public abstract void startEngine();
    public abstract void stopEngine();
    public abstract double getFuelEfficiency();
    public abstract int getMaxSpeed();
    
    // Concrete method - shared by all vehicles
    public void displayBasicInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
    }
    
    // Concrete method with common logic
    public void honk() {
        System.out.println("Beep! Beep!");
    }
    
    // Template method pattern
    public final void startJourney() {
        System.out.println("Starting journey...");
        checkFuel();
        startEngine();
        System.out.println("Journey started successfully!");
    }
    
    // Protected method for subclasses
    protected void checkFuel() {
        System.out.println("Checking fuel level...");
    }
    
    // Getters and Setters
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public double getPrice() { return price; }
    
    public void setPrice(double price) { this.price = price; }
}

// Concrete implementation of Vehicle
class Car extends Vehicle {
    private int numberOfDoors;
    private String transmissionType;
    
    public Car(String brand, String model, int year, double price, 
              int numberOfDoors, String transmissionType) {
        super(brand, model, year, price);
        this.numberOfDoors = numberOfDoors;
        this.transmissionType = transmissionType;
    }
    
    @Override
    public void startEngine() {
        System.out.println("Car engine started with key ignition");
    }
    
    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped");
    }
    
    @Override
    public double getFuelEfficiency() {
        return 25.5; // Miles per gallon
    }
    
    @Override
    public int getMaxSpeed() {
        return 120; // mph
    }
    
    @Override
    public void displayBasicInfo() {
        super.displayBasicInfo();
        System.out.println("Doors: " + numberOfDoors);
        System.out.println("Transmission: " + transmissionType);
        System.out.println("Fuel Efficiency: " + getFuelEfficiency() + " mpg");
        System.out.println("Max Speed: " + getMaxSpeed() + " mph");
    }
    
    // Car-specific method
    public void openTrunk() {
        System.out.println("Trunk opened");
    }
}

class Motorcycle extends Vehicle {
    private boolean hasSidecar;
    private String engineType;
    
    public Motorcycle(String brand, String model, int year, double price, 
                     boolean hasSidecar, String engineType) {
        super(brand, model, year, price);
        this.hasSidecar = hasSidecar;
        this.engineType = engineType;
    }
    
    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started with electric start");
    }
    
    @Override
    public void stopEngine() {
        System.out.println("Motorcycle engine stopped");
    }
    
    @Override
    public double getFuelEfficiency() {
        return 45.0; // Miles per gallon
    }
    
    @Override
    public int getMaxSpeed() {
        return 180; // mph
    }
    
    @Override
    public void displayBasicInfo() {
        super.displayBasicInfo();
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
        System.out.println("Engine Type: " + engineType);
        System.out.println("Fuel Efficiency: " + getFuelEfficiency() + " mpg");
        System.out.println("Max Speed: " + getMaxSpeed() + " mph");
    }
    
    // Motorcycle-specific method
    public void wheelie() {
        System.out.println("Performing a wheelie!");
    }
}
```

### 8.2 Interfaces

```java
// Interface for flying capability
interface Flyable {
    // All methods in interface are public and abstract by default
    void takeOff();
    void fly();
    void land();
    
    // Default method (Java 8+)
    default void checkWeatherConditions() {
        System.out.println("Checking weather conditions for flight...");
    }
    
    // Static method (Java 8+)
    static void displayFlightRules() {
        System.out.println("Flight Rules: Maintain safe altitude and follow air traffic control");
    }
    
    // Constants in interface (public, static, final by default)
    int MIN_ALTITUDE = 1000; // feet
    int MAX_ALTITUDE = 35000; // feet
}

// Interface for swimming capability
interface Swimmable {
    void dive();
    void swim();
    void surface();
    
    default void checkWaterConditions() {
        System.out.println("Checking water conditions...");
    }
    
    int MAX_DEPTH = 200; // meters
}

// Interface for land movement
interface Movable {
    void moveForward();
    void moveBackward();
    void turn(String direction);
    void stop();
    
    default void checkTerrain() {
        System.out.println("Checking terrain conditions...");
    }
}

// Abstract class implementing an interface
abstract class Bird implements Flyable {
    protected String species;
    protected double wingspan;
    
    public Bird(String species, double wingspan) {
        this.species = species;
        this.wingspan = wingspan;
    }
    
    // Implementing interface methods
    @Override
    public void takeOff() {
        System.out.println(species + " is taking off by flapping wings");
    }
    
    @Override
    public void land() {
        System.out.println(species + " is landing gracefully");
    }
    
    // Abstract method for subclasses
    public abstract void eat();
    
    // Concrete method
    public void displayInfo() {
        System.out.println("Species: " + species);
        System.out.println("Wingspan: " + wingspan + " meters");
    }
}

// Concrete class implementing multiple interfaces
class Duck extends Bird implements Swimmable {
    
    public Duck(double wingspan) {
        super("Duck", wingspan);
    }
    
    @Override
    public void fly() {
        System.out.println("Duck is flying at moderate speed");
    }
    
    @Override
    public void eat() {
        System.out.println("Duck is eating seeds and small fish");
    }
    
    // Implementing Swimmable interface
    @Override
    public void dive() {
        System.out.println("Duck is diving underwater");
    }
    
    @Override
    public void swim() {
        System.out.println("Duck is swimming on water surface");
    }
    
    @Override
    public void surface() {
        System.out.println("Duck is surfacing from underwater");
    }
}

// Class implementing multiple interfaces
class Airplane implements Flyable, Movable {
    private String model;
    private int passengerCapacity;
    private boolean isEngineOn;
    
    public Airplane(String model, int passengerCapacity) {
        this.model = model;
        this.passengerCapacity = passengerCapacity;
        this.isEngineOn = false;
    }
    
    // Implementing Flyable interface
    @Override
    public void takeOff() {
        if (isEngineOn) {
            System.out.println(model + " is taking off from runway");
        } else {
            System.out.println("Cannot take off - engine is not started");
        }
    }
    
    @Override
    public void fly() {
        System.out.println(model + " is flying at cruising altitude");
    }
    
    @Override
    public void land() {
        System.out.println(model + " is landing on runway");
    }
    
    // Implementing Movable interface
    @Override
    public void moveForward() {
        System.out.println(model + " is taxiing forward");
    }
    
    @Override
    public void moveBackward() {
        System.out.println(model + " is reversing using pushback");
    }
    
    @Override
    public void turn(String direction) {
        System.out.println(model + " is turning " + direction);
    }
    
    @Override
    public void stop() {
        System.out.println(model + " has stopped");
    }
    
    // Airplane-specific methods
    public void startEngine() {
        isEngineOn = true;
        System.out.println(model + " engines started");
    }
    
    public void stopEngine() {
        isEngineOn = false;
        System.out.println(model + " engines stopped");
    }
    
    public void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Passenger Capacity: " + passengerCapacity);
        System.out.println("Engine Status: " + (isEngineOn ? "On" : "Off"));
    }
}
```

### 8.3 Interface vs Abstract Class Comparison

```java
// Functional Interface (Java 8+) - has exactly one abstract method
@FunctionalInterface
interface Calculator {
    double calculate(double a, double b);
    
    // Default methods are allowed
    default void printResult(double result) {
        System.out.println("Result: " + result);
    }
    
    // Static methods are allowed
    static void printWelcome() {
        System.out.println("Welcome to Calculator!");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        System.out.println("=== Abstract Class Demo ===");
        testAbstractClass();
        
        System.out.println("\n=== Interface Demo ===");
        testInterfaces();
        
        System.out.println("\n=== Multiple Interface Implementation ===");
        testMultipleInterfaces();
        
        System.out.println("\n=== Functional Interface Demo ===");
        testFunctionalInterface();
    }
    
    public static void testAbstractClass() {
        Vehicle car = new Car("Toyota", "Camry", 2023, 25000, 4, "Automatic");
        Vehicle motorcycle = new Motorcycle("Honda", "CBR", 2023, 12000, false, "V-Twin");
        
        System.out.println("Car Information:");
        car.displayBasicInfo();
        car.startJourney();
        System.out.println();
        
        System.out.println("Motorcycle Information:");
        motorcycle.displayBasicInfo();
        motorcycle.startJourney();
    }
    
    public static void testInterfaces() {
        Duck duck = new Duck(0.8);
        
        System.out.println("Duck capabilities:");
        duck.displayInfo();
        
        // Flying capabilities
        duck.checkWeatherConditions();
        duck.takeOff();
        duck.fly();
        duck.land();
        
        // Swimming capabilities
        duck.checkWaterConditions();
        duck.dive();
        duck.swim();
        duck.surface();
        
        duck.eat();
        
        // Static method call
        Flyable.displayFlightRules();
    }
    
    public static void testMultipleInterfaces() {
        Airplane airplane = new Airplane("Boeing 737", 180);
        
        airplane.displayInfo();
        airplane.startEngine();
        
        // Using Movable interface methods
        airplane.moveForward();
        airplane.turn("left");
        
        // Using Flyable interface methods
        airplane.checkWeatherConditions();
        airplane.takeOff();
        airplane.fly();
        airplane.land();
        
        airplane.stop();
        airplane.stopEngine();
    }
    
    public static void testFunctionalInterface() {
        Calculator.printWelcome();
        
        // Lambda expressions with functional interface
        Calculator addition = (a, b) -> a + b;
        Calculator multiplication = (a, b) -> a * b;
        Calculator division = (a, b) -> b != 0 ? a / b : 0;
        
        double result1 = addition.calculate(10, 5);
        addition.printResult(result1);
        
        double result2 = multiplication.calculate(10, 5);
        multiplication.printResult(result2);
        
        double result3 = division.calculate(10, 5);
        division.printResult(result3);
    }
}
```

---

## 9. Advanced OOP Topics

### 9.1 Composition vs Inheritance

```java
// Composition Example - "HAS-A" relationship
class Engine {
    private String type;
    private int horsepower;
    private boolean isRunning;
    
    public Engine(String type, int horsepower) {
        this.type = type;
        this.horsepower = horsepower;
        this.isRunning = false;
    }
    
    public void start() {
        if (!isRunning) {
            isRunning = true;
            System.out.println(type + " engine started (" + horsepower + " HP)");
        } else {
            System.out.println("Engine is already running");
        }
    }
    
    public void stop() {
        if (isRunning) {
            isRunning = false;
            System.out.println(type + " engine stopped");
        } else {
            System.out.println("Engine is already stopped");
        }
    }
    
    public boolean isRunning() { return isRunning; }
    public String getType() { return type; }
    public int getHorsepower() { return horsepower; }
}

class GPS {
    private String currentLocation;
    private String destination;
    
    public GPS() {
        this.currentLocation = "Unknown";
        this.destination = "Not set";
    }
    
    public void setDestination(String destination) {
        this.destination = destination;
        System.out.println("Destination set to: " + destination);
    }
    
    public void navigate() {
        if (!"Not set".equals(destination)) {
            System.out.println("Navigating from " + currentLocation + " to " + destination);
        } else {
            System.out.println("Please set destination first");
        }
    }
    
    public void updateLocation(String location) {
        this.currentLocation = location;
        System.out.println("Location updated to: " + location);
    }
    
    public String getCurrentLocation() { return currentLocation; }
    public String getDestination() { return destination; }
}

// Car class using composition
class ModernCar {
    private String brand;
    private String model;
    
    // Composition - Car HAS-A Engine and GPS
    private Engine engine;
    private GPS gps;
    
    public ModernCar(String brand, String model, String engineType, int horsepower) {
        this.brand = brand;
        this.model = model;
        this.engine = new Engine(engineType, horsepower); // Creating component
        this.gps = new GPS(); // Creating component
    }
    
    public void startCar() {
        System.out.println("Starting " + brand + " " + model);
        engine.start(); // Delegating to component
    }
    
    public void stopCar() {
        System.out.println("Stopping " + brand + " " + model);
        engine.stop(); // Delegating to component
    }
    
    public void setDestination(String destination) {
        gps.setDestination(destination); // Delegating to component
    }
    
    public void navigate() {
        if (engine.isRunning()) {
            gps.navigate(); // Delegating to component
        } else {
            System.out.println("Please start the car first");
        }
    }
    
    // Getters for components
    public Engine getEngine() { return engine; }
    public GPS getGPS() { return gps; }
    
    public void displayInfo() {
        System.out.println("Car: " + brand + " " + model);
        System.out.println("Engine: " + engine.getType() + " (" + engine.getHorsepower() + " HP)");
        System.out.println("Current Location: " + gps.getCurrentLocation());
        System.out.println("Destination: " + gps.getDestination());
    }
}
```

### 9.2 Association, Aggregation, and Composition

```java
// Association Example - "USES-A" relationship
class Driver {
    private String name;
    private String licenseNumber;
    
    public Driver(String name, String licenseNumber) {
        this.name = name;
        this.licenseNumber = licenseNumber;
    }
    
    public void drive(ModernCar car) {
        System.out.println(name + " is driving the car");
        car.startCar();
    }
    
    public String getName() { return name; }
    public String getLicenseNumber() { return licenseNumber; }
}

// Aggregation Example - "HAS-A" relationship (weaker than composition)
class Department {
    private String name;
    private List<Employee> employees; // Aggregation
    
    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }
    
    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println(employee.getName() + " added to " + name + " department");
    }
    
    public void removeEmployee(Employee employee) {
        employees.remove(employee);
        System.out.println(employee.getName() + " removed from " + name + " department");
    }
    
    public void displayEmployees() {
        System.out.println("Employees in " + name + " department:");
        for (Employee emp : employees) {
            System.out.println("- " + emp.getName());
        }
    }
    
    public String getName() { return name; }
    public List<Employee> getEmployees() { return employees; }
}

class Employee {
    private String name;
    private int id;
    
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    public String getName() { return name; }
    public int getId() { return id; }
}

// Composition Example - Strong "HAS-A" relationship
class House {
    private String address;
    private List<Room> rooms; // Composition - rooms cannot exist without house
    
    public House(String address) {
        this.address = address;
        this.rooms = new ArrayList<>();
        
        // Creating rooms as part of house construction
        rooms.add(new Room("Living Room", 300));
        rooms.add(new Room("Kitchen", 150));
        rooms.add(new Room("Bedroom", 200));
    }
    
    public void displayHouseInfo() {
        System.out.println("House at: " + address);
        System.out.println("Rooms:");
        for (Room room : rooms) {
            room.displayRoomInfo();
        }
    }
    
    // Inner class representing strong composition
    private class Room {
        private String type;
        private int area;
        
        public Room(String type, int area) {
            this.type = type;
            this.area = area;
        }
        
        public void displayRoomInfo() {
            System.out.println("- " + type + ": " + area + " sq ft");
        }
    }
}
```

### 9.3 Inner Classes

```java
public class OuterClass {
    private String outerField = "Outer Field";
    private static String staticOuterField = "Static Outer Field";
    
    // Regular Inner Class
    public class InnerClass {
        private String innerField = "Inner Field";
        
        public void displayFields() {
            System.out.println("Inner Field: " + innerField);
            System.out.println("Outer Field: " + outerField); // Can access outer fields
            System.out.println("Static Outer Field: " + staticOuterField);
        }
        
        public void outerMethod() {
            OuterClass.this.outerMethod(); // Calling outer class method
        }
    }
    
    // Static Nested Class
    public static class StaticNestedClass {
        private String nestedField = "Nested Field";
        
        public void displayFields() {
            System.out.println("Nested Field: " + nestedField);
            System.out.println("Static Outer Field: " + staticOuterField);
            // System.out.println("Outer Field: " + outerField); // Cannot access non-static
        }
    }
    
    // Method Local Inner Class
    public void methodWithLocalClass() {
        final String localVariable = "Local Variable";
        
        class LocalInnerClass {
            public void display() {
                System.out.println("Local Variable: " + localVariable);
                System.out.println("Outer Field: " + outerField);
            }
        }
        
        LocalInnerClass localInner = new LocalInnerClass();
        localInner.display();
    }
    
    // Anonymous Inner Class
    public void demonstrateAnonymousClass() {
        // Anonymous class implementing Runnable
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous class running");
                System.out.println("Accessing outer field: " + outerField);
            }
        };
        
        Thread thread = new Thread(runnable);
        thread.start();
    }
    
    public void outerMethod() {
        System.out.println("Outer method called");
    }
    
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        
        // Creating inner class instance
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.displayFields();
        inner.outerMethod();
        
        System.out.println();
        
        // Creating static nested class instance
        OuterClass.StaticNestedClass nested = new OuterClass.StaticNestedClass();
        nested.displayFields();
        
        System.out.println();
        
        // Method local inner class
        outer.methodWithLocalClass();
        
        System.out.println();
        
        // Anonymous inner class
        outer.demonstrateAnonymousClass();
    }
}
```

---

## 10. Design Patterns in OOP

### 10.1 Singleton Pattern

```java
// Thread-safe Singleton implementation
public class DatabaseConnection {
    // Volatile keyword ensures visibility across threads
    private static volatile DatabaseConnection instance;
    private String connectionString;
    private boolean isConnected;
    
    // Private constructor prevents external instantiation
    private DatabaseConnection() {
        this.connectionString = "jdbc:mysql://localhost:3306/mydb";
        this.isConnected = false;
        System.out.println("Database connection object created");
    }
    
    // Thread-safe getInstance method using double-checked locking
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            synchronized (DatabaseConnection.class) {
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }
    
    public void connect() {
        if (!isConnected) {
            isConnected = true;
            System.out.println("Connected to database: " + connectionString);
        } else {
            System.out.println("Already connected to database");
        }
    }
    
    public void disconnect() {
        if (isConnected) {
            isConnected = false;
            System.out.println("Disconnected from database");
        } else {
            System.out.println("Already disconnected from database");
        }
    }
    
    public boolean isConnected() { return isConnected; }
}
```

### 10.2 Factory Pattern

```java
// Product interface
interface Animal {
    void makeSound();
    void move();
}

// Concrete products
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks: Woof!");
    }
    
    @Override
    public void move() {
        System.out.println("Dog runs on four legs");
    }
}

class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows: Meow!");
    }
    
    @Override
    public void move() {
        System.out.println("Cat walks gracefully");
    }
}

class Bird implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Bird chirps: Tweet!");
    }
    
    @Override
    public void move() {
        System.out.println("Bird flies in the sky");
    }
}

// Factory class
class AnimalFactory {
    public static Animal createAnimal(String animalType) {
        if (animalType == null || animalType.isEmpty()) {
            return null;
        }
        
        switch (animalType.toLowerCase()) {
            case "dog":
                return new Dog();
            case "cat":
                return new Cat();
            case "bird":
                return new Bird();
            default:
                throw new IllegalArgumentException("Unknown animal type: " + animalType);
        }
    }
}
```

### 10.3 Observer Pattern

```java
import java.util.*;

// Observer interface
interface Observer {
    void update(String message);
}

// Subject interface
interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String message);
}

// Concrete Subject
class NewsAgency implements Subject {
    private List<Observer> observers;
    private String latestNews;
    
    public NewsAgency() {
        this.observers = new ArrayList<>();
    }
    
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
        System.out.println("Observer added. Total observers: " + observers.size());
    }
    
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        System.out.println("Observer removed. Total observers: " + observers.size());
    }
    
    @Override
    public void notifyObservers(String message) {
        System.out.println("Notifying " + observers.size() + " observers...");
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
    
    public void setNews(String news) {
        this.latestNews = news;
        System.out.println("News Agency: Breaking News - " + news);
        notifyObservers(news);
    }
    
    public String getLatestNews() { return latestNews; }
}

// Concrete Observers
class NewsChannel implements Observer {
    private String channelName;
    
    public NewsChannel(String channelName) {
        this.channelName = channelName;
    }
    
    @Override
    public void update(String message) {
        System.out.println(channelName + " received news: " + message);
    }
}

class MobileApp implements Observer {
    private String appName;
    
    public MobileApp(String appName) {
        this.appName = appName;
    }
    
    @Override
    public void update(String message) {
        System.out.println(appName + " app notification: " + message);
    }
}
```
### 10.4 Design Patterns Demo (Completion)

```java
public class DesignPatternsDemo {
    public static void main(String[] args) {
        System.out.println("=== Singleton Pattern Demo ===");
        testSingletonPattern();
        
        System.out.println("\n=== Factory Pattern Demo ===");
        testFactoryPattern();
        
        System.out.println("\n=== Observer Pattern Demo ===");
        testObserverPattern();
    }
    
    public static void testSingletonPattern() {
        // Get singleton instances
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        
        // Verify they are the same instance
        System.out.println("Same instance? " + (db1 == db2));
        
        db1.connect();
        db2.disconnect(); // This affects the same instance
        System.out.println("DB1 connected? " + db1.isConnected());
        System.out.println("DB2 connected? " + db2.isConnected());
    }
    
    public static void testFactoryPattern() {
        try {
            // Create different animals using factory
            Animal dog = AnimalFactory.createAnimal("dog");
            Animal cat = AnimalFactory.createAnimal("cat");
            Animal bird = AnimalFactory.createAnimal("bird");
            
            // Test all animals
            System.out.println("Testing Dog:");
            dog.makeSound();
            dog.move();
            
            System.out.println("\nTesting Cat:");
            cat.makeSound();
            cat.move();
            
            System.out.println("\nTesting Bird:");
            bird.makeSound();
            bird.move();
            
            // Test invalid animal type
            System.out.println("\nTesting invalid animal:");
            Animal unknown = AnimalFactory.createAnimal("elephant");
            
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public static void testObserverPattern() {
        // Create news agency (subject)
        NewsAgency newsAgency = new NewsAgency();
        
        // Create observers
        NewsChannel cnn = new NewsChannel("CNN");
        NewsChannel bbc = new NewsChannel("BBC");
        MobileApp newsApp = new MobileApp("NewsApp");
        MobileApp alertApp = new MobileApp("AlertApp");
        
        // Add observers
        newsAgency.addObserver(cnn);
        newsAgency.addObserver(bbc);
        newsAgency.addObserver(newsApp);
        
        // Publish news
        newsAgency.setNews("Major earthquake hits the region!");
        
        System.out.println("\n--- Adding another observer ---");
        newsAgency.addObserver(alertApp);
        
        newsAgency.setNews("Stock market reaches all-time high!");
        
        System.out.println("\n--- Removing an observer ---");
        newsAgency.removeObserver(bbc);
        
        newsAgency.setNews("New technology breakthrough announced!");
    }
}
```

### 10.5 Strategy Pattern

```java
// Strategy interface
interface SortingStrategy {
    void sort(int[] array);
    String getAlgorithmName();
}

// Concrete strategies
class BubbleSort implements SortingStrategy {
    @Override
    public void sort(int[] array) {
        System.out.println("Performing Bubble Sort...");
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    
    @Override
    public String getAlgorithmName() {
        return "Bubble Sort";
    }
}

class QuickSort implements SortingStrategy {
    @Override
    public void sort(int[] array) {
        System.out.println("Performing Quick Sort...");
        quickSort(array, 0, array.length - 1);
    }
    
    private void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }
    
    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1);
        
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        
        return i + 1;
    }
    
    @Override
    public String getAlgorithmName() {
        return "Quick Sort";
    }
}

// Context class
class SortingContext {
    private SortingStrategy strategy;
    
    public SortingContext(SortingStrategy strategy) {
        this.strategy = strategy;
    }
    
    public void setStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }
    
    public void performSort(int[] array) {
        System.out.println("Using strategy: " + strategy.getAlgorithmName());
        strategy.sort(array);
    }
}
```

---

## 11. Memory Management in OOP

### 11.1 Understanding Object Lifecycle

```java
public class ObjectLifecycleDemo {
    private String name;
    private static int objectCount = 0;
    
    // Constructor
    public ObjectLifecycleDemo(String name) {
        this.name = name;
        objectCount++;
        System.out.println("Object '" + name + "' created. Total objects: " + objectCount);
    }
    
    // Method to demonstrate object usage
    public void doSomething() {
        System.out.println(name + " is doing something...");
    }
    
    // Finalize method (called by garbage collector)
    @Override
    protected void finalize() throws Throwable {
        try {
            objectCount--;
            System.out.println("Object '" + name + "' is being garbage collected. Remaining: " + objectCount);
        } finally {
            super.finalize();
        }
    }
    
    public static void demonstrateLifecycle() {
        System.out.println("=== Object Lifecycle Demonstration ===");
        
        // Creating objects
        ObjectLifecycleDemo obj1 = new ObjectLifecycleDemo("Object1");
        ObjectLifecycleDemo obj2 = new ObjectLifecycleDemo("Object2");
        
        // Using objects
        obj1.doSomething();
        obj2.doSomething();
        
        // Making objects eligible for garbage collection
        obj1 = null;
        obj2 = null;
        
        // Suggesting garbage collection (not guaranteed)
        System.gc();
        
        // Give garbage collector time to run
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("End of demonstration");
    }
}
```

### 11.2 Memory Leaks and Prevention

```java
import java.util.*;

public class MemoryLeakExamples {
    
    // Example 1: Static collections that grow indefinitely
    private static List<String> staticList = new ArrayList<>();
    
    // Example 2: Listener not removed
    public static class EventSource {
        private List<EventListener> listeners = new ArrayList<>();
        
        public void addListener(EventListener listener) {
            listeners.add(listener);
        }
        
        public void removeListener(EventListener listener) {
            listeners.remove(listener);
        }
        
        public void fireEvent(String event) {
            for (EventListener listener : listeners) {
                listener.onEvent(event);
            }
        }
    }
    
    public interface EventListener {
        void onEvent(String event);
    }
    
    // Example 3: Proper resource management with try-with-resources
    public static class ResourceManager {
        public void demonstrateProperResourceHandling() {
            // Using try-with-resources for automatic resource management
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.println("Enter your name:");
                String name = scanner.nextLine();
                System.out.println("Hello, " + name);
            } // Scanner is automatically closed here
        }
        
        // Manual resource management (alternative approach)
        public void demonstrateManualResourceHandling() {
            Scanner scanner = null;
            try {
                scanner = new Scanner(System.in);
                System.out.println("Enter your age:");
                int age = scanner.nextInt();
                System.out.println("You are " + age + " years old");
            } finally {
                if (scanner != null) {
                    scanner.close();
                }
            }
        }
    }
    
    // Example 4: WeakReference to prevent memory leaks
    public static class CacheExample {
        // This can cause memory leaks
        private static Map<String, Object> strongCache = new HashMap<>();
        
        // This is better for caching
        private static Map<String, java.lang.ref.WeakReference<Object>> weakCache = new HashMap<>();
        
        public static void addToStrongCache(String key, Object value) {
            strongCache.put(key, value);
        }
        
        public static void addToWeakCache(String key, Object value) {
            weakCache.put(key, new java.lang.ref.WeakReference<>(value));
        }
        
        public static Object getFromWeakCache(String key) {
            java.lang.ref.WeakReference<Object> ref = weakCache.get(key);
            return (ref != null) ? ref.get() : null;
        }
        
        public static void clearExpiredWeakReferences() {
            weakCache.entrySet().removeIf(entry -> entry.getValue().get() == null);
        }
    }
}
```

### 11.3 Garbage Collection Understanding

```java
public class GarbageCollectionDemo {
    private String data;
    private static int createdObjects = 0;
    private static int destroyedObjects = 0;
    
    public GarbageCollectionDemo(String data) {
        this.data = data;
        createdObjects++;
        System.out.println("Created: " + data + " (Total created: " + createdObjects + ")");
    }
    
    @Override
    protected void finalize() throws Throwable {
        try {
            destroyedObjects++;
            System.out.println("Finalized: " + data + " (Total destroyed: " + destroyedObjects + ")");
        } finally {
            super.finalize();
        }
    }
    
    public static void demonstrateGC() {
        System.out.println("=== Garbage Collection Demonstration ===");
        
        // Create many objects in a loop
        for (int i = 0; i < 100000; i++) {
            GarbageCollectionDemo obj = new GarbageCollectionDemo("Object_" + i);
            
            // Every 10000 objects, suggest garbage collection
            if (i % 10000 == 0) {
                System.gc();
                Runtime runtime = Runtime.getRuntime();
                long memory = runtime.totalMemory() - runtime.freeMemory();
                System.out.println("Memory used: " + memory / (1024 * 1024) + " MB");
            }
        }
        
        // Final garbage collection
        System.gc();
        
        // Wait for finalization
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Final stats - Created: " + createdObjects + ", Destroyed: " + destroyedObjects);
    }
}
```

---

## 12. Interview Questions and Answers

### 12.1 Fundamental OOP Questions

**Q1: What are the four pillars of Object-Oriented Programming?**

**Answer:** The four pillars of OOP are:

1. **Encapsulation**: Bundling data and methods that operate on that data within a single unit (class) and controlling access through access modifiers.

2. **Inheritance**: The mechanism by which one class acquires properties and behaviors of another class, promoting code reuse.

3. **Polymorphism**: The ability of objects of different types to be treated as instances of the same type through a common interface.

4. **Abstraction**: Hiding complex implementation details while exposing only essential features and functionality.

**Q2: Explain the difference between Abstract Classes and Interfaces.**

**Answer:**

```java
// Abstract Class Example
abstract class Vehicle {
    protected String brand;  // Can have instance variables
    
    public Vehicle(String brand) {  // Can have constructors
        this.brand = brand;
    }
    
    public void startEngine() {  // Can have concrete methods
        System.out.println("Engine started");
    }
    
    abstract void move();  // Can have abstract methods
}

// Interface Example
interface Flyable {
    // All variables are public, static, final by default
    int MAX_ALTITUDE = 50000;
    
    // All methods are public and abstract by default (before Java 8)
    void fly();
    void land();
    
    // Default methods (Java 8+)
    default void checkWeather() {
        System.out.println("Checking weather conditions");
    }
    
    // Static methods (Java 8+)
    static void displayFlightRules() {
        System.out.println("Follow aviation safety rules");
    }
}
```

**Key Differences:**
- Abstract classes can have constructors, interfaces cannot
- Abstract classes can have instance variables, interfaces have only constants
- A class can extend only one abstract class but implement multiple interfaces
- Abstract classes can have both abstract and concrete methods

**Q3: What is the difference between Method Overloading and Method Overriding?**

**Answer:**

```java
class Calculator {
    // Method Overloading - Same method name, different parameters
    public int add(int a, int b) {
        return a + b;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
    
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    // Method Overriding - Same method signature, different implementation
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
```

**Method Overloading:**
- Same class, same method name, different parameters
- Compile-time polymorphism
- Return type may or may not be same

**Method Overriding:**
- Inheritance relationship, same method signature
- Runtime polymorphism
- Return type must be same or covariant

### 12.2 Advanced OOP Questions

**Q4: Explain the Singleton Pattern and implement a thread-safe version.**

**Answer:**

```java
public class ThreadSafeSingleton {
    // Volatile ensures visibility across threads
    private static volatile ThreadSafeSingleton instance;
    private String data;
    
    private ThreadSafeSingleton() {
        // Prevent reflection attacks
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create instance");
        }
        this.data = "Singleton Data";
    }
    
    // Double-checked locking pattern
    public static ThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
    
    // Alternative: Enum Singleton (Joshua Bloch's approach)
    public enum EnumSingleton {
        INSTANCE;
        
        private String data = "Enum Singleton Data";
        
        public void doSomething() {
            System.out.println("Doing something: " + data);
        }
    }
}
```

**Q5: What is the difference between Composition and Inheritance?**

**Answer:**

```java
// Inheritance Example - "IS-A" relationship
class Animal {
    protected String name;
    
    public void eat() {
        System.out.println(name + " is eating");
    }
}

class Dog extends Animal {  // Dog IS-A Animal
    public Dog(String name) {
        this.name = name;
    }
    
    public void bark() {
        System.out.println(name + " is barking");
    }
}

// Composition Example - "HAS-A" relationship
class Engine {
    private String type;
    
    public Engine(String type) {
        this.type = type;
    }
    
    public void start() {
        System.out.println(type + " engine started");
    }
}

class Car {  // Car HAS-A Engine
    private Engine engine;  // Composition
    private String model;
    
    public Car(String model, String engineType) {
        this.model = model;
        this.engine = new Engine(engineType);  // Car creates Engine
    }
    
    public void startCar() {
        engine.start();  // Delegating to Engine
        System.out.println(model + " is ready to drive");
    }
}
```

**When to use:**
- **Inheritance**: When there's a clear "IS-A" relationship and you want to extend functionality
- **Composition**: When there's a "HAS-A" relationship and you want more flexibility

### 12.3 Practical Coding Questions

**Q6: Design a Library Management System using OOP principles.**

**Answer:**

```java
import java.util.*;
import java.time.LocalDate;

// Book class
class Book {
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;
    
    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }
    
    // Getters and setters
    public String getIsbn() { return isbn; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { isAvailable = available; }
    
    @Override
    public String toString() {
        return "Book{ISBN='" + isbn + "', title='" + title + "', author='" + author + "'}";
    }
}

// Member class
class Member {
    private String memberId;
    private String name;
    private String email;
    private List<Book> borrowedBooks;
    
    public Member(String memberId, String name, String email) {
        this.memberId = memberId;
        this.name = name;
        this.email = email;
        this.borrowedBooks = new ArrayList<>();
    }
    
    public String getMemberId() { return memberId; }
    public String getName() { return name; }
    public List<Book> getBorrowedBooks() { return borrowedBooks; }
    
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }
    
    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }
}

// Library Management System
class LibraryManagementSystem {
    private Map<String, Book> books;
    private Map<String, Member> members;
    private Map<String, LocalDate> borrowDates;
    
    public LibraryManagementSystem() {
        this.books = new HashMap<>();
        this.members = new HashMap<>();
        this.borrowDates = new HashMap<>();
    }
    
    public void addBook(Book book) {
        books.put(book.getIsbn(), book);
        System.out.println("Book added: " + book);
    }
    
    public void addMember(Member member) {
        members.put(member.getMemberId(), member);
        System.out.println("Member added: " + member.getName());
    }
    
    public boolean borrowBook(String memberId, String isbn) {
        Member member = members.get(memberId);
        Book book = books.get(isbn);
        
        if (member == null) {
            System.out.println("Member not found");
            return false;
        }
        
        if (book == null) {
            System.out.println("Book not found");
            return false;
        }
        
        if (!book.isAvailable()) {
            System.out.println("Book is not available");
            return false;
        }
        
        book.setAvailable(false);
        member.borrowBook(book);
        borrowDates.put(isbn, LocalDate.now());
        
        System.out.println(member.getName() + " borrowed: " + book.getTitle());
        return true;
    }
    
    public boolean returnBook(String memberId, String isbn) {
        Member member = members.get(memberId);
        Book book = books.get(isbn);
        
        if (member == null || book == null) {
            System.out.println("Member or book not found");
            return false;
        }
        
        book.setAvailable(true);
        member.returnBook(book);
        borrowDates.remove(isbn);
        
        System.out.println(member.getName() + " returned: " + book.getTitle());
        return true;
    }
    
    public void displayAvailableBooks() {
        System.out.println("Available Books:");
        for (Book book : books.values()) {
            if (book.isAvailable()) {
                System.out.println("- " + book);
            }
        }
    }
}
```

### 12.4 Common Pitfalls and Best Practices

**Q7: What are some common OOP mistakes and how to avoid them?**

**Answer:**

```java
// Common Mistake 1: God Object (Too many responsibilities)
// BAD
class UserManager {
    public void createUser() { /* ... */ }
    public void sendEmail() { /* ... */ }
    public void generateReport() { /* ... */ }
    public void processPayment() { /* ... */ }
    public void logActivity() { /* ... */ }
}

// GOOD - Single Responsibility Principle
class User {
    // User data and basic operations
}

class EmailService {
    public void sendEmail(String to, String subject, String body) { /* ... */ }
}

class ReportGenerator {
    public void generateUserReport(User user) { /* ... */ }
}

// Common Mistake 2: Inappropriate Inheritance
// BAD
class Rectangle {
    protected int width, height;
    
    public void setWidth(int width) { this.width = width; }
    public void setHeight(int height) { this.height = height; }
    public int getArea() { return width * height; }
}

class Square extends Rectangle {  // This violates LSP
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);  // Problem: changing width affects height
    }
    
    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);  // Problem: changing height affects width
    }
}

// GOOD - Use composition instead
interface Shape {
    int getArea();
}

class Rectangle implements Shape {
    private int width, height;
    
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    @Override
    public int getArea() { return width * height; }
}

class Square implements Shape {
    private int side;
    
    public Square(int side) {
        this.side = side;
    }
    
    @Override
    public int getArea() { return side * side; }
}
```

**Best Practices:**
1. **Follow SOLID Principles**
2. **Prefer Composition over Inheritance**
3. **Use Interfaces for contracts**
4. **Keep classes focused (Single Responsibility)**
5. **Encapsulate what varies**
6. **Program to interfaces, not implementations**

---

## Summary

This comprehensive guide covers all essential OOP concepts from basic principles to advanced design patterns and practical interview questions. Key takeaways:

1. **Master the fundamentals**: Encapsulation, Inheritance, Polymorphism, and Abstraction
2. **Understand design patterns**: They provide proven solutions to common problems
3. **Practice memory management**: Understand object lifecycle and garbage collection
4. **Apply SOLID principles**: Write maintainable and scalable code
5. **Learn from common mistakes**: Avoid pitfalls like God objects and inappropriate inheritance

Remember that OOP is not just about syntax—it's about designing clean, maintainable, and scalable software systems that model real-world problems effectively.