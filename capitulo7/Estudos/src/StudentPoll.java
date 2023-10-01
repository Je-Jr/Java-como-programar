public class StudentPoll {
  public static void main(String[] args) {
    int[] responses = { 1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14 };

    int[] frequencia = new int[6];

    for(int answer = 0; answer < responses.length; answer++) {
      try {
        ++frequencia[responses[answer]];
      } catch(IndexOutOfBoundsException e) {
        System.out.println(e);
        System.out.printf(" responses[%d] = %d%n%n", answer, responses[answer]);
      }
    }

    for (int i = 1; i < frequencia.length; i++) {
      System.out.printf("%5d %10d%n", i, frequencia[i]);
    }

  }
}