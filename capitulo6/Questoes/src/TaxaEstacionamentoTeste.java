import java.util.Scanner;

public class TaxaEstacionamentoTeste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        double total = 0;


        while(flag){
            System.out.println("Digite uma das opções");
            System.out.println("1 - adicionar cliente");
            System.out.println("2 - sair");
            int option = input.nextInt();
            if (option == 2) {
                flag = false;
            }else{
                System.out.println("Digite a quantidade de horas:");
                int hr = input.nextInt();
                TaxaEstacionamento p1 = new TaxaEstacionamento(hr);
                double valor = p1.calculateCharges();
                total += valor;
                System.out.println(valor);
            }

        }
        System.out.printf("O total do estacionamento foi R$%.2f", total);
        input.close();

    }
}
