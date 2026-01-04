package Aula02;
import java.util.Scanner;
public class Exercicio03 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um numero");
		
		float numero1= scanner.nextFloat();
		
		System.out.println("Digite um segundo numero");
		
		float numero2= scanner.nextFloat();
		
		float notafinal = (numero1+numero2)/2;
		
		System.out.println("A média será "+notafinal);



	
}

}