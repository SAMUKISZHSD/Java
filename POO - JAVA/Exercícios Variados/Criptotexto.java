/*
FAILED

Este código funciona da seguinte maneira:

Ele lê o número de mensagens codificadas.
Para cada mensagem, ele percorre cada caractere da mensagem.
Se o caractere é uma letra minúscula, ele é adicionado a um StringBuilder.
Após percorrer todos os caracteres, o texto oculto extraído da mensagem é comparado com “sapo”, “batata” e “arroz” usando a função isSimilar.
Se a mensagem decodificada for semelhante a “sapo”, “batata” ou “arroz”, o programa imprime a palavra correspondente.
A função isSimilar compara cada caractere da palavra com a palavra alvo e conta o número de diferenças. 
Se o número de diferenças for menor ou igual a 1, a função retorna true, indicando que a palavra é semelhante à palavra alvo. 

*/ 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine());

        for (int i = 0; i < C; i++) {
            String message = br.readLine();
            StringBuilder sb = new StringBuilder();

            for (char c : message.toCharArray()) {
                if (Character.isLowerCase(c)) {
                    sb.append(c);
                }
            }

            String decodedMessage = sb.toString();

            if (isSimilar(decodedMessage, "sapo")) {
                System.out.println("sapo");
            } else if (isSimilar(decodedMessage, "batata")) {
                System.out.println("batata");
            } else if (isSimilar(decodedMessage, "arroz")) {
                System.out.println("arroz");
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
