package aula33.labs;

public class ContaCorrenteTeste {
	
	public static void main (String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		
		conta.setChequeEspecial(false);
		
		conta.setSaldoConta(800.5);
		
		conta.setValorSaque(100.2);
		
		conta.realizarSaque();
		
		conta.realizarDeposito(200.6);
		
		conta.consultarSaldo();
		
		conta.verificaChequeEspecial();
	}

}
