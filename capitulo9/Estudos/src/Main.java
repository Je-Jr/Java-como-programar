public class Main {
  public static void main(String[] args) {
    ClasseC c = new ClasseC();
    System.out.println(c.toString());
  }
}

class ClasseA {
  public ClasseA() {
  }

  @Override
  public String toString() {
    return String.format("Classe A");
  }
}

class ClasseB extends ClasseA {
  public ClasseB() {
  }

  @Override
  public String toString() {
    return super.toString();
  }
}

class ClasseC extends ClasseB {
  public ClasseC() {
    
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
