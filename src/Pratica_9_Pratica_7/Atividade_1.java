package Pratica_9_Pratica_7;
import java.util.Scanner;

public class Atividade_1 {

    public static void main(String[] args) {
       
    	int[] vetor = criarVetor();
        leituraValores(vetor);
        int soma = somaPares(vetor);
        resultado(vetor, soma);
    }
    
    public static int[] criarVetor() {
        int[] vetor = new int[10];
        return vetor;
    }

    public static void leituraValores(int[] vetor) {
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Informe um número inteiro: ");
            vetor[i] = entrada.nextInt();
        }
        entrada.close();
    }

    public static int somaPares(int[] vetor) {
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                soma += vetor[i];
            }
        }
        return soma;
    }
    
    public static void resultado(int[] vetor, int soma) {
    	 System.out.println("Valores informados:");
         for (int i = 0; i < vetor.length; i++) {
             System.out.print(vetor[i] + ", ");
         }
         System.out.println("\nA soma dos números pares é = " + soma);
    }
}
