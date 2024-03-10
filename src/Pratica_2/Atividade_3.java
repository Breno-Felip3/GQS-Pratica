package Pratica_2;
import java.util.Scanner;

public class Atividade_3 {
	public static void main(String[] args)
	{
		//Receba o valor do salário mínimo e o valor do salário de um funcionário. O algoritmo
		//deve calcular e apresentar a quantidade de salários mínimos que esse funcionário
		//recebe.
		
		Scanner entrada = new Scanner(System.in);
		double salarioMinimo = 0;
		double salarioFuncionario;
		double qtdSalario;
		
		System.out.print("Informe o valor do salário mínimo: ");
		salarioMinimo = entrada.nextDouble();
		System.out.print("Informe o valor do salário do funcionário: ");
		salarioFuncionario = entrada.nextDouble();
		
		qtdSalario = (salarioFuncionario / salarioMinimo);
		System.out.print("O funcionário recebe " + qtdSalario + " salários minimos.");
		
		entrada.close();
	}
}
