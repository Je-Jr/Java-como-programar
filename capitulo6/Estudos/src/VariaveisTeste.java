public class VariaveisTeste {
  private static int x = 10;
  public static void main(String[] args) {
    int x = 20;
    System.out.println(x);
    
    useLocalVariable();
    useField();
  }

  public static void useLocalVariable() {
    int x = 30;
    System.out.println(x);
  }

  public static void useField() {
    System.out.println(x);
  }
}
