public class ClienteTest {
    public static void main(String[] args) {
        String numConta;
        int saldoInicial;
        int itensComprados;
        int creditosAplicados;
        int creditoAutorizado;

        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Digite o numero da conta:");
        numConta = input.nextLine();
        System.out.println("Saldo inicial: ");
        saldoInicial = input.nextInt();
        System.out.println("Digite o valor total de itens comprados:");
        itensComprados = input.nextInt();
        System.out.println("Digite os creditos aplicados a fatura:");
        creditosAplicados = input.nextInt();
        System.out.println("Digite o limite de credito:");
        creditoAutorizado = input.nextInt();
        
        input.close();

        Cliente pessoa1 = new Cliente(numConta, saldoInicial, itensComprados, creditosAplicados, creditoAutorizado);

        pessoa1.exibirDados();
    }
}
