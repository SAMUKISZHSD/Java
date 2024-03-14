/*Jogo do Tijolo

Há uma vila em Bangladesh, onde o jogo de tijolo é muito popular. Jogo de tijolo é um jogo de equipe. Cada equipe é constituída por um número ímpar de jogadores. O número de jogadores deve ser maior do que 1, mas não pode ser superior a 10. A idade de cada jogador deve estar entre 11(inclusive) e 20(inclusive). Não há dois jogadores com a mesma idade. Há um capitão para cada equipe.

A falta de comunicação entre dois jogadores depende da sua diferença de idade, ou seja, é maior se a diferença de idade for maior. Assim, eles selecionam o capitão de uma equipe de maneira que a quantidade de jogadores desta equipe que são mais jovens e mais velhos do que ele é igual.

As idades de todos os membros da equipe são fornecidas. Você tem que determinar a idade do capitão.

Entrada
A entrada começa com um número inteiro T (T ≤ 100), representando o número de casos de teste. Cada uma das próximas T linhas irá começar com um número inteiro N (1 < N < 11), número de membros da equipe, seguido por N inteiros separados por espaço representando as idades de todos os membros de uma equipe. Cada um destes N inteiros será entre 11 e 20(inclusive). Nota-se que, as idades serão dadas estritamente em ordem crescente ou estritamente em ordem decrescente. Nós não vamos mencionar qual está aumentando e qual está diminuindo, você tem que ser cuidadoso o suficiente para lidar com ambas as situações.

Saída
Para cada caso de teste, imprima uma linha no formato “Case x: a”\(sem as aspas), onde x é o número do caso de teste e a é a idade do capitão.

Exemplo de Entrada	
2
5 19 17 16 14 12
5 12 14 16 17 18

Exemplo de Saída

Case 1: 16
Case 2: 16
*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt(); // Número de casos de teste

        for (int caso = 1; caso <= T; caso++) {
            int N = scanner.nextInt(); // Número de membros da equipe
            int[] idades = new int[N]; // Array para armazenar as idades

            for (int i = 0; i < N; i++) {
                idades[i] = scanner.nextInt(); // Lendo as idades
            }

            // Calculando a idade do capitão
            int capitaoIdade = idades[N / 2];

            // Imprimindo o resultado
            System.out.println("Case " + caso + ": " + capitaoIdade);
        }

        scanner.close();
    }
}
