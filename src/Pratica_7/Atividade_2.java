package Pratica_7;
import java.util.Scanner;
public class Atividade_2 {
	 public static void main(String[] args) {
		  Scanner entrada = new Scanner(System.in);
		  int[] vetor = new int[10];
	      
	      for (int i = 0; i < 10; i++) {
	            System.out.println("Informe um número real: ");
	            vetor[i] = entrada.nextInt();
	      }
	      entrada.close();
	      
	      for(int i = 0; i < vetor.length; i++) {
	    	  System.out.print(vetor[i] + ", ");   
	      }
	      
	      for(int i = 0; i < vetor.length; i++) {
	    	  if (vetor[i] < 0) {
	    		  System.out.print("\nA posição " + i +" está armazenando um número negativo!"); 
	    	  }   
	      }	        
	 }
}
