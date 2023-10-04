public class RectangleTest {
  public static void main(String[] args) {
    Rectangle rect = new Rectangle(20, 40);

    System.out.println(rect.getWidth());
    System.out.println(rect.getLength());
    rect.setLength(23);
    System.out.println(rect.getLength());
  }
}