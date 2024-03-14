import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X;

        while ((X = scanner.nextInt()) != 0) {
            int soma = 0;
            int contadorPares = 0;

            // Se X for ímpar, somamos 1 para começar a partir do próximo par
            if (X % 2 != 0) {
                X++;
            }

            // Calcula a soma dos 5 pares consecutivos a partir de X
            while (contadorPares < 5) {
                soma += X;
                X += 2;
                contadorPares++;
            }

            System.out.println(soma);
        }

        scanner.close();
    }
}
