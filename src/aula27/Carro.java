package aula27;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	//declaração de um método sem retorno:
	void exibirAutonomia() {
		
		System.out.println("A autonomia do carro é: "+ capCombustivel * consumoCombustivel + " km");
		
	}
	
	
	//declarando de um método com retorno:
	double obterAutonomia() {
		
		System.out.println("Método obterAutonomia foi chamado.");
		
		return capCombustivel * consumoCombustivel;
	}
	
	double calcularCombustivel(double km) {
		
		double qtdCombustivel = km/consumoCombustivel;
		
		return qtdCombustivel;
		
	}

}