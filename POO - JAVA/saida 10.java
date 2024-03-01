public class Main {
    public static void main(String[] args) {
        // Parte 1
        for (int i = 0; i < 5; i++) {
            printSpaces(7 - i);
            System.out.print((char) ('A' + i));
            if (i > 0) {
                printSpaces(i * 2 - 1);
                System.out.print((char) ('A' + i));
            }
            System.out.println();
        }

        // Parte 2
        for (int i = 3; i >= 0; i--) {
            printSpaces(7 - i);
            System.out.print((char) ('A' + i));
            if (i > 0) {
                printSpaces(i * 2 - 1);
                System.out.print((char) ('A' + i));
            }
            System.out.println();
        }
    }

    // Método para imprimir espaços em branco
    public static void printSpaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }
}
