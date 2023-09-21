public class SobrecargaMetodos {
  public static void main(String[] args) {
    double result = max(20.0, 10.0);
    System.out.println(result);

  }

  public static int max(int a, int b) {
    System.out.println("Metodo com int");
    return (a > b) ? a : b;
  }

  public static double max(double a, double b) {
  System.out.println("Metodo com double");
    return (a > b) ? a : b;
  }
}
