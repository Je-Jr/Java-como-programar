import java.text.NumberFormat;

public class SavingsAccountTest {
  public enum Mes {
    JANEIRO, FEVEREIRO, MARCO, ABRIL, MAIO, JUNHO, JULHO, AGOSTO, SETEMBRO, OUTUBRO, NOVEMBRO, DEZEMBRO
  }

  public static void main(String[] args) {
    SavingsAccount.anualInterestRate = 0.04;
    SavingsAccount c1 = new SavingsAccount(2000.00);
    // SavingsAccount c2 = new SavingsAccount(3000.00);

    System.out.printf("%10s %10s%n", "mes", "valor");
    for(Mes m : Mes.values()){
      System.out.printf("%10s %16s%n", m, NumberFormat.getCurrencyInstance().format(c1.calculateMonthlyInterest()));
    }
  }
}
