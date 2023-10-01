import java.util.Scanner;

/**
 * Considere um array de inteiros dois por três t.
 * a) Escreva uma instrução que declara e cria t.
 * b) Quantas linhas tem t?
 * c) Quantas colunas tem t?
 * d) Quantos elementos tem t?
 * e) Escreva expressões de acesso para todos os elementos na linha 1 de t.
 * f) Escreva expressões de acesso para todos os elementos na coluna 2 de t.
 * g) Escreva uma única instrução que configura o elemento de t na linha 0 e na
 * coluna 1 como zero.
 * h) Escreva instruções individuais para inicializar cada elemento de t para
 * zero.
 * i) Escreva uma instrução for aninhada que inicializa cada elemento de t como
 * zero.
 * j) Escreva uma instrução for aninhada que insere os valores para os elementos
 * de t a partir do usuário.
 * k) Escreva uma série de instruções que determina e exibe o valor menor em t.
 * l) Escreva uma única instrução printf que exibe os elementos da primeira
 * linha de t.
 * m) Escreva uma instrução que soma os elementos da terceira coluna de t. Não
 * utilize repetição.
 * n) Escreva uma série de instruções que exibe o conteúdo de t no formato
 * tabular. Liste os índices de coluna como títulos na parte superior
 * e liste os índices de linha à esquerda de cada linha.
 */

public class ArrayDeInteiros {
  public static void main(String[] args) {
    // a) Instrução de criação do array
    int[][] t = new int[2][3];

    // b) O t possui 2 linhas
    // c) O t possui 3 colunas

    // d) o t possui linha vezes coluna elementos (2 x 3 = 6 elementos).

    // e) t[0][0], t[0][1], t[0][2]

    // f) t[1][0], t[1][1], t[1][2]

    // g) t[0][1] = 0

    // h) t[0][0] = 0, t[0][1] = 0, t[0][2] = 0, t[1][0] = 0, t[1][1] = 0, t[1][2] = 0

    // i)
    // for (int i = 0; i < t.length; i++) {
    //   for (int j = 0; j < i; j++) {
    //     t[i][j] = 0;
    //   }
    // }

    // j)
    Scanner input = new Scanner(System.in);
    for (int linha = 0; linha < t.length; linha++) {
      for (int coluna = 0; coluna < t[linha].length; coluna++) {
        System.out.printf("Digite um numero para o elemento [%d][%d]: ", linha, coluna);
        t[linha][coluna] = input.nextInt(); 
      }
    }
    input.close();
  }
}
