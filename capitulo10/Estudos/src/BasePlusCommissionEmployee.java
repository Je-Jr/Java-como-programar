public class BasePlusCommissionEmployee extends CommissionEmployee {
  private double baseSalary;

  public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
      double commissionRate, double grossSales, double baseSalary) {
    super(firstName, lastName, socialSecurityNumber, commissionRate, grossSales);

    if (baseSalary < 0.0) {
      throw new IllegalArgumentException(
          "base salary must be >= 0.0");
    }
    this.baseSalary = baseSalary;
  }

  public double getBaseSalary() {
    return baseSalary;
  }

  public void setBaseSalary(double baseSalary) {
    if (baseSalary < 0.0) {
      throw new IllegalArgumentException(
          "base salary must be >= 0.0");
    }
    this.baseSalary = baseSalary;
  }

  @Override
  public double getPaymentAmount() {
    return getBaseSalary() + super.getPaymentAmount();
  }

  @Override
  public String toString() {
    return String.format("%s %s; %s R$%,.2f%n",
        "base-salaried:", super.toString(),
        "base salary", getBaseSalary());
  }

}
