package Pratica_3;
import java.util.Scanner;
public class Atividade3 {
	 public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o coeficiente a:");
        double a = entrada.nextDouble();

        System.out.println("Informe o coeficiente b:");
        double b = entrada.nextDouble();

        System.out.println("Informe o coeficiente c:");
        double c = entrada.nextDouble();

        equacao(a, b, c);

        entrada.close();
    }

    public static void equacao(double a, double b, double c) {
        double delta = b * b - 4 * a * c;

        if (a == 0 && b == 0 && c == 0) {
            System.out.println("Igualdade confirmada: 0 = 0");
        } else if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente");
        } else if (a == 0 && b != 0) {
            System.out.println("Esta é uma equação de primeiro grau: x = " + (-c / b));
        } else {
            System.out.println("Esta é uma equação de segundo grau");

            if (delta < 0) {
                System.out.println("Esta equação não possui raízes reais (delta < 0): delta = " + delta);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Esta equação possui duas raízes reais iguais: x' = x'' = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Esta equação possui duas raízes reais diferentes: delta = " + delta + ", x' = " + x1 + ", x'' = " + x2);
            }
        }
    }
}
