import java.security.SecureRandom;

public class LancamentoDado {
  public static void main(String[] args) {
    SecureRandom randomNumbers = new SecureRandom();

    for (int counter = 1; counter <= 20; counter++) {
      int value = 1 + randomNumbers.nextInt(6);
      System.out.printf("%d ", value);

      if (counter % 5 == 0) {
        System.out.println();
      }

    }
  }
}
