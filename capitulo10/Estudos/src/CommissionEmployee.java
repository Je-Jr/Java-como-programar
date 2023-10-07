public class CommissionEmployee extends Employee {
  private double commissionRate;
  private double grossSales;

  public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double commissionRate,
      double grossSales) {
    super(firstName, lastName, socialSecurityNumber);

    if (commissionRate < 0.0 && commissionRate > 1.0) {
      throw new IllegalArgumentException(
          "commission rate must be between 0 and 1");
    }

    if (grossSales < 0.0) {
      throw new IllegalArgumentException(
          "gross sales must be grater than 0");
    }
    this.commissionRate = commissionRate;
    this.grossSales = grossSales;
  }

  public double getCommissionRate() {
    return commissionRate;
  }

  public void setCommissionRate(double commissionRate) {
    if (commissionRate < 0.0 && commissionRate > 1.0) {
      throw new IllegalArgumentException(
          "commission rate must be between 0 and 1");
    }
    this.commissionRate = commissionRate;
  }

  public double getGrossSales() {
    return grossSales;
  }

  public void setGrossSales(double grossSales) {
    if (grossSales < 0.0) {
      throw new IllegalArgumentException(
          "gross sales must be grater than 0");
    }
    this.grossSales = grossSales;
  }

  @Override
  public double getPaymentAmount() {
    return getGrossSales() * getCommissionRate();
  }

  @Override
  public String toString() {
    return String.format("commission employee: %s%n%s: R$%,.2f; %s: %.1f%%", 
    super.toString(),
    "gross sales", getGrossSales(),
    "commission rate", getCommissionRate() * 100);
  }

}
