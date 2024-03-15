/*
Este programa lê a quantidade de números na lista e os números da lista. 
Em seguida, ele conta quantos números são múltiplos de 2, 3, 4 e 5 e imprime essas quantidades.
*/


import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);
        
        // Lê o número de elementos na lista
        int N = sc.nextInt();
        
        // Cria um array para armazenar os números da lista
        int[] lista = new int[N];
        
        // Lê os números da lista
        for (int i = 0; i < N; i++) {
            lista[i] = sc.nextInt();
        }
        
        // Fecha o scanner após a leitura
        sc.close();

        // Cria um array para armazenar a contagem de múltiplos
        int[] mult = new int[6];
        
        // Percorre a lista e incrementa a contagem de múltiplos correspondente
        for (int i = 0; i < N; i++) {
            if (lista[i] % 2 == 0) mult[2]++;
            if (lista[i] % 3 == 0) mult[3]++;
            if (lista[i] % 4 == 0) mult[4]++;
            if (lista[i] % 5 == 0) mult[5]++;
        }

        // Imprime a contagem de múltiplos
        System.out.println(mult[2] + " Multiplo(s) de 2");
        System.out.println(mult[3] + " Multiplo(s) de 3");
        System.out.println(mult[4] + " Multiplo(s) de 4");
        System.out.println(mult[5] + " Multiplo(s) de 5");
    }
}
