# Complete Java Object-Oriented Programming Guide
### From Fundamentals to Advanced - 200+ Interview Questions

---

## Table of Contents

1. [Introduction to OOP](#1-introduction-to-oop)
2. [Classes and Objects](#2-classes-and-objects)
3. [Constructors](#3-constructors)
4. [Encapsulation](#4-encapsulation)
5. [Inheritance](#5-inheritance)
6. [Polymorphism](#6-polymorphism)
7. [Abstraction](#7-abstraction)
8. [Advanced OOP Concepts](#8-advanced-oop-concepts)
9. [Design Patterns](#9-design-patterns)
10. [Interview Scenarios & Problem Solving](#10-interview-scenarios--problem-solving)

---

## 1. Introduction to OOP

### What is Object-Oriented Programming?

Object-Oriented Programming (OOP) is a programming paradigm that organizes software design around **objects** rather than functions and logic. An object is a data field with unique attributes and behavior.

**Real-World Analogy:**
Think of building with LEGO blocks. Each LEGO piece is an object with:
- **Properties**: color, size, shape
- **Behaviors**: can connect, can stack, can rotate

Similarly, in OOP:
- A **Car** object has properties (color, model, speed) and behaviors (start, stop, accelerate)
- A **Student** object has properties (name, rollNumber, grade) and behaviors (study, attendClass, takeExam)

### Why OOP? The Problem It Solves

**Before OOP (Procedural Programming):**
```java
// Scattered data and functions
String car1Model = "Toyota";
String car1Color = "Red";
int car1Speed = 0;

String car2Model = "Honda";
String car2Color = "Blue";
int car2Speed = 0;

void startCar1() {
    System.out.println("Car 1 starting");
}

void startCar2() {
    System.out.println("Car 2 starting");
}
// Messy, hard to maintain, lots of duplication!
```

**With OOP:**
```java
class Car {
    String model;
    String color;
    int speed;
    
    void start() {
        System.out.println(model + " starting");
    }
}

Car car1 = new Car();
Car car2 = new Car();
// Clean, organized, reusable!
```

### Four Pillars of OOP (Remember: **APIE**)

1. **A**bstraction - Hiding complex details, showing only essentials
2. **P**olymorphism - One interface, many implementations
3. **I**nheritance - Child class acquires parent properties
4. **E**ncapsulation - Data hiding using access modifiers

### Benefits of OOP

1. **Modularity**: Code is organized into objects
2. **Reusability**: Through inheritance and composition
3. **Flexibility**: Through polymorphism
4. **Maintainability**: Changes in one place don't break everything
5. **Security**: Data hiding through encapsulation
6. **Real-world modeling**: Maps naturally to real entities

---

### Interview Questions: Introduction to OOP (Q1-Q15)

**Q1: What is Object-Oriented Programming?**
**A:** OOP is a programming paradigm based on "objects" that contain both data (attributes) and code (methods). It organizes software around objects rather than functions and logic, making code more modular, reusable, and maintainable.

**Q2: What are the main features/pillars of OOP?**
**A:** The four pillars are:
- **Abstraction**: Hiding implementation complexity
- **Polymorphism**: Same interface, different behaviors
- **Inheritance**: Code reuse through parent-child relationships
- **Encapsulation**: Bundling data with methods and restricting access

**Q3: Why should we use OOP instead of procedural programming?**
**A:** OOP provides:
- Better code organization and modularity
- Code reusability through inheritance
- Data security through encapsulation
- Flexibility through polymorphism
- Easier maintenance and debugging
- Natural mapping to real-world problems

**Q4: What is the difference between procedural and object-oriented programming?**
**A:**
| Procedural | Object-Oriented |
|------------|-----------------|
| Functions are primary | Objects are primary |
| Top-down approach | Bottom-up approach |
| Data exposed globally | Data hidden in objects |
| No inheritance | Supports inheritance |
| Less secure | More secure |
| Examples: C, Pascal | Examples: Java, C++, Python |

**Q5: Is Java 100% object-oriented? Why or why not?**
**A:** No, Java is not 100% object-oriented because:
- It uses primitive data types (int, char, boolean, etc.) which are not objects
- Static members belong to class, not objects
- We need wrapper classes to treat primitives as objects

**Q6: What is the difference between object-based and object-oriented languages?**
**A:**
- **Object-based**: Supports objects but not all OOP features like inheritance (e.g., early JavaScript, VBScript)
- **Object-oriented**: Supports full OOP including inheritance, polymorphism, etc. (e.g., Java, C++, Python)

**Q7: What is a message in OOP?**
**A:** A message is how one object communicates with another by invoking its methods. When we call `car.start()`, we're sending a "start" message to the car object.

**Q8: What is coupling in OOP?**
**A:** Coupling is the degree of dependency between classes.
- **Tight coupling**: High dependency (bad - hard to modify)
- **Loose coupling**: Low dependency (good - easy to maintain)

**Q9: What is cohesion in OOP?**
**A:** Cohesion measures how closely related the responsibilities of a class are. High cohesion means a class has a single, well-defined purpose (good design).

**Q10: Explain tight coupling vs loose coupling with examples.**
**A:**
```java
// Tight Coupling - BAD
class Car {
    PetrolEngine engine = new PetrolEngine(); // Hard-coded dependency
}

// Loose Coupling - GOOD
class Car {
    private Engine engine;
    public Car(Engine engine) { // Dependency injection
        this.engine = engine;
    }
}
```

**Q11: What are the advantages of OOP?**
**A:**
- Code reusability through inheritance
- Data security through encapsulation
- Easy troubleshooting and maintenance
- Flexible through polymorphism
- Better software design and architecture
- Team development support

**Q12: What are the disadvantages of OOP?**
**A:**
- Steeper learning curve
- Larger program size
- Slower execution compared to procedural
- Requires more planning in design phase
- Not suitable for all types of problems

**Q13: What real-world problems does OOP solve?**
**A:** OOP helps solve:
- Code duplication (through inheritance)
- Data security issues (through encapsulation)
- Complex system management (through modularity)
- Maintenance difficulties (through clear structure)
- Team collaboration issues (through well-defined interfaces)

**Q14: How does OOP relate to real-world entities?**
**A:** OOP naturally models real-world entities as objects. For example:
- A Bank Account has balance (property) and deposit/withdraw (behavior)
- A Student has name, grades (properties) and study, attendClass (behaviors)
- This makes software design intuitive and easier to understand

**Q15: What is the principle of "Don't Repeat Yourself" (DRY) in OOP?**
**A:** DRY principle states that every piece of knowledge should have a single, unambiguous representation in the system. OOP achieves this through inheritance and reusable components, avoiding code duplication.

---

## 2. Classes and Objects

### What is a Class?

A **class** is a blueprint or template that defines the structure and behavior of objects. Think of it as a cookie cutter - it defines the shape but doesn't create the cookie yet.

**Syntax:**
```java
class ClassName {
    // Data members (fields/attributes)
    dataType field1;
    dataType field2;
    
    // Member functions (methods/behaviors)
    returnType method1() {
        // method body
    }
}
```

**Example:**
```java
public class Dog {
    // Properties (what a dog HAS)
    String name;
    String breed;
    int age;
    String color;
    
    // Behaviors (what a dog DOES)
    void bark() {
        System.out.println(name + " says: Woof! Woof!");
    }
    
    void eat() {
        System.out.println(name + " is eating");
    }
    
    void sleep() {
        System.out.println(name + " is sleeping");
    }
}
```

### What is an Object?

An **object** is an instance of a class - the actual entity created from the blueprint. It's the cookie made from the cookie cutter.

An object has three characteristics:
1. **State**: Represented by attributes/fields
2. **Behavior**: Represented by methods
3. **Identity**: Unique reference in memory

**Creating Objects:**
```java
// Syntax: ClassName objectName = new ClassName();
Dog dog1 = new Dog();

// Setting properties
dog1.name = "Buddy";
dog1.breed = "Golden Retriever";
dog1.age = 3;
dog1.color = "Golden";

// Calling methods
dog1.bark();  // Buddy says: Woof! Woof!
dog1.eat();   // Buddy is eating
```

### What Happens When We Create an Object?

```java
Dog myDog = new Dog();
```

1. **Memory Allocation**: Space allocated in heap memory
2. **Constructor Invocation**: Default or custom constructor is called
3. **Initialization**: Instance variables get default values
4. **Reference Assignment**: Reference variable `myDog` points to object
5. **Object Ready**: Object is now ready to use

### Instance Variables vs Local Variables

```java
public class Student {
    // Instance variables - belong to object
    String name;        // Exists as long as object exists
    int rollNumber;     // Each object has its own copy
    
    void study() {
        // Local variable - belongs to method
        int hoursStudied = 5;  // Created when method called
        System.out.println(name + " studied for " + hoursStudied + " hours");
    } // hoursStudied destroyed when method ends
}
```

**Key Differences:**

| Instance Variables | Local Variables |
|-------------------|-----------------|
| Declared in class, outside methods | Declared inside methods |
| Stored in heap | Stored in stack |
| Live as long as object exists | Live only during method execution |
| Get default values (0, null, false) | Must be initialized before use |
| Can use access modifiers | No access modifiers |
| Accessed by all methods in class | Only accessible in that method |

### Instance vs Static (Class) Members

**Instance Members** - Belong to each object (every dog has its own name)  
**Static Members** - Shared by ALL objects (all dogs are mammals)

```java
public class Dog {
    // Instance variables - each dog has its own
    String name;
    int age;
    
    // Static variables - shared by ALL dogs
    static String species = "Canis familiaris";
    static int totalDogs = 0;
    
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        totalDogs++;  // Increment shared counter
    }
    
    // Instance method - needs object to call
    void bark() {
        System.out.println(name + " is barking");
    }
    
    // Static method - call without creating object
    static void displaySpecies() {
        System.out.println("All dogs are: " + species);
        // System.out.println(name); // ERROR! Can't access instance variable
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy", 3);
        Dog dog2 = new Dog("Max", 5);
        
        // Instance members - need object
        dog1.bark();  // Buddy is barking
        
        // Static members - use class name
        System.out.println(Dog.species);      // Canis familiaris
        System.out.println(Dog.totalDogs);    // 2
        Dog.displaySpecies();
    }
}
```

### The 'this' Keyword

`this` is a reference variable that refers to the **current object**. It's like saying "myself" or "this object".

**Uses of 'this':**

**1. To refer to current object's instance variable:**
```java
class Person {
    String name;
    
    void setName(String name) {
        this.name = name;  // 'this.name' is instance variable
                          // 'name' is parameter
    }
}
```

**2. To invoke current class method:**
```java
class Calculator {
    void display() {
        System.out.println("Displaying");
    }
    
    void show() {
        this.display();  // Calling current class method
    }
}
```

**3. To pass current object as parameter:**
```java
class Person {
    int age;
    
    void compareAge(Person other) {
        if (this.age > other.age) {
            System.out.println("I am older");
        }
    }
    
    void callAnotherMethod() {
        processObject(this);  // Passing current object
    }
    
    void processObject(Person p) {
        // Process
    }
}
```

**4. To return current object:**
```java
class Builder {
    private String name;
    
    Builder setName(String name) {
        this.name = name;
        return this;  // Return current object for chaining
    }
    
    // Usage: builder.setName("Test").build();
}
```

---

### Interview Questions: Classes and Objects (Q16-Q45)

**Q16: What is a class?**
**A:** A class is a blueprint or template that defines the structure (data) and behavior (methods) for objects. It's a user-defined data type that doesn't consume memory until an object is created.

**Q17: What is an object?**
**A:** An object is an instance of a class. It's a real-world entity with:
- State (values of attributes)
- Behavior (methods it can perform)
- Identity (unique memory address)

**Q18: What is the difference between a class and an object?**
**A:**
| Class | Object |
|-------|--------|
| Blueprint/template | Instance of class |
| Logical entity | Physical entity |
| Declared once | Created many times |
| No memory at declaration | Memory allocated at creation |
| Example: Car | Example: myCar, yourCar |

**Q19: Can we have multiple classes in a single Java file?**
**A:** Yes, but only ONE class can be public, and the file name must match the public class name.
```java
// File: Main.java
public class Main { }
class Helper { }  // OK, but not public
class Utility { } // OK, but not public
```

**Q20: What happens when you create an object?**
**A:** When we write `Dog d = new Dog();`:
1. Memory allocated in heap
2. Default/custom constructor invoked
3. Instance variables initialized
4. Reference returned and assigned to variable
5. Object ready to use

**Q21: How many ways can you create an object in Java?**
**A:** Five ways:
1. Using `new` keyword: `Dog d = new Dog();`
2. Using `newInstance()`: `Class.forName("Dog").newInstance();`
3. Using `clone()`: `Dog d2 = (Dog) d1.clone();`
4. Using deserialization: Reading from ObjectInputStream
5. Using factory methods: `Integer.valueOf()`

**Q22: What are instance variables?**
**A:** Variables declared inside a class but outside any method. Each object has its own copy. They get default values if not initialized.

**Q23: What are class/static variables?**
**A:** Variables declared with `static` keyword. Shared among all objects of the class. Only one copy exists in memory regardless of object count.

**Q24: What is the difference between instance and static variables?**
**A:**
| Instance Variable | Static Variable |
|-------------------|-----------------|
| Belongs to object | Belongs to class |
| Each object has copy | One copy for all objects |
| Created when object created | Created when class loaded |
| Accessed via object | Accessed via class name |
| Not shared | Shared among all objects |

**Q25: What is a local variable?**
**A:** Variable declared inside a method or block. It's created when method is called and destroyed when method completes. Must be initialized before use. No default values.

**Q26: What are default values for instance variables?**
**A:**
- `int`, `byte`, `short`, `long`: 0
- `float`, `double`: 0.0
- `boolean`: false
- `char`: '\u0000' (null character)
- Object references: null

**Q27: Why can't we access instance variables from static methods?**
**A:** Static methods belong to the class and can be called without objects. Instance variables belong to objects which may not exist when static method is called. Hence, static methods cannot access instance members directly.

**Q28: Can static methods be overridden?**
**A:** No, static methods cannot be overridden. They can be hidden (method hiding). Static methods are resolved at compile-time, not runtime.

**Q29: What is the 'this' keyword? When do we use it?**
**A:** `this` refers to the current object. Used to:
- Differentiate between instance variables and parameters with same name
- Call one constructor from another (`this()`)
- Pass current object as parameter
- Return current object from method

**Q30: Can we use 'this' keyword in static methods?**
**A:** No. Static methods belong to class, not objects. `this` refers to current object, which doesn't exist in static context.

**Q31: What is the difference between 'this' and 'super'?**
**A:**
| this | super |
|------|-------|
| Refers to current object | Refers to parent object |
| Access current class members | Access parent class members |
| Call current class constructor | Call parent class constructor |

**Q32: Can a class be declared as static?**
**A:** No, outer/top-level classes cannot be static. Only nested classes can be static.

**Q33: What is an anonymous object?**
**A:** Object created without reference variable.
```java
new Dog().bark();  // Anonymous object
// Object created, used, and eligible for GC immediately
```

**Q34: What is the purpose of a class?**
**A:** Classes provide:
- Code organization and modularity
- Blueprint for creating objects
- Encapsulation of data and methods
- Support for OOP principles
- Reusability through inheritance

**Q35: Can we create an object of an abstract class?**
**A:** No, we cannot directly instantiate abstract classes. But we can create anonymous inner class objects or reference variables of abstract class type.

**Q36: How is memory allocated for objects?**
**A:** Objects are allocated memory in the **heap**. The reference variable is stored in the **stack**, which points to the object in heap.

**Q37: What is the size of an object in Java?**
**A:** Object size depends on:
- Instance variables
- Object header (8-16 bytes)
- Alignment padding
Varies by JVM implementation and architecture (32-bit vs 64-bit).

**Q38: Can we have a method with the same name as the class?**
**A:** Yes, but it's not a constructor (if it has return type). It's a regular method that happens to have the same name as the class.

**Q39: What is the state of an object?**
**A:** State represents the values of all instance variables of an object at any point in time. It defines the object's current condition.

**Q40: What is the behavior of an object?**
**A:** Behavior consists of all methods that an object can perform. It defines what actions an object can take.

**Q41: What is the identity of an object?**
**A:** Identity is the unique memory address of an object. Even if two objects have the same state, they have different identities if they're separate objects in memory.

**Q42: Can two objects have the same identity?**
**A:** No, each object has a unique identity (memory address), even if they have identical states.

**Q43: What is object cloning?**
**A:** Creating an exact copy of an object. In Java, implement `Cloneable` interface and override `clone()` method.
```java
class Person implements Cloneable {
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
```

**Q44: What is the difference between shallow copy and deep copy?**
**A:**
- **Shallow copy**: Copies object but referenced objects are shared
- **Deep copy**: Copies object and creates new copies of all referenced objects

**Q45: Why do we need to override equals() and hashCode() together?**
**A:** Contract states: if two objects are equal (according to `equals()`), they must have the same `hashCode()`. This is crucial for collections like HashMap, HashSet to work correctly.

---

## 3. Constructors

### What is a Constructor?

A constructor is a special method that initializes objects. It's automatically called when an object is created using the `new` keyword.

**Characteristics of Constructors:**
- Same name as class name
- No return type (not even void)
- Called automatically when object is created
- Can be overloaded
- Cannot be abstract, static, or final

**Syntax:**
```java
class ClassName {
    // Constructor
    ClassName() {
        // initialization code
    }
}
```

### Types of Constructors

#### 1. Default Constructor (No-Argument Constructor)

```java
public class Student {
    String name;
    int rollNumber;
    
    // Default constructor
    public Student() {
        name = "Unknown";
        rollNumber = 0;
        System.out.println("Student created with default values");
    }
}

// Usage
Student s = new Student();  // Constructor called automatically
```

**Important:** If you don't write ANY constructor, Java automatically provides an invisible default constructor. But if you write even ONE constructor (parameterized), Java won't provide the default one.

#### 2. Parameterized Constructor

```java
public class Student {
    String name;
    int rollNumber;
    
    // Parameterized constructor
    public Student(String studentName, int roll) {
        name = studentName;
        rollNumber = roll;
        System.out.println("Student created: " + name);
    }
}

// Usage
Student s = new Student("Alice", 101);
```

#### 3. Copy Constructor

Creates a new object by copying another object's values.

```java
public class Student {
    String name;
    int rollNumber;
    
    // Regular constructor
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
    
    // Copy constructor
    public Student(Student other) {
        this.name = other.name;
        this.rollNumber = other.rollNumber;
        System.out.println("Copy created");
    }
}

// Usage
Student original = new Student("Alice", 101);
Student copy = new Student(original);  // Copy of original
```

### Constructor Overloading

Having multiple constructors with different parameter lists.

```java
public class Rectangle {
    double length;
    double width;
    
    // Constructor 1 - No parameters
    public Rectangle() {
        length = 1.0;
        width = 1.0;
    }
    
    // Constructor 2 - One parameter (square)
    public Rectangle(double side) {
        length = side;
        width = side;
    }
    
    // Constructor 3 - Two parameters
    public Rectangle(double l, double w) {
        length = l;
        width = w;
    }
    
    double area() {
        return length * width;
    }
}

// Usage
Rectangle r1 = new Rectangle();         // 1x1 rectangle
Rectangle r2 = new Rectangle(5);        // 5x5 square
Rectangle r3 = new Rectangle(4, 6);     // 4x6 rectangle
```

### Constructor Chaining

Calling one constructor from another using `this()` or `super()`.

**Using this():**
```java
public class Employee {
    int id;
    String name;
    double salary;
    String department;
    
    // Constructor 1
    public Employee() {
        this(0, "Unknown");  // Calls Constructor 2
    }
    
    // Constructor 2
    public Employee(int id, String name) {
        this(id, name, 0.0);  // Calls Constructor 3
    }
    
    // Constructor 3
    public Employee(int id, String name, double salary) {
        this(id, name, salary, "General");  // Calls Constructor 4
    }
    
    // Constructor 4 - Master constructor
    public Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
}
```

**Rules for this():**
- Must be the FIRST statement in constructor
- Can't use `this()` and `super()` in the same constructor
- Can't create circular chain

**Using super():**
```java
class Person {
    String name;
    int age;
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {
    int rollNumber;
    
    Student(String name, int age, int roll) {
        super(name, age);  // Call parent constructor - must be first line
        this.rollNumber = roll;
    }
}
```

### Private Constructor

Used to prevent object creation from outside the class. Useful for:
- Singleton pattern
- Utility classes (only static methods)
- Factory pattern

```java
public class Singleton {
    private static Singleton instance;
    
    // Private constructor
    private Singleton() {
        System.out.println("Singleton instance created");
    }
    
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

// Usage
Singleton obj1 = Singleton.getInstance();
Singleton obj2 = Singleton.getInstance();
System.out.println(obj1 == obj2);  // true - same instance
```

---

### Interview Questions: Constructors (Q46-Q75)

**Q46: What is a constructor?**
**A:** A constructor is a special method used to initialize objects. It has the same name as the class, has no return type, and is called automatically when an object is created using `new` keyword.

**Q47: What are the rules for creating a constructor?**
**A:**
- Must have same name as class
- No return type (not even void)
- Can be overloaded
- Cannot be abstract, static, final, or synchronized
- Can have any access modifier
- Automatically called when object created

**Q48: What is the difference between constructor and method?**
**A:**
| Constructor | Method |
|------------|--------|
| Same name as class | Any name |
| No return type | Must have return type |
| Called automatically | Called explicitly |
| Used for initialization | Used for behavior |
| Cannot be inherited | Can be inherited |
| Cannot be abstract/static/final | Can be abstract/static/final |

**Q49: Can constructor return a value?**
**A:** Constructor implicitly returns the current instance (this), but we cannot specify return type or explicitly return values.

**Q50: Can constructor be overloaded?**
**A:** Yes. We can have multiple constructors with different parameter lists in the same class.

**Q51: Can constructor be overridden?**
**A:** No. Constructors are not inherited, so they cannot be overridden. However, child class constructor can call parent constructor using `super()`.

**Q52: What is a default constructor?**
**A:** A no-argument constructor that Java provides automatically if no constructor is defined. It initializes instance variables to default values.

**Q53: When does Java provide a default constructor?**
**A:** Java provides default constructor only when NO constructors are defined in the class. If even one constructor exists, Java won't provide default constructor.

**Q54: What is constructor overloading?**
**A:** Having multiple constructors with different parameter lists (different number, type, or order of parameters) in the same class.

**Q55: What is constructor chaining?**
**A:** Calling one constructor from another. Achieved using:
- `this()` - call another constructor in same class
- `super()` - call parent class constructor

**Q56: What is the use of 'this()' in constructor?**
**A:** `this()` calls another constructor of the same class. Must be the first statement in constructor. Used to avoid code duplication.

**Q57: What is the use of 'super()' in constructor?**
**A:** `super()` calls parent class constructor. Must be the first statement. If not called explicitly, Java automatically adds `super()` call to no-arg parent constructor.

**Q58: Can we use both this() and super() in the same constructor?**
**A:** No. Both must be the first statement, which is impossible. We can use only one.

**Q59: What happens if parent class doesn't have a default constructor?**
**A:** Child class must explicitly call parent's parameterized constructor using `super(args)`, or compiler will give error.

**Q60: Can constructor be private?**
**A:** Yes. Private constructors prevent object creation from outside the class. Used in Singleton pattern, utility classes, and factory patterns.

**Q61: What is a copy constructor?**
**A:** A constructor that creates an object by copying values from another object of the same class.
```java
public Person(Person other) {
    this.name = other.name;
    this.age = other.age;
}
```

**Q62: Can constructor be static?**
**A:** No. Constructors cannot be static because they are called on objects during object creation. Static belongs to class, not objects.

**Q63: Can constructor be final?**
**A:** No. `final` prevents overriding, but constructors cannot be inherited or overridden, so `final` is meaningless for constructors.

**Q64: Can constructor be abstract?**
**A:** No. Abstract means method has no body and must be overridden. Constructors cannot be overridden, so cannot be abstract.

**Q65: Can constructor be synchronized?**
**A:** No. Constructor is called only once during object creation, so synchronization is not needed.

**Q66: Can we call constructor explicitly?**
**A:** Yes, using `this()` or `super()` from within another constructor, or using reflection. But we cannot call constructor like a regular method on an object.

**Q67: What is the order of execution of constructors in inheritance?**
**A:** Parent class constructor executes first, then child class constructor.
```
Parent constructor → Child constructor
```

**Q68: Can constructor throw exceptions?**
**A:** Yes. Constructors can throw both checked and unchecked exceptions.

**Q69: What is constructor injection?**
**A:** Design pattern where dependencies are provided to a class through its constructor parameters, promoting loose coupling and testability.

**Q70: How many constructors can a class have?**
**A:** A class can have any number of constructors (overloaded), but each must have a unique signature (parameter list).

**Q71: What is a parameterized constructor?**
**A:** A constructor that accepts parameters to initialize object with specific values during creation.

**Q72: What happens if constructor throws an exception?**
**A:** Object creation fails, memory is not allocated, and exception propagates to caller. The object is never created.

**Q73: Can we call parent class constructor from child class?**
**A:** Yes, using `super()`. If not called explicitly, Java automatically calls parent's no-arg constructor.

**Q74: What is a no-argument constructor?**
**A:** A constructor that takes no parameters. Can be default (provided by Java) or explicitly defined by programmer.

**Q75: Why can't constructor have return type?**
**A:** Constructor's purpose is to initialize objects and it implicitly returns the current instance. Having a return type would make it a regular method, not a constructor.

---

## 4. Encapsulation

### What is Encapsulation?

**Definition:** Encapsulation is the bundling of data (variables) and methods that operate on that data into a single unit (class), while hiding the internal implementation details from the outside world.

**Real-World Analogy:**
Think of a **capsule medicine**:
- Medicine (data) is protected inside the capsule
- You can't see or directly access what's inside
- You take it as intended (controlled access)
- The medicine works without you needing to know its composition

Another example - **TV Remote:**
- Internal circuits are hidden
- You only see buttons (interface)
- You press buttons to control TV
- You don't need to know how it works internally

### Why Encapsulation?

**Without Encapsulation (Bad Design):**
```java
public class BankAccount {
    public double balance;  // Anyone can access!
}

// In another class
BankAccount account = new BankAccount();
account.balance = -5000;    // Disaster! Negative balance
account.balance = 999999;   // Direct manipulation
```

**With Encapsulation (Good Design):**
```java
public class BankAccount {
    private double balance;  // Hidden from outside
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid amount");
        }
    }
    
    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        }
        System.out.println("Insufficient balance");
        return false;
    }
    
    public double getBalance() {
        return balance;
    }
}

// Now controlled access
BankAccount account = new BankAccount();
account.deposit(1000);     // Valid
account.withdraw(500);     // Validated
// account.balance = -5000; // ERROR! Can't access directly
```

### Access Modifiers

Java provides four access levels to control visibility:

**1. private** - Most restrictive
**2. default** (no modifier) - Package-private
**3. protected** - Package + subclasses
**4. public** - Least restrictive

```java
public class AccessDemo {
    public int publicVar;        // Accessible everywhere
    protected int protectedVar;  // Same package + subclasses
    int defaultVar;              // Same package only
    private int privateVar;      // This class only
    
    public void publicMethod() { }
    protected void protectedMethod() { }
    void defaultMethod() { }
    private void privateMethod() { }
}
```

**Access Level Table:**

| Modifier | Same Class | Same Package | Subclass | Everywhere |
|----------|-----------|--------------|----------|------------|
| public | ✓ | ✓ | ✓ | ✓ |
| protected | ✓ | ✓ | ✓ | ✗ |
| default | ✓ | ✓ | ✗ | ✗ |
| private | ✓ | ✗ | ✗ | ✗ |

### Getters and Setters

**Getter (Accessor)** - Read data
**Setter (Mutator)** - Write data with validation

```java
public class Person {
    private String name;
    private int age;
    private String email;
    
    // Getter for name
    public String getName() {
        return name;
    }
    
    // Setter for name with validation
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name cannot be empty");
        }
    }
    
    // Getter for age
    public int getAge() {
        return age;
    }
    
    // Setter for age with validation
    public void setAge(int age) {
        if (age >= 0 && age <= 150) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Invalid age");
        }
    }
    
    // Getter for email
    public String getEmail() {
        return email;
    }
    
    // Setter for email with validation
    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Invalid email");
        }
    }
}

// Usage
Person person = new Person();
person.setName("Alice");
person.setAge(25);
person.setEmail("alice@example.com");
// person.setAge(-5);  // Throws exception
```

### Complete Encapsulation Example

```java
public class BankAccount {
    // Private data members - fully encapsulated
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private String accountType;
    private static final double MIN_BALANCE = 1000.0;
    
    // Constructor
    public BankAccount(String accountNumber, String holderName, 
                      String accountType, double initialBalance) {
        if (initialBalance < MIN_BALANCE) {
            throw new IllegalArgumentException(
                "Minimum balance required: " + MIN_BALANCE);
        }
        this.accountNumber = accountNumber;
        this.accountHolderName = holderName;
        this.accountType = accountType;
        this.balance = initialBalance;
    }
    
    // Public method - controlled access
    public boolean deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Amount must be positive");
            return false;
        }
        balance += amount;
        System.out.println("Deposited: $" + amount);
        System.out.println("New Balance: $" + balance);
        return true;
    }
    
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Amount must be positive");
            return false;
        }
        if (balance - amount < MIN_BALANCE) {
            System.out.println("Insufficient balance. Minimum balance: $" + MIN_BALANCE);
            return false;
        }
        balance -= amount;
        System.out.println("Withdrawn: $" + amount);
        System.out.println("New Balance: $" + balance);
        return true;
    }
    
    // Read-only access (no setter)
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public double getBalance() {
        return balance;
    }
    
    // Controlled update
    public void updateAccountHolderName(String newName) {
        if (newName != null && !newName.trim().isEmpty()) {
            this.accountHolderName = newName;
            System.out.println("Name updated successfully");
        }
    }
    
    public String getAccountHolderName() {
        return accountHolderName;
    }
    
    public String getAccountType() {
        return accountType;
    }
    
    public void displayAccountInfo() {
        System.out.println("=== Account Details ===");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + accountHolderName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: $" + balance);
    }
}
```

### Benefits of Encapsulation

1. **Data Hiding** - Internal details are hidden
2. **Increased Flexibility** - Can change implementation without affecting users
3. **Reusability** - Encapsulated code can be reused
4. **Testing** - Easier to test and debug
5. **Control** - Full control over data through validation
6. **Read-Only/Write-Only** - Can create read-only fields (only getter)
7. **Security** - Protects data from unauthorized access

---

### Interview Questions: Encapsulation (Q76-Q100)

**Q76: What is encapsulation?**
**A:** Encapsulation is the mechanism of bundling data (variables) and methods that operate on that data into a single unit (class), while hiding internal implementation details from outside world using access modifiers.

**Q77: Why is encapsulation important?**
**A:** Encapsulation provides:
- Data security and protection
- Control over data through validation
- Flexibility to change implementation
- Increased modularity
- Easier maintenance and testing
- Implementation hiding

**Q78: How do you achieve encapsulation in Java?**
**A:** Achieve encapsulation by:
1. Declaring variables as private
2. Providing public getter/setter methods
3. Validating data in setters
4. Controlling access through methods

**Q79: What is the difference between encapsulation and abstraction?**
**A:**
| Encapsulation | Abstraction |
|--------------|-------------|
| Data hiding (HOW) | Hiding complexity (WHAT) |
| Implementation level | Design level |
| Using access modifiers | Using abstract classes/interfaces |
| Bundling data with methods | Showing only essential features |
| Example: private fields + getters/setters | Example: TV remote (hide circuits) |

**Q80: What are access modifiers in Java?**
**A:** Keywords that set accessibility of classes, methods, and variables:
- **public**: Accessible everywhere
- **protected**: Same package + subclasses
- **default**: Same package only
- **private**: Same class only

**Q81: What is the most restrictive access modifier?**
**A:** `private` - accessible only within the same class.

**Q82: What is the default access modifier in Java?**
**A:** When no modifier is specified, it's **default** (package-private) - accessible only within the same package.

**Q83: Can we access private members of a class from outside?**
**A:** Not directly, but can access through:
- Public getter/setter methods
- Reflection (breaks encapsulation)
- Inner classes can access outer class private members

**Q84: What are getter and setter methods?**
**A:**
- **Getter (accessor)**: Method to read/get value of private variable
- **Setter (mutator)**: Method to write/set value with validation

**Q85: Why use getters and setters instead of public variables?**
**A:** Benefits:
- Control and validation before setting values
- Can make fields read-only (only getter)
- Can change internal implementation without affecting users
- Can add logic (logging, notifications)
- Maintains encapsulation

**Q86: Can we have a getter without a setter?**
**A:** Yes. This creates a read-only field that can only be set through constructor or internally.

**Q87: Can we have a setter without a getter?**
**A:** Yes. This creates a write-only field (rare but valid).

**Q88: What is data hiding?**
**A:** Data hiding is the concept of making data members private so they cannot be accessed directly from outside the class. It's a key aspect of encapsulation.

**Q89: Can private methods be overridden?**
**A:** No. Private methods are not inherited, so they cannot be overridden in subclasses.

**Q90: Can protected members be accessed from different package?**
**A:** Yes, but only by subclasses in different packages. Not by non-subclass classes.

**Q91: What is the difference between private and protected?**
**A:**
- **private**: Only same class
- **protected**: Same package + subclasses (even in different packages)

**Q92: Can a class be private?**
**A:** Top-level classes cannot be private. Only nested/inner classes can be private.

**Q93: Can a constructor be private? What is its use?**
**A:** Yes. Used for:
- Singleton pattern (only one instance)
- Factory pattern (controlled instantiation)
- Utility classes (prevent instantiation)

**Q94: What is the principle of information hiding?**
**A:** Hide internal implementation details and expose only necessary information through public interfaces. Users interact with interfaces without knowing internal workings.

**Q95: How does encapsulation improve maintainability?**
**A:** Changes to internal implementation don't affect external code. As long as public interface remains same, internal changes are transparent to users.

**Q96: Can we change the access modifier while overriding?**
**A:** Yes, but only to less restrictive:
- private → default/protected/public
- default → protected/public
- protected → public
Cannot make more restrictive (will cause compilation error).

**Q97: What is tight encapsulation?**
**A:** A class is tightly encapsulated when all data members are private. This provides maximum data protection.

**Q98: Can static methods access instance variables?**
**A:** No. Static methods belong to class and exist before objects are created. Instance variables belong to objects which may not exist.

**Q99: What is the JavaBeans naming convention for getters and setters?**
**A:**
- **Getter**: `getPropertyName()` (e.g., `getName()`)
- **Boolean getter**: `isPropertyName()` (e.g., `isActive()`)
- **Setter**: `setPropertyName(value)` (e.g., `setName(String name)`)

**Q100: How does encapsulation support security?**
**A:** Encapsulation provides security by:
- Preventing unauthorized access to data
- Validating input before storing
- Hiding sensitive implementation
- Controlling how data is modified
- Protecting internal state

---

## 5. Inheritance

### What is Inheritance?

**Definition:** Inheritance is a mechanism where one class acquires the properties (fields) and behaviors (methods) of another class. It represents an **IS-A** relationship.

**Real-World Analogies:**
- A **Car IS-A Vehicle**
- A **Dog IS-A Animal**
- You inherit features from your parents (eye color, height)
- A **Student IS-A Person**

### Why Inheritance?

**Problem Without Inheritance (Code Duplication):**
```java
class Teacher {
    String name;
    int age;
    String address;
    
    void eat() { System.out.println("Eating"); }
    void sleep() { System.out.println("Sleeping"); }
    void teach() { System.out.println("Teaching"); }
}

class Student {
    String name;      // Duplicated!
    int age;          // Duplicated!
    String address;   // Duplicated!
    
    void eat() { System.out.println("Eating"); }      // Duplicated!
    void sleep() { System.out.println("Sleeping"); }  // Duplicated!
    void study() { System.out.println("Studying"); }
}
```

**Solution With Inheritance (Code Reuse):**
```java
class Person {
    String name;
    int age;
    String address;
    
    void eat() { System.out.println("Eating"); }
    void sleep() { System.out.println("Sleeping"); }
}

class Teacher extends Person {
    String subject;
    void teach() { System.out.println("Teaching " + subject); }
}

class Student extends Person {
    int rollNumber;
    void study() { System.out.println("Studying"); }
}
```

### Basic Inheritance Syntax

```java
// Parent class (Superclass/Base class)
class Animal {
    String name;
    int age;
    
    void eat() {
        System.out.println(name + " is eating");
    }
    
    void sleep() {
        System.out.println(name + " is sleeping");
    }
}

// Child class (Subclass/Derived class)
class Dog extends Animal {  // 'extends' creates inheritance
    String breed;
    
    void bark() {
        System.out.println(name + " is barking");
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Buddy";
        dog.age = 3;
        dog.breed = "Golden Retriever";
        
        dog.eat();    // Inherited from Animal
        dog.sleep();  // Inherited from Animal
        dog.bark();   // Dog's own method
    }
}
```

### Types of Inheritance

#### 1. Single Inheritance
One child class extends one parent class.

```java
class Animal {
    void eat() { System.out.println("Eating..."); }
}

class Dog extends Animal {
    void bark() { System.out.println("Barking..."); }
}
```

#### 2. Multilevel Inheritance
Chain of inheritance: Child extends Parent, Grandchild extends Child.

```java
class Animal {
    void eat() { System.out.println("Eating..."); }
}

class Dog extends Animal {
    void bark() { System.out.println("Barking..."); }
}

class Puppy extends Dog {
    void weep() { System.out.println("Weeping..."); }
}

// Usage
Puppy puppy = new Puppy();
puppy.eat();   // From Animal
puppy.bark();  // From Dog
puppy.weep();  // Own method
```

#### 3. Hierarchical Inheritance
Multiple child classes extend one parent class.

```java
class Animal {
    void eat() { System.out.println("Eating..."); }
}

class Dog extends Animal {
    void bark() { System.out.println("Barking..."); }
}

class Cat extends Animal {
    void meow() { System.out.println("Meowing..."); }
}

class Cow extends Animal {
    void moo() { System.out.println("Mooing..."); }
}
```

#### 4. Multiple Inheritance (NOT Supported for Classes!)

```java
// This is NOT allowed in Java with classes!
class A { }
class B { }
class C extends A, B { }  // ✗ COMPILATION ERROR!
```

**Why Not Allowed?** The **Diamond Problem** - ambiguity when both parents have the same method.

**Solution:** Use interfaces (can implement multiple interfaces).

```java
interface A {
    void show();
}

interface B {
    void show();
}

class C implements A, B {
    public void show() {
        System.out.println("Implementation of show");
    }
}
```

### The 'super' Keyword

`super` refers to the parent class. Used to:
1. Access parent's variables
2. Call parent's methods
3. Call parent's constructor

**1. Accessing Parent's Variables:**
```java
class Parent {
    int value = 100;
}

class Child extends Parent {
    int value = 200;
    
    void display() {
        System.out.println("Child value: " + value);        // 200
        System.out.println("Parent value: " + super.value); // 100
    }
}
```

**2. Calling Parent's Methods:**
```java
class Parent {
    void display() {
        System.out.println("Parent display");
    }
}

class Child extends Parent {
    void display() {
        super.display();  // Call parent's display first
        System.out.println("Child display");
    }
}

// Output:
// Parent display
// Child display
```

**3. Calling Parent's Constructor:**
```java
class Person {
    String name;
    int age;
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person constructor");
    }
}

class Student extends Person {
    int rollNumber;
    
    Student(String name, int age, int roll) {
        super(name, age);  // Must be first line!
        this.rollNumber = roll;
        System.out.println("Student constructor");
    }
}

// Usage
Student s = new Student("Alice", 20, 101);
// Output:
// Person constructor
// Student constructor
```

### Method Overriding

When a child class provides its own implementation of a parent class method.

```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
    
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    @Override  // Good practice - helps catch errors
    void sound() {
        System.out.println("Dog barks: Woof Woof!");
    }
    // eat() is inherited as-is (not overridden)
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows: Meow Meow!");
    }
}

// Usage
Animal animal = new Animal();
Dog dog = new Dog();
Cat cat = new Cat();

animal.sound();  // Animal makes a sound
dog.sound();     // Dog barks: Woof Woof!
cat.sound();     // Cat meows: Meow Meow!
```

### Rules for Method Overriding

1. **Same method signature** (name + parameters)
2. **Return type** must be same or covariant (subtype)
3. **Access modifier** cannot be more restrictive
4. **Cannot override**: static, final, or private methods
5. **Can throw**: same or fewer checked exceptions
6. **Must use**: `@Override` annotation (recommended)

```java
class Parent {
    protected Number getValue() {  // Returns Number
        return 10;
    }
}

class Child extends Parent {
    @Override
    public Integer getValue() {  // Returns Integer (covariant)
        return 20;  // public is less restrictive than protected ✓
    }
}
```

### Complete Inheritance Example

```java
// Base class
class Vehicle {
    protected String brand;
    protected String model;
    protected int year;
    protected double price;
    
    public Vehicle(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    
    public void start() {
        System.out.println(brand + " " + model + " is starting...");
    }
    
    public void stop() {
        System.out.println(brand + " " + model + " is stopping...");
    }
    
    public void displayInfo() {
        System.out.println("=== Vehicle Information ===");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
    }
    
    public double calculateDepreciation(int years) {
        return price * 0.1 * years;
    }
}

// Derived class - Car
class Car extends Vehicle {
    private int numberOfDoors;
    private String fuelType;
    private boolean hasAirConditioning;
    
    public Car(String brand, String model, int year, double price,
               int doors, String fuel, boolean ac) {
        super(brand, model, year, price);  // Call parent constructor
        this.numberOfDoors = doors;
        this.fuelType = fuel;
        this.hasAirConditioning = ac;
    }
    
    @Override
    public void start() {
        System.out.println("Insert key and turn ignition...");
        super.start();  // Call parent's start
        System.out.println("Car is ready to drive!");
    }
    
    public void playMusic() {
        System.out.println("Playing music in " + brand + " " + model);
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();  // Call parent's displayInfo
        System.out.println("Doors: " + numberOfDoors);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Air Conditioning: " + (hasAirConditioning ? "Yes" : "No"));
    }
}

// Derived class - Motorcycle
class Motorcycle extends Vehicle {
    private boolean hasSidecar;
    private String handlebarType;
    
    public Motorcycle(String brand, String model, int year, double price,
                     boolean sidecar, String handlebar) {
        super(brand, model, year, price);
        this.hasSidecar = sidecar;
        this.handlebarType = handlebar;
    }
    
    @Override
    public void start() {
        System.out.println("Kick start the motorcycle...");
        super.start();
    }
    
    public void wheelie() {
        System.out.println("Performing wheelie on " + brand + " " + model + "!");
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Sidecar: " + (hasSidecar ? "Yes" : "No"));
        System.out.println("Handlebar Type: " + handlebarType);
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2023, 25000, 4, "Petrol", true);
        car.displayInfo();
        car.start();
        car.playMusic();
        
        System.out.println("\n" + "=".repeat(30) + "\n");
        
        Motorcycle bike = new Motorcycle("Honda", "CBR", 2022, 15000, false, "Sport");
        bike.displayInfo();
        bike.start();
        bike.wheelie();
    }
}
```

---

### Interview Questions: Inheritance (Q101-Q140)

**Q101: What is inheritance?**
**A:** Inheritance is a mechanism where one class (child/subclass) acquires properties and methods of another class (parent/superclass). It represents IS-A relationship and promotes code reusability.

**Q102: Why do we need inheritance?**
**A:** Inheritance provides:
- Code reusability (avoid duplication)
- Method overriding (runtime polymorphism)
- Hierarchical classification
- Easier maintenance
- Natural modeling of real-world relationships

**Q103: What is the syntax for inheritance in Java?**
**A:**
```java
class ChildClass extends ParentClass {
    // child class body
}
```

**Q104: What are the types of inheritance in Java?**
**A:** Java supports:
1. **Single**: One child, one parent
2. **Multilevel**: Chain (A → B → C)
3. **Hierarchical**: Multiple children, one parent
Does NOT support Multiple inheritance for classes.

**Q105: Why doesn't Java support multiple inheritance for classes?**
**A:** Due to the **Diamond Problem** - ambiguity when two parent classes have the same method. Which implementation should child inherit? This creates confusion.

**Q106: How can we achieve multiple inheritance in Java?**
**A:** Using interfaces. A class can implement multiple interfaces.
```java
interface A { void show(); }
interface B { void display(); }
class C implements A, B {
    public void show() { }
    public void display() { }
}
```

**Q107: What is the Diamond Problem?**
**A:** When a class inherits from two classes that have the same method, it's ambiguous which method to inherit.
```
    A
   / \
  B   C
   \ /
    D  // Which method does D inherit?
```

**Q108: What is the difference between IS-A and HAS-A relationship?**
**A:**
- **IS-A**: Inheritance (Dog IS-A Animal)
- **HAS-A**: Composition (Car HAS-A Engine)

**Q109: What is the 'super' keyword?**
**A:** `super` refers to parent class object. Used to:
- Access parent's variables: `super.variable`
- Call parent's methods: `super.method()`
- Call parent's constructor: `super(args)`

**Q110: What is the use of super() in constructor?**
**A:** `super()` calls parent class constructor. Must be first statement in child constructor. If not called explicitly, Java automatically adds `super()` call to no-arg parent constructor.

**Q111: Can we use both this() and super() in a constructor?**
**A:** No. Both must be the first statement, which is impossible. Use only one.

**Q112: What happens if parent class doesn't have a no-arg constructor?**
**A:** Child class must explicitly call parent's parameterized constructor using `super(args)`, otherwise compilation error occurs.

**Q113: What is method overriding?**
**A:** When a subclass provides its own implementation of a method that's already defined in parent class with the same signature.

**Q114: What are the rules for method overriding?**
**A:**
- Same method signature (name + parameters)
- Same or covariant return type
- Cannot have more restrictive access modifier
- Cannot override static, final, or private methods
- Can throw same or fewer checked exceptions

**Q115: Can we override static methods?**
**A:** No. Static methods belong to class, not objects. We can "hide" them (method hiding) but not override them.

**Q116: Can we override private methods?**
**A:** No. Private methods are not inherited, so cannot be overridden.

**Q117: Can we override final methods?**
**A:** No. `final` keyword prevents method overriding.

**Q118: What is method hiding?**
**A:** When a subclass defines a static method with the same signature as parent's static method. It's not overriding; it's hiding the parent's method.

**Q119: What is the @Override annotation?**
**A:** Annotation that tells compiler that the method is intended to override a parent method. Helps catch errors at compile time if signature doesn't match.

**Q120: Can we change return type while overriding?**
**A:** Yes, but only to a covariant type (subtype of original return type). Introduced in Java 5.
```java
class Parent {
    Number getValue() { return 10; }
}
class Child extends Parent {
    Integer getValue() { return 20; }  // Integer is subtype of Number
}
```

**Q121: Can we change access modifier while overriding?**
**A:** Yes, but only to less restrictive. Can go from private → default → protected → public. Cannot go more restrictive.

**Q122: What is covariant return type?**
**A:** Feature (Java 5+) allowing overriding method to return a subtype of the return type declared in parent method.

**Q123: Can constructor be inherited?**
**A:** No. Constructors are not inherited. Child class can call parent constructor using `super()` but doesn't inherit it.

**Q124: What is the order of constructor execution in inheritance?**
**A:** Parent constructor executes first, then child constructor. This continues up the inheritance chain.
```
Grandparent → Parent → Child
```

**Q125: Can we override main method?**
**A:** No. `main` is static, and static methods cannot be overridden (only hidden).

**Q126: What is multilevel inheritance?**
**A:** When a class is derived from a class which is also derived from another class, forming a chain.
```java
class A { }
class B extends A { }
class C extends B { }  // C inherits from B, which inherits from A
```

**Q127: What is hierarchical inheritance?**
**A:** When multiple classes inherit from a single parent class.
```java
class Animal { }
class Dog extends Animal { }
class Cat extends Animal { }
class Cow extends Animal { }
```

**Q128: Can a class extend multiple classes in Java?**
**A:** No. Java doesn't support multiple inheritance for classes. A class can extend only one class.

**Q129: Can a class extend itself?**
**A:** No. A class cannot extend itself. This would cause infinite loop and compilation error.

**Q130: What is the difference between inheritance and composition?**
**A:**
| Inheritance | Composition |
|-------------|-------------|
| IS-A relationship | HAS-A relationship |
| extends keyword | Objects as fields |
| Tight coupling | Loose coupling |
| Compile-time | Runtime |
| Example: Dog IS-A Animal | Example: Car HAS-A Engine |

**Q131: When should we use inheritance vs composition?**
**A:** Use:
- **Inheritance**: When there's clear IS-A relationship and code reuse needed
- **Composition**: When there's HAS-A relationship or need flexibility
Generally prefer composition over inheritance for flexibility.

**Q132: What is the difference between extends and implements?**
**A:**
- **extends**: Used for class inheritance (one class only)
- **implements**: Used for interface implementation (multiple interfaces)

**Q133: Can an interface extend another interface?**
**A:** Yes. An interface can extend multiple interfaces.
```java
interface A { }
interface B { }
interface C extends A, B { }
```

**Q134: What is protected access modifier in context of inheritance?**
**A:** Protected members are accessible in:
- Same package (like default)
- Subclasses in any package (additional access)

**Q135: Can we access parent's private members in child class?**
**A:** No. Private members are not inherited. Child can access them only through parent's public/protected methods.

**Q136: What is the instanceof operator?**
**A:** Checks if an object is an instance of a specific class or implements an interface.
```java
Dog dog = new Dog();
if (dog instanceof Animal) {
    System.out.println("Dog is an Animal");
}
```

**Q137: Can we prevent inheritance of a class?**
**A:** Yes, using `final` keyword.
```java
final class MyClass {
    // Cannot be inherited
}
```

**Q138: What happens if child and parent have same variable name?**
**A:** Variable hiding occurs. Child's variable hides parent's. Access parent's variable using `super.variableName`.

**Q139: Can we inherit from multiple interfaces?**
**A:** Yes. A class can implement multiple interfaces, and an interface can extend multiple interfaces.

**Q140: What is object slicing?**
**A:** Not applicable in Java (C++ concept). In Java, objects are always accessed by reference, preventing slicing.

---

## 6. Polymorphism

### What is Polymorphism?

**Definition:** Polymorphism means "many forms". It's the ability of an object to take multiple forms. The same interface can be used to represent different underlying forms (data types).

**Etymology:**
- **Poly** = Many
- **Morph** = Forms

**Real-World Analogies:**

1. **You as a Person:**
   - At home → Son/Daughter
   - At work → Employee
   - At gym → Member
   - Same person, different roles!

2. **Smartphone:**
   - Can make calls
   - Can send messages
   - Can browse internet
   - Can take photos
   - One device, many functions!

3. **Water:**
   - Ice (solid) at 0°C
   - Water (liquid) at 25°C
   - Steam (gas) at 100°C
   - Same substance, different forms!

4. **A Person speaking:**
   - Speaks English with English speakers
   - Speaks Spanish with Spanish speakers
   - Same person, adapts behavior based on context

### Types of Polymorphism

```
Polymorphism
    ├── Compile-time Polymorphism (Static Binding)
    │   ├── Method Overloading
    │   └── Operator Overloading (Not in Java)
    │
    └── Runtime Polymorphism (Dynamic Binding)
        └── Method Overriding
```

---

### A. Compile-Time Polymorphism (Static/Early Binding)

**When:** Decision made at **compile time**
**How:** Through **Method Overloading**

#### Method Overloading

**Definition:** Same method name with different parameters in the SAME class.

**Ways to Overload:**
1. Different number of parameters
2. Different type of parameters
3. Different order of parameters

```java
public class Calculator {
    
    // 1. Different NUMBER of parameters
    public int add(int a, int b) {
        System.out.println("Adding 2 numbers");
        return a + b;
    }
    
    public int add(int a, int b, int c) {
        System.out.println("Adding 3 numbers");
        return a + b + c;
    }
    
    public int add(int a, int b, int c, int d) {
        System.out.println("Adding 4 numbers");
        return a + b + c + d;
    }
    
    // 2. Different TYPE of parameters
    public double add(double a, double b) {
        System.out.println("Adding 2 doubles");
        return a + b;
    }
    
    public String add(String a, String b) {
        System.out.println("Concatenating strings");
        return a + b;
    }
    
    // 3. Different ORDER of parameters
    public void display(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    
    public void display(int age, String name) {
        System.out.println("Age: " + age + ", Name: " + name);
    }
}

// Usage
Calculator calc = new Calculator();
System.out.println(calc.add(5, 3));              // Calls add(int, int)
System.out.println(calc.add(5, 3, 2));           // Calls add(int, int, int)
System.out.println(calc.add(5.5, 3.2));          // Calls add(double, double)
System.out.println(calc.add("Hello", " World")); // Calls add(String, String)

calc.display("Alice", 25);  // Calls display(String, int)
calc.display(25, "Alice");  // Calls display(int, String)
```

#### Rules for Method Overloading

**✓ Can Change:**
- Number of parameters
- Type of parameters
- Order of parameters
- Return type (but not alone!)
- Access modifiers

**✗ Cannot Overload By:**
- Return type alone
- Access modifier alone
- Parameter names alone

```java
// ✓ Valid Overloading
public int add(int a, int b) { return a + b; }
public double add(double a, double b) { return a + b; }

// ✗ Invalid - only return type is different
public int add(int a, int b) { return a + b; }
public double add(int a, int b) { return a + b; }  // COMPILATION ERROR!

// ✗ Invalid - only parameter names are different
public int add(int a, int b) { return a + b; }
public int add(int x, int y) { return x + y; }  // COMPILATION ERROR!
```

#### Real-World Example: Print Method

```java
public class Printer {
    
    public void print(int num) {
        System.out.println("Printing integer: " + num);
    }
    
    public void print(double num) {
        System.out.println("Printing double: " + num);
    }
    
    public void print(String text) {
        System.out.println("Printing string: " + text);
    }
    
    public void print(int[] arr) {
        System.out.print("Printing array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public void print(boolean flag) {
        System.out.println("Printing boolean: " + flag);
    }
}

// Usage
Printer p = new Printer();
p.print(10);                      // Printing integer: 10
p.print(10.5);                    // Printing double: 10.5
p.print("Hello");                 // Printing string: Hello
p.print(new int[]{1, 2, 3, 4});   // Printing array: 1 2 3 4
p.print(true);                    // Printing boolean: true
```

---

### B. Runtime Polymorphism (Dynamic/Late Binding)

**When:** Decision made at **runtime**
**How:** Through **Method Overriding** and **Inheritance**

#### Method Overriding in Polymorphism

```java
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
    
    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows: Meow Meow!");
    }
}

class Cow extends Animal {
    @Override
    public void sound() {
        System.out.println("Cow moos: Moo Moo!");
    }
}

// Usage - THE POWER OF POLYMORPHISM!
public class Main {
    public static void main(String[] args) {
        // Parent reference, Child object
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        Animal animal3 = new Cow();
        
        // Runtime polymorphism - method called based on actual object
        animal1.sound();  // Dog barks: Woof Woof!
        animal2.sound();  // Cat meows: Meow Meow!
        animal3.sound();  // Cow moos: Moo Moo!
    }
}
```

#### Understanding Runtime Polymorphism

**Key Concept:** Parent reference can hold child object.

```java
// Valid assignments (Upcasting)
Animal a1 = new Animal();    // Animal reference, Animal object
Animal a2 = new Dog();       // Animal reference, Dog object ✓
Animal a3 = new Cat();       // Animal reference, Cat object ✓

// Invalid assignment
Dog d = new Animal();        // ✗ ERROR! Dog reference can't hold Animal object
```

**Why it works:**
- Dog **IS-A** Animal (inheritance relationship)
- So Animal reference can point to Dog object
- But not vice versa (not all animals are dogs)

#### Dynamic Method Dispatch

The JVM determines which method to call at runtime based on the actual object type, not the reference type.

```java
class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
    
    public double area() {
        return 0.0;
    }
}

class Circle extends Shape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
    
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length, width;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
    
    @Override
    public double area() {
        return length * width;
    }
}

class Triangle extends Shape {
    private double base, height;
    
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a triangle");
    }
    
    @Override
    public double area() {
        return 0.5 * base * height;
    }
}

// Usage - Same code works for all shapes!
public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4.0, 6.0);
        shapes[2] = new Triangle(3.0, 4.0);
        
        // Polymorphism in action
        for (Shape shape : shapes) {
            shape.draw();
            System.out.println("Area: " + shape.area());
            System.out.println();
        }
    }
}
```

**Output:**
```
Drawing a circle
Area: 78.53981633974483

Drawing a rectangle
Area: 24.0

Drawing a triangle
Area: 6.0
```

#### Real-World Example: Payment System

```java
abstract class Payment {
    protected double amount;
    protected String transactionId;
    
    public Payment(double amount) {
        this.amount = amount;
        this.transactionId = generateTransactionId();
    }
    
    private String generateTransactionId() {
        return "TXN" + System.currentTimeMillis();
    }
    
    public abstract void processPayment();
    public abstract String getPaymentMethod();
    
    public void printReceipt() {
        System.out.println("=== Payment Receipt ===");
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Amount: $" + amount);
        System.out.println("Method: " + getPaymentMethod());
        System.out.println("======================");
    }
}

class CreditCardPayment extends Payment {
    private String cardNumber;
    private String cardHolder;
    
    public CreditCardPayment(double amount, String cardNumber, String cardHolder) {
        super(amount);
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }
    
    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment...");
        System.out.println("Card Holder: " + cardHolder);
        System.out.println("Card: ****" + cardNumber.substring(cardNumber.length() - 4));
        System.out.println("Amount: $" + amount);
        System.out.println("Payment successful!");
    }
    
    @Override
    public String getPaymentMethod() {
        return "Credit Card";
    }
}

class PayPalPayment extends Payment {
    private String email;
    
    public PayPalPayment(double amount, String email) {
        super(amount);
        this.email = email;
    }
    
    @Override
    public void processPayment() {
        System.out.println("Processing PayPal payment...");
        System.out.println("PayPal Account: " + email);
        System.out.println("Amount: $" + amount);
        System.out.println("Payment successful!");
    }
    
    @Override
    public String getPaymentMethod() {
        return "PayPal";
    }
}

class CashPayment extends Payment {
    public CashPayment(double amount) {
        super(amount);
    }
    
    @Override
    public void processPayment() {
        System.out.println("Processing cash payment...");
        System.out.println("Amount: $" + amount);
        System.out.println("Payment received!");
    }
    
    @Override
    public String getPaymentMethod() {
        return "Cash";
    }
}

class CryptoPayment extends Payment {
    private String walletAddress;
    private String cryptocurrency;
    
    public CryptoPayment(double amount, String wallet, String crypto) {
        super(amount);
        this.walletAddress = wallet;
        this.cryptocurrency = crypto;
    }
    
    @Override
    public void processPayment() {
        System.out.println("Processing cryptocurrency payment...");
        System.out.println("Cryptocurrency: " + cryptocurrency);
        System.out.println("Wallet: " + walletAddress);
        System.out.println("Amount: $" + amount);
        System.out.println("Payment confirmed on blockchain!");
    }
    
    @Override
    public String getPaymentMethod() {
        return "Cryptocurrency (" + cryptocurrency + ")";
    }
}

// Shopping Cart
class ShoppingCart {
    public void checkout(Payment payment) {
        System.out.println("\n*** CHECKOUT ***");
        payment.processPayment();
        payment.printReceipt();
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        
        // Polymorphism - same method works with different payment types
        Payment payment1 = new CreditCardPayment(150.50, "1234567890123456", "John Doe");
        Payment payment2 = new PayPalPayment(75.25, "john@example.com");
        Payment payment3 = new CashPayment(50.00);
        Payment payment4 = new CryptoPayment(200.00, "0x742d35Cc6634C0532925a3b844Bc9e7595f0bEb", "Bitcoin");
        
        cart.checkout(payment1);
        cart.checkout(payment2);
        cart.checkout(payment3);
        cart.checkout(payment4);
    }
}
```

### Upcasting and Downcasting

#### Upcasting (Implicit/Automatic)
Child object → Parent reference (safe)

```java
Dog dog = new Dog();
Animal animal = dog;  // Upcasting - automatic, safe
animal.eat();         // Works fine
```

#### Downcasting (Explicit/Manual)
Parent reference → Child reference (risky - can throw ClassCastException)

```java
Animal animal = new Dog();  // Upcasting first

// Downcasting - need explicit cast
Dog dog = (Dog) animal;
dog.bark();  // Now can access Dog-specific methods

// Risky downcasting
Animal animal2 = new Animal();
Dog dog2 = (Dog) animal2;  // ClassCastException at runtime!
```

#### Safe Downcasting with instanceof

```java
Animal animal = new Dog();

// Check before casting
if (animal instanceof Dog) {
    Dog dog = (Dog) animal;
    dog.bark();  // Safe!
}

// Java 16+ Pattern Matching for instanceof
if (animal instanceof Dog dog) {
    dog.bark();  // Even cleaner!
}
```

### Comparison: Compile-time vs Runtime Polymorphism

| Feature | Compile-time | Runtime |
|---------|-------------|---------|
| **Also called** | Static binding, Early binding | Dynamic binding, Late binding |
| **Achieved by** | Method Overloading | Method Overriding |
| **When decided** | Compile time | Runtime |
| **Performance** | Faster | Slightly slower |
| **Inheritance** | Not required | Required |
| **Flexibility** | Less flexible | More flexible |
| **Example** | `add(int, int)` vs `add(double, double)` | `Animal a = new Dog(); a.sound();` |

### Benefits of Polymorphism

1. **Code Reusability** - Same code works with different types
2. **Flexibility** - Easy to add new types without changing existing code
3. **Maintainability** - Less code duplication
4. **Extensibility** - New functionality added easily
5. **Loose Coupling** - Reduces dependencies between classes

---

### Interview Questions: Polymorphism (Q141-Q175)

**Q141: What is polymorphism?**
**A:** Polymorphism means "many forms". It's the ability of an object to take multiple forms. Same interface can represent different underlying forms, allowing one method/object to behave differently in different contexts.

**Q142: What are the types of polymorphism in Java?**
**A:** Two types:
1. **Compile-time (Static)**: Method Overloading
2. **Runtime (Dynamic)**: Method Overriding

**Q143: What is method overloading?**
**A:** Having multiple methods with same name but different parameters (number, type, or order) in the same class. Decision is made at compile time.

**Q144: What is method overriding?**
**A:** When a subclass provides its own implementation of a method already defined in parent class with the same signature. Decision is made at runtime.

**Q145: What is the difference between method overloading and overriding?**
**A:**
| Overloading | Overriding |
|------------|-----------|
| Same class | Different classes (inheritance) |
| Different parameters | Same signature |
| Compile-time | Runtime |
| Can change return type | Same/covariant return type |
| No inheritance needed | Inheritance required |
| Static binding | Dynamic binding |

**Q146: Can we overload main method?**
**A:** Yes, but JVM will only call `public static void main(String[] args)`.
```java
public static void main(String[] args) { }  // JVM calls this
public static void main(int a) { }  // Can define but won't be called by JVM
```

**Q147: Can we overload a method by changing return type only?**
**A:** No. Return type alone is not sufficient to distinguish methods. Parameter list must be different.

**Q148: Can we overload a method by changing access modifier only?**
**A:** No. Access modifier alone doesn't distinguish methods. Parameter list must differ.

**Q149: Can we override static methods?**
**A:** No. Static methods belong to class, not objects. We can "hide" them (method hiding) but not override.

**Q150: Can we override private methods?**
**A:** No. Private methods are not inherited, so cannot be overridden.

**Q151: Can we override final methods?**
**A:** No. `final` keyword prevents method overriding.

**Q152: What is runtime polymorphism?**
**A:** When method call is resolved at runtime based on actual object type, not reference type. Achieved through method overriding and inheritance.

**Q153: What is dynamic method dispatch?**
**A:** The mechanism by which a call to an overridden method is resolved at runtime. JVM determines which method to execute based on the actual object, not the reference type.

**Q154: What is upcasting?**
**A:** Converting subclass reference to superclass reference. Automatic and safe.
```java
Dog dog = new Dog();
Animal animal = dog;  // Upcasting
```

**Q155: What is downcasting?**
**A:** Converting superclass reference to subclass reference. Explicit and risky (can throw ClassCastException).
```java
Animal animal = new Dog();
Dog dog = (Dog) animal;  // Downcasting
```

**Q156: When do we need downcasting?**
**A:** When we have a superclass reference pointing to subclass object and need to access subclass-specific methods.

**Q157: What is the instanceof operator?**
**A:** Checks if an object is an instance of a specific class or interface. Returns boolean.
```java
if (animal instanceof Dog) {
    Dog dog = (Dog) animal;  // Safe downcasting
}
```

**Q158: Can we achieve polymorphism without inheritance?**
**A:** Yes, using interfaces. A class can implement interface and provide its own implementation.

**Q159: What is the difference between static and dynamic binding?**
**A:**
- **Static binding**: Resolved at compile time (overloading, static methods)
- **Dynamic binding**: Resolved at runtime (overriding, instance methods)

**Q160: Which is faster - compile-time or runtime polymorphism?**
**A:** Compile-time polymorphism is faster because method call is resolved at compile time. Runtime polymorphism has slight overhead for dynamic method lookup.

**Q161: Can constructors be overloaded?**
**A:** Yes. We can have multiple constructors with different parameters.

**Q162: Can constructors be overridden?**
**A:** No. Constructors are not inherited, so cannot be overridden.

**Q163: What is covariant return type in polymorphism?**
**A:** Overriding method can return a subtype of the return type in parent method (Java 5+).
```java
class Parent {
    Animal getAnimal() { return new Animal(); }
}
class Child extends Parent {
    Dog getAnimal() { return new Dog(); }  // Covariant return
}
```

**Q164: Can we change exception thrown while overriding?**
**A:** Yes, but can only throw same, fewer, or more specific checked exceptions. Can throw any unchecked exception.

**Q165: What happens if we don't use @Override annotation?**
**A:** Code still works, but we lose compile-time checking. @Override helps catch errors if we accidentally change method signature.

**Q166: Can overloaded methods have different access modifiers?**
**A:** Yes. Access modifiers can be different for overloaded methods.

**Q167: Can overriding method have different access modifier?**
**A:** Yes, but only less restrictive (private → default → protected → public).

**Q168: What is method hiding?**
**A:** When a subclass defines a static method with same signature as parent's static method. It's hiding, not overriding.

**Q169: Why can't static methods be overridden?**
**A:** Static methods belong to class and are resolved at compile time. Overriding is a runtime concept for instance methods.

**Q170: Can we override Object class methods?**
**A:** Yes. Methods like `toString()`, `equals()`, `hashCode()` can and should be overridden.

**Q171: What is the use of polymorphism in real applications?**
**A:** Polymorphism allows:
- Writing generic code that works with multiple types
- Adding new types without modifying existing code
- Creating extensible frameworks
- Implementing design patterns (Strategy, Factory, etc.)

**Q172: Can interface have polymorphism?**
**A:** Yes. A class implementing interface can be referred by interface reference, enabling polymorphism.

**Q173: What is the difference between overloading and overwriting?**
**A:** **Overloading** is having multiple methods with same name but different parameters. **Overwriting/Overriding** is redefining parent's method in child class.

**Q174: Can we achieve runtime polymorphism with private methods?**
**A:** No. Private methods are not inherited, so no overriding, hence no runtime polymorphism.

**Q175: What is the significance of parent reference holding child object?**
**A:** Enables runtime polymorphism. We can write code that works with parent type but behaves according to actual child object at runtime.

---

## 7. Abstraction

### What is Abstraction?

**Definition:** Abstraction is the process of hiding implementation details and showing only essential features to the user. It focuses on WHAT an object does rather than HOW it does it.

**Real-World Analogies:**

1. **TV Remote:**
   - You see: Power button, volume, channel buttons
   - You don't see: Internal circuits, signal processing, IR technology
   - You just press buttons - implementation is hidden!

2. **Car:**
   - You use: Steering wheel, pedals, gear shift
   - You don't know: How engine combusts fuel, how brakes work internally
   - You just drive - complexity is hidden!

3. **ATM:**
   - You see: Screen, keypad, card slot
   - You don't see: Database connections, security protocols, transaction processing
   - You just withdraw money - backend is hidden!

4. **Coffee Machine:**
   - You press: Button for espresso
   - You don't know: Water heating, pressure mechanism, grinding process
   - You get coffee - process is abstracted!

### Abstraction vs Encapsulation

| Abstraction | Encapsulation |
|------------|--------------|
| WHAT to show | HOW to hide |
| Design level | Implementation level |
| Hiding complexity | Hiding data |
| Achieved via abstract classes/interfaces | Achieved via access modifiers |
| Focus on behavior | Focus on data protection |
| Example: Car driving interface | Example: Private variables + getters/setters |

### Ways to Achieve Abstraction

1. **Abstract Classes** (0-100% abstraction)
2. **Interfaces** (100% abstraction before Java 8)

---

### A. Abstract Classes

**Definition:** A class declared with `abstract` keyword that cannot be instantiated and may contain abstract methods (methods without body).

```java
// Cannot create: new Animal(); ✗

abstract class Animal {
    // Instance variables allowed
    protected String name;
    protected int age;
    
    // Constructor allowed
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Abstract methods - no body, must be overridden
    public abstract void sound();
    public abstract void move();
    
    // Concrete methods - have body, optional to override
    public void eat() {
        System.out.println(name + " is eating");
    }
    
    public void sleep() {
        System.out.println(name + " is sleeping");
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Dog extends Animal {
    private String breed;
    
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    
    @Override
    public void sound() {
        System.out.println(name + " barks: Woof Woof!");
    }
    
    @Override
    public void move() {
        System.out.println(name + " runs on four legs");
    }
}

class Bird extends Animal {
    private double wingspan;
    
    public Bird(String name, int age, double wingspan) {
        super(name, age);
        this.wingspan = wingspan;
    }
    
    @Override
    public void sound() {
        System.out.println(name + " chirps: Tweet Tweet!");
    }
    
    @Override
    public void move() {
        System.out.println(name + " flies with " + wingspan + "m wingspan");
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        // Animal animal = new Animal("Generic", 5); // ✗ ERROR!
        
        Animal dog = new Dog("Buddy", 3, "Golden Retriever");
        Animal bird = new Bird("Tweety", 1, 0.3);
        
        dog.displayInfo();
        dog.sound();
        dog.move();
        dog.eat();
        
        System.out.println();
        
        bird.displayInfo();
        bird.sound();
        bird.move();
        bird.eat();
    }
}
```

#### Rules for Abstract Classes

1. **Cannot be instantiated** directly
2. **Can have 0 or more abstract methods**
3. **Can have constructors**
4. **Can have instance variables**
5. **Can have concrete methods**
6. **Child must implement all abstract methods** (or be abstract itself)
7. **Can have static methods**
8. **Can extend only ONE abstract class**
9. **Can be final? NO** - abstract class must be extended
10. **Can have main method? YES**

```java
abstract class Vehicle {
    // ✓ All are allowed
    private String brand;                    // Instance variable
    private static int count = 0;           // Static variable
    
    public Vehicle(String brand) {          // Constructor
        this.brand = brand;
        count++;
    }
    
    public abstract void start();           // Abstract method
    
    public void stop() {                    // Concrete method
        System.out.println("Vehicle stopped");
    }
    
    public static int getCount() {          // Static method
        return count;
    }
    
    public final void displayBrand() {      // Final method
        System.out.println("Brand: " + brand);
    }
}
```

---

### B. Interfaces

**Definition:** A blueprint of a class that contains only abstract methods (before Java 8) and constants. It defines a contract that implementing classes must follow.

**Think of it as a CONTRACT:**
"If you sign this contract (implement this interface), you MUST provide these services (methods)."

```java
interface Flyable {
    // All variables are public static final by default
    int MAX_ALTITUDE = 50000;
    int MIN_ALTITUDE = 1000;
    
    // All methods are public abstract by default
    void takeOff();
    void fly();
    void land();
}

class Airplane implements Flyable {
    private String model;
    
    public Airplane(String model) {
        this.model = model;
    }
    
    @Override
    public void takeOff() {
        System.out.println(model + " taking off from runway");
    }
    
    @Override
    public void fly() {
        System.out.println(model + " flying at " + MAX_ALTITUDE + " feet");
    }
    
    @Override
    public void land() {
        System.out.println(model + " landing");
    }
}

class Bird implements Flyable {
    private String species;
    
    public Bird(String species) {
        this.species = species;
    }
    
    @Override
    public void takeOff() {
        System.out.println(species + " flaps wings and takes off");
    }
    
    @Override
    public void fly() {
        System.out.println(species + " is flying");
    }
    
    @Override
    public void land() {
        System.out.println(species + " lands on a branch");
    }
}

// Usage
Airplane plane = new Airplane("Boeing 747");
Bird bird = new Bird("Eagle");

plane.takeOff();
plane.fly();
plane.land();

bird.takeOff();
bird.fly();
bird.land();
```

#### Multiple Inheritance with Interfaces

Java doesn't support multiple inheritance for classes, but DOES for interfaces.

```java
interface Swimmable {
    void swim();
}

interface Flyable {
    void fly();
}

interface Walkable {
    void walk();
}

// Duck can implement all three!
class Duck implements Swimmable, Flyable, Walkable {
    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }
    
    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }
    
    @Override
    public void walk() {
        System.out.println("Duck is walking");
    }
}

// Usage
Duck duck = new Duck();
duck.swim();
duck.fly();
duck.walk();
```

#### Default Methods (Java 8+)

Interfaces can have method implementations using `default` keyword.

```java
interface Payment {
    // Abstract method
    void processPayment(double amount);
    
    // Default method - has implementation
    default void printReceipt() {
        System.out.println("Payment receipt printed");
    }
    
    default boolean validateAmount(double amount) {
        return amount > 0;
    }
}

class CreditCard implements Payment {
    @Override
    public void processPayment(double amount) {
        if (validateAmount(amount)) {
            System.out.println("Paid $" + amount + " via Credit Card");
            printReceipt();
        }
    }
    
    // Can override default method if needed
    @Override
    public void printReceipt() {
        System.out.println("Credit Card receipt printed");
    }
}
```

#### Static Methods in Interfaces (Java 8+)

```java
interface MathOperations {
    // Abstract method
    double calculate(double a, double b);
    
    // Static methods
    static double square(double num) {
        return num * num;
    }
    
    static double cube(double num) {
        return num * num * num;
    }
}

// Usage
double result1 = MathOperations.square(5);  // 25.0
double result2 = MathOperations.cube(3);    // 27.0
```

#### Private Methods in Interfaces (Java 9+)

```java
interface Logger {
    default void logInfo(String message) {
        log(message, "INFO");
    }
    
    default void logError(String message) {
        log(message, "ERROR");
    }
    
    // Private method - code reuse within interface
    private void log(String message, String level) {
        System.out.println("[" + level + "] " + message);
    }
}
```

### Abstract Class vs Interface

| Feature | Abstract Class | Interface |
|---------|---------------|-----------|
| **Methods** | Can have both abstract and concrete | All abstract (before Java 8) |
| **Variables** | Any type of variables | Only constants (public static final) |
| **Constructor** | Can have | Cannot have |
| **Multiple Inheritance** | No (extends one class) | Yes (implements multiple) |
| **Access Modifiers** | Any modifier | Only public (methods) |
| **When to use** | IS-A relationship with shared code | CAN-DO capability, contract |
| **Keyword** | extends | implements |
| **Speed** | Fast | Slightly slower (Java < 8) |
| **State** | Can maintain state | Cannot maintain state |
| **Example** | Animal (Dog IS-A Animal) | Flyable (Bird CAN-DO Flying) |

### When to Use What?

**Use Abstract Class when:**
- Classes are closely related
- Want to share code among related classes
- Want to declare non-static/non-final fields
- Need constructors
- Need access modifiers other than public

**Use Interface when:**
- Unrelated classes will implement your interface
- Want to specify behavior contract
- Want multiple inheritance of type
- Want to achieve complete abstraction

### Complete Abstraction Example

```java
// Abstract class for common behavior
abstract class Vehicle {
    protected String brand;
    protected String model;
    protected int year;
    
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    
    // Abstract methods
    public abstract void start();
    public abstract void stop();
    public abstract double getFuelEfficiency();
    
    // Concrete method
    public void displayInfo() {
        System.out.println(year + " " + brand + " " + model);
    }
}

// Interfaces for capabilities
interface Electric {
    void charge();
    int getBatteryLevel();
}

interface GPS {
    void navigate(String destination);
    String getCurrentLocation();
}

interface SelfDriving {
    void enableAutopilot();
    void disableAutopilot();
}

interface Entertainment {
    void playMusic(String song);
    void adjustVolume(int level);
}

// Tesla car implementing multiple interfaces
class TeslaCar extends Vehicle implements Electric, GPS, SelfDriving, Entertainment {
    private int batteryLevel;
    private String currentLocation;
    private boolean autopilotEnabled;
    private int volume;
    
    public TeslaCar(String model, int year) {
        super("Tesla", model, year);
        this.batteryLevel = 100;
        this.currentLocation = "Home";
        this.autopilotEnabled = false;
        this.volume = 50;
    }
    
    @Override
    public void start() {
        System.out.println("Tesla starting silently...");
    }
    
    @Override
    public void stop() {
        System.out.println("Tesla stopped");
    }
    
    @Override
    public double getFuelEfficiency() {
        return 0; // Electric, no fuel consumption
    }
    
    @Override
    public void charge() {
        System.out.println("Charging battery...");
        batteryLevel = 100;
        System.out.println("Battery fully charged!");
    }
    
    @Override
    public int getBatteryLevel() {
        return batteryLevel;
    }
    
    @Override
    public void navigate(String destination) {
        System.out.println("Navigating to: " + destination);
        currentLocation = destination;
    }
    
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }
    
    @Override
    public void enableAutopilot() {
        autopilotEnabled = true;
        System.out.println("Autopilot enabled - Hands-free driving!");
    }
    
    @Override
    public void disableAutopilot() {
        autopilotEnabled = false;
        System.out.println("Autopilot disabled");
    }
    
    @Override
    public void playMusic(String song) {
        System.out.println("Playing: " + song + " at volume " + volume);
    }
    
    @Override
    public void adjustVolume(int level) {
        this.volume = level;
        System.out.println("Volume set to: " + level);
    }
}

// Regular gas car
class GasCar extends Vehicle implements GPS, Entertainment {
    private String currentLocation;
    private int volume;
    
    public GasCar(String brand, String model, int year) {
        super(brand, model, year);
        this.currentLocation = "Home";
        this.volume = 50;
    }
    
    @Override
    public void start() {
        System.out.println("Gas engine starting...");
    }
    
    @Override
    public void stop() {
        System.out.println("Gas engine stopped");
    }
    
    @Override
    public double getFuelEfficiency() {
        return 25.5; // miles per gallon
    }
    
    @Override
    public void navigate(String destination) {
        System.out.println("GPS navigating to: " + destination);
        currentLocation = destination;
    }
    
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }
    
    @Override
    public void playMusic(String song) {
        System.out.println("Playing: " + song);
    }
    
    @Override
    public void adjustVolume(int level) {
        this.volume = level;
        System.out.println("Volume: " + level);
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        TeslaCar tesla = new TeslaCar("Model S", 2024);
        tesla.displayInfo();
        tesla.start();
        tesla.enableAutopilot();
        tesla.navigate("Office");
        tesla.playMusic("Favorite Song");
        System.out.println("Battery: " + tesla.getBatteryLevel() + "%");
        
        System.out.println("\n" + "=".repeat(40) + "\n");
        
        GasCar toyota = new GasCar("Toyota", "Camry", 2023);
        toyota.displayInfo();
        toyota.start();
        toyota.navigate("Mall");
        System.out.println("Fuel Efficiency: " + toyota.getFuelEfficiency() + " mpg");
    }
}
```

---

### Interview Questions: Abstraction (Q176-Q210)

**Q176: What is abstraction?**
**A:** Abstraction is hiding implementation details and showing only essential features. It focuses on WHAT an object does rather than HOW it does it. Achieved through abstract classes and interfaces.

**Q177: What is the difference between abstraction and encapsulation?**
**A:**
- **Abstraction**: Design level, hides complexity, WHAT to show (using abstract classes/interfaces)
- **Encapsulation**: Implementation level, hides data, HOW to hide (using access modifiers)

**Q178: What is an abstract class?**
**A:** A class declared with `abstract` keyword that cannot be instantiated directly and may contain abstract methods (without body) that must be implemented by subclasses.

**Q179: What is an abstract method?**
**A:** A method declared without implementation (no body) using `abstract` keyword. Subclasses must provide implementation.

**Q180: Can we create an object of an abstract class?**
**A:** No, we cannot directly instantiate abstract classes. But we can create reference variables of abstract class type and create anonymous inner class objects.

**Q181: Can an abstract class have constructors?**
**A:** Yes. Abstract classes can have constructors which are called when a subclass object is created.

**Q182: Can an abstract class have concrete methods?**
**A:** Yes. Abstract classes can have both abstract methods (without body) and concrete methods (with body).

**Q183: Can an abstract class have no abstract methods?**
**A:** Yes. An abstract class can have zero abstract methods. This is used when we want to prevent direct instantiation.

**Q184: Can an abstract class be final?**
**A:** No. `final` prevents inheritance, but abstract classes must be extended. These keywords are contradictory.

**Q185: Can an abstract method be static?**
**A:** No. Static methods belong to class and cannot be overridden. Abstract methods must be overridden, so they cannot be static.

**Q186: Can an abstract method be final?**
**A:** No. `final` prevents overriding, but abstract methods must be overridden. These are contradictory.

**Q187: Can an abstract method be private?**
**A:** No. Private methods are not inherited, but abstract methods must be overridden by subclasses.

**Q188: What happens if a child class doesn't implement all abstract methods?**
**A:** The child class must also be declared abstract, or it will cause compilation error.

**Q189: Can an abstract class extend another abstract class?**
**A:** Yes. An abstract class can extend another abstract class. It may or may not implement parent's abstract methods.

**Q190: Can an abstract class implement an interface?**
**A:** Yes. An abstract class can implement interfaces without providing implementation for interface methods (subclasses will implement them).

**Q191: What is an interface?**
**A:** Interface is a blueprint of a class that contains only abstract methods (before Java 8) and constants. It defines a contract that implementing classes must follow.

**Q192: Why do we need interfaces?**
**A:** Interfaces provide:
- Complete abstraction
- Multiple inheritance support
- Loose coupling
- Contract/specification definition
- Polymorphism support

**Q193: Can an interface have constructors?**
**A:** No. Interfaces cannot be instantiated, so constructors are not allowed.

**Q194: Can an interface have instance variables?**
**A:** No. All variables in interface are implicitly `public static final` (constants).

**Q195: What are the default modifiers for interface methods?**
**A:** Methods in interfaces are implicitly `public abstract` (before Java 8). Variables are `public static final`.

**Q196: Can interface methods be private?**
**A:** Yes, since Java 9. Private methods can be used for code reuse within the interface (by default methods).

**Q197: What are default methods in interfaces?**
**A:** Default methods (Java 8+) are methods with implementation in interfaces using `default` keyword. Implementing classes can use or override them.

**Q198: Why were default methods added to interfaces?**
**A:** To allow adding new methods to interfaces without breaking existing implementations. Provides backward compatibility.

**Q199: Can interfaces have static methods?**
**A:** Yes (Java 8+). Interface static methods must have body and cannot be overridden by implementing classes.

**Q200: Can a class implement multiple interfaces?**
**A:** Yes. A class can implement multiple interfaces, which is how Java achieves multiple inheritance of type.

**Q201: Can an interface extend another interface?**
**A:** Yes. An interface can extend multiple interfaces using `extends` keyword.

**Q202: Can an interface extend a class?**
**A:** No. Interfaces can only extend other interfaces, not classes.

**Q203: What is a marker interface?**
**A:** Interface with no methods. Used to mark classes for special treatment. Examples: `Serializable`, `Cloneable`, `Remote`.

**Q204: What is a functional interface?**
**A:** Interface with exactly one abstract method. Used for lambda expressions. Annotated with `@FunctionalInterface`.
```java
@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}
```

**Q205: What is the difference between abstract class and interface?**
**A:**
| Abstract Class | Interface |
|---------------|-----------|
| Can have concrete methods | Only abstract (before Java 8) |
| Can have constructors | No constructors |
| Can have instance variables | Only constants |
| Single inheritance | Multiple inheritance |
| Any access modifier | Only public methods |
| IS-A relationship | CAN-DO capability |

**Q206: When should we use abstract class vs interface?**
**A:**
- **Abstract class**: Related classes, code sharing, non-final/non-static fields
- **Interface**: Unrelated classes, multiple inheritance, defining contract

**Q207: Can we have variables in interface?**
**A:** Yes, but they are implicitly `public static final` (constants only).

**Q208: Why can't interfaces have instance variables?**
**A:** Interfaces cannot be instantiated, so instance variables would serve no purpose. They can only have constants.

**Q209: What is the diamond problem with interfaces?**
**A:** When a class implements two interfaces with same default method, the class must override the method to resolve ambiguity.
```java
interface A {
    default void show() { }
}
interface B {
    default void show() { }
}
class C implements A, B {
    public void show() { }  // Must override
}
```

**Q210: Can abstract class have main method?**
**A:** Yes. Abstract classes can have `main` method and can be run like regular classes. Just cannot be instantiated.

---

## 8. Advanced OOP Concepts

### A. Composition vs Inheritance

**Inheritance** = IS-A relationship (Dog IS-A Animal)  
**Composition** = HAS-A relationship (Car HAS-A Engine)

**General Rule:** Prefer Composition over Inheritance for flexibility and loose coupling.

#### Problem with Inheritance

```java
// Problem: Not all birds can fly!
class Bird {
    void fly() {
        System.out.println("Flying");
    }
}

class Sparrow extends Bird {
    // Can fly - OK
}

class Penguin extends Bird {
    // Problem: Penguins can't fly but inherited fly() method!
}
```

#### Solution with Composition

```java
// Better approach using composition
interface FlyBehavior {
    void fly();
}

class CanFly implements FlyBehavior {
    public void fly() {
        System.out.println("Flying high in the sky!");
    }
}

class CannotFly implements FlyBehavior {
    public void fly() {
        System.out.println("Cannot fly");
    }
}

class Bird {
    private String name;
    private FlyBehavior flyBehavior;  // Composition
    
    public Bird(String name, FlyBehavior flyBehavior) {
        this.name = name;
        this.flyBehavior = flyBehavior;
    }
    
    public void performFly() {
        System.out.print(name + ": ");
        flyBehavior.fly();
    }
    
    // Can change behavior at runtime
    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }
}

// Usage
Bird sparrow = new Bird("Sparrow", new CanFly());
Bird penguin = new Bird("Penguin", new CannotFly());

sparrow.performFly();  // Sparrow: Flying high in the sky!
penguin.performFly();  // Penguin: Cannot fly
```

#### Complete Composition Example

```java
// Engine class
class Engine {
    private String type;
    private int horsepower;
    
    public Engine(String type, int horsepower) {
        this.type = type;
        this.horsepower = horsepower;
    }
    
    public void start() {
        System.out.println(type + " engine started (" + horsepower + " HP)");
    }
    
    public void stop() {
        System.out.println(type + " engine stopped");
    }
}

// Transmission class
class Transmission {
    private String type;
    
    public Transmission(String type) {
        this.type = type;
    }
    
    public void shiftGear(int gear) {
        System.out.println(type + " transmission - Shifted to gear " + gear);
    }
}

// GPS class
class GPS {
    public void navigate(String destination) {
        System.out.println("Navigating to: " + destination);
    }
}

// Car HAS-A Engine, Transmission, GPS
class Car {
    private String model;
    private Engine engine;            // Composition
    private Transmission transmission; // Composition
    private GPS gps;                  // Composition
    
    public Car(String model, Engine engine, Transmission transmission) {
        this.model = model;
        this.engine = engine;
        this.transmission = transmission;
        this.gps = new GPS();
    }
    
    public void start() {
        System.out.println("Starting " + model);
        engine.start();
    }
    
    public void drive(int gear) {
        transmission.shiftGear(gear);
        System.out.println(model + " is moving");
    }
    
    public void navigateTo(String destination) {
        gps.navigate(destination);
    }
    
    public void stop() {
        engine.stop();
        System.out.println(model + " stopped");
    }
}

// Usage
Engine v8Engine = new Engine("V8", 450);
Transmission autoTrans = new Transmission("Automatic");
Car myCar = new Car("Mercedes S-Class", v8Engine, autoTrans);

myCar.start();
myCar.drive(3);
myCar.navigateTo("Downtown");
myCar.stop();
```

### B. Association, Aggregation, Composition

**Association** - Relationship between two objects (uses-a)  
**Aggregation** - Weak HAS-A (can exist independently)  
**Composition** - Strong HAS-A (cannot exist independently)

```java
// 1. Association - Student uses Library
class Library {
    String name;
    
    public Library(String name) {
        this.name = name;
    }
}

class Student {
    String name;
    
    public Student(String name) {
        this.name = name;
    }
    
    void study(Library library) {  // Association
        System.out.println(name + " studying at " + library.name);
    }
}

// 2. Aggregation - Department HAS Employees (employees can exist without department)
class Employee {
    String name;
    
    public Employee(String name) {
        this.name = name;
    }
}

class Department {
    String name;
    List<Employee> employees;  // Aggregation
    
    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }
    
    public void addEmployee(Employee emp) {
        employees.add(emp);
    }
}

// Usage - Employee exists independently
Employee emp1 = new Employee("John");
Department dept = new Department("IT");
dept.addEmployee(emp1);  // Employee can exist without department

// 3. Composition - House HAS Rooms (rooms cannot exist without house)
class House {
    String address;
    List<Room> rooms;  // Composition - strong ownership
    
    public House(String address) {
        this.address = address;
        rooms = new ArrayList<>();
        // Rooms created with house
        rooms.add(new Room("Living Room", 300));
        rooms.add(new Room("Bedroom", 200));
    }
    
    class Room {  // Inner class - strong coupling
        String name;
        int area;
        
        public Room(String name, int area) {
            this.name = name;
            this.area = area;
        }
    }
}
// When House is destroyed, Rooms are destroyed too
```

### C. Inner Classes

#### 1. Member Inner Class (Non-static Nested Class)

```java
class Outer {
    private String outerField = "Outer Field";
    
    // Member Inner Class
    class Inner {
        private String innerField = "Inner Field";
        
        public void display() {
            System.out.println("Outer: " + outerField);
            System.out.println("Inner: " + innerField);
        }
    }
    
    public void createInner() {
        Inner inner = new Inner();
        inner.display();
    }
}

// Usage
Outer outer = new Outer();
Outer.Inner inner = outer.new Inner();
inner.display();
```

#### 2. Static Nested Class

```java
class Outer {
    private static String staticField = "Static Field";
    private String instanceField = "Instance Field";
    
    // Static Nested Class
    static class StaticNested {
        public void display() {
            System.out.println("Static: " + staticField);
            // System.out.println(instanceField); // ERROR! Can't access instance members
        }
    }
}

// Usage
Outer.StaticNested nested = new Outer.StaticNested();
nested.display();
```

#### 3. Local Inner Class

```java
class Outer {
    public void method() {
        final String localVar = "Local Variable";
        
        // Local Inner Class
        class LocalInner {
            public void display() {
                System.out.println("Local: " + localVar);
            }
        }
        
        LocalInner inner = new LocalInner();
        inner.display();
    }
}
```

#### 4. Anonymous Inner Class

```java
// Using abstract class
abstract class Animal {
    abstract void sound();
}

// Anonymous inner class
Animal dog = new Animal() {
    void sound() {
        System.out.println("Woof!");
    }
};
dog.sound();

// Using interface
interface Greeting {
    void greet();
}

Greeting hello = new Greeting() {
    public void greet() {
        System.out.println("Hello!");
    }
};
hello.greet();
```

### D. Object Class Methods

Every class in Java inherits from `Object` class.

```java
public class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // 1. toString() - String representation
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
    
    // 2. equals() - Compare objects
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name);
    }
    
    // 3. hashCode() - Hash value for collections
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
    
    // 4. clone() - Create copy
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

// Usage
Person p1 = new Person("Alice", 25);
Person p2 = new Person("Alice", 25);

System.out.println(p1.toString());        // Person{name='Alice', age=25}
System.out.println(p1.equals(p2));        // true
System.out.println(p1.hashCode());        // Some integer
System.out.println(p1.getClass());        // class Person
```

**Important Contract:** Always override `equals()` and `hashCode()` together!

### E. Enums

```java
// Basic Enum
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

// Enum with fields, constructors, and methods
enum Season {
    SPRING("Warm", 20),
    SUMMER("Hot", 35),
    AUTUMN("Cool", 15),
    WINTER("Cold", 5);
    
    private final String weather;
    private final int avgTemp;
    
    // Constructor (always private)
    Season(String weather, int avgTemp) {
        this.weather = weather;
        this.avgTemp = avgTemp;
    }
    
    public String getWeather() {
        return weather;
    }
    
    public int getAvgTemp() {
        return avgTemp;
    }
}

// Usage
Day today = Day.MONDAY;
System.out.println(today);  // MONDAY

Season season = Season.SUMMER;
System.out.println(season.getWeather());  // Hot
System.out.println(season.getAvgTemp());  // 35

// Enum methods
for (Day day : Day.values()) {
    System.out.println(day);
}
```

### F. The final Keyword

```java
// 1. final variable - cannot be changed
final int MAX_VALUE = 100;
// MAX_VALUE = 200;  // ERROR!

// 2. final method - cannot be overridden
class Parent {
    final void display() {
        System.out.println("Final method");
    }
}

class Child extends Parent {
    // void display() { }  // ERROR! Cannot override
}

// 3. final class - cannot be extended
final class FinalClass {
    // Class body
}

// class SubClass extends FinalClass { }  // ERROR!

// 4. Blank final variable - must be initialized in constructor
class Example {
    final int value;
    
    public Example(int value) {
        this.value = value;  // Must initialize
    }
}

// 5. final with reference variables
final List<String> list = new ArrayList<>();
list.add("Item");  // ✓ Can modify contents
// list = new ArrayList<>();  // ✗ Cannot reassign reference
```

---

### Interview Questions: Advanced Concepts (Q211-Q240)

**Q211: What is composition?**
**A:** Composition is a design technique where a class contains objects of other classes as members, representing a HAS-A relationship. It provides strong ownership where contained objects cannot exist independently.

**Q212: What is aggregation?**
**A:** Aggregation is a weak form of composition where objects can exist independently. It represents a HAS-A relationship with loose coupling.

**Q213: What is the difference between composition and aggregation?**
**A:**
- **Composition**: Strong relationship, child cannot exist without parent (House-Room)
- **Aggregation**: Weak relationship, child can exist independently (Department-Employee)

**Q214: Why prefer composition over inheritance?**
**A:** Composition provides:
- Better flexibility (change behavior at runtime)
- Loose coupling
- Avoids fragile base class problem
- Multiple "inheritance" through multiple objects
- Better encapsulation

**Q215: What is association?**
**A:** Association is a relationship where objects use each other but neither owns the other. It's a "uses-a" relationship (Student uses Library).

**Q216: What are inner classes?**
**A:** Classes defined within another class. Types: Member Inner Class, Static Nested Class, Local Inner Class, Anonymous Inner Class.

**Q217: What is a static nested class?**
**A:** A static class defined inside another class. Can access only static members of outer class. Created without outer class instance.

**Q218: What is a member inner class?**
**A:** Non-static class defined inside another class. Can access all members (including private) of outer class. Needs outer class instance to be created.

**Q219: What is an anonymous inner class?**
**A:** Class without a name, defined and instantiated in a single expression. Used for one-time use, often with interfaces or abstract classes.

**Q220: What is a local inner class?**
**A:** Class defined inside a method or block. Can access final or effectively final local variables.

**Q221: Can inner class access outer class private members?**
**A:** Yes. Member inner classes can access all members (including private) of the outer class.

**Q222: Can outer class access inner class private members?**
**A:** Yes, if outer class has reference to inner class object.

**Q223: Can static nested class access outer class instance variables?**
**A:** No. Static nested classes can only access static members of outer class.

**Q224: What is the Object class?**
**A:** Root class of Java class hierarchy. Every class implicitly extends Object class. Provides methods like `toString()`, `equals()`, `hashCode()`, `clone()`, etc.

**Q225: What are the important methods in Object class?**
**A:**
- `toString()`: String representation
- `equals()`: Compare objects
- `hashCode()`: Hash code for collections
- `clone()`: Create object copy
- `getClass()`: Get runtime class
- `finalize()`: Called before garbage collection (deprecated)
- `wait()`, `notify()`, `notifyAll()`: Thread synchronization

**Q226: Why override equals() and hashCode() together?**
**A:** Contract states: if two objects are equal per `equals()`, they must have same `hashCode()`. Essential for HashMap, HashSet to work correctly. Breaking this contract causes bugs in collections.

**Q227: What is an enum?**
**A:** Special class that represents a group of constants. More powerful than simple constants as it can have fields, methods, and constructors.

**Q228: Can enum have constructors?**
**A:** Yes, but they're always private (implicitly). Enum constructors are called when constants are created.

**Q229: Can enum implement interfaces?**
**A:** Yes. Enums can implement interfaces and provide implementations for interface methods.

**Q230: Can enum extend a class?**
**A:** No. All enums implicitly extend `java.lang.Enum`, and Java doesn't support multiple inheritance.

**Q231: What is the final keyword?**
**A:** Prevents modification:
- **final variable**: Cannot be reassigned
- **final method**: Cannot be overridden
- **final class**: Cannot be extended

**Q232: Can final variables be uninitialized?**
**A:** Blank final variables can be declared without initialization but must be initialized in constructor before use.

**Q233: Can we change the content of a final object?**
**A:** Yes. `final` prevents reassigning the reference, but object's internal state can be modified.
```java
final List<String> list = new ArrayList<>();
list.add("item");  // ✓ OK
// list = new ArrayList<>();  // ✗ Error
```

**Q234: What is the difference between final, finally, and finalize?**
**A:**
- **final**: Keyword for constants, preventing override/inheritance
- **finally**: Block that always executes after try-catch
- **finalize()**: Method called before object garbage collection (deprecated)

**Q235: Can we declare constructor as final?**
**A:** No. Constructors cannot be inherited, so `final` is meaningless for them.

**Q236: What is shallow copy vs deep copy?**
**A:**
- **Shallow copy**: Copies object but references to other objects are shared
- **Deep copy**: Copies object and creates new copies of all referenced objects

**Q237: What is the Cloneable interface?**
**A:** Marker interface indicating a class allows cloning via `clone()` method. Without it, `clone()` throws `CloneNotSupportedException`.

**Q238: What is method hiding?**
**A:** When a subclass defines a static method with same signature as parent's static method. It hides (not overrides) the parent method.

**Q239: Can we override equals() without overriding hashCode()?**
**A:** Technically yes, but it violates the contract and causes bugs in hash-based collections like HashMap, HashSet.

**Q240: What is the difference between nested class and inner class?**
**A:**
- **Inner class**: Non-static nested class (needs outer instance)
- **Nested class**: General term including both static and non-static

---

## 9. Design Patterns

Design patterns are proven solutions to recurring problems in software design.

### A. Singleton Pattern

**Problem:** Need exactly one instance of a class throughout application.

**Solution:** Make constructor private and provide static method to get instance.

```java
public class Database {
    // Single instance
    private static Database instance;
    private String connectionString;
    
    // Private constructor
    private Database() {
        connectionString = "jdbc:mysql://localhost:3306/mydb";
        System.out.println("Database connection created");
    }
    
    // Public method to get instance
    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }
    
    public void executeQuery(String query) {
        System.out.println("Executing: " + query);
    }
}

// Usage
Database db1 = Database.getInstance();
Database db2 = Database.getInstance();
System.out.println(db1 == db2);  // true - same instance!
```

**Thread-Safe Singleton:**

```java
public class ThreadSafeSingleton {
    private static volatile ThreadSafeSingleton instance;
    
    private ThreadSafeSingleton() { }
    
    // Double-checked locking
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
}
```

**Enum Singleton (Best approach):**

```java
public enum DatabaseConnection {
    INSTANCE;
    
    public void connect() {
        System.out.println("Connected to database");
    }
}

// Usage
DatabaseConnection.INSTANCE.connect();
```

### B. Factory Pattern

**Problem:** Need to create objects without specifying exact class.

**Solution:** Factory method decides which class to instantiate.

```java
// Product interface
interface Shape {
    void draw();
    double calculateArea();
}

// Concrete products
class Circle implements Shape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing Circle with radius: " + radius);
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    private double length, width;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle: " + length + "x" + width);
    }
    
    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Triangle implements Shape {
    private double base, height;
    
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing Triangle: base=" + base + ", height=" + height);
    }
    
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

// Factory
class ShapeFactory {
    public static Shape createShape(String type, double... dimensions) {
        switch (type.toLowerCase()) {
            case "circle":
                return new Circle(dimensions[0]);
            case "rectangle":
                return new Rectangle(dimensions[0], dimensions[1]);
            case "triangle":
                return new Triangle(dimensions[0], dimensions[1]);
            default:
                throw new IllegalArgumentException("Unknown shape: " + type);
        }
    }
}

// Usage
Shape circle = ShapeFactory.createShape("circle", 5.0);
Shape rectangle = ShapeFactory.createShape("rectangle", 4.0, 6.0);
Shape triangle = ShapeFactory.createShape("triangle", 3.0, 4.0);

circle.draw();
System.out.println("Area: " + circle.calculateArea());
```

### C. Observer Pattern

**Problem:** When one object changes, multiple objects need notification.

**Solution:** Define one-to-many dependency between objects.

```java
import java.util.*;

// Observer interface
interface Observer {
    void update(String message);
}

// Subject/Observable
class NewsAgency {
    private List<Observer> observers = new ArrayList<>();
    private String latestNews;
    
    public void attach(Observer observer) {
        observers.add(observer);
        System.out.println("Observer attached");
    }
    
    public void detach(Observer observer) {
        observers.remove(observer);
        System.out.println("Observer detached");
    }
    
    public void setNews(String news) {
        this.latestNews = news;
        notifyObservers();
    }
    
    private void notifyObservers() {
        System.out.println("\n*** Breaking News ***");
        for (Observer observer : observers) {
            observer.update(latestNews);
        }
    }
}

// Concrete Observers
class NewsChannel implements Observer {
    private String channelName;
    
    public NewsChannel(String name) {
        this.channelName = name;
    }
    
    @Override
    public void update(String message) {
        System.out.println(channelName + " received: " + message);
    }
}

class MobileApp implements Observer {
    private String appName;
    
    public MobileApp(String name) {
        this.appName = name;
    }
    
    @Override
    public void update(String message) {
        System.out.println(appName + " notification: " + message);
    }
}

// Usage
NewsAgency agency = new NewsAgency();

Observer cnn = new NewsChannel("CNN");
Observer bbc = new NewsChannel("BBC");
Observer app = new MobileApp("NewsApp");

agency.attach(cnn);
agency.attach(bbc);
agency.attach(app);

agency.setNews("Major earthquake detected!");
agency.setNews("New technology breakthrough!");
```

### D. Strategy Pattern

**Problem:** Need to switch between different algorithms at runtime.

**Solution:** Define family of algorithms, encapsulate each one.

```java
// Strategy interface
interface PaymentStrategy {
    boolean pay(double amount);
    String getPaymentType();
}

// Concrete strategies
class CreditCardStrategy implements PaymentStrategy {
    private String cardNumber;
    private String cvv;
    private String expiryDate;
    
    public CreditCardStrategy(String card, String cvv, String expiry) {
        this.cardNumber = card;
        this.cvv = cvv;
        this.expiryDate = expiry;
    }
    
    @Override
    public boolean pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card");
        System.out.println("Card: ****" + cardNumber.substring(cardNumber.length() - 4));
        return true;
    }
    
    @Override
    public String getPaymentType() {
        return "Credit Card";
    }
}

class PayPalStrategy implements PaymentStrategy {
    private String email;
    private String password;
    
    public PayPalStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }
    
    @Override
    public boolean pay(double amount) {
        System.out.println("Paid $" + amount + " using PayPal");
        System.out.println("Account: " + email);
        return true;
    }
    
    @Override
    public String getPaymentType() {
        return "PayPal";
    }
}

class BitcoinStrategy implements PaymentStrategy {
    private String walletAddress;
    
    public BitcoinStrategy(String wallet) {
        this.walletAddress = wallet;
    }
    
    @Override
    public boolean pay(double amount) {
        System.out.println("Paid $" + amount + " using Bitcoin");
        System.out.println("Wallet: " + walletAddress);
        return true;
    }
    
    @Override
    public String getPaymentType() {
        return "Bitcoin";
    }
}

// Context
class ShoppingCart {
    private List<String> items = new ArrayList<>();
    private PaymentStrategy paymentStrategy;
    
    public void addItem(String item) {
        items.add(item);
    }
    
    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }
    
    public void checkout(double amount) {
        if (paymentStrategy == null) {
            System.out.println("Please select a payment method");
            return;
        }
        
        System.out.println("\n=== Checkout ===");
        System.out.println("Items: " + items);
        System.out.println("Total: $" + amount);
        System.out.println("Payment Method: " + paymentStrategy.getPaymentType());
        paymentStrategy.pay(amount);
        System.out.println("Checkout complete!\n");
    }
}

// Usage
ShoppingCart cart = new ShoppingCart();
cart.addItem("Laptop");
cart.addItem("Mouse");

// Pay with credit card
cart.setPaymentStrategy(new CreditCardStrategy("1234567890123456", "123", "12/25"));
cart.checkout(1500.00);

// Pay with PayPal
cart.setPaymentStrategy(new PayPalStrategy("user@example.com", "password"));
cart.checkout(1500.00);

// Pay with Bitcoin
cart.setPaymentStrategy(new BitcoinStrategy("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa"));
cart.checkout(1500.00);
```

### E. Builder Pattern

**Problem:** Constructing complex objects with many optional parameters.

**Solution:** Separate construction from representation using builder.

```java
// Product
class Computer {
    // Required parameters
    private String CPU;
    private String RAM;
    
    // Optional parameters
    private String storage;
    private String GPU;
    private boolean isWiFiEnabled;
    private boolean isBluetoothEnabled;
    
    private Computer(ComputerBuilder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.GPU = builder.GPU;
        this.isWiFiEnabled = builder.isWiFiEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }
    
    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", storage='" + storage + '\'' +
                ", GPU='" + GPU + '\'' +
                ", WiFi=" + isWiFiEnabled +
                ", Bluetooth=" + isBluetoothEnabled +
                '}';
    }
    
    // Builder class
    public static class ComputerBuilder {
        // Required parameters
        private String CPU;
        private String RAM;
        
        // Optional parameters - initialized to default values
        private String storage = "256GB SSD";
        private String GPU = "Integrated";
        private boolean isWiFiEnabled = false;
        private boolean isBluetoothEnabled = false;
        
        public ComputerBuilder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }
        
        public ComputerBuilder setStorage(String storage) {
            this.storage = storage;
            return this;
        }
        
        public ComputerBuilder setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }
        
        public ComputerBuilder setWiFiEnabled(boolean enabled) {
            this.isWiFiEnabled = enabled;
            return this;
        }
        
        public ComputerBuilder setBluetoothEnabled(boolean enabled) {
            this.isBluetoothEnabled = enabled;
            return this;
        }
        
        public Computer build() {
            return new Computer(this);
        }
    }
}

// Usage
Computer gamingPC = new Computer.ComputerBuilder("Intel i9", "32GB")
        .setStorage("1TB SSD")
        .setGPU("RTX 4090")
        .setWiFiEnabled(true)
        .setBluetoothEnabled(true)
        .build();

Computer officePC = new Computer.ComputerBuilder("Intel i5", "16GB")
        .setWiFiEnabled(true)
        .build();

System.out.println(gamingPC);
System.out.println(officePC);
```

---

### Interview Questions: Design Patterns (Q241-Q260)

**Q241: What is a design pattern?**
**A:** A design pattern is a general reusable solution to a commonly occurring problem in software design. It's a template for how to solve a problem in various situations.

**Q242: What are the types of design patterns?**
**A:** Three main categories:
1. **Creational**: Object creation (Singleton, Factory, Builder)
2. **Structural**: Object composition (Adapter, Decorator, Composite)
3. **Behavioral**: Object interaction (Observer, Strategy, Template Method)

**Q243: What is Singleton pattern?**
**A:** Ensures a class has only one instance and provides global access point to it. Used for logging, database connections, configuration management.

**Q244: How do you implement thread-safe Singleton?**
**A:** Using:
- Double-checked locking with volatile
- Enum (best approach)
- Static inner class (lazy initialization)
- Synchronized method

**Q245: What are the disadvantages of Singleton?**
**A:**
- Difficult to test (hard to mock)
- Hidden dependencies
- Violates Single Responsibility Principle
- Thread safety issues if not implemented correctly
- Global state problems

**Q246: What is Factory pattern?**
**A:** Creates objects without specifying exact class. Factory method decides which class to instantiate based on input parameters.

**Q247: What is the difference between Factory and Abstract Factory?**
**A:**
- **Factory**: Creates one type of object
- **Abstract Factory**: Creates families of related objects

**Q248: What is Observer pattern?**
**A:** Defines one-to-many dependency where when one object changes state, all dependents are notified. Used in event handling, MVC architecture.

**Q249: What is Strategy pattern?**
**A:** Defines family of algorithms, encapsulates each one, and makes them interchangeable. Algorithm can vary independently from clients using it.

**Q250: What is Builder pattern?**
**A:** Separates construction of complex object from its representation. Useful when object has many optional parameters.

**Q251: When should we use Builder pattern?**
**A:** When:
- Object has many parameters (especially optional ones)
- Want immutable objects
- Constructor has too many parameters (telescoping constructor problem)
- Need step-by-step construction

**Q252: What is Dependency Injection?**
**A:** Design pattern where dependencies are provided to an object rather than object creating them. Promotes loose coupling and testability.

**Q253: What are the types of Dependency Injection?**
**A:**
1. **Constructor Injection**: Dependencies passed through constructor
2. **Setter Injection**: Dependencies set through setter methods
3. **Field Injection**: Dependencies directly assigned to fields

**Q254: What is the difference between Strategy and State pattern?**
**A:**
- **Strategy**: Client chooses algorithm/strategy
- **State**: Object changes behavior based on internal state

**Q255: What is Template Method pattern?**
**A:** Defines skeleton of algorithm in base class, letting subclasses override specific steps without changing algorithm structure.

**Q256: What is Adapter pattern?**
**A:** Converts interface of class into another interface clients expect. Allows classes with incompatible interfaces to work together.

**Q257: What is Decorator pattern?**
**A:** Attaches additional responsibilities to object dynamically. Provides flexible alternative to subclassing for extending functionality.

**Q258: What is the advantage of using design patterns?**
**A:**
- Proven solutions to common problems
- Improve code reusability
- Better communication among developers
- Easier maintenance
- Best practices documentation

**Q259: Can Singleton pattern be broken?**
**A:** Yes, through:
- Reflection (can access private constructor)
- Serialization (creates new instance on deserialization)
- Cloning
- Multiple classloaders
Enum Singleton is immune to most of these.

**Q260: What is anti-pattern?**
**A:** A common solution to a problem that appears effective but actually leads to bad consequences. Examples: God Object, Spaghetti Code, Golden Hammer.

---

## 10. Interview Scenarios & Problem Solving

### Scenario-Based Questions (Q261-Q300)

**Q261: Design a parking lot system.**
**A:** Key classes:
```java
enum VehicleType { CAR, BIKE, TRUCK }

class Vehicle {
    String licensePlate;
    VehicleType type;
}

class ParkingSpot {
    int spotNumber;
    VehicleType type;
    Vehicle vehicle;
    boolean isOccupied;
}

class ParkingLot {
    List<ParkingSpot> spots;
    
    boolean parkVehicle(Vehicle vehicle) {
        // Find available spot
        // Park vehicle
        // Return success/failure
    }
    
    void removeVehicle(String licensePlate) {
        // Find vehicle
        // Free spot
    }
}
```

**Q262: Design a library management system.**
**A:** Key components:
- Book (ISBN, title, author, copies)
- Member (memberId, name, borrowedBooks)
- Library (books collection, members, borrow/return methods)
- Transaction history

**Q263: Explain how you would implement a cache system.**
**A:** Using Singleton pattern with HashMap:
```java
class Cache {
    private static Cache instance;
    private Map<String, Object> cache;
    private int maxSize;
    
    private Cache() {
        cache = new LinkedHashMap<>(16, 0.75f, true);
        maxSize = 100;
    }
    
    public void put(String key, Object value) {
        if (cache.size() >= maxSize) {
            // Remove least recently used
        }
        cache.put(key, value);
    }
}
```

**Q264: Design an employee management system with different employee types.**
**A:** Use inheritance and polymorphism:
```java
abstract class Employee {
    protected String id;
    protected String name;
    protected double baseSalary;
    
    public abstract double calculateSalary();
    public abstract String getEmployeeType();
}

class FullTimeEmployee extends Employee {
    private double bonus;
    
    public double calculateSalary() {
        return baseSalary + bonus;
    }
}

class ContractEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;
    
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}
```

**Q265: How would you design a notification system supporting multiple channels?**
**A:** Strategy pattern:
```java
interface NotificationStrategy {
    void send(String message, String recipient);
}

class EmailNotification implements NotificationStrategy {
    public void send(String message, String recipient) {
        // Send email
    }
}

class SMSNotification implements NotificationStrategy {
    public void send(String message, String recipient) {
        // Send SMS
    }
}

class NotificationService {
    private NotificationStrategy strategy;
    
    public void setStrategy(NotificationStrategy strategy) {
        this.strategy = strategy;
    }
    
    public void notify(String message, String recipient) {
        strategy.send(message, recipient);
    }
}
```

**Q266: Design a bank account system with different account types.**
**A:** Use inheritance:
```java
abstract class Account {
    protected String accountNumber;
    protected double balance;
    
    public abstract void withdraw(double amount);
    public abstract double getInterestRate();
    
    public void deposit(double amount) {
        balance += amount;
    }
}

class SavingsAccount extends Account {
    private static final double INTEREST_RATE = 0.04;
    
    public void withdraw(double amount) {
        if (balance - amount >= 1000) {
            balance -= amount;
        }
    }
    
    public double getInterestRate() {
        return INTEREST_RATE;
    }
}

class CheckingAccount extends Account {
    private static final double INTEREST_RATE = 0.01;
    
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        }
    }
    
    public double getInterestRate() {
        return INTEREST_RATE;
    }
}
```

**Q267: How to prevent object creation in Java?**
**A:** Make constructor private (Singleton pattern) or make class abstract.

**Q268: Design a logging system with different log levels.**
**A:**
```java
enum LogLevel {
    DEBUG, INFO, WARNING, ERROR, CRITICAL
}

class Logger {
    private static Logger instance;
    private LogLevel currentLevel;
    
    private Logger() {
        currentLevel = LogLevel.INFO;
    }
    
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
    
    public void log(LogLevel level, String message) {
        if (level.ordinal() >= currentLevel.ordinal()) {
            System.out.println("[" + level + "] " + message);
        }
    }
}
```

**Q269: Implement a simple calculator using OOP principles.**
**A:**
```java
interface Operation {
    double execute(double a, double b);
}

class Addition implements Operation {
    public double execute(double a, double b) {
        return a + b;
    }
}

class Subtraction implements Operation {
    public double execute(double a, double b) {
        return a - b;
    }
}

class Calculator {
    public double calculate(double a, double b, Operation operation) {
        return operation.execute(a, b);
    }
}
```

**Q270: Design a shape hierarchy with area calculation.**
**A:** Already covered in polymorphism section with Shape, Circle, Rectangle, Triangle classes.

**Q271: How would you implement a plugin system?**
**A:** Using interfaces:
```java
interface Plugin {
    void initialize();
    void execute();
    String getName();
}

class PluginManager {
    private List<Plugin> plugins = new ArrayList<>();
    
    public void registerPlugin(Plugin plugin) {
        plugins.add(plugin);
        plugin.initialize();
    }
    
    public void executeAll() {
        for (Plugin plugin : plugins) {
            plugin.execute();
        }
    }
}
```

**Q272: Design a shopping cart with discount strategies.**
**A:** Strategy pattern for discounts:
```java
interface DiscountStrategy {
    double applyDiscount(double price);
}

class NoDiscount implements DiscountStrategy {
    public double applyDiscount(double price) {
        return price;
    }
}

class PercentageDiscount implements DiscountStrategy {
    private double percentage;
    
    public PercentageDiscount(double percentage) {
        this.percentage = percentage;
    }
    
    public double applyDiscount(double price) {
        return price * (1 - percentage / 100);
    }
}

class ShoppingCart {
    private List<Double> items = new ArrayList<>();
    private DiscountStrategy discountStrategy;
    
    public double calculateTotal() {
        double total = items.stream().mapToDouble(Double::doubleValue).sum();
        return discountStrategy.applyDiscount(total);
    }
}
```

**Q273: What's wrong with this code? (Common mistakes)**
```java
class Parent {
    private void display() { }
}

class Child extends Parent {
    public void display() { }  // Not overriding! Private not inherited
}
```
**A:** Private methods aren't inherited, so this isn't overriding. It's a new method in Child.

**Q274: Design a file system hierarchy.**
**A:** Composite pattern:
```java
abstract class FileSystemComponent {
    protected String name;
    
    public abstract void display(String indent);
    public abstract long getSize();
}

class File extends FileSystemComponent {
    private long size;
    
    public void display(String indent) {
        System.out.println(indent + name + " (" + size + " bytes)");
    }
    
    public long getSize() {
        return size;
    }
}

class Directory extends FileSystemComponent {
    private List<FileSystemComponent> children = new ArrayList<>();
    
    public void add(FileSystemComponent component) {
        children.add(component);
    }
    
    public void display(String indent) {
        System.out.println(indent + name + "/");
        for (FileSystemComponent child : children) {
            child.display(indent + "  ");
        }
    }
    
    public long getSize() {
        return children.stream().mapToLong(FileSystemComponent::getSize).sum();
    }
}
```

**Q275: Implement immutable class in Java.**
**A:**
```java
public final class ImmutablePerson {
    private final String name;
    private final int age;
    private final List<String> hobbies;
    
    public ImmutablePerson(String name, int age, List<String> hobbies) {
        this.name = name;
        this.age = age;
        // Defensive copy
        this.hobbies = new ArrayList<>(hobbies);
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public List<String> getHobbies() {
        // Return unmodifiable view
        return Collections.unmodifiableList(hobbies);
    }
}
```

**Q276-Q300: Rapid Fire Interview Questions**

**Q276: Can we have multiple public classes in single file?**
**A:** No. Only one public class per file, and filename must match.

**Q277: What's the difference between this() and super()?**
**A:** `this()` calls another constructor in same class, `super()` calls parent constructor.

**Q278: Can abstract methods be synchronized?**
**A:** No. Abstract methods have no body, so synchronization is meaningless.

**Q279: What is marker interface?**
**A:** Interface with no methods. Examples: Serializable, Cloneable, Remote.

**Q280: Can interface variables be private?**
**A:** No. Interface variables are always public static final.

**Q281: What is the purpose of @FunctionalInterface annotation?**
**A:** Indicates interface should have exactly one abstract method. Used for lambda expressions.

**Q282: Can we reduce visibility while overriding?**
**A:** No. Can only increase visibility (private → public), not decrease.

**Q283: What is the difference between aggregation and association?**
**A:** Aggregation is "has-a" relationship with ownership, association is "uses-a" relationship without ownership.

**Q284: Can static block throw exceptions?**
**A:** Yes, but only unchecked exceptions. Checked exceptions must be caught.

**Q285: What is the difference between abstract class and concrete class?**
**A:** Abstract class can have abstract methods and cannot be instantiated. Concrete class has all methods implemented and can be instantiated.

**Q286: Can we override static methods?**
**A:** No, but we can hide them (method hiding).

**Q287: What is early binding and late binding?**
**A:** Early binding (compile-time): overloading, static methods. Late binding (runtime): overriding, instance methods.

**Q288: Can constructor call methods?**
**A:** Yes, but be careful calling overridden methods as subclass methods might access uninitialized fields.

**Q289: What is object slicing?**
**A:** Not applicable in Java (C++ concept). Java uses references, preventing slicing.

**Q290: Can we serialize static variables?**
**A:** No. Static variables belong to class, not objects. Serialization saves object state.

**Q291: What is phantom reference?**
**A:** Weakest reference type. Used for cleanup operations before object is garbage collected.

**Q292: Can enum be null?**
**A:** Enum variable can be null, but enum constants themselves cannot be null.

**Q293: What is the use of instanceof operator in casting?**
**A:** To check object type before downcasting, preventing ClassCastException.

**Q294: Can we override equals() method to compare based on one field only?**
**A:** Yes, but it should maintain equals() contract (reflexive, symmetric, transitive).

**Q295: What is the difference between shadowing and hiding?**
**A:** Shadowing: local variable hides instance variable. Hiding: static method in subclass hides parent's static method.

**Q296: Can we call non-static method from static context?**
**A:** No, unless we create an object first. Static context has no `this` reference.

**Q297: What is tight encapsulation?**
**A:** All instance variables are private with public getters/setters providing controlled access.

**Q298: Can interface extend multiple interfaces?**
**A:** Yes. Interfaces can extend multiple interfaces using comma-separated list.

**Q299: What is the difference between method signature and method declaration?**
**A:** Signature: method name + parameter list. Declaration: includes return type, modifiers, exceptions.

**Q300: Can we have circular inheritance?**
**A:** No. Java compiler prevents circular inheritance (A extends B, B extends A).

---

## Final Tips for Interview Success

### Key Concepts to Master

1. **Four Pillars**: Thoroughly understand Abstraction, Polymorphism, Inheritance, Encapsulation
2. **Class vs Object**: Clear distinction and relationship
3. **Constructors**: Types, chaining, overloading
4. **Access Modifiers**: When to use which
5. **Abstract Classes vs Interfaces**: Differences and when to use
6. **Polymorphism**: Compile-time vs runtime, practical examples
7. **Inheritance**: Types, method overriding rules
8. **Design Patterns**: At least Singleton, Factory, Observer, Strategy

### Common Interview Mistakes to Avoid

1. Confusing method overloading with overriding
2. Not knowing private methods can't be overridden
3. Forgetting static methods can't be overridden
4. Not understanding the equals() and hashCode() contract
5. Confusion about when to use abstract class vs interface
6. Not knowing constructors aren't inherited
7. Misunderstanding access modifiers visibility

### How to Approach Coding Questions

1. **Clarify Requirements**: Ask questions about edge cases
2. **Think Out Loud**: Explain your thought process
3. **Start Simple**: Begin with basic solution, then optimize
4. **Use OOP Principles**: Show encapsulation, abstraction
5. **Consider Design Patterns**: When appropriate
6. **Handle Edge Cases**: Null checks, validation
7. **Write Clean Code**: Meaningful names, proper indentation

### Sample Answers Structure

**For "What" questions:**
- Definition
- Purpose/Why it exists
- Simple example
- Real-world analogy (if applicable)

**For "Difference" questions:**
- Create comparison table
- Provide examples for each
- Mention when to use which

**For "How" questions:**
- Step-by-step explanation
- Code example
- Mention any gotchas or best practices

### Code Quality Checklist

- [ ] Proper naming conventions
- [ ] Encapsulation (private fields, public methods)
- [ ] Single Responsibility Principle
- [ ] Input validation
- [ ] Exception handling
- [ ] Comments for complex logic
- [ ] Consistent formatting
- [ ] No code duplication

### Practice Scenarios

**Scenario 1: Design a Banking System**
- Account hierarchy (Savings, Checking, Fixed Deposit)
- Transaction management
- Interest calculation (polymorphism)
- Authentication and security

**Scenario 2: E-commerce Application**
- Product catalog
- Shopping cart
- Order processing
- Payment strategies (Strategy pattern)
- User management

**Scenario 3: Vehicle Rental System**
- Vehicle types (inheritance)
- Booking system
- Pricing strategies
- Availability management

**Scenario 4: Online Learning Platform**
- Course hierarchy
- Student enrollment
- Progress tracking
- Certificate generation

**Scenario 5: Restaurant Management**
- Menu management
- Order processing
- Table reservations
- Billing system

### Important Interview Questions Summary

**Must-Know Questions:**
1. Four pillars of OOP
2. Difference between abstract class and interface
3. Method overloading vs overriding
4. Why multiple inheritance is not supported for classes
5. Access modifiers and their visibility
6. Singleton pattern implementation
7. Composition vs Inheritance
8. equals() and hashCode() contract
9. Static vs instance members
10. Constructor chaining

**Frequently Asked:**
11. this vs super keyword
12. final keyword usage
13. Can we override static/private/final methods?
14. Default constructor behavior
15. Polymorphism examples
16. Design patterns you know
17. Immutable class creation
18. Shallow vs deep copy
19. Marker interfaces
20. Functional interfaces

### Quick Reference Tables

**Access Modifiers:**
| Modifier | Same Class | Same Package | Subclass | Everywhere |
|----------|-----------|--------------|----------|------------|
| private | ✓ | ✗ | ✗ | ✗ |
| default | ✓ | ✓ | ✗ | ✗ |
| protected | ✓ | ✓ | ✓ | ✗ |
| public | ✓ | ✓ | ✓ | ✓ |

**Overloading vs Overriding:**
| Feature | Overloading | Overriding |
|---------|------------|-----------|
| Same class | ✓ | ✗ |
| Inheritance | Not required | Required |
| Parameters | Different | Same |
| Return type | Can differ | Same/covariant |
| Binding | Compile-time | Runtime |

**Abstract Class vs Interface:**
| Feature | Abstract Class | Interface |
|---------|---------------|-----------|
| Methods | Abstract + Concrete | Abstract (mainly) |
| Variables | Any type | Constants only |
| Constructor | Yes | No |
| Multiple inheritance | No | Yes |
| When to use | IS-A + code sharing | CAN-DO capability |

### SOLID Principles (Brief)

**S - Single Responsibility**
- One class = one responsibility
- Makes code easier to maintain

**O - Open/Closed**
- Open for extension, closed for modification
- Use inheritance/interfaces to extend

**L - Liskov Substitution**
- Subclass objects should work wherever parent objects work
- Don't break parent's behavior

**I - Interface Segregation**
- Many specific interfaces > one general interface
- Don't force implementation of unused methods

**D - Dependency Inversion**
- Depend on abstractions, not concrete classes
- High-level shouldn't depend on low-level modules

### Study Plan Recommendation

**Week 1: Fundamentals**
- Classes, objects, constructors
- Instance vs static members
- this keyword
- Practice: Create 5-10 simple classes

**Week 2: Core Pillars**
- Encapsulation and access modifiers
- Inheritance and method overriding
- Practice: Create class hierarchies

**Week 3: Advanced OOP**
- Polymorphism (both types)
- Abstraction (abstract classes and interfaces)
- Practice: Implement interfaces, polymorphic behavior

**Week 4: Design Patterns**
- Singleton, Factory, Observer, Strategy, Builder
- Practice: Implement each pattern

**Week 5: Practice & Review**
- Solve scenario-based problems
- Review all concepts
- Mock interviews with friends
- Practice explaining concepts out loud

### Resources to Study

1. **Books:**
   - "Head First Java" by Kathy Sierra
   - "Effective Java" by Joshua Bloch
   - "Design Patterns" by Gang of Four

2. **Online Platforms:**
   - LeetCode (OOP problems)
   - HackerRank (Java practice)
   - InterviewBit (OOP questions)

3. **Practice:**
   - Write code daily
   - Explain concepts to others
   - Review and refactor old code
   - Participate in code reviews

### Before Interview Day

**Technical Preparation:**
- Review all 300 questions in this guide
- Practice writing code on paper/whiteboard
- Prepare examples from your projects
- Review time/space complexity basics

**Mental Preparation:**
- Get good sleep
- Review notes in the morning
- Don't cram new concepts
- Stay calm and confident

**During Interview:**
- Listen carefully to questions
- Ask clarifying questions
- Think before coding
- Explain your approach
- Test your code mentally
- Be honest if you don't know something

### Final Checklist

Before any OOP interview, make sure you can:

- [ ] Explain all four pillars with examples
- [ ] Write a class with proper encapsulation
- [ ] Implement inheritance hierarchy
- [ ] Demonstrate polymorphism
- [ ] Explain abstract class vs interface
- [ ] Implement at least 3 design patterns
- [ ] Handle constructor chaining
- [ ] Override equals() and hashCode()
- [ ] Explain access modifiers clearly
- [ ] Solve scenario-based design problems
- [ ] Write clean, readable code
- [ ] Explain your design decisions

---

## Conclusion

This guide covers 300+ questions on Java Object-Oriented Programming from basic to advanced level. The key to mastering OOP is:

1. **Understand Concepts Deeply**: Don't memorize, understand WHY
2. **Practice Regularly**: Code every day, even if just 30 minutes
3. **Learn from Examples**: Study real-world applications
4. **Teach Others**: Best way to solidify your understanding
5. **Review Mistakes**: Learn from errors in practice problems
6. **Stay Updated**: Java evolves, keep learning new features

**Remember:**
- OOP is about modeling real-world entities
- Focus on creating maintainable, reusable code
- Design patterns are tools, not rules
- Practice explaining concepts verbally
- Code quality matters as much as correctness

**Good Luck with Your Interviews!**

The journey to mastering OOP is continuous. Even experienced developers keep learning and improving. Stay curious, keep practicing, and don't be discouraged by difficult questions. Every interview is a learning opportunity.

### Additional Practice Resources

**GitHub Projects to Study:**
- Open-source Java projects
- Spring Framework (for advanced OOP patterns)
- Apache Commons (utility classes)

**YouTube Channels:**
- Programming with Mosh
- Java Brains
- Telusko

**Communities:**
- Stack Overflow (ask and answer questions)
- Reddit (r/learnjava)
- Java Discord servers

---

**Final Words of Advice:**

1. **Be Honest**: If you don't know something, say so. Show willingness to learn.
2. **Think Aloud**: Interviewers want to see your thought process.
3. **Ask Questions**: Shows engagement and critical thinking.
4. **Take Your Time**: Don't rush. Think before you speak/code.
5. **Stay Calm**: Mistakes are okay. How you handle them matters.

This guide is comprehensive, but real mastery comes from practice. Use this as a reference, practice coding regularly, and you'll be well-prepared for any OOP interview.

**You've got this! Happy Learning and Best of Luck!** 🚀