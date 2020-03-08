package rent;

import java.math.BigDecimal;

public class InvoiceService {

    public void generateInvoice(Rentable rentable, int hours) {
        BigDecimal price = rentable.calculatePrice(hours);
        System.out.println("Generowanie faktury... cena: " + price);
    }

}
