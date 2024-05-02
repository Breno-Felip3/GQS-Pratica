package Pratica_12;

public class Divisao {
	 public static double dividir(int dividendo, int divisor) throws ArithmeticException {
        if (dividendo == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        if (divisor < 10) {
            throw new ArithmeticException("O divisor deve ser maior ou igual a 10.");
        }
        return (double) dividendo / divisor;
    }
}
