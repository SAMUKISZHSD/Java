import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] N = new int[20];

        // Lendo os valores para o vetor N
        for (int i = 0; i < 20; i++) {
            N[i] = scanner.nextInt();
        }

        // Trocando os elementos do vetor
        for (int i = 0; i < 10; i++) {
            int temp = N[i];
            N[i] = N[19 - i];
            N[19 - i] = temp;
        }

        // Imprimindo o vetor modificado
        for (int i = 0; i < 20; i++) {
            System.out.println("N[" + i + "] = " + N[i]);
        }

        scanner.close();
    }
}
