import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Recebe dois números do usuário
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        // Determina os limites do intervalo
        int inicio = Math.min(numero1, numero2);
        int fim = Math.max(numero1, numero2);

        // Calcula o fatorial de todos os números no intervalo
        for (int i = inicio; i <= fim; i++) {
            long fatorial = 1;
            for (int j = 1; j <= i; j++) {
                fatorial *= j;
            }
            System.out.println("O fatorial de " + i + " é: " + fatorial);
        }

        scanner.close();
    }
}
