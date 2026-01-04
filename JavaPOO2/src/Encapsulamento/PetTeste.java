package Encapsulamento;

public class PetTeste {

	public static void main(String[] args) {
		Pet p1 = new Pet();
		
		 p1.setNome("Branco");
		 p1.setIdade(6);
		 p1.setTipo("Cachorro");
		 p1.setRaca("Dalmata");
		 
		 System.out.println(p1.getNome());
		 System.out.println(p1.getIdade());
		 System.out.println(p1.getTipo());
		 System.out.println(p1.getRaca());

}}

	
	