## Threads In Java

### Threads
- A Thread is a light weight procces in java used for multitasking.
- Java Threads are managed by JVM (Java Virtual Machines).
- Threads allows program to run multiple tasks simultaneously.
- Threads are created by extending Thread class.

### Example of creating a thread

```java


class A extends Thread {
    public void run() 
    {
        System.out.println("New Thread is started.."); 
        
    }
}

class Main {
    public static void main(String args[]){
        A t1 = new A();
        t1.start();
        System.out.println("Primary Thread.");

        
    }
}


```

- run() method is used to run the thread in main 
- start() is used to create a new thread


## Multiple Threads

Instead of single thread, multiple threads run simultaneously to improve performance and efficiency.
Multi-Thread allows multiple part of the program to run at the same time.

## Example of multithread

```java
class A extends Thread{
   public void run()
   {
       for(int i=0;i<=5;i++){
           System.out.println("Hi");
       }
   }
    
}

class B extends Thread{
    
    public void run()
   {
       for(int i=0;i<=5;i++){
           
           System.out.println("Hello");
       }
   }
}

class Main{
    public static void main(String args[]){
        A t1 = new A();
        B t2 = new B();
        
        t1.start();
        t2.start();

    }
}

```

## Thread Priority and Sleep

### Priority in Thread

- Thread priority determines the order in which threads are executed.
- Priority range:
    - `Thread.MIN_PRIORITY (1)` → Lowest priority
    - `Thread.NORM_PRIORITY (5)` → Default priority
    - `Thread.MAX_PRIORITY (10)` → Highest priority
### Sleep in thread
- sleep() method pauses the execution of a thread for a specific period of time.
- Thread.sleep(1000) pause execution for 1 second.


## Example 

``` java
class A extends Thread{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Thread1: Hi");
            try{
                Thread.sleep(1000);    
            }catch(InterruptedException e){}
        }
    }
}

class B extends Thread{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Thread 2: Hello");
            
        }
    }
}

class Main{
    public static void main(String args[])
    {
        A t1 = new A();
        B t2 = new B();
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        try{
            t1.join();
        }catch(InterruptedException e){}
        
        t2.start();
    }
}

```

# Runnable vs Thread

## Thread 

- Thread class directly represent a thread.
- Can be created by extending Thread class.
- Limitaion: Since java does not support Multi Inheritance , we cannot extend another class if you extend Thread.


## Runnable 
- Runnable is an interface so class can implement Runnalbe and still extend another class.
- A runnable object must be passed to a thread object

## Example 

```java
class Base{
    public void show(){
        System.out.println("From Base class..");
    }
}

class A extends Base implements Runnable{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Thread1 using runnable: Hi");
            try{
                Thread.sleep(1000);    
            }catch(InterruptedException e){}
        }
        show();
    }
}

class Main{
    public static void main(String args[])
    {
        A obj = new A();
        Thread t1 = new Thread(obj);
        t1.start();
    }
}

```

# Race Condition 

A race condition occurs in a multi-threaded program when multiple threads try to access and modify shared resources simultaneously, leading to unpredictable results. 
To fix this make the threads Synchronus executin by using synchronize

## Example 

```java
class Counter {
    int count = 0; // Shared variable

     synchronized public void increment() { // synchronized method to prevent race conditon
        count++; // Multiple threads access this
    }
}

class A extends Thread {
    Counter c;

    A(Counter c) {
        this.c = c;
    }

    public void run() {
        for (int i = 1; i <= 1000; i++) {
            c.increment();
        }
    }
}

class B extends Thread {
    Counter c;

    B(Counter c) {
        this.c = c;
    }

    public void run() {
        for (int i = 1; i <= 1000; i++) {
            c.increment();
        }
    }
}

class Main {
    public static void main(String args[])throws InterruptedException {
        Counter c = new Counter(); // Shared Counter object

        A t1 = new A(c);
        B t2 = new B(c);

        t1.start(); 
        t2.start();

        // Wait for both threads to finish
        t1.join(); // wait for thread 1 to finish.
        t2.join(); // wait for thread 2 to finish.
        

        System.out.println("Final Count: " + c.count);
    }
}
```



