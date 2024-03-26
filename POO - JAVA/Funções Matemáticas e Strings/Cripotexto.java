/* Ele lê um número "c" e, em seguida, lê c palavras. Para cada palavra, ele inverte a ordem dos caracteres e imprime 
a palavra invertida, mas apenas os caracteres de ‘a’ a ‘z’.  */

// Importa as classes necessárias para entrada de dados
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // Cria um BufferedReader para ler a entrada do usuário
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Lê a primeira linha da entrada do usuário e a converte em um inteiro
        int c = Integer.parseInt(br.readLine());

        // Loop que executa 'c' vezes
        for (int contador = 0; contador < c; contador++) {
            // Lê a próxima linha da entrada do usuário
            String palavra = br.readLine();
            // Cria um StringBuilder para construir a string invertida
            StringBuilder reversed = new StringBuilder();

            // Loop que percorre a string de trás para frente
            for (int pos = palavra.length() - 1; pos >= 0; pos--) {
                // Obtém o caractere atual
                char currentChar = palavra.charAt(pos);
                // Verifica se o caractere atual é uma letra minúscula
                if (currentChar >= 'a' && currentChar <= 'z') {
                    // Adiciona o caractere à string invertida
                    reversed.append(currentChar);
                }
            }

            // Imprime a string invertida
            System.out.println(reversed.toString());
        }
    }
}
