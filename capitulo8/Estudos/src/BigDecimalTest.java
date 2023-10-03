import java.math.BigDecimal;

public class BigDecimalTest {
  public static void main(String[] args) {
    BigDecimal c12 = BigDecimal.valueOf(12.011);
    BigDecimal o16 = BigDecimal.valueOf(15.999);

    BigDecimal co2 = c12.add(o16.multiply(BigDecimal.valueOf(2)));

    System.out.println(co2);
  }
}
