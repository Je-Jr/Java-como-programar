import java.util.Scanner;

public class AssertExample {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Digite um numero positivo menor que 10: ");
    int number = input.nextInt();
    assert (number > 0 && number < 10) : "Numero invalido" + number;

    System.out.printf("Voce digitou %d%n", number);
    input.close();

  }
}
