package oop.abstractclass;

public class Triangle extends Figure {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculateArea() {
        double numerator = (a + b + c) * (a + b - c) * (a - b + c) * (-a + b + c);
        return Math.sqrt(numerator) / 4;
    }

    @Override
    public double calculateCircuit() {
        return a + b + c;
    }
}
