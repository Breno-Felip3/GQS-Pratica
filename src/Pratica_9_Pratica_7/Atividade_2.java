package Pratica_9_Pratica_7;
import java.util.Scanner;
public class Atividade_2 {
	public static void main(String[] args) {
	
		 int[] vetor = criarVetor();
		 leituraValores(vetor);
		 apresentaVetor(vetor);
		 apresentaNumeroNegativo(vetor);      
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
	 
	public static void apresentaNumeroNegativo(int[] vetor) {
		 for(int i = 0; i < vetor.length; i++) {
	    	  if (vetor[i] < 0) {
	    		  System.out.print("\nA posição " + i +" está armazenando um número negativo!"); 
	    	  }   
	      }	     
	 }
}
