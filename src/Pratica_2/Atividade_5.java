package Pratica_2;
import java.util.Scanner;

public class Atividade_5 {
	public static void main(String[] args)
	{
		//Receba o raio, calcule e apresente:
			//a. O comprimento de uma esfera: C = 2 * π * R.
			//b. A área de uma esfera: A = π * R2
			//c. O volume de uma esfera: V = 3⁄4 * π * R3
			
		double raio = 0;
		double comprimento = 0;
		double area = 0;
		double volume = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o valor do raio: ");
		raio = entrada.nextDouble();
		
		comprimento = (2 * raio * Math.PI);
		area = (Math.PI * Math.pow(raio, 2));
		volume = ((3.0 / 4.0) * Math.PI * Math.pow(raio, 3));
		
		System.out.println("O comprimento da esfera é = " + String.format("%.2f", comprimento));
		System.out.println("A área da esfera é = " + String.format("%.2f", area));
		System.out.println("O volume da esfera é = " + String.format("%.2f", volume));
		
		entrada.close();		
	}
}
