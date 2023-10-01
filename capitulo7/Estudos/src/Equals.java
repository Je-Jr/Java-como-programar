import java.util.Arrays;

public class Equals {
  public static void main(String[] args) {
    int[] arr1 = new int[5];
    int[] arr2;

    Arrays.fill(arr1, 1);

    arr2 = arr1;

    System.out.println(Arrays.equals(arr1, arr2));
    System.out.println(arr1.equals(arr2));
  }
}
