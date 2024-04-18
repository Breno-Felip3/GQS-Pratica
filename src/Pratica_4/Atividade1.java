package Pratica_4;
import java.util.Scanner;

public class Atividade1 {
	 public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float nota = 0;
        int faltas = 0;
        int notaMaior90 = 0;
        int alunosReprovados = 0;
        float maiorNota = 0;
        float menorNota = 0;
        int totalNotas = 0;
        int contador = 1;
        int totalAlunos = 0;
        double mediaNotas = 0;

        while (nota >= 0) {
        	totalAlunos++;
        	
            System.out.println("Informe a nota final do aluno (ou digite uma nota negativa para sair): ");
            nota = entrada.nextFloat();
            
         	if(contador == 1) {
        		maiorNota = nota;
        		menorNota = nota;
        	}
            if (nota > maiorNota) {
            	maiorNota = nota;
            }
            if(nota >=0 && nota < menorNota) {
            	menorNota = nota;
            }
            
            totalNotas += nota;
            
            if (nota >= 90) {
            	notaMaior90++;
            }

            if (nota >= 0 && nota < 70 || nota >= 70 && faltas >= 20) {
                alunosReprovados++;
            }
            
            if(nota >= 0) {
            	mediaNotas = totalNotas / totalAlunos;
            }
            
            if(nota >= 0) {
            	System.out.println("Informe a quantidade de faltas do aluno: ");
            	faltas = entrada.nextInt();
            }
   
            contador++;
        }
       
        entrada.close();
     
        System.out.println("Quantidade de alunos com nota final maior ou igual a 90: " + notaMaior90);
        System.out.println("Quantidade de alunos reprovados por nota ou falta: " + alunosReprovados);
        System.out.println("Maior nota: " + (maiorNota));
        System.out.println("Menor nota: " + (menorNota));
        System.out.println("Média de notas da turma: " + mediaNotas);
    }
}


