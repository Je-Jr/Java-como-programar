public class LadosDeUmTriangulo {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if (num1 > 0 && num2 > 0 && num3 > 0) {
            if (num1 + num2 > num3 || num1 + num3 > num2 || num2 + num3 > num1 ){
                System.out.println("Triangle");
            }
        }else{ 
            System.out.println("This is not a triangle");
        }
        input.close();
        }
    
}
