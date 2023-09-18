import java.security.SecureRandom;

public class SecurityRandom {
  public static void main(String[] args) {
    SecureRandom randomNumbers = new SecureRandom();
    int value = randomNumbers.nextInt(2);
    System.out.println(value);
  }
}
