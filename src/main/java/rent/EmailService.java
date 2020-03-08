package rent;

public class EmailService {

    public void sendRentConfirmation(Rentable rentable) {
        System.out.println("email: Wypozyczono " + rentable.generateDescription());
    }

}
