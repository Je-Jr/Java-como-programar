public class Multiplo {
  public static void main(String[] args) {

    System.out.println(isMultiple(6, 3));
    System.out.println(isMultiple(3, 15));
    System.out.println(isMultiple(60, 12));
    System.out.println(isMultiple(3, 56));
    System.out.println(isMultiple(45, 345));
    System.out.println(isMultiple(7, 28));

    
  }
  /**
   * Determina se o segundo valor é multiplo do primeiro
   * 
   * @param n1
   * @param n2
   * @return
   */
  public static boolean isMultiple(int n1, int n2) {
    return n2 % n1 == 0;
  }
}
