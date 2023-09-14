public class PiComSeries {
  public static void main(String[] args) {
    int numeroDeTermos = 1;
    double pi = 0.0;
    double multiplicador = 1.0;
    int contador = 1;

    while (true) {
      if (contador % 2 != 0) {
        pi = pi +  ((double) 4/contador) * multiplicador;
        multiplicador *= -1.0;      
        numeroDeTermos++;
      }
      contador++;
      
      if (pi == 3.14159) {
        System.out.printf("Parando em %d %.5f%n", numeroDeTermos, pi );
        break;
      }
    }
    
    
    /**
    for (int i = 1; i <= numeroDeTermos; i++) {
      if (i % 2 != 0) {
        pi = pi +  ((double) 4/i) * multiplicador;
        multiplicador *= -1.0;      
        // System.out.printf("%d %.5f %n",i ,pi);
      }
      if (pi >= 3.14159 &&  pi <= 3.14161) {
        System.out.printf("Parando em %d %n",i);
        break;
      }
    }
     */
  }
}
