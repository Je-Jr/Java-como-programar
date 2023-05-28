/*
(Quadrado de asteriscos) Escreva um aplicativo que solicita ao usuário que insira o tamanho do lado de um quadrado 
e, então, exibe um quadrado vazio desse tamanho com asteriscos. Seu programa deve trabalhar com quadrados de todos 
os comprimentos de lado possíveis entre 1 e 20.


se o contador for igual a um ou igual a numero_digitado:
  enquanto numero_digitado <= numero_digitado -2
   mostre *
  pule para a proxima linha


*/


public class QuadradoDeAsteriscos {
  public static void main(String[] args) {
    java.util.Scanner input = new java.util.Scanner(System.in);

    System.out.println("Digite um numero (1 - 20)");
    int tamanho = input.nextInt();

    if (tamanho >= 1 && tamanho <= 20) {
      int linha = 1;
      while (linha <= tamanho) {
        int coluna = 1;
        while (coluna <= tamanho) {
          if (linha == 1 || linha == tamanho || coluna == 1 || coluna == tamanho) {
            System.out.print("* ");
          }else {
            System.out.print("  ");
          }
          coluna++;
        }
        System.out.println();
        linha++;
      }
    } else {
      System.out.println("Tamanho invalido.");
    }
    input.close();
  }
}
