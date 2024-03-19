/*
Ele lê o número de palavras.
Para cada palavra, ele verifica se a palavra é semelhante a “one”, “two” ou “three” usando a função isSimilar.
A função isSimilar compara cada caractere da palavra com a palavra alvo e conta o número de diferenças. Se o número de diferenças for menor ou igual a 1, a função retorna true, indicando que a palavra é semelhante à palavra alvo.
Se a palavra for semelhante a “one”, “two” ou “three”, o programa imprime o valor numérico correspondente.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            if (isSimilar(word, "one")) {
                System.out.println(1);
            } else if (isSimilar(word, "two")) {
                System.out.println(2);
            } else if (isSimilar(word, "three")) {
                System.out.println(3);
            }
        }
    }

    private static boolean isSimilar(String word, String target) {
        if (word.length() != target.length()) {
            return false;
        }

        int diff = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != target.charAt(i)) {
                diff++;
            }
        }

        return diff <= 1;
    }
}
