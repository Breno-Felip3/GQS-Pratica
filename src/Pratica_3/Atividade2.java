package Pratica_3;
import java.util.Scanner;

public class Atividade2 {
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		
		int apt = 0;
		double diarias = 0;
		double total = 0;
		
		System.out.print("Digite 1 para Apto Simples ou 2 para Apto Duplo: ");
		apt = entrada.nextInt();
		
		if (apt != 1 && apt != 2) 
		{
			System.out.print("Somente os valore 1 ou 2 são válidos.");	
		}
		else if (apt == 1)
		{
			System.out.print("Informe a quantidade de dias hospedados: ");
			diarias = entrada.nextInt();
		}
		if (diarias < 10 && apt == 1)
		{
			total = (diarias * 100);
			System.out.print("O total a pagar será de R$" + String.format("%.2f", total));
		}
		else if (diarias <= 15 && apt == 1)
		{
			total = (diarias * 90);
			System.out.print("O total a pagar será de R$" + String.format("%.2f", total));
		}
		else if (diarias > 15 && apt == 1)
		{
			total = (diarias * 80);
			System.out.print("O total a pagar será de R$" + String.format("%.2f", total));
		}
		if (apt == 2)
		{
			System.out.print("Informe a quantidade de dias hospedados: ");
			diarias = entrada.nextInt();
			
			if (diarias < 10)
			{
				total = (diarias * 140);
				System.out.print("O total a pagar será de R$" + String.format("%.2f", total));
			}
			else if (diarias <= 15)
			{
				total = (diarias * 120);
				System.out.print("O total a pagar será de R$" + String.format("%.2f", total));
			}
			else if (diarias > 15)
			{
				total = (diarias * 100);
				System.out.print("O total a pagar será de R$" + String.format("%.2f", total));
			}
		}
		
		entrada.close();
	}
}
