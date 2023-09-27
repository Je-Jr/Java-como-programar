import java.security.SecureRandom;

/**
 * Escreva instruções que exibirão um número aleatório de cada um dos seguintes conjuntos:
 * a) 2, 4, 6, 8, 10.
 * b) 3, 5, 7, 9, 11.
 * c) 6, 10, 14, 18, 22.
 */

public class NumeroAleatorio {
  public static int createRandomNumber() {
    SecureRandom randomNumber = new SecureRandom();
    int n = randomNumber.nextInt(100);
    return n;
    // SecureRandom randomNumber = new SecureRandom();
    // for (int i = 0; i < args.length; i++) {
    //   int n = 2 + 2 * randomNumber.nextInt(5);
    //   System.out.println(n);
    // }

    // SecureRandom randomNumber = new SecureRandom();
    // for (int i = 0; i < args.length; i++) {
    //   int n = 3 + 2 * randomNumber.nextInt(5);
    //   System.out.println(n);
    // }

    // SecureRandom randomNumber = new SecureRandom();
    // for (int i = 0; i < 10; i++) {
    //   int n = 6 + 4 * randomNumber.nextInt(5);
    //   System.out.println(n);
    // }
  }

}
