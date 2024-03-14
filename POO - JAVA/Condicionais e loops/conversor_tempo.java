//Conversão de tempo em java 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criar um Scanner para a entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Ler o valor inteiro representando o tempo em segundos
        int tempoSegundos = scanner.nextInt();

        // Calcular horas, minutos e segundos
        int horas = tempoSegundos / 3600;
        tempoSegundos %= 3600;

        int minutos = tempoSegundos / 60;
        int segundos = tempoSegundos % 60;

        // Imprimir o resultado formatado
        System.out.printf("%d:%d:%d%n", horas, minutos, segundos);

        // Fechar o Scanner
        scanner.close();
    }
}
