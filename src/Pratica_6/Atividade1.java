package Pratica_6;
import javax.swing.JOptionPane;

public class Atividade1 {
	public static void main(String[] arg) {		
		
		 int primeiroNumero;
	     int segundoNumero;
	     int somaImpares = 0;
	        
	        do {
	            primeiroNumero = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número: "));
	            segundoNumero = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número: "));
	   
	            if (primeiroNumero <= 0 || segundoNumero <= 0) {
	                JOptionPane.showMessageDialog(null, "Por favor, informe números positivos.");
	            }
	            
	            for(int i = 0; i <= primeiroNumero; i++) {
	            	if(i % 2 != 0) {
	            		somaImpares += i;
	            	}
	            }
	            JOptionPane.showMessageDialog(null, "A soma dos números ímpares de 0 a " + primeiroNumero + " é = " + somaImpares);
	           
	            somaImpares = 0;
	            for(int i = 0; i <= segundoNumero; i++) {
	            	if(i % 2 != 0) {
	            		somaImpares += i;
	            	}
	            }
	            JOptionPane.showMessageDialog(null, "A soma dos números ímpares de 0 a " + segundoNumero + " é = " + somaImpares);
	            
	        } while (primeiroNumero <= 0 || segundoNumero <= 0);
	    }
	}
