//Quadrado ao Cubo 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criar um Scanner para a entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Ler o valor inteiro N
        int N = scanner.nextInt();

        // Imprimir a saída conforme o exemplo fornecido
        for (int i = 1; i <= N; i++) {
            System.out.printf("%d %d %d%n", i, i * i, i * i * i);
        }

        // Fechar o Scanner
        scanner.close();
    }
}