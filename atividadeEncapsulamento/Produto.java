package atividadeEncapsulamento;

public class Produto {
	
	private String nome;
	private double preco;
	private int quantidadeEstoque;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	public void adicionarEstoque(int qtd) {
		quantidadeEstoque += qtd;
	}
	
	public void removerEstoque(int qtd) {
		if(qtd > 0 && quantidadeEstoque > qtd) {
			quantidadeEstoque -= qtd;
		} else {
			System.out.println("Quantidade em estoque insuficiente");
		}
	}
}

