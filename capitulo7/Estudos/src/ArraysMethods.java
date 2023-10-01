import java.util.ArrayList;

public class ArraysMethods {
  /**
   * Metodo para mostrar os elementos de um array de inteiros em uma linha no terminal.
   * 
   * @param a - Array
   */
  public static void displayArray(int[] a) {
    for(int i : a) {
      System.out.print(i + " ");
    }
  }

  /**
   * Método para mostrar os elementos de um ArrayList de inteiros em uma linha no terminal.
   *  
   * @param a - ArrayList de inteiros
   */
  public static void displayArray(ArrayList<Integer> a) {
    for(int i : a) {
      System.out.print(i + " ");
    }
  }
}
