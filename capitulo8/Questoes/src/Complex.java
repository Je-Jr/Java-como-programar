public class Complex {
  private double realPart;
  private double imaginaryPart;

  public Complex() {
    this(0.0, 0.0);
  }

  public Complex(double realPart, double imaginaryPart) {
    this.realPart = realPart;
    this.imaginaryPart = imaginaryPart;
  }

  public void add(double rP, double iP){
    realPart += rP;
    imaginaryPart += iP;
  }

  public void subtract(double rP, double iP){
    realPart -= rP;
    imaginaryPart -= iP;
  }

  public void display() {
    String text = String.format("%.2f + %.2fi", realPart, imaginaryPart);
    System.out.println(text);
  }
}
