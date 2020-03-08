package rent;

public class SmsService {

    public void sendRentConfirmation(Rentable rentable) {
        System.out.println("sms: Wypozyczono " + rentable.generateDescription());
    }

}
