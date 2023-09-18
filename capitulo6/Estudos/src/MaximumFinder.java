import java.util.Scanner;

public class MaximumFinder {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    boolean flag = true;
    double result = 0;
    int option;

    while (flag) {
      System.out.printf(
          "Choose a method below:%n" +
              "1 - maximum%n" +
              "2 - minumum%n" +
              "0 - exit%n"

      );
      option = input.nextInt();
      if (option > 0 && option < 3) {
        System.out.print("Enter three floating-point numbers separated by spaces: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        if (option == 1) {
          result = maximum(number1, number2, number3);
        }
        if (option == 2) {
          result = minnimum(number1, number2, number3);
        }

        System.out.println("Maximum is: " + result);
      } else {
        flag = false;
      }
    }
    input.close();
  }

  public static double maximum(double n1, double n2, double n3) {
    double maximumValue = Math.max(n1, Math.max(n2, n3));
    return maximumValue;
  }

  // Estudos adicionais

  public static double minnimum(double n1, double n2, double n3) {
    double minValue = Math.min(n1, Math.min(n2, n3));
    return minValue;
  }
}
