package atividadeEncapsulamento;

public class Livre {
	
	private String titulo;
	private String autor;
	private int faixaEtariaMinima;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getFaixaEtariaMinima() {
		return faixaEtariaMinima;
	}
	public void setFaixaEtariaMinima(int faixaEtariaMinima) {
		this.faixaEtariaMinima = faixaEtariaMinima;
	}
	
	public boolean podeSerLidoPor(int idadeLeitor) {
		if(idadeLeitor > faixaEtariaMinima) {
			return true;
		} else {
			return false;
		}
	}
}


