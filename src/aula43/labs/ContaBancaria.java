package aula43.labs;

import java.util.Scanner;

public class ContaBancaria {
	
	
	private String nomeCliente;
	private String numConta;
	private double saldo;
	
	
	public ContaBancaria(String nomeCliente, String numConta, double saldo) {
		super();
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = saldo;
	}
	

	public ContaBancaria() {}

	
	public String getNomeCliente() {
		return nomeCliente;
	}

	public String getNumConta() {
		return numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	public void sacar() {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o valor que você deseja sacar:");
		double saque = input.nextDouble();
		
		if(saque>saldo) {
			System.out.println("Você não tem saldo suficiente para realizar essa operação.");
		}
		else {
			saldo -= saque;
			System.out.println("Seu saldo agora é de: R$"+saldo);
		}
	}
	
	public void depositar() {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o valor que você deseja depositar:");
		double deposito = input.nextDouble();
		saldo += deposito;
		System.out.println("Seu saldo agora é de: R$"+saldo);
	}
	
	
	

}
