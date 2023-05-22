import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        // Exibe o saldo inicial de cada objeto
        showBalance(account1);
        showBalance(account2);
        
        // Cria um scanner para obter uma entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account 1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account 1 balance%n%n", depositAmount);
        account1.deposit(depositAmount); // adiciona ao saldo de account1

        // Exibe os saldos
        showBalance(account1);
        showBalance(account2);

        System.out.print("Enter deposit amount for account 2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account 2 balance%n%n", depositAmount);
        account2.deposit(depositAmount); // adiciona ao saldo de account2

        // Exibe os saldos
        showBalance(account1);
        showBalance(account2);

        // Retira uma quantia da conta 1
        System.out.print("Enter withdraw amount for account 1: ");
        Double withdrawAmount = input.nextDouble();
        System.out.printf("%nWithdrawing %.2f from account 1%n%n", withdrawAmount);
        account1.withdraw(withdrawAmount);

        showBalance(account1);
        showBalance(account2);

        // Retira uma quantia da conta 2
        System.out.print("Enter withdraw amount for account 2: ");
        withdrawAmount = input.nextDouble();
        System.out.printf("%nWithdrawing %.2f from account 2%n%n", withdrawAmount);
        account2.withdraw(withdrawAmount);

        showBalance(account1);
        showBalance(account2);


        input.close();

    }

    public static void showBalance(Account account) {
        System.out.printf("%s balance: $%.2f %n", account.getName(), account.getBalance());
    }
}
