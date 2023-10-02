import java.text.DateFormat;
import java.util.Date;

public class DateTimeAPI {
  public static void main(String[] args) {
    Date dt = new Date();
    // Time1 time = new Time1();
    // time.hour = 10; erro de compilação


    System.out.println(DateFormat.getDateInstance().format(dt));
    
  }
}
