import java.util.Scanner;

public class ConversaoDeTemperatura {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Escolha uma das opcoes:");
    System.out.println("1 - celsius to fahrenheit");
    System.out.println("2 - fahrenheit to celsius");
    int option = input.nextInt();
    if (option == 1 || option == 2) {
      if (option == 1) {
        System.out.println("Digite a temperatura em celsius: ");
        double celsius = input.nextDouble();
        cToF(celsius);
      }
      if (option == 2) {
        System.out.println("Digite a temperatura em fahrenheit: ");
        double fahrenheit = input.nextDouble();
        fToC(fahrenheit);
      }
    } else {
      System.out.println("Voce nao digitou uma opcao valida");
    }
    input.close();
  }

  public static void cToF(double fahrenheit) {
    double celsius = 5.0 / 9.0 * (fahrenheit - 32);
    System.out.println(celsius);
  }
  public static void fToC(double celsius) {
    double fahrenheit = 9.0 / 5.0 * celsius + 32;
    System.out.println(fahrenheit);
  }
}
