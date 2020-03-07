package oop.powtorka;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("Opel", "Astra");
        Car car2 = new Car("Nissan", "Micra");
        Car car3 = new Car("Tesla", "Model 3");

        Car[] array = new Car[3];

        array[0] = car1;
        array[1] = car2;
        array[2] = car3;

        for(Car car : array) {
            System.out.println(car.description());
        }

        Meeting meeting = new Meeting("Spotkanie informacyjne", "NOwogrodzka 56");

        System.out.println(meeting.description());

        meeting.delayMeeting(3);

        System.out.println(meeting.description());
    }

}
