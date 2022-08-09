package aula43.labs.exer01;

public class Teste {
	
	public static void main(String[] args) {
		
		System.out.println("*** Teste Conta Bancaria ***");
		
		ContaBancaria contaBancaria = new ContaBancaria();
		
		contaBancaria.setNomeCliente("João");
		contaBancaria.setNumConta("11111");
		
		contaBancaria.depositar(100);
		
		realizarSaque(contaBancaria, 50);
		
		realizarSaque(contaBancaria, 70);
		
		System.out.println(contaBancaria);
		
		
		System.out.println("/n*** Teste Conta Poupanca ***");
		
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		
		contaPoupanca.setNomeCliente("Ana");
		contaPoupanca.setNumConta("22222");
		contaPoupanca.setDiaRendimento(22);
		
		contaPoupanca.depositar(100);
		
		realizarSaque(contaPoupanca, 50);
		
		realizarSaque(contaPoupanca, 70);
		
		if (contaPoupanca.calcularNovoSaldo(0.5)) {
			System.out.println("Rendimento aplicado com sucesso. Novo saldo é de R$"+contaPoupanca.getSaldo());
		} else {
			System.out.println("Hoje não é o dia de rendimento.");
		}
		
		System.out.println(contaPoupanca);
		
		System.out.println("/n*** Teste Conta Especial ***");
		
		ContaEspecial contaEspecial = new ContaEspecial();
		
		contaEspecial.setNomeCliente("Carla");
		contaEspecial.setNumConta("33333");
		contaEspecial.setLimite(50);
		
		contaEspecial.depositar(100);
		
		realizarSaque(contaEspecial, 50);
		
		realizarSaque(contaEspecial, 70);
		
		realizarSaque(contaEspecial, 50);
		
		
	}
	
	public static void realizarSaque(ContaBancaria conta, double valor) {
		if (conta.sacar(valor)) {
			System.out.println("Saque efetuado com sucesso! Seu novo saldo é: R$"+conta.getSaldo());
		} else {
			System.out.println("Saldo insuficiente para saque de "+50+". Seu saldo atual é: R$"+conta.getSaldo());
		}
	}

}
