# Method Overriding 

## What is Method Overriding?

Method overriding in Java occurs when a subclass provides a specific implementation of a method that is already defined in its superclass. The overriding method in the subclass must have the same name, return type, and parameters as the method in the parent class.

## Rules for Method Overriding

- The method in the child class must have the same name and parameters as in the parent class.

- The return type must be the same or a subclass (covariant return type) of the overridden method.

- The access modifier cannot be more restrictive than the overridden method.

- The overridden method cannot be static, private, or final.

- The @Override annotation is optional but recommended for readability and error detection.

``` Example of Method Overriding```
```
// Parent class
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Main class to test method overriding
public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.makeSound(); // Outputs: Animal makes a sound

        Animal myDog = new Dog();
        myDog.makeSound(); // Outputs: Dog barks
    }
}
```
