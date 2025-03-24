# Dynamic Method Dispatch 

## What is Dynamic Method Dispatch?

Dynamic Method Dispatch, also known as Runtime Polymorphism, is a mechanism in Java where a call to an overridden method is resolved at runtime rather than at compile time. This enables Java to support method overriding, allowing a subclass to provide a specific implementation of a method already defined in its superclass.

## How Dynamic Method Dispatch Works

- A superclass reference variable can refer to a subclass object.

- When a method is called on the reference, Java determines at runtime which method implementation to execute (the one in the superclass or the subclass).

- This enables runtime polymorphism and makes Java more flexible and extensible.

Example of Dynamic Method Dispatch
```
// Superclass
class Parent {
    void show() {
        System.out.println("Parent class method");
    }
}

// Subclass
class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child class method");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Parent obj; // Reference of superclass
        
        obj = new Parent();
        obj.show(); // Outputs: Parent class method
        
        obj = new Child();
        obj.show(); // Outputs: Child class method (Dynamic Method Dispatch)
    }
}
```
``` Key Points to Remember```

- Only overridden methods are resolved using dynamic method dispatch. Variables are not affected.

- The method that gets executed depends on the object's runtime type, not the reference type.

- Useful in designing flexible and scalable applications using polymorphism.
