import java.util.Arrays;

public class Fill {
  public static void main(String[] args) {
    int[] array = new int[10];

    Arrays.fill(array, 1, 8, 8);

    for(int i : array) {
      System.out.print(i + " ");
    }
  }

}
