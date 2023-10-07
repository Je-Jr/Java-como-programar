public class HourlyEmployee extends Employee {
  private double wage;
  private double hours;

  public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hours, double wage) {
    super(firstName, lastName, socialSecurityNumber);

    if (hours < 0.0 || hours > 168.0) {
      throw new IllegalArgumentException(
          "hours must be between 0-168");
    }
    if (wage < 0.0) {
      throw new IllegalArgumentException(
          "hours must be between 0-168");
    }
    this.hours = hours;
    this.wage = wage;
  }

  public double getWage() {
    return wage;
  }

  public void setWage(double wage) {
    if (wage < 0.0) {
      throw new IllegalArgumentException(
          "hours must be between 0-168");
    }
    this.wage = wage;
  }

  public double getHours() {
    return hours;
  }

  public void setHours(double hours) {
    if (hours < 0.0 || hours > 168.0) {
      throw new IllegalArgumentException(
          "hours must be between 0-168");
    }
    this.hours = hours;
  }

  @Override
  public double getPaymentAmount() {
    if(getHours() < 40){
      return getWage() * getHours();
    }else{
      return getWage() * getHours() + (getHours() - 40) * getWage() * 1.5;
    }
  }

  @Override
  public String toString() {
    return String.format("hourly employee: %s%n%s: R$%,.2f; %s: %,.2f",
        super.toString(),
        "hourly wage",
        getWage(),
        "hours worked", getHours());
  }

}
