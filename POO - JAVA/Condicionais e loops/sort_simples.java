import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo os três valores inteiros
        int[] valores = new int[3];
        for (int i = 0; i < 3; i++) {
            valores[i] = scanner.nextInt();
        }

        // Ordenando os valores em ordem crescente
        int[] valoresOrdenados = Arrays.copyOf(valores, 3);
        Arrays.sort(valoresOrdenados);

        // Imprimindo os valores em ordem crescente
        for (int valor : valoresOrdenados) {
            System.out.println(valor);
        }

        System.out.println();

        // Imprimindo os valores na sequência em que foram lidos
        for (int valor : valores) {
            System.out.println(valor);
        }

        scanner.close();
    }
}
