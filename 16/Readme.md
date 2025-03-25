# Java Threads

## What is a Thread?
A *Java process* is a program in execution, and it consists of multiple *threads*. A Java **thread** is a lightweight process that shares process resources. Every Java application has at least one thread, known as the *main thread*.

## Thread Lifecycle
1. **New**: The thread is created but not started yet (`new Thread()`).
2. **Runnable**: The thread is ready to run and waiting for CPU time (`start()` method called).
3. **Blocked**: The thread is waiting for access to a locked resource.
4. **Waiting**: The thread is waiting indefinitely until notified.
5. **Timed Waiting**: The thread is waiting for a specified time (`sleep()`, `join()`, etc.).
6. **Terminated**: The thread has finished execution.

## Example:
```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        System.out.println(t1.getState()); // NEW
        t1.start();
        System.out.println(t1.getState()); // RUNNABLE
    }
}
```

---

# Java Collections

## What is a Collection?
*Collections in Java* is a framework that provides an architecture to store and manipulate a group of objects.

## Java Collection Framework (JCF)
The `java.util` package contains:
1. **Interfaces** (`Collection`, `Set`, `List`, `Queue`, `Map`, etc.)
2. **Implementation classes** (`ArrayList`, `LinkedList`, `HashSet`, `TreeSet`, `HashMap`, `TreeMap`, etc.)
3. **Algorithms** (Sorting, Searching, etc.)

## Advantages of Collection Framework
- **Consistent API**: Unified interface for different data structures.
- **Reduces programming effort**: Ready-made data structures.
- **Increases program speed & quality**: Optimized implementations of data structures and algorithms.

## Core Interfaces in Collections

### 1. List (Ordered Collection, Allows Duplicates)
- Implements: `ArrayList`, `LinkedList`
- Index-based access.

#### Example:
```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple"); // Allows duplicates
        
        System.out.println(list); // [Apple, Banana, Apple]
        System.out.println(list.get(1)); // Banana
    }
}
```

### 2. Set (No Duplicates, Unordered)
- Implements: `HashSet`, `TreeSet`, `LinkedHashSet`

#### Example:
```java
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); // Duplicate will not be added

        System.out.println(set); // [Apple, Banana] (Order is not guaranteed)
    }
}
```

### 3. Queue (FIFO - First In First Out)
- Implements: `PriorityQueue`

### 4. Deque (Double-ended Queue - Allows Insertion/Removal from Both Ends)
- Implements: `ArrayDeque`

### 5. Map (Key-Value Pair, Unique Keys)
- Implements: `HashMap`, `TreeMap`, `LinkedHashMap`

#### Example:
```java
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(1, "Updated One"); // Key 1 is updated

        System.out.println(map); // {1=Updated One, 2=Two}
        System.out.println(map.get(1)); // Updated One
    }
}
```

## Summary
- **Thread Lifecycle**: NEW, RUNNABLE, BLOCKED, WAITING, TIMED_WAITING, TERMINATED.
- **Collection Framework**: Provides data structures like List, Set, Queue, Map.
- **List**: Ordered, allows duplicates, index-based.
- **Set**: Unordered, no duplicates
- **Queue & Deque**: FIFO and double-ended operations.
- **Map**: Key-value pairs, unique keys, fast lookup.
