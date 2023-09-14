public class Losangulos {
  public static void main(String[] args) {
    int limite = 10;
    for (int linha = 1; linha <= limite; linha++) {
      for (int espaco = 1; espaco <= limite - linha; espaco++) {
        System.out.print(" ");
      }

      for (int asterisco = 1; asterisco <= 2 * linha - 1; asterisco++) {
        System.out.print("*");
      }

      System.out.println();
    }

    for (int linha = limite-1; linha >= 1; linha--) {
      for (int espaco = 1; espaco <= limite - linha; espaco++) {
        System.out.print(" ");
      }

      for (int asterisco = 1; asterisco <= 2 * linha - 1; asterisco++) {
        System.out.print("*");
      }

      System.out.println();
    }
  }
}
