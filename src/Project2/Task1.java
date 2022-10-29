package Project2;

public class Task1 {
    //Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimeter.
    // Create 2 classes Circle & Square that implements functionality defined in the Shape Interface. Test your code.
    public static void main(String[] args) {
        Circle circle = new Circle(2.2);
        circle.calculateArea();
        circle.calculatePerimeter();

        Square square = new Square(5.3);
        square.calculateArea();
        square.calculatePerimeter();
    }
}

interface Shape {
    void calculateArea();

    void calculatePerimeter();
}

class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        double area = (radius * radius) * Math.PI;
        System.out.println("The area of circle is " + area);
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("The perimeter of circle is " + perimeter);
    }
}

class Square implements Shape {
    double length;

    Square(double length) {
        this.length = length;
    }

    @Override
    public void calculateArea() {
        double area = length * length;
        System.out.println("The area of square is " + area);
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = length * 4;
        System.out.println("The perimeter of square is " + perimeter);
    }
}
