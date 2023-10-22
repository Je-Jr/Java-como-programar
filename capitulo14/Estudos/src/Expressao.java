import java.util.Scanner;

public class Expressao {
  public static void main(String[] args) {
    String name;
    Scanner input = new Scanner(System.in);

    do {
      System.out.println("Digite:");
      name = input.next();
    } while (!validateName(name));
    input.close();
    System.out.println(name);
  }

  public static boolean validateName(String name) {
    return name.matches("[^A-Ya-y]");
  }
}
