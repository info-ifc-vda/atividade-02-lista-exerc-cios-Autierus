import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contadorPrimos = 0;

        // Loop para receber 10 números inteiros
        for (int i = 1; i < 11; i++) {
            System.out.print("Digite o " + i + "º número inteiro: ");
            int numero = scanner.nextInt();

            if (isPrimo(numero)) {
                contadorPrimos++;
            }
        }

        // Mostra a quantidade de números primos
        System.out.println("A quantidade de números primos digitados é: " + contadorPrimos);

        scanner.close();
    }

    // Função que verifica se um número é primo
    public static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
