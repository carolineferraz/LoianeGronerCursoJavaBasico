package aula34.labs;

public class CalculadoraTeste {
	
	static void imprimirValor() {
		System.out.println(Calculadora.mostrarResultado());
	}

	public static void main(String[] args) {
		
		Calculadora.lerNumero();
		
		imprimirValor();
		
		Calculadora.somar();
		
		imprimirValor();
		
		Calculadora.subtrair();
		
		imprimirValor();
		
		Calculadora.multiplicar();
		
		imprimirValor();
		
		Calculadora.dividir();
		
		imprimirValor();
		
		Calculadora.elevarPotencia();
		
		imprimirValor();
		
		
	}

}
