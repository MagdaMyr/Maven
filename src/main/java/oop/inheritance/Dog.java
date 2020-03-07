package oop.inheritance;

public class Dog extends Animal {

    private String color;

    public Dog(String name, int age, String race,
               String color) {
        super(name, age, race);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return super.toString() + " color : " + this. color;
    }

    @Override
    public void voice() {
        System.out.println("Hau");
    }
}
