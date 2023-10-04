public class Time2TickTest {
  public static void main(String[] args) {
    Time2Tick time = new Time2Tick(11, 59, 59);

    System.out.println(time.toString());
    time.tick();
    System.out.println(time.toString());


  }
}
