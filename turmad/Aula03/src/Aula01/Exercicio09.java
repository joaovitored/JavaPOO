package Aula01;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos tem na sala?");
        int qntAlunos = sc.nextInt();

        double somaMedias = 0; 

        for (int i = 1; i <= qntAlunos; i++) {
            System.out.println("Digite a quantidade de notas do aluno " + i + ":");
            int qntNotas = sc.nextInt();

            double somaNotas = 0;

            for (int j = 1; j <= qntNotas; j++) {
                System.out.print("Digite a nota " + j + " do aluno " + i + ": ");
                double nota = sc.nextDouble();
                somaNotas += nota;
            }

            double mediaAluno = somaNotas / qntNotas;
            System.out.printf("Média do aluno %d: %.2f%n", i, mediaAluno);
            somaMedias += mediaAluno;
        }

        double mediaTurma = somaMedias / qntAlunos;
        System.out.printf("A média geral da turma é: %.2f%n", mediaTurma);

        sc.close();
    }
}
