package aula24;

import java.util.Scanner;

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
		
		System.out.println();
		
		System.out.println(fusca.capCombustivel);
		System.out.println(fusca.consumoCombustivel);
		
		Scanner scan = new Scanner(System.in);
		
		Carro carro = new Carro();
		
		
		
//		System.out.println("Digite o número de passageiros do carro: ");
//		carro.numPassageiros = scan.nextInt();
//		
//		System.out.println("Informações do carro: ");
//		System.out.println("Marca: "+carro.marca);
//		System.out.println("Número de passageiros: "+carro.numPassageiros);
		
		
		
		
		

	}

}
