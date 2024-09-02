import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Variáveis 
        int totalDeJogadores = 5 * 11; // total de jogadores 
        int menorDe18 = 0;
        double somaIdadePorTime;
        double somaAlturas = 0;
        double somaIdades = 0;
        int acima80kg = 0;

        for (int time = 1; time <= 5; time++){
            somaIdadePorTime = 0;

            System.out.println("time " + time);

            for (int jogador =1; jogador <= 11; jogador++){
                System.out.println("Jogador "+ jogador);

                //recebendo a idade dos jagadores
                System.out.println("Digite a idade do jogador: ");
                int idade = scan.nextInt();
                somaIdadePorTime += idade;
                somaIdades += idade;

                // Verifica se o jogador tem menos de 18 anos
                if (idade < 18) {
                    menorDe18++;
                }

                // Recebe o peso do jogador
                System.out.print("Digite o peso do jogador (kg): ");
                double peso = scan.nextDouble();

                // Verifica se o jogador pesa mais de 80 kg
                if (peso > 80) {
                    acima80kg++;
                }

                // Recebe a altura do jogador
                System.out.print("Digite a altura do jogador (m): ");
                double altura = scan.nextDouble();
                somaAlturas += altura;
            }

            // Calcula e mostra a média das idades dos jogadores do time
            double mediaIdadeTime = somaIdadePorTime / 11.0;
            System.out.println("Média das idades do Time " + time + ": " + mediaIdadeTime);
            System.out.println();
        }

        // Calcula a média das alturas de todos os jogadores do campeonato
        double mediaAlturaCampeonato = somaAlturas / totalDeJogadores;

        // Calcula a porcentagem de jogadores com mais de 80kg
        double porcentagemJogadoresAcima80kg = (acima80kg / (double) totalDeJogadores) * 100;

        // Mostra os resultados finais
        System.out.println("Quantidade de jogadores com idade inferior a 18 anos: " + menorDe18);
        System.out.println("Média das alturas de todos os jogadores do campeonato: " + mediaAlturaCampeonato + " m");
        System.out.println("Porcentagem de jogadores com mais de 80kg: " + porcentagemJogadoresAcima80kg + "%");

        scan.close();
    }
    
}
