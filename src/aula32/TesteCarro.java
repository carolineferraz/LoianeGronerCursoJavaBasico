package aula32;

// AULA SOBRE ENCAPSULAMENTO (M�TODOS GET E SET)

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		
		van.setMarca("Fiat");
		
		van.setModelo("Ducato");
		
		System.out.println(van.getMarca());
		
		System.out.println(van.getModelo());

	}

}
