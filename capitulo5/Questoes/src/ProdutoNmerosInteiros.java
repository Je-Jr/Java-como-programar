public class ProdutoNmerosInteiros {
  public static void main(String[] args) {
    int product = 1;
    for (int i = 1; i <= 15; i++) {
      if (i % 2 != 0) {
        product *= i;
      }
    }
    System.out.printf("O produto dos numeros impares de 1 a 15: %d", product);
  }
}
