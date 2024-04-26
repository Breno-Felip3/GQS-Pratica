package Pratica_7;
import java.util.Scanner;
public class Atividade_1 {
	public static void main(String[] args ) {
		Scanner entrada = new Scanner(System.in);
        int[] vetor = new int[10];
        int soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Informe um número inteiro: ");
            vetor[i] = entrada.nextInt();
        }
        entrada.close();
        
        System.out.println("Valores informados:");
        for (int i = 0; i < vetor.length; i++) {
        	if (vetor[i] % 2 == 0) {
        		soma += vetor[i];
        	}
            System.out.print(vetor[i] + ", ");  
        }
        System.out.println("\nA soma dos números pares é = " + soma);
    }
}
