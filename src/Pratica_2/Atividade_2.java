package Pratica_2;
import java.util.Scanner;

public class Atividade_2 {
	public static void main (String[] args)
	{
		//Receba uma temperatura em Celsius, calcule e mostre essa temperatura em Fahrenheit.
		//OBS: F = (C * 1,8) + 32.
		
		Scanner entrada = new Scanner(System.in);
		double temperaturaCelsius = 0;
		double temperaturaFahrenheit = 0;
		
		System.out.print("Informe a temperatura em Celsius: ");
		temperaturaCelsius = entrada.nextDouble();
		temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;
		
		System.out.print("A temperatura em Fahrenheit é = " + temperaturaFahrenheit) ;
		entrada.close();
	}
}
