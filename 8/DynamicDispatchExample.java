// Parent class
class Shape {
    // Method to be overridden
    void draw() {
        System.out.println("Drawing a shape");
    }
}

// Child class 1: Circle
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Child class 2: Rectangle
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

// Main class to test dynamic dispatch
public class DynamicDispatchExample {
    public static void main(String[] args) {
        // Upcasting: Parent reference pointing to Child objects
        Shape myShape;

        // Assign Circle object to Shape reference
        myShape = new Circle();
        myShape.draw();  // Output: Drawing a Circle

        // Assign Rectangle object to Shape reference
        myShape = new Rectangle();
        myShape.draw();  // Output: Drawing a Rectangle
    }
}
