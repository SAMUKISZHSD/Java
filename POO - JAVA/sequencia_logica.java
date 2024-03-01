import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            int quadrado = i * i;
            int cubo = quadrado * i;
            int quartaPotencia = quadrado * quadrado;
            int quintaPotencia = quartaPotencia * i;

            System.out.println(i + " " + quadrado + " " + cubo);
            System.out.println((i) + " " + (quadrado + 1) + " " + (cubo + 1));
        }

        scanner.close();
    }
}