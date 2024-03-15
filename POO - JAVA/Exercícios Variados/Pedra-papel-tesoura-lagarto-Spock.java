/*
Este programa lê o número de casos de teste e, para cada caso, lê as escolhas de Rajesh e Sheldon. 
Em seguida, verifica as regras do jogo para determinar o vencedor e imprime o resultado. Se as escolhas forem iguais, é um empate. 
Se a escolha de Rajesh vence a de Sheldon de acordo com as regras, Rajesh ganha. Caso contrário, Sheldon ganha. 
As regras do jogo são representadas como um mapa, onde a chave é a escolha e o valor é uma string contendo as escolhas 
que são derrotadas por essa escolha.
*/

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Lê o número de casos de teste
        int T = scanner.nextInt();
        
        // Consome a linha restante após a leitura do número de casos de teste
        scanner.nextLine();  
        
        // Cria um mapa para armazenar as regras do jogo
        Map<String, String> rules = new HashMap<>();
        rules.put("tesoura", "papel lagarto");
        rules.put("papel", "pedra spock");
        rules.put("pedra", "lagarto tesoura");
        rules.put("lagarto", "spock papel");
        rules.put("spock", "tesoura pedra");
        
        // Processa cada caso de teste
        for (int i = 0; i < T; i++) {
            // Lê as escolhas de Rajesh e Sheldon
            String[] choices = scanner.nextLine().split(" ");
            
            // Verifica o resultado do jogo
            if (choices[0].equals(choices[1])) {
                // Se as escolhas são iguais, é um empate
                System.out.println("empate");
            } else if (rules.get(choices[0]).contains(choices[1])) {
                // Se a escolha de Rajesh vence a de Sheldon de acordo com as regras, Rajesh ganha
                System.out.println("rajesh");
            } else {
                // Caso contrário, Sheldon ganha
                System.out.println("sheldon");
            }
        }
    }
}
