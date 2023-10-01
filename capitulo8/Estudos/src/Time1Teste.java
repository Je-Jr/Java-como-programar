public class Time1Teste {
  public static void main(String[] args) {
    Time1 time = new Time1();

    try {
      time.setTime(99, 99, 99);
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }

    String tp = time.toString();



    System.out.println(tp);
  }
}
