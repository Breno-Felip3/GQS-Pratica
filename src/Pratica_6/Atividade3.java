package Pratica_6;
import javax.swing.JOptionPane;
public class Atividade3 {
	public static void main(String[] arg) {		
		
		int idade;
		int somatoriaIdade = 0;
		int contador = 0;
		float media = 0;
		
		do {
			idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade para ser calculada a média "
					+ "aritmética ou um número negativo para sair: "));
			
			somatoriaIdade += idade;			
			contador ++;
			
			if(idade > 0) {
				media = (somatoriaIdade / contador);
			}
			
		}while(idade > 0);
		
		JOptionPane.showMessageDialog(null, "A média das idades informadas é = " + media);
	}
}
