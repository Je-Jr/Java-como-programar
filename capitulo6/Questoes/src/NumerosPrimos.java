public class NumerosPrimos {
  public static void main(String[] args) {
    for (int i = 2; i < 12; i++) {
      if(isPrime(i)){
        System.out.println(i + " is prime");
      }
    }
  }

  public static boolean isPrime(int n) {
    double raiz = Math.sqrt(n);
    System.out.println(raiz);
    for(int d = 2; d <= (int) raiz; d++) {
      if (n % d == 0)
        return false;
      }
    return true;
  }
}
