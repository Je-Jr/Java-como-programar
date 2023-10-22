public class ClasseString {
  public static void main(String[] args) {
    char[] arrayNome = {'J','o','r','g','e',' ','J','u','n','i','o','r'};


    System.out.println(new String(arrayNome, 0, 1) + 
        new String(arrayNome, 4, 1) +
        new String("-") + 
        new String(arrayNome, 6, 1) + 
        new String(arrayNome, arrayNome.length - 1, 1)
    );

  }
}
