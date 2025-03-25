# README - Lambda Expressions in Java

## Overview

This project demonstrates the use of **Lambda Expressions** in Java, providing a concise way to implement functional interfaces without requiring anonymous classes.

## Features

- Simplified syntax for functional interface implementation.
- Lambda expressions with and without parameters.
- Multiple statement lambda expressions.
- Usage of Java's built-in functional interfaces like `Consumer`, `Supplier`, `Predicate`, and `Function`.
- Lambda expressions with return values, including multiple return values.

## Requirements

- Java 8 or later.
- A Java IDE (Eclipse, IntelliJ, VS Code) or a terminal with `javac`.

## Installation & Usage

1. Clone the repository:
   ```sh
   git clone https://github.com/your-repo-name.git
   cd your-repo-name
   ```
2. Compile the Java files:
   ```sh
   javac Main.java
   ```
3. Run the program:
   ```sh
   java Main
   ```

## Code Examples

### Basic Lambda Expression

```java
@FunctionalInterface
interface A {
    void show();
}

public class Main {
    public static void main(String[] args) {
        A obj = () -> System.out.println("Hello from Lambda");
        obj.show();
    }
}
```

**Output:**

```
Hello from Lambda
```

### Lambda with Parameters

```java
@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        MathOperation add = (a, b) -> a + b;
        MathOperation multiply = (a, b) -> a * b;

        System.out.println("Sum: " + add.operate(5, 3));
        System.out.println("Product: " + multiply.operate(5, 3));
    }
}
```

**Output:**

```
Sum: 8
Product: 15
```

### Lambda with Multiple Statements

```java
@FunctionalInterface
interface Message {
    void printMessage(String msg);
}

public class Main {
    public static void main(String[] args) {
        Message message = (msg) -> {
            System.out.println("Message received:");
            System.out.println(msg);
            System.out.println("Message processing complete.");
        };

        message.printMessage("Hello, Lambda with multiple statements!");
    }
}
```

**Output:**

```
Message received:
Hello, Lambda with multiple statements!
Message processing complete.
```

### Lambda with Return Value

```java
@FunctionalInterface
interface Square {
    int calculate(int x);
}

public class Main {
    public static void main(String[] args) {
        Square square = (x) -> x * x;
        System.out.println("Square of 5: " + square.calculate(5));
    }
}
```

**Output:**

```
Square of 5: 25
```

### Lambda Returning Multiple Values

Using a wrapper class:

```java
class Result {
    int sum;
    int product;

    Result(int sum, int product) {
        this.sum = sum;
        this.product = product;
    }
}

@FunctionalInterface
interface MathOperations {
    Result compute(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        MathOperations operations = (a, b) -> new Result(a + b, a * b);
        Result result = operations.compute(4, 5);
        System.out.println("Sum: " + result.sum + ", Product: " + result.product);
    }
}
```

**Output:**

```
Sum: 9, Product: 20
```

## Using Built-in Functional Interfaces

#### 1. Consumer (T -> void)

Used when you want to perform an operation on an input without returning anything.

```java
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
        printUpperCase.accept("hello lambda!");
    }
}
```

**Output:**

```
HELLO LAMBDA!
```

#### 2. Supplier (()-> T)

Used when you need to supply a value without taking any input.

```java
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println("Random value: " + randomValue.get());
    }
}
```

#### 3. Predicate (T -> boolean)

Used when you want to test a condition and return `true` or `false`.

```java
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4));
        System.out.println("Is 7 even? " + isEven.test(7));
    }
}
```

**Output:**

```
Is 4 even? true
Is 7 even? false
```

#### 4. Function (T -> R)

Used when you take an input (`T`) and return a result (`R`).

```java
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, Integer> lengthFunction = str -> str.length();
        System.out.println("Length of 'Lambda': " + lengthFunction.apply("Lambda"));
    }
}
```

**Output:**

```
Length of 'Lambda': 6
```

## Contributing

Feel free to submit issues or pull requests for improvements.

## License

This project is licensed under the MIT License.

