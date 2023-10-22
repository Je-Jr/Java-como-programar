import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StBuilder {
  public static void main(String[] args) {
    String name = "Jorge Pereira Viana Junior";
    String regex = "J[o]";

    Pattern pattern = Pattern.compile(regex);

    StringBuilder sb = new StringBuilder(name);

    Matcher matcher = pattern.matcher(sb);

    while(matcher.find()) {
      System.out.println("Encontrada: " + matcher.group());
    }
  }
}
