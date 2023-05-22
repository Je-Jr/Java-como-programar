public class DateTest {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("Digite uma data no formato MES DIA ANO: ");
        int mesDigitado = input.nextInt();
        int diaDigitado = input.nextInt();
        int anoDigitado = input.nextInt();

        input.close();

        Date date1 = new Date(mesDigitado, diaDigitado, anoDigitado);

        System.out.printf("A data: %s foi digitada pelo usuario.", date1.displayDate(date1));
        
    }
}
