public class TryCatch {
  public static void main(String[] args) {
    int[] arr = new int[5];
    try {
      arr[0] = 1;
      arr[1] = 2;
      arr[2] = 3;
      arr[3] = 4;
      arr[4] = 5;
      arr[5] = 6; // lança a exceção
    } catch (IndexOutOfBoundsException e) {

      System.out.println("Excecao" + e);
    }

    System.out.println("Excecao tratada");
  }
}
