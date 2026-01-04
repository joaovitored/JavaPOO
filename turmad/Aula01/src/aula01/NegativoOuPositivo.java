package aula01;
import java.util.Scanner;
public class NegativoOuPositivo {
public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	System.out.println("Digite um numero");
	double valor = entrada.nextDouble();
	
	if (valor >0) {
		System.out.println("Valor Positivo");
	} else if(valor <0) {
		System.out.println("Valor Negativo");
	}
	else { 
		System.out.println("Zero");
	
		}
	}
}
