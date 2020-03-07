package oop.inheritance;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("name", 0,
                "race");
        Cat cat = new Cat("Mruczek", 3, "Syjamski");
        Dog dog = new Dog("Reksio", 5, "Beagle",
                "trikolor");

        Animal dog2 = new Dog("Ciapek", 5, "Beagle",
                "trikolor");

        Animal[] animals = {animal, cat, dog, dog2};

        for(Animal an : animals) {
           an.voice();
        }
    }

}
