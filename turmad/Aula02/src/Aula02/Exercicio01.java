package Aula02;
import java.util.Scanner;
public class Exercicio01 {
	
		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Digite um numero");
			
			int numero1= scanner.nextInt();
			
			System.out.println("Digite um segundo numero");
			
			int numero2= scanner.nextInt();

			
			System.out.println("Digite um terceiro numero");
			
			int numero3= scanner.nextInt();
			
			if(numero1 > numero2 && numero1 > numero3) {
				System.out.println("numero 1 é o maior");
				
			}
				
			if(numero2 > numero1 && numero2 > numero3) {
				System.out.println("numero 2 é o maior");
			}
			
				else {
					System.out.println("numero 3 é o maior");
					System.out.println("numero 3 é o maior");

				}
				


						
		}

}
