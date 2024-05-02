package Pratica_12;
import javax.swing.JOptionPane;
public class Atividade_1 {
	 public static void main(String[] args) {
		 int numerador = 0;
		 int denominador = 0;
		 double resultado = 0;
        try {
            String inputDividendo = JOptionPane.showInputDialog("Digite o numerador:");
            numerador = Integer.parseInt(inputDividendo);

            String inputDivisor = JOptionPane.showInputDialog("Digite o denominador:");
            denominador = Integer.parseInt(inputDivisor);

            resultado = divide(numerador, denominador);
            JOptionPane.showMessageDialog(null, "Resultado da divisão: " + resultado);
        } 
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Digite um número válido.");
        } 
        catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Erro: Não tem como existir divisão por Zero.");
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }

    public static double divide(int numerador, int denominador) {
        if (numerador == 0) {
            throw new ArithmeticException("Não é permitido ter divisão por zero");
        }
        return (double) numerador / denominador;
    }
}
