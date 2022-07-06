package aula25;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		Carro fusca = new Carro();
		fusca.capCombustivel = 80;
		fusca.consumoCombustivel = 0.4;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		van.exibirAutonomia();
		
//		System.out.println();
//		
//		System.out.println(fusca.capCombustivel);
//		System.out.println(fusca.consumoCombustivel);

	}

}
