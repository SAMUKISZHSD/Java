//Calibrador de Pneu

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criar um Scanner para a entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Ler a pressão desejada e a pressão lida
        int pressaoDesejada = scanner.nextInt();
        int pressaoLida = scanner.nextInt();

        // Calcular a diferença entre as pressões
        int diferencaPressao = pressaoDesejada - pressaoLida;

        // Imprimir o resultado
        System.out.println(diferencaPressao);

        // Fechar o Scanner
        scanner.close();
    }
}
