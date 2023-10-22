import java.util.Scanner;

public class DividedByZeroNoExceptionHandling {
  public static int quotient(int numerator, int denominator) {
    return numerator / denominator;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Type the numerator: ");
    int numerator = input.nextInt();
    System.out.print("Type the denominator: ");
    int denominator = input.nextInt();

    int result = quotient(numerator, denominator);

    System.out.printf("%nResult: %d / %d = %d%n", numerator, denominator, result);
    input.close();
  }

}