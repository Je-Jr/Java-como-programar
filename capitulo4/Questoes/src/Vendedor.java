/*
(Calculador de comissão de vendas) Uma grande empresa paga seu pessoal de vendas com base em comissões. 
O pessoal de vendas recebe R$ 200 por semana mais 9% de suas vendas brutas durante esse período. Por 
exemplo, um vendedor que realiza um total de vendas de mercadorias de R$ 5.000 em uma semana recebe 
R$ 200 mais 9% de R$ 5.000, um total de R$ 650. Foi-lhe fornecida uma lista dos itens vendidos por cada 
vendedor. Os valores desses itens são como segue:

Item  Value
 1    239.99
 2    129.75
 3    99.95
 4    350.89

Desenvolva um aplicativo Java que recebe entrada de itens vendidos por um vendedor durante a última semana e 
calcula e exibe os rendimentos do vendedor. Não existe nenhum limite para o número de itens que pode ser vendido.


Problema:
Fazer um programa que calcule o pagamento de um vendedor a partir de uma lista de dos itens vendidos

1 refinamento:
Inicializar os dados;
Requisitar os valores;
Realizar os cálculos;
exibir o resultado;

2 refinamento:
Inicializar valorItem;
Inicializar valorTotal;
inicializar objeto input;
Inicializar flag;

Criar um loop para requisitar os valores;
Adicionar o valor de item ao valor total;

Realizar o calculo do pagamento do vendedor;

exibir o resultado com o valor do pagamento;

*/

public class Vendedor {
    public static void main(String[] args) {
        double valorItem;
        double valorTotal = 0.0;
        java.util.Scanner input = new java.util.Scanner(System.in);

        int flag = 0;
        while (flag == 0) {
            if (flag == -1) {
                flag = -1;
            }
            System.out.println("Digite o valor do item vendido: ");
            valorItem = input.nextDouble();
            valorTotal += valorItem;
            System.out.println("Digite -1 ou 0 para continuar");
            flag = input.nextInt();
        }
        input.close();
        System.out.println("O valor total de vendas foi de R$ " + valorTotal);
        System.out.println("A commissao foi de R$ " + calcularComissao(valorTotal));
        System.out.println("O pagamento do funcionario devera ser de R$ " + (200 + calcularComissao(valorTotal)));
        
    }
    public static double calcularComissao(double vendas) {
        double totalVendas = vendas * 0.09;
        return totalVendas;
    }
}