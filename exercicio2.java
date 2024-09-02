import javax.swing.JOptionPane;

public class exercicio2 {
    public static void main(String[] args) {

        
            // Para digitar o valor do salario mínimo 
            float salarioMinimo = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do salário mínimo"));
    
            // Para digitar o valor da hora trabalhada
            float quilowattsConsumida = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade de quilowatts consumida"));
    
            //calculo da quandidade de quilowatts consumida (1% sobre o salário mínimo)
            double quilowattsValor = salarioMinimo * 0.01;
            JOptionPane.showMessageDialog(null,"Quilowhatts consumida:\n " + quilowattsValor);
            
            //calculo para ser pago
            double valorTotal = quilowattsConsumida * quilowattsValor;
            JOptionPane.showMessageDialog(null,"Valor a pagar é de:\n " + valorTotal);
    }
}
