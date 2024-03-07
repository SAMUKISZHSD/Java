import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente
        
        for (int i = 0; i < N; i++) {
            String linha = scanner.nextLine();
            int soma = calcularSomaNumeros(linha);
            System.out.println(soma);
        }
        
        scanner.close();
    }
    
    private static int calcularSomaNumeros(String linha) {
        int soma = 0;
        
        // Loop para percorrer a linha e extrair os números
        for (int i = 0; i < linha.length(); i++) {
            char caractere = linha.charAt(i);
            // Verificar se o caractere é um dígito
            if (Character.isDigit(caractere)) {
                // Extrair o número da linha
                String numero = "";
                while (i < linha.length() && Character.isDigit(linha.charAt(i))) {
                    numero += linha.charAt(i);
                    i++;
                }
                // Adicionar o número à soma
                soma += Integer.parseInt(numero);
            }
        }
        
        return soma;
    }
}
