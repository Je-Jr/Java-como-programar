public class DateAndTimeTest {
  public static void main(String[] args) {
    Date d = new Date(4, 10, 2023);
    Time2Tick t = new Time2Tick(23,0,0);
    DateAndTime dt = new DateAndTime(d, t);

    dt.incrementHour();
    System.out.println(dt.toString());

  }
}
