package Pratica_2;
import java.util.Scanner;

public class Atividade_4 {
	public static void main(String[] args)
	{
		//Receba os valores dos dois catetos de um triângulo, calcule e apresente o valor da
		//hipotenusa. OBS - Teorema de Pitágoras: a2 + b2 = c2
		
		double cateto1 = 0;
		double cateto2 = 0;
		double hipotenusa = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o valor do primeiro cateto: ");
		cateto1 = entrada.nextDouble();
		System.out.print("Informe o valor do segundo cateto: ");
		cateto2 = entrada.nextDouble();
		
		hipotenusa = Math.sqrt((Math.pow(cateto1,2)) + Math.pow(cateto2, 2));
		System.out.println("O valor da hipotenusa é = " + String.format("%.2f", hipotenusa));
		
		entrada.close();
	}
}
