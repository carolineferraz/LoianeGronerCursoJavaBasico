package aula33.labs;

// QUEST�O 2: CRIA UMA CLASSE PARA REPRESENTAR UMA CONTA CORRENTE QUE POSSUI:
// UM N�MERO; UM SALDO; UM STATUS QUE INFORMA SE ELA � ESPECIAL OU N�O; UM LIMITE.
// DESENVOLVA M�TODOS PARA:
// REALIZAR SAQUE (VERIFICANDO SE O CLIENTE PODE REALIZAR SAQUE);
// DEPOSITAR DINHEIRO;
// CONSULTAR SALDO;
// VERIFICAR SE O CLIENTE EST� USANDO CHEQUE ESPECIAL OU N�O.
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
			System.out.println("Saque realizado. O saldo da conta agora � R$"+saldoConta);
		} else if (valorSaque > saldoConta || chequeEspecial == true) {
			System.out.println("Voc� n�o pode realizar esse saque, porque n�o tem saldo suficiente ou porque j� est� com cheque especial.");
		}
	}
		
	public void realizarDeposito(double valorDeposito) {
		saldoConta += valorDeposito;
		System.out.println("Dep�sito realizado. Seu saldo agora � R$"+saldoConta);
	}
	
	public void consultarSaldo() {
		System.out.println("Seu saldo � de R$"+saldoConta);
	}
	
	public void verificaChequeEspecial() {
		if (chequeEspecial == true) {
			System.out.println("Voc� est� usando cheque especial.");
		} else {
			System.out.println("Voc� n�o est� usando cheque especial.");
		}
	}
	
	

}
