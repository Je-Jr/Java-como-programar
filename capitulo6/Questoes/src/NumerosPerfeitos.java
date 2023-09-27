public class NumerosPerfeitos {
  public static void main(String[] args) {
    for (int i = 1; i <= 10000; i++) {
      if (isPerfect(i)) {
          System.out.print(i + " is perfect. Factors: 1");
          int sum = 1;
          for (int j = 2; j <= i / 2; j++) {
              if (i % j == 0) {
                  sum += j;
                  System.out.print(" + " + j);
              }
          }
          System.out.println(" = " + sum);
      }
  }
  }

  public static boolean isPerfect(int n) {
    int sum = 1;
    for (int i = 2; i <= n / 2; i++) {
      if (n % i == 0)
      sum = sum + i;
    }
    return sum == n;
  }
}
