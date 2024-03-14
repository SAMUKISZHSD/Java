//Corrida em Java - Calibrador de Pneu

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criar um Scanner para a entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Ler os valores de C e N
        int C = scanner.nextInt();
        int N = scanner.nextInt();

        // Calcular o ponto de término
        int pontoTermino = C % N;

        // Imprimir o resultado
        System.out.println(pontoTermino);

        // Fechar o Scanner
        scanner.close();
    }
}
