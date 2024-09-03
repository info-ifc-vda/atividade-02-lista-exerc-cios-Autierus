package lista2;
import java.util.Random;

public class Exercicio5 {
    public static void main(String[] args) {        
        
        int[][] matriz = new int[7][7];
        Random random = new Random();

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                matriz[i][j] = random.nextInt(100);
            }
        }

        int[] maiorPorLinha = new int[7];
        int[] menorPorColuna = new int[7];

        for (int i = 0; i < 7; i++) {
            int maior = matriz[i][0];
            for (int j = 1; j < 7; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
            maiorPorLinha[i] = maior;
        }

        // Calculando o menor elemento de cada coluna
        for (int j = 0; j < 7; j++) {
            int menor = matriz[0][j];
            for (int i = 1; i < 7; i++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
            menorPorColuna[j] = menor;
        }


        System.out.println("Matriz 7x7:");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("\t" + matriz[i][j]);
            }
            System.out.println();
        }

        System.out.println("Maior número de cada linha:");
        for (int i = 0; i < 7; i++) {
            System.out.print(maiorPorLinha[i] + " ");
        }
        System.out.println();

        System.out.println("Menor número de cada coluna:");
        for (int j = 0; j < 7; j++) {
            System.out.print(menorPorColuna[j] + " ");
        }
        System.out.println();
    }
}

