package rent;

import java.math.BigDecimal;

public class Scooter implements Rentable{

    private static final BigDecimal PRICE_PER_HOUR = BigDecimal.valueOf(3);

    private String brand;

    public Scooter(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String generateDescription() {
        return "Hulajnoga marki: " + this.brand;
    }

    @Override
    public BigDecimal calculatePrice(int hours) {
        BigDecimal bigDecimalHours = BigDecimal.valueOf(hours);
        return bigDecimalHours.multiply(PRICE_PER_HOUR);
    }

}
