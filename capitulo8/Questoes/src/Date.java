public class Date {
  private int day;
  private int month;
  private int year;

  private static final int[] daysPerMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

  public Date(int day, int month, int year) {
    // verifica o intervalo de month
    if (month <= 0 || month > 12) {
      throw new IllegalArgumentException(
          "Month must be in range (1-12)");
    }

    // verifica o intervalo de day
    if (day <= 0 || day > daysPerMonth[month] && !(month == 2 && day == 29)) {
      throw new IllegalArgumentException(
          "Day must be in range for month and year");
    }

    if (year <= 1000 || year > 9999) {
      throw new IllegalArgumentException(
          "Year must be in range 1000-9999");
    }

    // verifica o ano bisexto
    if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
      throw new IllegalArgumentException(
          "Out of range for specified month and year");
    }

    this.day = day;
    this.month = month;
    this.year = year;

    System.out.printf("Date object constructor for date %s%n", this);
  }

  public void nextDay() {
    if(day == 28 && month == 2) {
      day = 0;
      month++;
    }
    if(day == 30 && (month == 4 || month == 6 || month == 9 || month == 11)) {
      day = 0;
      month++;
    }
    if(day == 31 && !(month == 12)) {
      day = 0;
      month++;
    }
    if(day == 31 && month == 12) {
      day = 0;
      month = 1;
      year++;
    }
    day++;
  }

  public String toString() {
    return String.format("%02d/%02d/%d", day, month, year);
  }
}
