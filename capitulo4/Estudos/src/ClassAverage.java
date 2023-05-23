// Figura 4.8: ClassAverage.java
// Resolvendo o problema da média da classe usando a repetição controlada por contador.

import java.util.Scanner; // programa utiliza a classe Scanner

public class ClassAverage {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int total = 0;
        int gradeCounter = 1;

        while (gradeCounter <= 10) {
            System.out.printf("Digite a nota %d: ", gradeCounter);
            int grade = input.nextInt();
            total = total + grade;
            gradeCounter = gradeCounter + 1;
        }
        input.close();
        int average = total / 10;

        System.out.printf("%nTotal of all 10 grades is %d%n", total);
        System.out.printf("Class average is %d%n", average);
    }    
}
