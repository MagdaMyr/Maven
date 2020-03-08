package rent;

public class RentService {

    private EmailService emailService;
    private SmsService smsService;
    private InvoiceService invoiceService;

    public RentService(EmailService emailService, SmsService smsService,
                       InvoiceService invoiceService) {
        this.emailService = emailService;
        this.smsService = smsService;
        this.invoiceService = invoiceService;
    }

    public void rent(Rentable rentable, int hours) {
        emailService.sendRentConfirmation(rentable);
        smsService.sendRentConfirmation(rentable);
        invoiceService.generateInvoice(rentable, hours);
    }

}
