package atividadeEncapsulamento;

public class contabancaria {
	
	private String numeroConta;
	private double saldo;
	
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar (double valor) {
		if (valor > 0){
			saldo += valor;
			System.out.println("Saldo depositado");
		} else {
			System.out.println("Número inválido");
		}
	}
	
	public void sacar(double valor) {
		if(valor > 0 && saldo >= valor) {
			System.out.println("Saque realizado");
			saldo -= valor;
		} else { 
			System.out.println("Você não possui saldo suficiente");
		}
	}
}

