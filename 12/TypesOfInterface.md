# Types of Interfaces in Java

In Java, an **interface** defines a contract that a class must follow. Interfaces are used to achieve **abstraction** and **multiple inheritance**. There are three main types of interfaces in Java:

---

## 1. Normal Interface
A **normal interface** contains one or more **abstract methods** that must be implemented by any class that chooses to implement the interface. These interfaces help define a common behavior for multiple unrelated classes.

### **Key Characteristics:**
- Before Java 8, interfaces could contain only **abstract methods** and **constants**.
- From Java 8 onwards, interfaces can also have **default** and **static** methods.
- A class implementing a normal interface must **override all its abstract methods**.

### **Example:**
```java
// Defining an interface
interface Animal {
    void makeSound(); // Abstract method (must be implemented)
}

// Implementing the interface
class Dog implements Animal {
    public void makeSound() {
        System.out.println("Dog barks: Woof! Woof!");
    }
}

public class NormalInterfaceExample {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound(); // Output: Dog barks: Woof! Woof!
    }
}
```

### **Real-World Usage:**
- **`List`, `Set`, and `Map`** interfaces in Java Collections Framework.
- **Database connectivity (`Connection`, `Statement`)** in JDBC.
- **GUI event handling (`ActionListener`)** in Java Swing.

---

## 2. Functional Interface
A **functional interface** is an interface that contains **exactly one abstract method**. It enables functional programming using **lambda expressions** and **method references**.

### **Key Characteristics:**
- It contains only **one** abstract method.
- Can have **multiple default and static methods**.
- Marked with `@FunctionalInterface` annotation to prevent adding multiple abstract methods.

### **Example:**
```java
@FunctionalInterface
interface Calculator {
    int operate(int a, int b); // Only one abstract method
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        Calculator addition = (a, b) -> a + b; // Lambda expression
        System.out.println("Sum: " + addition.operate(5, 3)); // Output: Sum: 8
    }
}
```

### **Common Functional Interfaces in Java:**
- `Runnable` (for multithreading)
- `Callable<T>` (for multithreading with return values)
- `Comparator<T>` (for sorting collections)
- `Predicate<T>` (for filtering data)
- `Function<T, R>` (for transforming data)

### **Real-World Usage:**
- **Lambda expressions** in stream processing (`map`, `filter` in Java Streams API).
- **Multithreading (`Runnable`)** to define tasks for threads.

---

## 3. Marker Interface
A **marker interface** is an interface that does not have any methods or fields. It is used to **tag a class** with a specific property so that Java’s runtime or frameworks can provide special behavior.

### **Key Characteristics:**
- Has **no methods or fields**.
- Used for **tagging classes** to provide special behavior.
- Used by **JVM and frameworks** to identify objects with specific capabilities.

### **Example: `Serializable` (Used for object serialization)**
```java
import java.io.*;

class Student implements Serializable {
    private static final long serialVersionUID = 1L; // Version control
    String name;
    int age;
    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

### **Common Marker Interfaces in Java:**
- `Serializable` (for object serialization - saving objects to files or databases)
- `Cloneable` (for object cloning using `clone()` method)
- `Remote` (for remote method invocation - RMI)

### **Real-World Usage:**
- **Serialization (`Serializable`)** for storing objects in files/databases.
- **Cloning (`Cloneable`)** to duplicate objects efficiently.
- **RMI (`Remote`)** for distributed computing in Java.

---

## Conclusion
| **Interface Type** | **Characteristics** | **Example** |
|------------------|----------------|---------|
| **Normal Interface** | Contains multiple abstract methods | `Runnable`, `Comparator` |
| **Functional Interface** | Has only **one** abstract method | `Predicate<T>`, `Function<T, R>` |
| **Marker Interface** | Has **no** methods, used for tagging | `Serializable`, `Cloneable` |

Java interfaces provide a **structured** and **flexible** way to define contracts, support **abstraction**, and enable **multiple inheritance**. Using the right type of interface improves code **modularity, readability, and maintainability**.

