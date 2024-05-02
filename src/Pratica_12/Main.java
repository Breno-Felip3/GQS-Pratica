package Pratica_12;
import javax.swing.JOptionPane;
public class Main {
	 public static void main(String[] args) {
		 int numerador = 0;
		 int denominador = 0;
		 double resultado = 0;
        try {
	    	 String inputDividendo = JOptionPane.showInputDialog("Digite o numerador:");
	    	 numerador = Integer.parseInt(inputDividendo);
	
	         String inputDivisor = JOptionPane.showInputDialog("Digite o denominador:");
	         denominador = Integer.parseInt(inputDivisor);

	         resultado = Divisao.dividir(numerador, denominador);
            JOptionPane.showMessageDialog(null, "Resultado da divisão: " + resultado);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Digite um número válido.");
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }
}
