import java.util.Scanner;

public class CalculandoVendas {
  public static double total = 0.0;
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    boolean flag = true;
    
    
    while(flag) {
      double valor = 0.0;
      int qntd = 0;
      
      System.out.println("Digite o numero do produto:");
      int number = input.nextInt();
      if (number == 0) {
        flag = false;
        break;
      }

      System.out.println("Digite a quantidade vendida:");
      qntd = input.nextInt();

      switch (number) {
        case 1:
          valor = 2.98;
          break;
        case 2:
          valor = 4.50;
          break;
        case 3:
          valor = 9.98;
          break;
        case 4:
          valor = 4.49;
          break;
        case 5:
          valor = 6.87;
          break;
        default:
          break;
      }

      total = (double) qntd * valor;

    }
    System.out.println(total);
    input.close();
  }
}
