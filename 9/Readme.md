# Final Keyword

In c++ , we use -> const

Final keyword can be used with 
1.Variable
2.Method
3.Class

## 1.Varible 
   ```cpp
    final int a = 10; //const value assigned to a 
    a = 9; // not possible
```

## 2.Method
When we make a method final, no one can override it.
```cpp
    class Calc{
        public final void show(){
            System.out.println("By Arathypm");
        }
    }

    class A extends Calc{
        public void show() {
            System.out.println("By Meera");
        }
    }

    public class Main {
    public static void main(String[] args) {
        A obj = new A();
        obj.show(); 
    }
    }
```


``` cpp
    class Calc{
        public void show(){
            System.out.println("By Arathypm");
        }
    }

    class A extends Calc{
        public void show() {
            System.out.println("By Meera");
        }
    }

    public class Main {
    public static void main(String[] args) {
        A obj = new A();
        obj.show(); //output : By Meera
    }
    }
```


## 3.Class
    Once you make the class final, you stop the inheritance. No one can extend it.

```cpp
    final class Calc{
        .....
    }

    class AdvcCalc extends Calc{
        ....
    }

    //error
```
# Typecasting

```cpp
double d = 4.5;
int i = int (d);  // output : 4
```

# Upcasting and downcasting

## Upcasting
Upcasting always happens automtically.
* we can only access methods in parent class.
* With upcasting, we can create one method which operaters on many subclasses.
## Downcasting
* We should do it explicitly
* it may throw exceptions
* always use keyword 'instanceof' to avoid exception.

```cpp
class A{
    public void show1(){
    ......
    }
}

class B extends A{
    public void show2(){
    ......
    }
}

public class Demo{
    public static void main(String[] args){
        A obj = new b()  // UPCASTING
        obj.show1();
        B obj = (B) obj;  //    DOWNCSTING
        obj1.show2();
    } 
}

```

```cpp
class Animal{
 public void makeNoise(){
    System.out.println("I am animal");
    } 

class Dog extends Animal{
    public void makeNoise(){
        System.out.println("Boww Boww!!");
    }

    public void growl(){
        System.out.println("Grrrrrr....");
    }

public static void main(String[] args)
{
    Animal myanimal = new Dog();
    myanimal.growl();
}
}
```
