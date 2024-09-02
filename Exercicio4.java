import javax.swing.JOptionPane;

public class Exercicio4 {
    public static void main(String[] args) {

        double valor = 0;
        double precoDes = 0;

        //para digitar o código do produto
        int codigo = Integer.parseInt( JOptionPane.showInputDialog("Digite o código do produto"));
        if ((codigo > 0) && (codigo <= 10)){
           double preco = 10.00;
            int quant = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de produtos"));
            int result = quant * 10;
            
            if (result <= 250) {
                valor = result * 0.05;
                precoDes = result - valor;

            }else if ((result > 250) && (result < 501)) {
                valor = result * 0.10;
                precoDes = result - valor;

            }else if ((result > 500)) {
                valor = result * 0.15;
                precoDes = result - valor;
            }
            JOptionPane.showMessageDialog(null," Preço do produto: " + preco +"\nPreço total: " + result + "\nValor descontado: " + valor + "\nValor à pagar: " + precoDes );

        }else if ((codigo >= 11) && (codigo < 21)) {
            double preco = 15.00;
            int quant = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de produtos"));
            int result = quant * 15;
            if (result <= 250) {
                valor = result * 0.05;
                precoDes = result - valor;

            }else if ((result > 250) && (result < 501)) {
                valor = result * 0.10;
                precoDes = result - valor;

            }else if ((result > 500)) {
                valor = result * 0.15;
                precoDes = result - valor;
            }
            JOptionPane.showMessageDialog(null," Preço do produto: " + preco +"\nPreço total: " + result + "\nValor descontado: " + valor + "\nValor à pagar: " + precoDes );

        }else if ((codigo >= 21) && (codigo < 31)) {
            double preco = 20.00;
            int quant = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de produtos"));
            int result = quant * 20;
            if (result <= 250) {
                valor = result * 0.05;
                precoDes = result - valor;

            }else if ((result > 250) && (result < 501)) {
                valor = result * 0.10;
                precoDes = result - valor;

            }else if ((result > 500)) {
                 valor = result * 0.15;
                 precoDes = result - valor;
            }
            JOptionPane.showMessageDialog(null," Preço do produto: " + preco +"\nPreço total: " + result + "\nValor descontado: " + valor + "\nValor à pagar: " + precoDes );

        }else if ((codigo >= 31) && (codigo < 41)) {
            double preco = 40.00;
            int quant = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de produtos"));
            int result = quant * 40;
            if (result <= 250) {
                valor = result * 0.05;
                precoDes = result - valor;

            }else if ((result > 250) && (result < 501)) {
                valor = result * 0.10;
                precoDes = result - valor;

            }else if ((result > 500)) {
                valor = result * 0.15;
                precoDes = result - valor;
            }
            JOptionPane.showMessageDialog(null," Preço do produto: " + preco +"\nPreço total: " + result + "\nValor descontado: " + valor + "\nValor à pagar: " + precoDes );
        }

        
    }
    
}  