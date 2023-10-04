public class DateTest {
  public static void main(String[] args) {
    Date date = new Date(1, 1, 2023);
    for (int i = 0; i < 400; i++) {
      date.nextDay();
      System.out.println(date.toString());
    }
  }
}
