public class TriplosDePitagoras {
    public static void main(String[] args) {
        int limite = 500;
        int count = 0;

        System.out.println("Triplo de Pitagoras");
        System.out.printf("%-10s %-10s %-20s%n", "side1", "side2", "hypotenuse");

        for (int side1 = 1; side1 <= limite; side1++) {
            for (int side2 = 1; side2 <= limite; side2++) {
                for (int hypotenuse = 1; hypotenuse <= limite; hypotenuse++) {
                    // Verifica se é um triângulo retângulo
                    count++;
                    if (isTrianguloRetangulo(side1, side2, hypotenuse)) {
                        System.out.printf("%-10d %-10d %-10d%n", side1, side2, hypotenuse);
                    }
                }
            }
        }
        System.out.println(count);
    }

    // Função para verificar se é um triângulo retângulo
    public static boolean isTrianguloRetangulo(int side1, int side2, int hypotenuse) {
        return (side1 * side1 + side2 * side2 == hypotenuse * hypotenuse);
    }
}
