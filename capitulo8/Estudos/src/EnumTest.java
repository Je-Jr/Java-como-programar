import java.util.EnumSet;

public class EnumTest {
  public static void main(String[] args) {
    for (Book book : Book.values()) {
      System.out.printf("Name: %s%nCopyright year: %s%n%n", book.getTitle(), book.getCopyrightYear());
    }

    System.out.println("...............................");

    for (Book book : EnumSet.range(Book.CHTP, Book.CPPHTP)) {
      System.out.printf("Name: %s%nCopyright year: %s%n%n", book.getTitle(), book.getCopyrightYear());
    }
  }
}
