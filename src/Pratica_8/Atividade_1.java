package Pratica_8;
import java.util.Scanner;
public class Atividade_1 {
	 public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite os elementos da matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = entrada.nextInt();
            }
        }

        System.out.println("Matriz inserida:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); 
        }
        
        System.out.println("Elementos nas posições onde a linha é par e a coluna é ímpar:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i % 2 == 0 && j % 2 != 0) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
        
        System.out.println("\nMatriz transposta:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println(); 
        }
        
        for (int i = 0; i < 5; i++) {
            int temp = matriz[i][i];
            matriz[i][i] = matriz[i][4 - i];
            matriz[i][4 - i] = temp;
        }
        
        System.out.println("\nMatriz resultante após trocar as diagonais:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); 
        }
        
        entrada.close();
    }
}