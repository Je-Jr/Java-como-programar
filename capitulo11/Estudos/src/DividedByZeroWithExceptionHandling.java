import java.util.InputMismatchException;
import java.util.Scanner;

public class DividedByZeroWithExceptionHandling {
  public static int quotient(int numerator, int denominator) throws ArithmeticException {
    return numerator / denominator;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    boolean continueLoop = true;

    do {
      try {
        System.out.print("Type the numerator: ");
        int numerator = input.nextInt();
        System.out.print("Type the denominator: ");
        int denominator = input.nextInt();

        int result = quotient(numerator, denominator);

        System.out.printf("%nResult: %d / %d = %d%n", numerator, denominator, result);
        continueLoop = false;

      } catch (InputMismatchException inputMismatchException) {
        System.err.printf("%nException: %s%n", inputMismatchException);
        input.nextLine();
        System.out.printf("You must enter integers. Please try again%n%n");
      } catch (ArithmeticException arithmeticException) {
        System.err.printf("%nException: %s%n", arithmeticException);
        input.nextLine();
        System.out.printf("Zero is an invalid denominator. Please try again%n%n");
      }
    } while (continueLoop);

    input.close();
  }

}