package rent;

import java.math.BigDecimal;

public interface Rentable {
    String generateDescription();
    BigDecimal calculatePrice(int hours);
}
