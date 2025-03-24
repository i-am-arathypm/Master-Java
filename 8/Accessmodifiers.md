# Access Modifiers 

## What are Access Modifiers?

Access modifiers in Java are keywords that determine the visibility and accessibility of classes, methods, and variables. They help in encapsulating data and maintaining security in an application.

## Types of Access Modifiers

  Java provides four types of access modifiers:

 1.Private (private)

- Accessible only within the same class.

- Used for encapsulation to hide implementation details.

Example:
```
class Example {
    private int data = 10;
    private void display() {
        System.out.println("Data: " + data);
    }
}
```
2. Default (Package-Private) (No Modifier)

- Accessible only within the same package.

- If no access modifier is specified, it is considered package-private.

Example:
```
class Example {
    void display() {
        System.out.println("Default access");
    }
}
```
3.Protected (protected)

- Accessible within the same package and by subclasses.

- Useful for inheritance.

Example:
```
class Parent {
    protected void show() {
        System.out.println("Protected method");
    }
}
```
4.Public (public)

- Accessible from anywhere in the application.

Example:
```
public class Example {
    public void display() {
        System.out.println("Public access");
    }
}

```
