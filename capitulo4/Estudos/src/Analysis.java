public class Analysis {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int reprovacoesExame = 0;
        int aprovacoesExame = 0;
        int contadorAlunos = 1;

        System.out.println("Insira os resultados [passou = 1] e [reprovou = 2] ");
        while (contadorAlunos <= 10) {
            System.out.printf("Resultado %d: ", contadorAlunos);
            int nota = input.nextInt();

            if (nota == 1)
                aprovacoesExame = aprovacoesExame + 1;
            else
                reprovacoesExame = reprovacoesExame + 1;

            contadorAlunos = contadorAlunos + 1;
        }
        input.close();
        System.out.println("Numero de aprovacoes: " + aprovacoesExame);
        System.out.println("Numero de reprovacoes: " + reprovacoesExame);

        if (aprovacoesExame > 8)
            System.out.println("Bonus para o instrutor!");
    }
}
