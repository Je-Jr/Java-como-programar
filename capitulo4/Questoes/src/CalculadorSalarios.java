/** 
(Calculador de salários) Desenvolva um aplicativo Java que determina o salário bruto de cada um de três empregados. 
A empresa paga as horas normais pelas primeiras 40 horas trabalhadas por cada funcionário e 50% a mais por todas 
as horas trabalhadas além das 40 horas. Você recebe uma lista de empregados, o número de horas trabalhadas por eles 
na semana passada e o salário-hora de cada um. Seu programa deve aceitar a entrada dessas informações para cada 
empregado e, então, determinar e exibir o salário bruto do empregado. Utilize a classe Scanner para inserir os dados.

Problema: Determinar o valor a ser pago ao funcionario com base nas horas trabalhadas

*/

import java.util.Scanner;

public class CalculadorSalarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        while (contador < 3) {
            System.out.println("Empregado #" + (contador + 1));
            System.out.print("Digite o numero de horas trabalhadas: ");
            int horasTrabalhadas = scanner.nextInt();

            System.out.print("Digite o salario-hora: ");
            double salarioHora = scanner.nextDouble();

            double salarioBruto = calcularSalarioBruto(horasTrabalhadas, salarioHora);
            System.out.println("Salario bruto: R$" + salarioBruto);

            contador++;
        }
        scanner.close();
    }

    public static double calcularSalarioBruto(int horasTrabalhadas, double salarioHora) {
        double salarioBruto = 0.0;

        if (horasTrabalhadas <= 40) {
            salarioBruto = horasTrabalhadas * salarioHora;
        } else {
            int horasExtras = horasTrabalhadas - 40;
            salarioBruto = (40 * salarioHora) + (horasExtras * salarioHora * 1.5);
        }

        return salarioBruto;
    }
}

