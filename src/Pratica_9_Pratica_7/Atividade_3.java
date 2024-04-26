package Pratica_9_Pratica_7;
import java.util.Scanner;
public class Atividade_3 {
	 public static void main(String[] args) {
		 int[] vetor = criarVetor();
		 leituraValores(vetor);
		 apresentaVetor(vetor);
		 apresentaMaiorMenor(vetor);
	 }
	 
	 public static int[] criarVetor() {
	    int[] vetor = new int[10];
	    return vetor;
	 }
	 
	 public static void leituraValores(int[] vetor) {
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
			 System.out.println("Informe um número real: ");
			 vetor[i] = entrada.nextInt();
        }
		entrada.close();
	 }
	 
	 public static void apresentaVetor(int[] vetor) {
		 for(int i = 0; i < vetor.length; i++) {
			 System.out.print(vetor[i] + ", ");   
		 }
	 }
	 
	 public static void apresentaMaiorMenor(int[] vetor) {
		 int menor = 0;
		 int maior = 0;
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
	     }
		 System.out.println("\nO menor número informado foi o " + menor);   
		 System.out.print("O maior número informado foi o " + maior); 
	 }
}
