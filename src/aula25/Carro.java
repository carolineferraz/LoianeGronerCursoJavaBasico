package aula25;

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

}
