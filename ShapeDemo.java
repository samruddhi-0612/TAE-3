abstract class Shape {

    // Abstract method
    abstract double calculate_area();

    // Concrete method
    void display_info() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double calculate_area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    double calculate_area() {
        return length * breadth;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {

        // Shape s = new Shape(); ❌ ERROR (cannot instantiate abstract class)

        Shape c = new Circle(3);
        Shape r = new Rectangle(4, 5);

        c.display_info();
        System.out.println("Circle Area: " + c.calculate_area());

        r.display_info();
        System.out.println("Rectangle Area: " + r.calculate_area());
    }
}