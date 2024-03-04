import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criar um Scanner para a entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Ler o valor inteiro N
        int N = scanner.nextInt();

        // Imprimir o valor lido
        System.out.println(N);

        // Array com os valores das cédulas disponíveis
        int[] cedulas = {100, 50, 20, 10, 5, 2, 1};

        // Iterar sobre as cédulas
        for (int cedula : cedulas) {
            // Calcular a quantidade de cédulas necessárias
            int quantidade = N / cedula;

            // Atualizar o valor de N para o restante
            N %= cedula;

            // Imprimir a quantidade de cédulas necessárias
            System.out.println(quantidade + " nota(s) de R$ " + cedula + ",00");
        }

        // Fechar o Scanner
        scanner.close();
    }
}