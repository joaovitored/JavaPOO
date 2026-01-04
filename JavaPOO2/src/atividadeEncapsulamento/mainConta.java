package atividadeEncapsulamento;

public class mainConta {
	public static void main(String [] args) {
		contabancaria c1 = new contabancaria();
		
		c1.setNumeroConta("12345");
		
		c1.depositar(50);
		c1.sacar(10);
		c1.sacar(100);
	}
}
