/*Encaixa ou Não I

Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
Paulinho tem em suas mãos um pequeno problema. A professora lhe pediu que ele construísse um programa para verificar, à partir de dois valores inteiros A e B, se B corresponde aos últimos dígitos de A.

Entrada
A entrada consiste de vários casos de teste. A primeira linha de entrada contém um inteiro N que indica a quantidade de casos de teste. Cada caso de teste consiste de dois inteiros A (1 ≤ A < 231 ) e B (1 ≤ B < 231) positivos.

Saída
Para cada caso de entrada imprima uma mensagem indicando se o segundo valor encaixa no primeiro valor, confome exemplo abaixo.

Exemplo de Entrada	Exemplo de Saída
4			encaixa
5678690 78690		nao encaixa
5434554 543		encaixa
1243 1243		nao encaixa
54 654	*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo o número de casos de teste
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            // Lendo os valores A e B
            long A = scanner.nextLong();
            long B = scanner.nextLong();

            // Verificando se B encaixa nos últimos dígitos de A
            if (encaixa(A, B)) {
                System.out.println("encaixa");
            } else {
                System.out.println("nao encaixa");
            }
        }

        scanner.close();
    }

    // Função para verificar se B encaixa nos últimos dígitos de A
    private static boolean encaixa(long A, long B) {
        // Obtendo o número de dígitos de B
        int numDigitsB = Long.toString(B).length();

        // Obtendo os últimos dígitos de A com o mesmo comprimento de B
        long lastDigitsA = A % (long) Math.pow(10, numDigitsB);

        // Verificando se os últimos dígitos de A são iguais a B
        return lastDigitsA == B;
    }
}