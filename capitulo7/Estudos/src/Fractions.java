public class Fractions {
  public static final int ARRAY_SIZE = 10;
  public static void main(String[] args) {
    double[] array = new double[ARRAY_SIZE];
    array[9] = 1.667;
    array[6] = 3.333;

    double x = 0.0;
    for(int i = 0; i < array.length; i++) {
      x += array[i];
    }
    System.out.println(x);
  }  
}
