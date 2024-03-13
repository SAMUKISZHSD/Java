    import java.util.Scanner;

    public class VerificaEncaixe {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Lendo a quantidade de casos de teste
            System.out.print("Digite a quantidade de casos de teste: ");
            int N = scanner.nextInt();

            // Iterando sobre os casos de teste
            for (int i = 0; i < N; i++) {
                // Lendo os valores de A e B
                int A = scanner.nextInt();
                int B = scanner.nextInt();

                // Verificando e imprimindo o resultado
                System.out.println(verificaEncaixe(A, B));
            }

            scanner.close();
        }

        public static String verificaEncaixe(int A, int B) {
            // Convertendo os números para strings
            String strA = Integer.toString(A);
            String strB = Integer.toString(B);

            // Verificando se B corresponde aos últimos dígitos de A
            if (strA.endsWith(strB)) {
                return "encaixa";
            } else {
                return "nao encaixa";
            }
        }
    }
