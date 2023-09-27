public class Exponenciacao {
  public static void main(String[] args) {
    int calc = integerPow(2, 5);
    System.out.println(calc);
  }

  public static int integerPow(int base, int exponent) {
    int count = 0;
    int result = 1;
    while (count < exponent) {
      result *= base;
      count++;
    }
    return result;
  }
}

