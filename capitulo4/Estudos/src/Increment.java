public class Increment {
    public static void main(String[] args) {
        int c = 5;
        System.out.printf("c before postincrement: %d%n", c);
        System.out.printf("    postincrementing c: %d%n", c++);
        System.out.printf(" c after postincrement: %d%n", c);

        c = 5;
        System.out.printf("c before pretincrement: %d%n", c);
        System.out.printf("    pretincrementing c: %d%n", ++c);
        System.out.printf(" c after pretincrement: %d%n", c);
    }
}
