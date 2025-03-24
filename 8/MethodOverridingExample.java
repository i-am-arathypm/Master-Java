// Parent class
class Animal {
    // Method to be overridden
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {
    // Overriding the makeSound method
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Main class to run the program
public class MethodOverridingExample {
    public static void main(String[] args) {
        // Creating an object of the parent class
        Animal myAnimal = new Animal();
        myAnimal.makeSound(); // Output: Animal makes a sound

        // Creating an object of the child class
        Dog myDog = new Dog();
        myDog.makeSound(); // Output: Dog barks

        // Demonstrating method overriding using parent reference
        Animal anotherDog = new Dog();
        anotherDog.makeSound(); // Output: Dog barks (Method Overriding)
    }
}
