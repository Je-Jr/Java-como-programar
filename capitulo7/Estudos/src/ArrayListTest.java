import java.util.ArrayList;

public class ArrayListTest {
  public static void main(String[] args) {
    ArrayList<Integer> integers = new ArrayList<>();

    for (int i = 1; i <= 100; i++) {
      if (i % 2 != 0) {
        integers.add(i);
      }
    }

    ArraysMethods.displayArray(integers);
    System.out.println(integers.size());
  }
}