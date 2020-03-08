package rent;

import java.math.BigDecimal;

public class Trailer implements Rentable {

    private int capacity;

    public Trailer(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String generateDescription() {
        return "przyczepka o poj. " + this.capacity;
    }

    @Override
    public BigDecimal calculatePrice(int hours) {
        return BigDecimal.valueOf(hours);
    }
}
