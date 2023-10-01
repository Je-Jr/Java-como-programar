public class ArraySoma {
  public static void main(String[] args) {
    int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
    int sum = 0;
    for(int counter = 0; counter < array.length; counter++) {
      sum += array[counter];
    }

    System.out.println(sum);
  }
}
