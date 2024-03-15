/*
Este programa lê um número natural n e calcula o valor de Fibonacci(n) usando a fórmula de Binet. 
A fórmula de Binet é uma expressão fechada para os números de Fibonacci que envolve a raiz quadrada 
de 5 e potências de ((1 + sqrt(5)) / 2) e ((1 - sqrt(5)) / 2), que são os zeros da equação característica 
da relação de recorrência de Fibonacci. O resultado é então impresso com 1 casa decimal.
*/

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        // Lê o número de entrada
        int n = sc.nextInt();
        sc.close();

        // Calcula a raiz quadrada de 5, que é uma constante na fórmula de Binet
        double sqrt5 = Math.sqrt(5);

        // Calcula o valor de Fibonacci(n) usando a fórmula de Binet
        double fib = (Math.pow((1 + sqrt5) / 2, n) - Math.pow((1 - sqrt5) / 2, n)) / sqrt5;

        // Imprime o valor de Fibonacci(n) com 1 casa decimal
        System.out.printf("%.1f\n", fib);
    }
}
