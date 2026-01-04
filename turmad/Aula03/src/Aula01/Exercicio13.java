package Aula01;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
    	Scanner sc= new Scanner(System.in);

    	double notas [] = new double[5];
    	double soma=0, media=0;
    	
    	for(int x=0; x<notas.length;x++) {
    		System.out.printf("Digite a nota do aluno: ");
    			notas[x] = sc.nextDouble();
    	}
    	for (double i: notas ) {
    		soma+=i;
    	}

    	media=soma/notas.length;
    	System.out.printf("A média da turma é %2f",media);
}}
