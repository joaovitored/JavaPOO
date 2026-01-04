package atividadeEncapsulamento;

public class mainAluno {
	public static void main(String [] args) {

	Aluno a1 = new Aluno();
	Aluno a2 = new Aluno();
	
	a1.setNome("Armando");
	a1.setNota1(5);
	a1.setNota2(7);
	
	a2.setNome("Júlia");
	a2.setNota1(6);
	a2.setNota2(10);
	
	System.out.printf("O aluno %s teve média %.2f e foi %s\n", 
		    a1.getNome(), 
		    a1.getMedia(), 
		    a1.isAprovado() ? "aprovado" : "reprovado");
	
	System.out.printf("O aluno %s teve média %.2f e foi %s\n", 
		    a2.getNome(), 
		    a2.getMedia(), 
		    a2.isAprovado() ? "aprovado" : "reprovado");
}}





