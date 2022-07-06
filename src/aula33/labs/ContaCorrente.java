package aula33.labs;

// QUESTÃO 2: CRIA UMA CLASSE PARA REPRESENTAR UMA CONTA CORRENTE QUE POSSUI:
// UM NÚMERO; UM SALDO; UM STATUS QUE INFORMA SE ELA É ESPECIAL OU NÃO; UM LIMITE.
// DESENVOLVA MÉTODOS PARA:
// REALIZAR SAQUE (VERIFICANDO SE O CLIENTE PODE REALIZAR SAQUE);
// DEPOSITAR DINHEIRO;
// CONSULTAR SALDO;
// VERIFICAR SE O CLIENTE ESTÁ USANDO CHEQUE ESPECIAL OU NÃO.
// DEVOLVA UM PROGRAMA PARA TESTAR ESSA CLASSE.
// UTILIZE OS CONCEITOS DE ENCAPSULAMENTO, SOBRECARGA E PALAVRA-CHAVE THIS

public class ContaCorrente {
	
	private String numConta;
	private double saldoConta;
	private boolean chequeEspecial;
	private double limite;
	private double valorSaque;
	
	public ContaCorrente() {
		super();
	}

	public ContaCorrente(String numConta, double saldoConta, boolean chequeEspecial, double limite) {
		super();
		this.numConta = numConta;
		this.saldoConta = saldoConta;
		this.chequeEspecial = chequeEspecial;
		this.limite = limite;
	}

	public String getNumConta() {
		return numConta;
	}

	public double getSaldoConta() {
		return saldoConta;
	}

	public boolean isChequeEspecial() {
		return chequeEspecial;
	}

	public double getLimite() {
		return limite;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}

	public void setChequeEspecial(boolean chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public double getValorSaque() {
		return valorSaque;
	}

	public void setValorSaque(double valorSaque) {
		this.valorSaque = valorSaque;
	}

	public void realizarSaque() {
		if (valorSaque <= saldoConta && chequeEspecial == false) {
			saldoConta -= valorSaque;
			System.out.println("Saque realizado. O saldo da conta agora é R$"+saldoConta);
		} else if (valorSaque > saldoConta || chequeEspecial == true) {
			System.out.println("Você não pode realizar esse saque, porque não tem saldo suficiente ou porque já está com cheque especial.");
		}
	}
		
	public void realizarDeposito(double valorDeposito) {
		saldoConta += valorDeposito;
		System.out.println("Depósito realizado. Seu saldo agora é R$"+saldoConta);
	}
	
	public void consultarSaldo() {
		System.out.println("Seu saldo é de R$"+saldoConta);
	}
	
	public void verificaChequeEspecial() {
		if (chequeEspecial == true) {
			System.out.println("Você está usando cheque especial.");
		} else {
			System.out.println("Você não está usando cheque especial.");
		}
	}
	
	

}
