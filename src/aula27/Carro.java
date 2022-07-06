package aula27;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	//declara��o de um m�todo sem retorno:
	void exibirAutonomia() {
		
		System.out.println("A autonomia do carro �: "+ capCombustivel * consumoCombustivel + " km");
		
	}
	
	
	//declarando de um m�todo com retorno:
	double obterAutonomia() {
		
		System.out.println("M�todo obterAutonomia foi chamado.");
		
		return capCombustivel * consumoCombustivel;
	}
	
	double calcularCombustivel(double km) {
		
		double qtdCombustivel = km/consumoCombustivel;
		
		return qtdCombustivel;
		
	}

}