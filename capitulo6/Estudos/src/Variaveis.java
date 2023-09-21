public class Variaveis {
  static int varNumero = 100;
  private int varNumeroObj = 200;

  public int getVarNumeroObj() {
    return varNumeroObj;
  }

  public void setVarNumeroObj(int varNumeroObj) {
    this.varNumeroObj = varNumeroObj;
  }

  Variaveis(int n) {
    this.varNumeroObj = n;

  } 

  protected void say() {
    System.out.println("saying hello with number " + this.varNumeroObj);
  }

}