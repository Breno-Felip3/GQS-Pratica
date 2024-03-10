package Pratica_3;
import java.util.Scanner;

public class Atividade1 {
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		int sexo = 0;
		int idade = 0;
		
		System.out.print("Digite 1 para Homem e 2 para Mulher: ");
		sexo = entrada.nextInt();
		
		if (sexo != 1 && sexo != 2) 
		{
			System.out.print("Somente os valore 1 ou 2 são válidos.");	
		}
		else if(sexo == 1)
		{
			System.out.print("Informe a sua idade: ");
			idade = entrada.nextInt();
			
			if(idade <= 15)
			{
				System.out.print("A sua mensalidade será de R$60,00");
			}
			else if(idade <= 18)
			{
				System.out.print("A sua mensalidade será de R$75,00");
			}
			else if(idade <= 30)
			{
				System.out.print("A sua mensalidade será de R$90,00");
			}
			else if(idade <= 40)
			{
				System.out.print("A sua mensalidade será de R$85,00");
			}
			else
			{
				System.out.print("A sua mensalidade será de R$85,00");
			}
			
		}
		else if(sexo == 2)
		{
			System.out.print("Informe a sua idade: ");
			idade = entrada.nextInt();
			
			if(idade <= 18)
			{
				System.out.print("A sua mensalidade será de R$60,00");
			}
			else if(idade <= 25)
			{
				System.out.print("A sua mensalidade será de R$90,00");
			}
			else if(idade <= 40)
			{
				System.out.print("A sua mensalidade será de R$85,00");
			}
			else
			{
				System.out.print("A sua mensalidade será de R$80,00");
			}
		}
		
		entrada.close();
	}
}
