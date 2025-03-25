# Java Annotations Guide

## Introduction

Annotations in Java are metadata that provide additional information to the compiler and runtime environment. They do not affect the execution of the program directly but help in tasks like compilation checks, runtime processing, and documentation.

## Built-in Annotations

### 1. `@Override`

Ensures that a method is overriding a method from the superclass.

```java
class Parent {
    void show() {
        System.out.println("This is the parent class method.");
    }
}

class Child extends Parent {
    @Override // Ensures this method overrides the parent method
    void show() {
        System.out.println("This is the child class method.");
    }
}

public class OverrideExample {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show(); // Output: This is the child class method.
    }
}
```

### 2. `@Deprecated`

Marks a method as deprecated, warning users that it should not be used.

```java
class Example {
    @Deprecated // Marks this method as deprecated
    void oldMethod() {
        System.out.println("This method is deprecated and should not be used.");
    }
}

public class DeprecatedExample {
    public static void main(String[] args) {
        Example obj = new Example();
        obj.oldMethod(); // Generates a warning but still executes
    }
}
```

### 3. `@FunctionalInterface`

Ensures an interface has only one abstract method, which is required for functional programming.

```java
@FunctionalInterface
interface MyFunctionalInterface {
    void display(); // Single abstract method
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        // Using Lambda Expression to define the method
        MyFunctionalInterface obj = () -> System.out.println("Hello from Functional Interface!");
        obj.display(); // Output: Hello from Functional Interface!
    }
}
```

### 4. `@SafeVarargs`

Suppresses warnings related to using varargs in methods.

```java
class Utility {
    @SafeVarargs
    static <T> void printElements(T... elements) {
        for (T element : elements) {
            System.out.println(element);
        }
    }
}

public class SafeVarargsExample {
    public static void main(String[] args) {
        Utility.printElements("Java", "Annotations", "Example");
    }
}
```

### 5. `@Native`

Indicates that a constant is intended for use in native code.

```java
import java.lang.annotation.Native;

class Constants {
    @Native
    public static final int SUCCESS = 0;
    @Native
    public static final int ERROR = 1;
}

public class NativeAnnotationExample {
    public static void main(String[] args) {
        System.out.println("Success Code: " + Constants.SUCCESS);
        System.out.println("Error Code: " + Constants.ERROR);
    }
}
```

### 6. `@SuppressWarnings`

Suppresses compiler warnings.

```java
class WarningExample {
    @SuppressWarnings("unchecked") // Suppresses unchecked warnings
    void uncheckedMethod() {
        java.util.List list = new java.util.ArrayList();
        list.add("Unchecked Warning Suppressed");
    }
}
```

## Custom Annotations

Custom annotations allow developers to create their own metadata for specific purposes.

### Defining a Custom Annotation

```java
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME) // Available at runtime
@Target(ElementType.METHOD) // Can be applied to methods only
@interface MyCustomAnnotation {
    String value() default "Default Message";
    int version() default 1;
}
```

### Using a Custom Annotation

```java
class MyClass {
    @MyCustomAnnotation(value = "Hello Annotation", version = 2)
    public void myMethod() {
        System.out.println("Method with custom annotation");
    }
}
```

### Accessing a Custom Annotation via Reflection

```java
public class CustomAnnotationExample {
    public static void main(String[] args) throws Exception {
        MyClass obj = new MyClass();
        obj.myMethod();

        MyCustomAnnotation annotation = obj.getClass()
                .getMethod("myMethod")
                .getAnnotation(MyCustomAnnotation.class);

        System.out.println("Value: " + annotation.value());
        System.out.println("Version: " + annotation.version());
    }
}
```

### Expected Output
```
Method with custom annotation
Value: Hello Annotation
Version: 2
```

## Meta-Annotations

Meta-annotations are used to define annotations and specify their behavior.

### 1. `@Retention`

Defines how long an annotation is retained (SOURCE, CLASS, or RUNTIME).

```java
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME) // Makes annotation available at runtime
@interface MyAnnotation {}
```

### 2. `@Target`

Defines where the annotation can be applied (e.g., method, field, class).

```java
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) // Specifies annotation is for methods only
@interface MyMethodAnnotation {}
```

### 3. `@Documented`

Marks an annotation to be included in Javadoc.

```java
import java.lang.annotation.Documented;

@Documented // Ensures annotation appears in Javadoc
@interface MyDocumentedAnnotation {}
```

### 4. `@Inherited`

Allows an annotation to be inherited by subclasses.

```java
import java.lang.annotation.Inherited;

@Inherited // Allows annotation inheritance
@interface MyInheritedAnnotation {}

@MyInheritedAnnotation
class ParentClass {}

class ChildClass extends ParentClass {} // Inherits the annotation
```

### 5. `@Repeatable`

Enables an annotation to be applied multiple times to the same element.

```java
import java.lang.annotation.Repeatable;

@Repeatable(MyAnnotations.class)
@interface MyAnnotation {
    String value();
}

@interface MyAnnotations {
    MyAnnotation[] value();
}

@MyAnnotation("Annotation 1")
@MyAnnotation("Annotation 2")
class RepeatableExample {}
```

## Conclusion

Annotations in Java are powerful tools for adding metadata to code. They enhance code readability, reduce boilerplate, and enable various compile-time and runtime processing mechanisms. By using annotations wisely, developers can improve code efficiency and maintainability.

