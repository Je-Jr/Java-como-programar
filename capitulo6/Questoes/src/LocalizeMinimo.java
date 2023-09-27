public class LocalizeMinimo {
  public static void main(String[] args) {
    minimum3(5.3, 4.2, 6.1);
  }

  public static void minimum3(double n1, double n2, double n3) {
    double result = Math.min(n1, Math.min(n2, n3));
    System.out.println(result);
  }
}
