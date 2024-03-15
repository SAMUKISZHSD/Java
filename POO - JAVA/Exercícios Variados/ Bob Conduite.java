/* Este programa lê o número de casos de teste e, para cada caso, lê os raios dos dois cabos. 
Em seguida, imprime a soma dos raios, que é o menor raio do conduite que pode englobar ambos os cabos. 
Isso ocorre porque os dois cabos podem ser dispostos de tal forma que formem uma linha reta dentro do conduite, exigindo 
um conduite com raio igual à soma dos raios dos cabos.*/

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int R1 = scanner.nextInt();
            int R2 = scanner.nextInt();
            System.out.println(R1 + R2);
        }
    }
}
