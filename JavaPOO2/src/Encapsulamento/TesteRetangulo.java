package Encapsulamento;

public class TesteRetangulo {
	 
	public static void main(String [] args) {
		Retangulo n1 = new Retangulo();
		n1.setAltura(40);
		n1.setBase(5);
		
		System.out.println(n1.calcularArea());
		System.out.println(n1.calcularPerimetro());
		}
}
