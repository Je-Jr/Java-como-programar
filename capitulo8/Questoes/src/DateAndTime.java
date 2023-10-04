public class DateAndTime {
  private Date date;
  private Time2Tick time;

  public DateAndTime(Date date, Time2Tick time) {

    this.date = date;
    this.time = time;
  }
  
  @Override
  public String toString() {
    String dateTime = String.format("%s %s", time.toUniversalString(), date.toString());
    return dateTime;
  }

  public void incrementHour() {
    time.hour++;
    if(time.hour == 24) {
      time.hour = 0;
      date.nextDay();
    }
}

}
