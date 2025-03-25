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
* We should downcast a variable manually.
* it may throw exceptions
* always use keyword 'instanceof' to avoid exception.

```cpp
class A{
    public void show1(){
    
    }
}

class B extends A{
    public void show2(){
  
    }
}

public class Demo{
    public static void main(String[] args){
        A obj = new B()  // UPCASTING
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
    myanimal.growl(); // Error  ❌
   myanimal.makeNoise(); ✔️ 
}
}
```

* instanceof - returns a boolean value.

  ```cpp
  class Parent{
  }

  class Child extends Parent{
      void showChild(){

      }
  }

  public static void main(String[] args){
      Parent obj1 = new Child();

      if (obj1 instanceof Child());{
         Child obj2 = (Child) obj1;
         obj2.showChild()
      }
  }
  

# Wrapper class
* For every primitive type , we have a class for it.
int -> Integer
char -> Character
double -> Double

```cpp
int num = 7;
Integer num1 = 7; // boxing
Integer num1 = num; // auto-boxing
```

```cpp
int num2 = num1 // auto-unboxing
System.out.println(num2);
```

```cpp
string str = "12";
int num3 = Integer.parseInt(str);
System.out.println(num3 * 2);
```

