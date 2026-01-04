package atividadeEncapsulamento;

public class pessoaMain {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		
		p1.setIdade(21);
		p1.setNome("Sol");
		
		System.out.println(p1.getIdade());
		System.out.println(p1.getNome());

	}

}
