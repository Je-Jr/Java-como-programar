public class UsuariosFacebook {
  public static void main(String[] args) {
    double taxa = 0.04;
    long quantidadeAtual = 1000000000;
    long quantidadeFutura = 1500000000;

    double n = (Math.log((double) quantidadeFutura / quantidadeAtual) / Math.log(1.0 + taxa));

    System.out.println(n);
  }
}
