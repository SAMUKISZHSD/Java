import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicializando as contagens de cada tipo de combustível
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        // Lendo os códigos dos clientes até que seja informado o código 4
        int codigo;
        do {
            codigo = scanner.nextInt();
            switch (codigo) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
                case 4:
                    break;
            }
        } while (codigo != 4);

        // Imprimindo a mensagem de agradecimento e as quantidades de cada tipo de combustível
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        scanner.close();
    }
}
