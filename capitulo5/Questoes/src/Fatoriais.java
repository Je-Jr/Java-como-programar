public class Fatoriais {
  public static void main(String[] args) {
    System.out.println("Fatoriais de 1 a 20");
    System.out.printf("Numero | Fatorial%n");
    for (int i = 1; i <= 20; i++) {
      long total = 1;
      for (int j = 1; j <= i; j++) {
        total *= j;
      }
      System.out.printf("%-6d | %d%n", i, total);
    }
  }
}
