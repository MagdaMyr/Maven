package oop.abstractclass;

public class Rectangle extends Figure{

    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double calculateArea() {
        return sideA * sideB;
    }

    public double calculateCircle() {
        return (sideA * 2) + (sideB * 2);
    }
}
