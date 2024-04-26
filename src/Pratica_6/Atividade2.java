package Pratica_6;
import javax.swing.JOptionPane;

public class Atividade2 {
    public static void main(String[] args) {
        int numero;
        int fatorial = 1;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número para calcular o seu fatorial: "));
        
        if(numero < 0) {
        	JOptionPane.showMessageDialog(null, "O número informado é inválido!");
        }
        else {
	        for(int i = 1; i <= numero; i++) {
	            fatorial *= i;
	        }
	        JOptionPane.showMessageDialog(null, "O fatorial de " + numero + " é " + fatorial, "!", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
