package Aula01;
import java.util.Scanner;
public class Exercicio01 {
	public static void main(String[] args) {
		int qnt=0, x=0;
		double notas=0, somaNotas=0, media=0;
				
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos alunos tem na sala?");
		qnt = sc.nextInt();
		while (x < qnt) {
		System.out.println("Digite a quantidade de nota ");
		notas = sc.nextDouble();
		somaNotas += notas;
		
		
		}
		
		media = somaNotas/qnt;
		System.out.println(media);
		sc.close();
		
			
	
	}

		

}
