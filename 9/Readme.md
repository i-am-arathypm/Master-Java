Final Keyword

In c++ , we use -> const

Final keyword can be used with 
1.Variable
2.Method
3.Class

1.Varible 
    final int a = 10; //const value assigned to a 
    a = 9; // not possible


2.Method
    When we make a method final, no one can override it.

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



3.Class
    Once you make the class final, you stop the inheritance. No one can extend it.

    final class Calc{
        .....
    }

    class AdvcCalc extends Calc{
        ....
    }

    //error