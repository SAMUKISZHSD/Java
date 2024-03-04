//Quantas mandiocas em java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criar um Scanner para a entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Ler as porções dos convidados
        int curupira = scanner.nextInt();
        int boitata = scanner.nextInt();
        int boto = scanner.nextInt();
        int mapinguari = scanner.nextInt();
        int iara = scanner.nextInt();

        // Calcular a quantidade total de mandioca
        int totalMandioca = (curupira * 300) + (boitata * 1500) + (boto * 600) + (mapinguari * 1000) + (iara * 150) + 225;

        // Imprimir o resultado
        System.out.println(totalMandioca);

        // Fechar o Scanner
        scanner.close();
    }
}
