public class SavingsAccount {
  public static double anualInterestRate;
  private double savingsBalance;

  public SavingsAccount(double savingsBalance) {
    this.savingsBalance = savingsBalance;
  }

  public double calculateMonthlyInterest() {
    savingsBalance += savingsBalance * (anualInterestRate / 12);
    return savingsBalance;
  }

  public static void setAnnualInterestRate(double val) {
    anualInterestRate += val;
  }
}
