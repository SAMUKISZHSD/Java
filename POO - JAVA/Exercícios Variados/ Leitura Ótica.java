import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int N = scanner.nextInt();
            if (N == 0) break;
            for (int i = 0; i < N; i++) {
                int[] answers = new int[5];
                for (int j = 0; j < 5; j++) {
                    answers[j] = scanner.nextInt();
                }
                printAnswer(answers);
            }
        }
        scanner.close();
    }

    private static void printAnswer(int[] answers) {
        int countBlack = 0;
        int blackIndex = -1;
        for (int i = 0; i < 5; i++) {
            if (answers[i] <= 127) {
                countBlack++;
                blackIndex = i;
            }
        }
        if (countBlack == 1) {
            System.out.println((char) ('A' + blackIndex));
        } else {
            System.out.println("*");
        }
    }
}
