public class Ellipse {
  public static void main(String[] args) {
    average(90.0, 100.0);
  }

  public static void average(double ...notas){
    double soma = 0.0;
    double total = 0.0;
    for(double nota : notas){
      soma += nota;
    }
    total = soma / notas.length;
    System.out.println(total);
  }
}
