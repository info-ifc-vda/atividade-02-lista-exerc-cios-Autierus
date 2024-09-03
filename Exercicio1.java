package lista2;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String cabecalho = "Valor \t Cubo \t Raiz Quadrada";
        String linha = "---------------------------------------------";

        int contadorLinhas = 0;

        System.out.println("Digite valores para a tabela. Digite um número negativo ou 0 para encerrar.");

        while (true) {

            System.out.print("Digite um valor: ");
            double valor = scanner.nextDouble();

            if (valor <= 0) {
                break;
            }

            double cubo = Math.pow(valor, 3);
            double raizQuadrada = Math.sqrt(valor);


            if (contadorLinhas % 20 == 0) {
                System.out.println("\n" + cabecalho);
                System.out.println(linha);
            }

            System.out.printf(valor +"\t"+ cubo +"\t"+ raizQuadrada +"\n");
            
            contadorLinhas++;
        }
    }
}
