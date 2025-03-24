 #  Packages

 ## What is a Package in Java?

A package in Java is a way to organize related classes and interfaces into a single unit. It helps in preventing class name conflicts and makes code more manageable.

## Types of Packages in Java

 ``` 1. Built-in Packages: These are pre-defined in Java, such as java.util, java.io, and java.lang.```

 ``` 2.User-defined Packages: Created by developers to structure their own code efficiently.```

## Creating a Package

- To create a package in Java, use the package keyword at the beginning of your Java file:
```
package mypackage;

public class MyClass {
    public void display() {
        System.out.println("Hello from MyClass");
    }
}
```

## Using a Package

- To use a class from a package, you need to import it into your Java program:
```
import mypackage.MyClass;

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.display();
    }
}
```
- Alternatively, you can use the fully qualified name without importing:
```
public class Main {
    public static void main(String[] args) {
        mypackage.MyClass obj = new mypackage.MyClass();
        obj.display();
    }
}
```
## Advantages of Packages

- Avoids Name Conflicts: Allows the use of the same class name in different packages.

- Code Reusability: Classes can be reused across multiple projects.

- Better Organization: Makes it easier to manage large codebases.



