package rent;

import java.math.BigDecimal;

public class Car implements Rentable{

    private static final BigDecimal PRICE_PER_HOUR = BigDecimal.TEN;

    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String generateDescription() {
        return "Samochod marki " + this.brand + " model " + this.model
                + " rocznik " + this.year;
    }

    @Override
    public BigDecimal calculatePrice(int hours) {
        //zamiana z int na BigDecimal
        BigDecimal bigDecimalHours = BigDecimal.valueOf(hours);
        //mnozenie
        return bigDecimalHours.multiply(PRICE_PER_HOUR);
    }

}
