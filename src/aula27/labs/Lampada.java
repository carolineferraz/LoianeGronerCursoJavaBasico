package aula27.labs;

public class Lampada {
	
	String modelo;
	String tensao;
	int potencia;
	String cor;
	String tipoLuz;
	int garantiaMeses;
	String[] tipos;
	boolean tipoAbajour;
	boolean ligada;
	
	void ligar() {
		ligada = true;
	}
	
	void desligar() {
		ligada = false;
	}
	
	void mostrarEstado() {
		if (ligada == true) {
			System.out.println("A l�mpada est� ligada!");
		} else {
			System.out.println("A l�mpada est� desligada!");
		}
	}
		
	void mudarEstado() {
		if (ligada == true) {
			desligar();
		} else {
			ligar();
	}
	}
	
	

}
