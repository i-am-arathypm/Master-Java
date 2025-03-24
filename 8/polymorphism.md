# Polymorphism 

## What is Polymorphism?

Polymorphism in Java is the ability of an object to take on multiple forms. It allows a single interface to be used for different types, making code more flexible and scalable. Polymorphism enables method overloading and method overriding.

## Types of Polymorphism

- Java supports two types of polymorphism:

- 1.Compile-time Polymorphism (Method Overloading)

- Occurs when multiple methods have the same name but different parameters.

- The method to be executed is determined at compile time.

Example:
```
class MathOperations {
    int add(int a, int b) {
        return a + b;
    }
    
    int add(int a, int b, int c) {
        return a + b + c;
    }
}
public class Main {
    public static void main(String[] args) {
        MathOperations obj = new MathOperations();
        System.out.println(obj.add(5, 10)); // Outputs: 15
        System.out.println(obj.add(5, 10, 20)); // Outputs: 35
    }
}
```

- 2.Runtime Polymorphism (Method Overriding)

- Occurs when a subclass provides a specific implementation of a method already defined in the parent class.

- The method to be executed is determined at runtime.

Example:
```
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        myAnimal.makeSound(); // Outputs: Dog barks
    }
}
```
## Advantages of Polymorphism

- Enhances code reusability and flexibility.

- Simplifies code maintenance and readability.

- Supports the principles of object-oriented programming (OOP).



