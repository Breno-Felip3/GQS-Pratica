package Pratica_4;
import java.util.Scanner;
public class Atividade2 {
	 public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int totalPessoas = 0;
        double totalSalarios = 0;
        double salario = 0;
        int totalFilhos = 0;
        int filhos = 0;

        while (salario >= 0) {
        	System.out.println("Informe o seu salário (ou digite um salário negativo para sair): ");
        	salario = entrada.nextDouble();
        	
        	if(salario >= 0) {
        		System.out.println("Informa a quantidade de filhos: ");
                filhos = entrada.nextInt();
        	}
        	
        	if (salario >= 0) {
        		totalPessoas++;
                totalSalarios += salario;
                totalFilhos += filhos;
        	}
        }

        if (totalPessoas == 0) {
            System.out.println("Nenhum habitante informado.");
        } 
        else {
            double mediaSalarial = totalSalarios / totalPessoas;
            double mediaFilhos = (double) totalFilhos / totalPessoas;

            System.out.println("Média salarial da população: " + mediaSalarial);
            System.out.println("Média do número de filhos: " + mediaFilhos);
        }

        entrada.close();
    }
}
