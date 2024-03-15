/* 
Este programa lê o número de crianças e, em seguida, para cada criança, lê o comportamento e o nome da criança. 
Ele adiciona o nome à lista de nomes e incrementa o contador de crianças comportadas ou não comportadas, dependendo do comportamento. 
Depois de ler todos os nomes, ele ordena a lista de nomes e imprime os nomes em ordem alfabética. Finalmente, ele imprime o número de 
crianças que se comportaram e não se comportaram.
*/

// Importando as classes necessárias
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Classe principal
public class Main {
    // Método principal
    public static void main(String[] args) throws IOException {
        // Criando um BufferedReader para ler a entrada do usuário
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Lendo o número de crianças da entrada
        int N = Integer.parseInt(br.readLine());
        
        // Inicializando a lista de nomes e os contadores de comportamento
        List<String> nomes = new ArrayList<>();
        int comportados = 0, naoComportados = 0;

        // Loop para ler o comportamento e o nome de cada criança
        for (int i = 0; i < N; i++) {
            // Lendo a linha da entrada e separando o comportamento e o nome
            String linha = br.readLine();
            char comportamento = linha.charAt(0);
            String nome = linha.substring(2);
            
            // Adicionando o nome à lista de nomes
            nomes.add(nome);

            // Atualizando os contadores de comportamento
            if (comportamento == '+') {
                comportados++;
            } else {
                naoComportados++;
            }
        }

        // Ordenando a lista de nomes em ordem alfabética
        Collections.sort(nomes);

        // Imprimindo os nomes em ordem alfabética
        for (String nome : nomes) {
            System.out.println(nome);
        }

        // Imprimindo o total de crianças que se comportaram bem ou mal
        System.out.println("Se comportaram: " + comportados + " | Nao se comportaram: " + naoComportados);
    }
}
