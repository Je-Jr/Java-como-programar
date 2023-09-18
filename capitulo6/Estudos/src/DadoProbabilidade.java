import java.security.SecureRandom;

public class DadoProbabilidade {
  public static void main(String[] args) {
    SecureRandom randomNumbers = new SecureRandom();

    int freq1 = 0;
    int freq2 = 0;
    int freq3 = 0;
    int freq4 = 0;
    int freq5 = 0;
    int freq6 = 0;

    for (int counter = 1; counter <= 6000000; counter++) {
      int face = 1 + randomNumbers.nextInt(6);
      switch (face) {
        case 1:
          freq1++;
          break;
        case 2:
          freq2++;
          break;
        case 3:
          freq3++;
          break;
        case 4:
          freq4++;
          break;
        case 5:
          freq5++;
          break;
        case 6:
          freq6++;
          break;
      }
    }
    System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n",
    freq1, freq2, freq3, freq4,
    freq5, freq6);
  }
}
