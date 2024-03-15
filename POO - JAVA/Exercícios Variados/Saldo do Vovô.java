/*
Este programa lê o número de dias e o saldo inicial da entrada padrão. Em seguida, para cada dia, lê a movimentação do dia e atualiza o saldo.
 Se o saldo atual for menor que o menor saldo registrado até agora, o menor saldo é atualizado. Finalmente, o programa imprime o menor saldo
registrado.
*/

// Importando as classes necessárias
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Classe principal
public class Main {
    // Método principal
    public static void main(String[] args) throws IOException {
        // Criando um BufferedReader para ler a entrada do usuário
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Lendo a primeira linha da entrada e dividindo-a em dois números
        String[] inputs = br.readLine().split(" ");
        
        // Convertendo os números de String para int
        int N = Integer.parseInt(inputs[0]); // Número de dias
        int S = Integer.parseInt(inputs[1]); // Saldo inicial
        
        // Inicializando o saldo e o menor saldo
        int saldo = S;
        int menorSaldo = saldo;

        // Loop para ler as movimentações dos próximos N dias
        for (int i = 0; i < N; i++) {
            // Lendo a movimentação do dia e convertendo-a para int
            int movimentacao = Integer.parseInt(br.readLine());
            
            // Atualizando o saldo
            saldo += movimentacao;
            
            // Se o saldo atual for menor que o menor saldo registrado até agora,
            // atualiza o menor saldo
            if (saldo < menorSaldo) {
                menorSaldo = saldo;
            }
        }

        // Imprimindo o menor saldo registrado
        System.out.println(menorSaldo);
    }
}
