package atividadeEncapsulamento;

public class mainProduto {
	public static void main(String [] args) {
		Produto p1 = new Produto();
		
		p1.adicionarEstoque(5);
		p1.removerEstoque(2);
		
		System.out.println(p1.getQuantidadeEstoque());
	}
}
