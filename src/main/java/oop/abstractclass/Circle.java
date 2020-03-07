package oop.abstractclass;

public class Circle extends Figure {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public double calculateCircuit() {
        return 2 * Math.PI * r;
    }
}
