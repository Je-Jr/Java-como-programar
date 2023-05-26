/*
(Localize o maior número) O processo de localizar o maior valor é muito utilizado em aplicativos de computador. 
Por exemplo, um programa que determina o vencedor de uma competição de vendas inseriria o número de unidades 
vendidas por cada vendedor. O vendedor que vende mais unidades ganha a competição. Escreva um programa em 
pseudocódigo e, então, um aplicativo Java que aceita como entrada uma série de 10 inteiros e determina e imprime 
o maior dos inteiros. Seu programa deve utilizar pelo menos as três variáveis a seguir:

a) counter: um contador para contar até 10 (isto é, monitorar quantos números foram inseridos e determinar 
quando todos os 10 números foram processados).
b) number: o inteiro mais recentemente inserido pelo usuário.
c) largest: o maior número encontrado até agora.

int counter = 0;
int number;
int largest;

enquanto counter < 10:
  escreva "digite um numero"
  leia number
  se number > largest:
    largest = number;

  print(largest)


*/

public class LocalizarMaiorNumero {
    public static void main(String[] args) {
        int number;
        int counter = 0;
        int largest = Integer.MIN_VALUE;
        java.util.Scanner input = new java.util.Scanner(System.in);

        while (counter < 10) {
            System.out.printf("Digite o total de items para o vendedor %d: ", (counter + 1));
            number = input.nextInt();
            if (number > largest) {
                largest = number;
            }
            counter++;
        }
        input.close();
        System.out.printf("O maior numero foi: %d", largest);
    }
}
