public class Rectangle {
  private double length = 1.0;
  private double width = 1.0;

  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  public void calcularPerimetro() {
    double perimetro = 2 * width + 2 * length;
    System.out.printf("%s: %.2f%n", "o perimetro do retangulo", perimetro);
  }

  public void calcularArea() {
    double area = width * length;
    System.out.printf("%s: %.2f%n", "area do retangulo", area);
  }

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    if(length < 0.0 || length > 20.0) {
      throw new IllegalArgumentException("length must be 0.0-20.0");
    }
    this.length = length;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    if(width < 0.0 || width > 20.0) {
      throw new IllegalArgumentException("width must be 0.0-20.0");
    }
    this.width = width;
  }
}
