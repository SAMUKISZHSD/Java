//Soma Simples em java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criar um Scanner para a entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Ler dois valores inteiros
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        // Calcular a soma
        int SOMA = A + B;

        // Imprimir a mensagem "SOMA" e o valor da soma
        System.out.println("SOMA = " + SOMA);

        // Fechar o Scanner
        scanner.close();
    }
}