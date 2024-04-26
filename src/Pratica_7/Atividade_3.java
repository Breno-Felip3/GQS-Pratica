package Pratica_7;
import java.util.Scanner;
public class Atividade_3 {
	 public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
		 
		 int[] vetor = new int[10];
		 int menor = 0;
		 int maior = 0;
	      
		 for (int i = 0; i < 10; i++) {
			 System.out.println("Informe um número real: ");
			 vetor[i] = entrada.nextInt();
		 }
		 entrada.close();
		 
		 for(int i = 0; i < vetor.length; i++) {
			 if(i == 0) {
				 menor = vetor[0];
				 maior = vetor[0];
			 }
		
			 if (vetor[i] < menor) {
				 menor = vetor[i];
			 } 
			
			 if(vetor[i] > maior) {
				 maior = vetor[i];
			 }
	    	  System.out.print(vetor[i] + ", ");   
	     }
		 System.out.println("\nO menor número informado foi o " + menor);   
		 System.out.print("O maior número informado foi o " + maior); 
	 }
}
