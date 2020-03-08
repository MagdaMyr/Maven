package rent;

public class Main {

    public static void main(String[] args) {
        EmailService emailService = new EmailService();
        SmsService smsService = new SmsService();
        InvoiceService invoiceService = new InvoiceService();

        RentService rentService = new RentService(emailService, smsService,
                invoiceService);

        Car car = new Car("Toyota", "Yaris", 2010);
        rentService.rent(car, 10);

        Scooter scooter = new Scooter("Xiaomi");
        rentService.rent(scooter, 10);

        Trailer trailer = new Trailer(100);
        rentService.rent(trailer, 10);
    }

}
