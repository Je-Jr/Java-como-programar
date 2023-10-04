public class ComplexTest {
  public static void main(String[] args) {
    Complex n1 = new Complex(4.0, 2.0);

    n1.display();
    n1.add(2.0, 1.0);
    n1.display();
    n1.subtract(3.0, 1.5);
    n1.display();
  }
}
