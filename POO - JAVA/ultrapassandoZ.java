//Ultrapassando z

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        int Z;

        do {
            Z = scanner.nextInt();
        } while (Z <= X);

        int soma = X;
        int numerosSomados = 1;
        int valorAtual = X + 1;

        while (soma <= Z) {
            soma += valorAtual;
            valorAtual++;
            numerosSomados++;
        }

        System.out.println(numerosSomados);

        scanner.close();
    }
}
