public class ArrayDePares {
  public static void main(String[] args) {
    final int ARRAY_LENGTH = 10;
    int[] array = new int[ARRAY_LENGTH];

    for(int counter = 0; counter < array.length; counter++) {
      array[counter] = 2 + 2 * counter;
    }

    System.out.printf("%-10s%-10s%n", "Index", "Value");
    for(int counter = 0; counter < array.length; counter++) {
      System.out.printf("%-10d%-10d%n", counter, array[counter]);
    }
  }
}
