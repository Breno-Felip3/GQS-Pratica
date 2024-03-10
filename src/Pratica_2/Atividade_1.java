package Pratica_2;
import java.util.Scanner;

public class Atividade_1 
{
	public static void main (String[] args) 
	{
		//Calcule e apresente a área de um losango. As diagonais maior e menor do losango
		//devem ser informadas pelo usuário. OBS: AREA = (DIAGONAL MAIOR * DIAGONAL
		//MENOR) / 2.
		Scanner entrada = new Scanner(System.in);
		double diagonalMaior = 0;
		double diagonalMenor = 0;
		double area = 0;
		
		System.out.print("Digite o valor da diagonal maior: ");
		diagonalMaior = entrada.nextDouble();
		System.out.print("Digite o valor da diagonal menor: ");
		diagonalMenor = entrada.nextDouble();
		area = (diagonalMaior * diagonalMenor) / 2;
		
		System.out.print("A área do losango é = " + area);	
		entrada.close();
	}
}
