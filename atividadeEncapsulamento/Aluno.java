package atividadeEncapsulamento;

public class Aluno {
	
	private String nome;
	private double nota1;
	private double nota2;
	public double media;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	
	public double getMedia() {
		media = (nota1 + nota2) / 2;
		return media;
	}
	
	public boolean isAprovado() {
		if(media >= 6) {
			return true;
		} else {
			return false;
	}
}}


