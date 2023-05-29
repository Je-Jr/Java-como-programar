public class PadraoDeTabuleiroDeDamasDeAsteriscos {
    public static void main(String[] args) {
        int linha = 0;
        while (linha < 8) {
            int coluna = 0;
            while (coluna < 8) {
                System.out.print("* ");
                coluna++;
            }
            System.out.println();
            if (linha % 2 == 0)
                System.out.print(" ");
            linha++;
        }
    }
}
