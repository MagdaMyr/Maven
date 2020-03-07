package fizzbuzz;

public class FizzBuzz {

    //Wydrukuj liczby od 1 do 100.
    //Jeśli liczba jest podzielna przez 3 wydrukuj Fizz.
    //Jeśli liczba jest podzielna przez 5 wydrukuj Buzz.
    //Jeśli liczba jest podzielna przez 3 oraz 5 wydrukuj FizzBuzz.
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
