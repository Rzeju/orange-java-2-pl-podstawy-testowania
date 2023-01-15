package pl.sda.oop;

public class Triangle {

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calculatePerimeter() {
        return a + b + c;
    }

//    public double calculateArea() {
//        return 0;
//    }
}
