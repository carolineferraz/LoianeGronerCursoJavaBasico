package aula25;

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

}
