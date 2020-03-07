package oop.composition;

public class Main {

    public static void main(String[] args) {
        Processor processor = new Processor("I7");
        GraphicCard graphicCard = new GraphicCard("RTX2070");
        PowerSuply powerSuply = new PowerSuply("Corsair 500W");

        Computer computer = new Computer(processor, graphicCard,
                powerSuply);

        System.out.println(computer);

        Computer comp = ComputerFactory.createComputer("I5",
                "GTX660", "450W");

        System.out.println(comp);
    }

}
