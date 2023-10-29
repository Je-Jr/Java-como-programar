import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Lendo {
  private static Scanner input;
  public static void main(String[] args) {
    openFile();
    readRecords();
    closeFile();
  }

  public static void openFile() {
    try {
      input = new Scanner(Paths.get("arquivo.txt"));
    } catch (IOException ioException) {
      System.err.println("Error opening file. Terminating");
      System.exit(1);
    }
  }

  public static void readRecords() {
    try {
      while(input.hasNextLine()) {
        System.out.printf("%s", input.nextLine());
      }
    } catch (NoSuchElementException noSuchElementException) {
      System.err.println(noSuchElementException);
    } catch (IllegalStateException illegalStateException) {
      System.err.println(illegalStateException);
    }
  }

  public static void closeFile() {
    if(input != null) {
      input.close();
    }
  }

}
