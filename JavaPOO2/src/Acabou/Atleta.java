package Acabou;

public abstract class Atleta {
	
	private String nome;
	private double idade;
	
	public Atleta(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	
	public void aquecer() {
		System.out.printf("%s está aquecendo", nome);
		
	}
}
