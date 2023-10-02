// Figura 8.6: Time2Test.java
// Construtores sobrecarregados utilizados para inicializar objetos Time2.

public class Time2Test {
    public static void main(String[] args) {
        Time2 t1 = new Time2(); // 00:00:00
        Time2 t2 = new Time2(2); // 02:00:00
        Time2 t3 = new Time2(21, 34); // 21:34:00
        Time2 t4 = new Time2(12, 25, 42); // 12:25:42
        Time2 t5 = new Time2(t4); // 12:25:42

        System.out.println("Constructed with:");
        displayTime("t1: todos com argumentos padrao", t1);
        displayTime("t2: hora especificada, argumento padrao nos minutos e segundos", t2);
        displayTime("t3: hora e minutos especificados, argumento padrao nos segundos", t3);
        displayTime("t4: hora, minutos e segundos especificados", t4);
        displayTime("t5: Time2 object t4 specified", t5);

        // Tenta inicializar t6 com valores inválidos
        try {
            new Time2(27, 74, 99);
        } catch (IllegalArgumentException e) {
            System.out.printf("%nException while initializing t6: %s%n", e.getMessage());
        }
    }

    // Exibe um objeto Time2 nos formatos de 24 horas e 12 horas
    private static void displayTime(String header, Time2 t) {
        System.out.printf("%s%n %s%n %s%n",
            header, t.toUniversalString(), t.toString());
    }
} // Fim da classe Time2Test
