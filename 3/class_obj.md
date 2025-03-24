# 1. Class and Object Theory in Java
What is a Class?

A class is a blueprint or template that defines the properties (fields/attributes) and behaviors (methods) of objects.

It does not store any data by itself but serves as a model for creating objects.

What is an Object?

An object is an instance of a class.

It has a state (data/attributes) and behavior (methods).

Objects are stored in heap memory in Java.

## Example of Class and Object Theory

```java
// Defining a class
class Car {
    // Attributes (Instance Variables)
    String brand;
    int speed;

    // Method (Behavior)
    void display() {
        System.out.println("Car Brand: " + brand + ", Speed: " + speed);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car car1 = new Car();  
        car1.brand = "Toyota";  
        car1.speed = 120;  
        
        // Calling method
        car1.display();
    }
}
```



Output:

Car Brand: Toyota, Speed: 120


# 2. Class and Object Practical
Now, let’s see a real-world example of a Bank Account system.

## Practical Example
~~~java
class BankAccount {
    // Instance variables
    String accountHolder;
    double balance;

    // Constructor
    BankAccount(String holder, double initialBalance) {
        accountHolder = holder;
        balance = initialBalance;
    }

    // Method to deposit money
    void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. New balance: " + balance);
    }

    // Method to withdraw money
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        // Creating objects
        BankAccount acc1 = new BankAccount("Naveen", 5000);
        acc1.deposit(2000);
        acc1.withdraw(3000);
    }
}

~~~

Output:

2000 deposited. New balance: 7000
3000 withdrawn. Remaining balance: 4000

## 3. JDK, JRE, and JVM

Component	Description
JDK (Java Development Kit)	Contains JRE + development tools (compiler, debugger, etc.). Used for Java development.

JRE (Java Runtime Environment)	Contains JVM + libraries needed to run Java applications. No compiler.

JVM (Java Virtual Machine)	Executes Java bytecode, handling memory management and garbage collection.

JVM Execution Process

Java code (.java file) → Compiled by javac → Generates bytecode (.class file).

JVM executes .class file → Converts to machine code for execution.

## 4. Methods in Java
A method is a block of code that performs a specific task.

Types of Methods
Predefined Methods – Built-in Java methods (e.g., Math.sqrt(), System.out.println()).

User-defined Methods – Created by the programmer.

# Example of a Method
~~~java
class MathOperations {
    // Method to add two numbers
    int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        MathOperations obj = new MathOperations();
        int sum = obj.add(10, 20);
        System.out.println("Sum: " + sum);
    }
}
~~~

Output:

Sum: 30

## 5. Method Overloading
Method Overloading allows multiple methods in the same class with the same name but different parameters (number, type, or order).

# Example of Method Overloading
~~~java
class Calculator {
    // Method 1: Add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method 2: Add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: Add two double numbers
    double add(double a, double b) {
        return a + b;
    }
}

public class OverloadingExample {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(10, 20));  // Calls method 1
        System.out.println(calc.add(10, 20, 30));  // Calls method 2
        System.out.println(calc.add(5.5, 2.2));  // Calls method 3
    }
}
~~~

Output:

30
60
7.7


## 6. Stack and Heap in Java

Feature	Stack Memory	Heap Memory

Usage	Stores method calls and local variables	Stores objects and instance variables

Access Speed	Fast	Slower

Memory Management	Automatic (removed when method ends)	Managed by Garbage Collector

Exception	StackOverflowError (due to deep recursion)	OutOfMemoryError (if heap is full)

# Example: Stack vs Heap
~~~java
class MemoryExample {
    int x = 10;  // Stored in heap

    void display() {
        int y = 20;  // Stored in stack
        System.out.println("x: " + x + ", y: " + y);
    }

    public static void main(String[] args) {
        MemoryExample obj = new MemoryExample();  // 'obj' stored in stack, object in heap
        obj.display();
    }
}
~~~

How Stack & Heap Work in This Example

Stack: Stores obj reference and method variables.

Heap: Stores the actual object (MemoryExample instance).

Conclusion

Topic	Key Takeaway

Class & Object	A class is a blueprint; objects are created from it.

Practical Example	Real-world applications like a Bank Account.

JDK, JRE, JVM	JDK = Development tools + JRE; JRE = JVM + libraries.

Methods	Used to perform tasks; can be predefined or user-defined.

Method Overloading	Multiple methods with the same name but different parameters.

Stack & Heap	Stack = Method calls & local variables; Heap = Objects & instance variables.

