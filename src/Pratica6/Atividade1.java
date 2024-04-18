package Pratica6;
import javax.swing.JOptionPane;

public class Atividade1 {
	public static void main(String[] arg) {		
		
		 int primeiroNumero;
	     int segundoNumero;
	        
	        do {
	            primeiroNumero = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número: "));
	            segundoNumero = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número: "));
	            
	            if (primeiroNumero <= 0 || segundoNumero <= 0) {
	                JOptionPane.showMessageDialog(null, "Por favor, informe números positivos.");
	            }
	        } while (primeiroNumero <= 0 || segundoNumero <= 0);
	    }
	}
