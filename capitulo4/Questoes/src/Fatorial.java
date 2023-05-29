public class Fatorial {
    public static void main(String[] args) {
        // int number = 20;
        // double valorDeE1 = eConstant(2);
       
    }
    
    
    // Função para estimar o valor da constante (e)
    public static double eConstant(int terms) {
        double resultado = 1;
        int i = 1;
        while (i <= terms) {
            resultado =  resultado + ((double) 1 /  fatorial(i));
            i++;
        }
        return resultado;
    }


    // Função que calcula o valor de (e) elevado a (x)
    

    // Função para encontrar o fatorial de um numero
    public static int fatorial(int n) {
        if ( n == 1 || n == 0) {
            return 1;
        }else{
            return n * fatorial(n - 1);
        }
    }
}
