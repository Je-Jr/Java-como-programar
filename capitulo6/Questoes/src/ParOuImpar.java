public class ParOuImpar {
  public static void main(String[] args) {
   
    System.out.printf("%s",isEven(NumeroAleatorio.createRandomNumber()));
  }

  public static boolean isEven(int n) {
    System.out.println(n);
    return n % 2 == 0 ? true : false;
  }
}
