import java.util.Scanner;

public class QuadradoDeAsteriscos {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    squareOfAsterisks(n);
    
    input.close();
  }
  
  public static void squareOfAsterisks(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.printf("* ");
      }
      System.out.println();
    }
  }
}
