public class Main {
    public static void main(String[] args) {
        new Exemplo();
        new Exemplo();
        new Exemplo();
        new Exemplo();
        new Exemplo();

        // Acessando a variável estática contador diretamente pela classe
        System.out.println("Total de objetos criados: " + Exemplo.contador);
    }
}
class Exemplo {
    // Variável estática
    public static int contador = 0;

    public Exemplo() {
        // Incrementa o contador
        contador++;
    }
}

