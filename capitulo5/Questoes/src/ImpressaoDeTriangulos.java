public class ImpressaoDeTriangulos {
  public static void main(String[] args) {
    
    System.out.println("pattern (a)");

    for (int a = 0; a < 10; a++) {
      for (int b = 0; b <= a; b++) {
        System.out.print("*");
      }
      System.out.println();
    }

    System.out.println("pattern (b)");

    for (int c = 10; c > 0; c--) {
      for (int d = 0; d <= c; d++) {
        System.out.print("*");
      }
      System.out.println();
    }

    System.out.println("pattern (c)");

    for (int e = 0; e <= 10; e++) {
      for (int f = 0; f < e; f++) {
        System.out.print(" ");
      }
      for (int g = 10; g > e; g--) {
        System.out.print("*");
      }
      System.out.println();
    }

    System.out.println("pattern (d)");

    for (int e = 10; e > 0; e--) {
      for (int f = 0; f < e - 1; f++) {
        System.out.print(" ");
      }
      for (int g = 10; g >= e; g--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}