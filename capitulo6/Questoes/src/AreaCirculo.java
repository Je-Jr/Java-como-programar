import java.util.Scanner;

public class AreaCirculo {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int r = input.nextInt();
    
    System.out.println(circleArea(r) + " centimetros quadrados");
    input.close();
  }
  
  public static double circleArea(int r) {
    return Math.PI * Math.pow(r, 2);
  }
}