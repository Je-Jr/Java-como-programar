public class StringMiscellaneous {
  public static void main(String[] args) {
    String s1 = "hello there";
    Integer number = 100;
    char[] charArray = new char[5];

    System.out.println(new String(number.toString()));

    System.out.printf("s1: %s", s1);

    System.out.printf("%nLength of s1: %d", s1.length());

    System.out.printf("%nThe string reversed is: ");

    for (int count = s1.length() - 1; count >= 0; count--)
      System.out.printf("%c ", s1.charAt(count));
  }
}
