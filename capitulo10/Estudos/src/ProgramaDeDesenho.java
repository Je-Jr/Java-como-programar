abstract class Forma {
  abstract void desenhar();
}

class Triangle extends Forma {
  @Override
  public void desenhar(){
    System.out.println("Triangulo");
  }
}

class Rectangle extends Forma {
  @Override
  public void desenhar(){
    System.out.println("Retangulo");
  }
}

class Circle extends Forma {
  @Override
  public void desenhar(){
    System.out.println("Circulo");
  }
}



public class ProgramaDeDesenho {
  public static void main(String[] args) {
    Forma[] formas = new Forma[3];
    formas[0] = new Circle();
    formas[1] = new Triangle();
    formas[2] = new Rectangle();

    for(Forma forma : formas) {
      forma.desenhar();
    }
  }
}