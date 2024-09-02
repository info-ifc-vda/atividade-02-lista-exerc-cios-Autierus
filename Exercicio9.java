import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Recebe um número do usuário
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Verifica se o número é primo
        boolean isPrimo = true;

        if (numero <= 1) {
            isPrimo = false; // Números menores ou iguais a 1 não são primos
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    isPrimo = false; // Se o número for divisível por qualquer número diferente de 1 e dele mesmo, não é primo
                    break;
                }
            }
        }

        // Exibe o resultado
        if (isPrimo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

        scanner.close();
    } 
}
