public class SalariedEmployee extends Employee {
  private double weeklySalary;

  public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
    super(firstName, lastName, socialSecurityNumber);
    if(weeklySalary < 0.0) {
      throw new IllegalArgumentException(
        "week salary must be greater than zero"
      );
    }
    this.weeklySalary = weeklySalary;
  }

  public double getWeeklySalary() {
    return weeklySalary;
  }

  public void setWeeklySalary(double weeklySalary) {
    if(weeklySalary < 0.0) {
      throw new IllegalArgumentException(
        "week salary must be greater than zero"
      );
    }
    this.weeklySalary = weeklySalary;
  }

  @Override
  public double getPaymentAmount() {
    return getWeeklySalary();
  }

  @Override
  public String toString() {
    return String.format("salaried employee: %s%n%s: R$%,.2f", 
    super.toString(), 
    "weekly salary", 
    getWeeklySalary()) ;
  }

}
