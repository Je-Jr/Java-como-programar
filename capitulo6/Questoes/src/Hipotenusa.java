public class Hipotenusa {
  public static void main(String[] args) {
    double result;
    result = hypotenuse(3.0, 4.0);
    System.out.println(result);
    result = hypotenuse(5.0, 12.0);
    System.out.println(result);
    result = hypotenuse(8.0, 15.0);
    System.out.println(result);

  }
  public static double hypotenuse(double l1, double l2) {
    double hyp;
    hyp = Math.sqrt(Math.pow(l1, 2) + Math.pow(l2, 2));
    return hyp;
  }
}
