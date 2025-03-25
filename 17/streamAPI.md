# Stream In Java

- Introduced in Java 8, Stream API is used to process collections of objects. A stream in Java is a sequence of objects that supports various methods that can be pipelined to produce the desired result.

1. Stream API is a way to express and process collections of objects.
2. Enable us to perform operations like filtering, mapping, reducing, and sorting.


How to Create Java Stream?

Java Stream Creation is one of the most basic steps before considering the functionalities of the Java Stream. Below is the syntax given for declaring Java Stream.

```java
Stream<T> stream;
```

Here T is either a class, object, or data type depending upon the declaration.

## Java Stream Features

The features of Java stream are mentioned below:

- A stream is not a data structure instead it takes input from the Collections, Arrays or I/O channels.
- Streams don’t change the original data structure, they only provide the result as per the pipelined methods.
- Each intermediate operation is lazily executed and returns a stream as a result, hence various intermediate operations can be pipelined. Terminal operations mark the end of the stream and return the result.

## Different Operations On Streams

There are two types of Operations in Streams:

1. Intermediate Operations
2. Terminal Operations
3. Intermediate Operations

   

