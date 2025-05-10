abstract class Shape {
    double dim1, dim2;

    Shape(double d1, double d2) {  // Constructor corrected (was outside proper scope)
        dim1 = d1;
        dim2 = d2;
    }

    abstract double area();
}

class Rectangle extends Shape {  // Corrected class name capitalization for convention
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        return dim1 * dim2;
    }
}

class Triangle extends Shape {  // Corrected class name capitalization for convention
    Triangle(double h, double e) {
        super(e, h);
    }

    double area() {
        return 0.5 * dim1 * dim2;
    }
}

class Abstraction { 
    public static void main(String args[]) {
        Rectangle r = new Rectangle(3, 2);
        Triangle t = new Triangle(4, 5);
        Shape s1;

        s1 = r;
        System.out.println("Rectangle area = " + s1.area());

        s1 = t;
        System.out.println("Triangle area = " + s1.area());
    }
}
