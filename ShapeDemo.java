class Shape {
    void display() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    double radius = 3;

    void area() {
        System.out.println("Circle Area: " + (Math.PI * radius * radius));
    }
}

class Rectangle extends Shape {
    int length = 4, breadth = 5;

    void area() {
        System.out.println("Rectangle Area: " + (length * breadth));
    }
}

public class ShapeDemo {
    public static void main(String[] args) {

        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.display();
        c.area();

        r.display();
        r.area();
    }
}