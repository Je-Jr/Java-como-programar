import java.security.SecureRandom;

public class ArraysContadores {
  public static void main(String[] args) {
    SecureRandom randomNumber = new SecureRandom();
    int[] frequencia = new int[7];
    for(int roll = 1; roll < 6000000; roll++) {
      ++frequencia[1 + randomNumber.nextInt(6)];
    }

    System.out.printf("%4s %10s%n", "face", "frequencia");
    for(int face = 1; face < frequencia.length; face++) {
      System.out.printf("%4d %10d%n", face, frequencia[face]);
    }
  }
}
