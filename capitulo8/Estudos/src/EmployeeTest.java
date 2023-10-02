public class EmployeeTest {
  public static void main(String[] args) {
    Date birth = new Date(30, 01, 1999);
    Date hire = new Date(20, 9, 2020);
    Employee jr = new Employee("Jorge", "Junior", birth, hire);

    System.out.println(jr);
  }
}
