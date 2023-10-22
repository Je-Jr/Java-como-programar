public class CompareTo {
  public static void main(String[] args) {
    String s1 = "gessica viana";
    String s2 = "gessiane viana";

    System.out.println(s2.regionMatches(0, s1, 0, 6));
  }
}