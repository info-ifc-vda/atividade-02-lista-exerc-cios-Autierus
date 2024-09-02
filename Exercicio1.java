import javax.swing.JOptionPane;

public class Exercicio1{
    public static void main(String[] args) {

        float imposto = 0, salarioBruto = 0, salarioLiquido = 0;

        // Para digitar o numero de horas trabalhadas
        float horas = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas"));

        // Para digitar o valor da hora trabalhada
        float valor = Float.parseFloat(JOptionPane.showInputDialog("Digite a valor da hora"));

        //calculo do salário Bruto
        salarioBruto = horas * valor;
        JOptionPane.showMessageDialog(null,"Salário bruto: " + salarioBruto);
        
        //calculo do imposto (30% sálario bruto)
        imposto = salarioBruto * 0.30f;
        JOptionPane.showMessageDialog(null,"Imposto de 30% do salário bruto: " + imposto);

        // salário para receber 
        salarioLiquido = salarioBruto - imposto;
        JOptionPane.showMessageDialog(null,"Salário Líquido: " + salarioLiquido);

    }
}