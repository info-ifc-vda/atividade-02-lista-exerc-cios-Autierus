import java.util.Scanner;

public class Exercicio6 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Recebe o número do usuário
        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();

        // Inicializa a variável fatorial com 1
        long fatorial = 1;

        // Calcula o fatorial do número
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        // Mostra o resultado
        System.out.println("O fatorial de " + numero + " é: " + fatorial);

        scanner.close();
    }
}
