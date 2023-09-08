public class JurosCompostos {
  public static void main(String[] args) {
    double montante;
    double capital = 1000.0;
    
    System.out.printf("%s%20s %n", "Ano", "Montante");
    for (int ano = 1; ano <= 4; ano++) {
      double taxa = 5.0;
      while(taxa <= 10){
        montante = capital * Math.pow(1.0 + taxa / 100.0, ano);
        System.out.printf("%3d%,20.2f%n", ano, montante);
        taxa++;
      }

    }
  }
}
