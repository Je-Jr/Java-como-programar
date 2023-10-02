public class Date {
  private int day;
  private int month;
  private int year;

  private static final int[] daysPerMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

  public Date(int day, int month, int year) {
    // verifica o intervalo de month
    if (month <= 0 || month > 12) {
      throw new IllegalArgumentException(
        "Month must be in range (1-12)"
      );
    }

    // verifica o intervalo de day
    if(day <= 0 || day > daysPerMonth[month] && !(month == 2 && day == 29)) {
      throw new IllegalArgumentException(
        "Day must be in range for month and year"
      );
    }

    // verifica o ano bisexto
    if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
      throw new IllegalArgumentException(
        "Out of range for specified month and year"
      );
    }

    this.day = day;
    this.month = month;
    this.year = year;

    System.out.printf("Date object constructor for date %s%n", this);
  }

  public String toString() {
    return String.format("%d/%d/%d", day, month, year);
  }
}
