/*
Funções
Na última aula de matemática, Rafael, Beto e Carlos aprenderam algumas novas funções matemáticas. Cada um deles se identificou com uma função em especial, e resolveram competir para ver quem tinha a função de maior resultado.

A função que Rafael escolheu é r(x, y) = (3x)² + y².

Já Beto escolheu a função b(x, y) = 2(x²) + (5y)².

Carlos, por sua vez, escolheu a função c(x, y) = -100x + y³.

Dados os valores x e y, diga quem escolheu a função com o maior resultado.

Entrada
A primeira linha de entrada contém um inteiro N que determina a quantidade de casos de teste. Cada caso de teste consiste em dois inteiros x e y (1 ≤ x, y ≤ 100), indicando as variáveis a serem inseridas na função.

Saída
Para cada caso de teste imprima uma linha, contendo uma frase, indicando quem ganhou a competição. Por exemplo, se Rafael ganhar a competição, imprima “Rafael ganhou”. Assuma que nunca haverá empates.

Exemplo de Entrada

6
5 3
2 30
2 100
30 20
15 5
30 2

Exemplo de Saída

Beto ganhou
Carlos ganhou
Carlos ganhou
Beto ganhou
Rafael ganhou
Rafael ganhou
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // Número de casos de teste

        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            // Calculando os resultados das funções para cada participante
            int resultadoRafael = calcularRafael(x, y);
            int resultadoBeto = calcularBeto(x, y);
            int resultadoCarlos = calcularCarlos(x, y);

            // Verificando quem ganhou e imprimindo o resultado
            if (resultadoRafael > resultadoBeto && resultadoRafael > resultadoCarlos) {
                System.out.println("Rafael ganhou");
            } else if (resultadoBeto > resultadoCarlos) {
                System.out.println("Beto ganhou");
            } else {
                System.out.println("Carlos ganhou");
            }
        }

        scanner.close();
    }

    // Função para calcular o resultado da função de Rafael
    private static int calcularRafael(int x, int y) {
        return (int) Math.pow((3 * x), 2) + (int) Math.pow(y, 2);
    }

    // Função para calcular o resultado da função de Beto
    private static int calcularBeto(int x, int y) {
        return 2 * (int) Math.pow(x, 2) + (int) Math.pow((5 * y), 2);
    }

    // Função para calcular o resultado da função de Carlos
    private static int calcularCarlos(int x, int y) {
        return -100 * x + (int) Math.pow(y, 3);
    }
}



