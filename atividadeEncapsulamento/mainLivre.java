package atividadeEncapsulamento;

public class mainLivre {
	
	public static void main(String[] args) {
		 Livre l1 = new Livre();
		 Livre l2 = new Livre();
		 
		 l1.setFaixaEtariaMinima(12);
		 l2.setFaixaEtariaMinima(18);
		 
		 System.out.println(l1.podeSerLidoPor(24));
		 System.out.println(l2.podeSerLidoPor(12));
		 
		 
	}

}
