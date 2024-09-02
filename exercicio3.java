import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //tamanho do primeiro angulo.
        System.out.println("\n Digite o primeiro angulo: ");
        int ang1 = scan.nextInt();
        // tamanho do segundo angulo.
        System.out.println("Digite o segundo angulo: ");
        int ang2 = scan.nextInt();

        if((ang1 >= 90) && (ang2 >= 90)){
            System.out.println("Não pode dois angulos maior ou igual à 90º");
        }

        // Tamanho do terceiro angulo.
        System.out.println("Digite o terceiero angulo: ");
        int ang3 = scan.nextInt();

        if(((ang3 >= 90) && (ang1 >= 90)) || ((ang3 >= 90) && (ang2 >= 90))){
            System.out.println("Não pode dois angulos maior ou igual à 90º");
        }

        //Tamanho primero lado.
        System.out.println("\nDigite o tamnaho do primeiro lado: ");
        int lado1 = scan.nextInt();
        //tamanho do segundo lada.
        System.out.println("Digite o tamanho segundo lado: ");
        int lado2 = scan.nextInt();
        //Tamanho do terceiro lado.
        System.out.println("Digite o tamanho do terceiro lado: ");
        int lado3 = scan.nextInt();
        System.out.println("\n");

        if ((ang1 == 90) || (ang2 == 90) || (ang3 == 90)) { //Verificação se é um Triangulo Retângulo
           // System.out.println("Este triangulo é um 'Retângulo");
            if ((lado1 == lado2) && (lado1 == lado3)) {
                System.out.println(" Este triangulo é um 'Retângulo Equilátero', pois todos os lados são iguais: \n" + lado1 + " " + lado2 +" " + lado3 +"\n");
            } else if (((lado1 == lado2) || (lado1 == lado3)) || (lado2 == lado3)) {
                System.out.println("Este triangulo é um 'Retângulo Isósceles', pois possui dois lados iguais: \n" + lado1 +" "+ lado2 +" "+ lado3 +"\n");
            }else if (((lado1 != lado2) && (lado1 != lado3)) || (lado2 != lado3)) {
                System.out.println("Este triangulo é um 'Retângulo Escaleno', pois todos os lados são diferentes: \n" + lado1 +" "+ lado2 +" "+ lado3 +"\n");
            }
        }else if ((ang1 > 90) || (ang2 > 90) || (ang3 > 90)) { // Verificação se é um Triangulo Obtusângulo
            if ((lado1 == lado2) && (lado1 == lado3)) {
                System.out.println("Este triangulo é um 'Obtusângulo Equilátero' pois todos os lados são iguais: \n" + lado1 + " " + lado2 +" " + lado3 +"\n");
            } else if (((lado1 == lado2) || (lado1 == lado3)) || (lado2 == lado3)) {
                System.out.println("Este triangulo é um 'Obtusângulo Isósceles' pois possui dois lados iguais: \n" + lado1 +" "+ lado2 +" "+ lado3 +"\n");
            }else if (((lado1 != lado2) && (lado1 != lado3)) || (lado2 != lado3)) {
                System.out.println("Este triangulo é um 'Obtusângulo Escaleno' pois todos os lados são diferentes: " + lado1 +" "+ lado2 +" "+ lado3 +"\n");
            }
        }else if ((ang1 < 90) && (ang2 < 90) && (ang3 < 90)) { // Verificação se é um Triangulo Acutângulo
            if ((lado1 == lado2) && (lado1 == lado3)) {
                System.out.println("Este triangulo é um 'Acutângulo Equilátero' pois todos os lados são iguais: \n" + lado1 + " " + lado2 +" " + lado3 +"\n");
            } else if (((lado1 == lado2) || (lado1 == lado3)) || (lado2 == lado3)) {
                System.out.println("Este triangulo é um 'Acutângulo Isósceles' pois possui dois lados iguais: \n" + lado1 +" "+ lado2 +" "+ lado3 +"\n");
            }else if (((lado1 != lado2) && (lado1 != lado3)) || (lado2 != lado3)) {
                System.out.println("Este triangulo é um 'Acutângulo Escaleno' pois todos os lados são diferentes: \n" + lado1 +" "+ lado2 +" "+ lado3 +"\n");
            }
        }
 
    }
    
}
