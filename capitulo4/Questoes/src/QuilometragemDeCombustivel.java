/*
 (Quilometragem de combustível) Os motoristas se preocupam com a quilometragem obtida por seus automóveis. 
 Um motorista monitorou várias viagens registrando a quilometragem dirigida e a quantidade de combustível 
 em litros utilizados para cada tanque cheio. Desenvolva um aplicativo Java que receba como entrada os 
 quilômetros dirigidos e os litros de gasolina consumidos (ambos como inteiros) para cada viagem. O programa 
 deve calcular e exibir o consumo em quilômetros/litro para cada viagem e imprimir a quilometragem total e a 
 soma total de litros de combustível consumidos até esse ponto para todas as viagens. Todos os cálculos de 
 média devem produzir resultados de ponto flutuante. Utilize classe Scanner e repetição controlada por 
 sentinela para obter os dados do usuário.
 */

public class QuilometragemDeCombustivel {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int quilometrosPercorridos, litrosCombustivel;

        int flag = 0;
        int totalCombustivel = 0;
        int totalQuilometros = 0;

        System.out.println("Digite [1 - inserir rota] ou [-1 para encerrar]: ");
        int entradaUsuarioContinuar = input.nextInt();
        while (flag == 0) {
            if (entradaUsuarioContinuar == -1) {
                flag = -1;
            } else {
                System.out.println("Digite a quilometragem: ");
                quilometrosPercorridos = input.nextInt();
                System.out.println("Digite os litros de combustível: ");
                litrosCombustivel = input.nextInt();

                totalCombustivel += litrosCombustivel;
                totalQuilometros += quilometrosPercorridos;
                mostrarResultados(quilometrosPercorridos, litrosCombustivel, totalCombustivel, totalQuilometros);
                System.out.println("Digite [1 - inserir rota] ou [-1 para encerrar]: ");
                entradaUsuarioContinuar = input.nextInt();
            }
        }
        input.close();
    }
    public static double calcularConsumo(int quilometrosPercorridos, int litrosCombustivel) {
        return (double) quilometrosPercorridos / litrosCombustivel;
    }

    public static void mostrarResultados(int quilometrosPercorridos, int litrosCombustivel, int totalCombustivel, int totalQuilometros) {
        System.out.printf("Essa viagem teve %d Km de percurso%n", quilometrosPercorridos);
        System.out.printf("Essa viagem gastou %d L de combustivel%n", litrosCombustivel);
        System.out.printf("O consumo foi de %.2f Km/l%n", calcularConsumo(quilometrosPercorridos, litrosCombustivel));
        System.out.printf("TOTAL LITROS: %d L%n", totalCombustivel, totalQuilometros);
        System.out.printf("TOTAL QUILOMETROS: %d Km%n", totalQuilometros);

    }
}