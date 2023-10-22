public class TestandoSubstrings {
  public static void main(String[] args) {
    String name = "Jorge";
    String lastName = "Junior";
    String sb = name.substring(3, 5) + lastName.substring(4, 6) + name.substring(3, 5);

    System.out.println(sb.toUpperCase());
  }
}
