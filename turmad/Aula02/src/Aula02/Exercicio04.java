package Aula02;
import java.util.Scanner;
public class Exercicio04 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite F ou M");
		char sexo = input.next().charAt(0);
		
	System.out.println(sexo == 'M' ? "Homem" : sexo ==  'F' ? "Mulher" :"letra invalida");
		
		}
		
	}
		