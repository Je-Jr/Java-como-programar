public class ThisTest {
  public static void main(String[] args) {
    SimpleTime time = new SimpleTime(16, 59, 1);
    System.out.println(time.toUniversalString());
  }
}

class SimpleTime {
  private int hour;
  private int minute;
  private int second;

  public SimpleTime(int hour, int minute, int second) {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  public String buildString() {
    return String.format("%24s: %s%n%24s: %s",
          "this.toUniversalString()", this.toUniversalString(),
          "toUniversalString()", toUniversalString());
  }

  public String toUniversalString() {
    return String.format("%02d:%02d:%02d", hour, minute, second);
  }
}
