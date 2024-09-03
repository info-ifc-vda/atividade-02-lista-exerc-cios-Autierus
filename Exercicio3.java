package lista2;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[5];

        System.out.println("Digite 10 valores inteiros:");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vetor1[i] = scanner.nextInt();
        }

        System.out.println("Digite 5 valores inteiros para o vetor2:");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vetor2[i] = scanner.nextInt();
        }


        int[] resultado1 = new int[vetor1.length];
        int[] resultado2 = new int[vetor1.length];

        for (int i = 0; i < vetor1.length; i++) {
            if (vetor1[i] % 2 == 0) { 
                int soma = 0;
                for (int num : vetor2) {
                    soma += (vetor1[i] + num);
                }
                resultado1[i] = soma;
            } else {
                resultado1[i] = 0;
            }
        }


        for (int i = 0; i < vetor1.length; i++) {
            if (vetor1[i] % 2 != 0) { 
                int count = 0;
                for (int num : vetor2) {
                    if (vetor1[i] % num == 0) {
                        count++;
                    }
                }
                resultado2[i] = count;
            } else {
                resultado2[i] = 0;
            }
        }

        System.out.println("");
        System.out.println("Vetor Resultante 1:");
        for (int num : resultado1) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Vetor Resultante 2:");
        for (int num : resultado2) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }
}
