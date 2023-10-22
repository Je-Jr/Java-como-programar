import java.util.InputMismatchException;
import java.util.Scanner;

public class TestFinally {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    boolean flag = true;

    do {
      try {
        System.out.print("Digite um numero: ");
        int n1 = input.nextInt();
        System.out.print("Digite outro numero: ");
        int n2 = input.nextInt();
        int soma = n1 + n2;
        System.out.println("A soma de " + n1 + "+" + n2 + "=" + soma);
        flag = false;
        input.close();
      } catch (InputMismatchException e) {
        System.err.println(e);
        input.nextLine();
      }
    } while (flag);
  }
}
