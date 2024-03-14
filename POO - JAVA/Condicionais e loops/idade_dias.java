//Idade em dias em java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criar um Scanner para a entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Ler o valor inteiro correspondente à idade em dias
        int idadeEmDias = scanner.nextInt();

        // Calcular anos, meses e dias
        int anos = idadeEmDias / 365;
        idadeEmDias %= 365;

        int meses = idadeEmDias / 30;
        idadeEmDias %= 30;

        int dias = idadeEmDias;

        // Imprimir o resultado formatado
        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");

        // Fechar o Scanner
        scanner.close();
    }
}