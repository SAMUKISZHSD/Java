//Produto Simples - Multiplicação em Java - Calibrador de Pneu

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criar um Scanner para a entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Ler dois valores inteiros
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        // Calcular o produto
        int PROD = A * B;

        // Imprimir a mensagem "PROD" e o valor do produto
        System.out.println("PROD = " + PROD);

        // Fechar o Scanner
        scanner.close();
    }
}