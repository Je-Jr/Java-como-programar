import java.util.Scanner;

public class SquareOfACharacter {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    char c = input.next().charAt(0);
    squareOfAsterisks(n, c);
    
    input.close();
  }
  
  public static void squareOfAsterisks(int n, char c) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.printf("%s ", c);
      }
      System.out.println();
    }
  }
}