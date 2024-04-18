package Pratica6;
import javax.swing.JOptionPane;
public class Atividade4 {
	public static void main(String[] args) {
		
		int numero;
		int maior = 0;
		int menor = 0;
		int contador = 0;
		
		do {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número positivo "
					+ "ou um número negativo para sair: "));
			
			if(contador == 0) {
				maior = numero;
				menor = numero;
			}
			
			if(numero > maior) {
				maior = numero;
			}
			else if(numero >=0 && numero < menor) {
				menor = numero;
			}
			
			contador ++;
		} while(numero >= 0);
		
		 JOptionPane.showMessageDialog(null, "O maior número informado foi o " + maior + " E o menor número informado foi o " + menor);
	}
}