package aula35;

// A Recursividade � o ato de colocar um m�todo dentro dele mesmo
// Na recursividade, � preciso adicionar dentro do m�todo uma condicional de parada
// Caso contr�rio, o m�todo ficaria se repetindo infinitamente

public class Calculadora {
	
	public static int fatorialNaoRecursivo(int num) {
		
		if(num == 0) {
			return 1;
		}
		
		int total = 1;
		
		for (int i=num; i>1; i--) {
			total *= i;
		}
		
		return total;
		
	}
	
	//fatorial(5) = 5 * fatorial(4);
	//fatorial(4) = 4 * fatorial(3);
	//fatorial(3) = 3 * fatorial(2);
	//fatorial(2) = 2 * fatorial(1);
	//fatorial(1) = 1 * fatorial(0);
	//fatorial(0) = 1;
	public static int fatorialRecursivo(int num) {
		
		// essa condicional ser� o ponto de parada do m�todo
		// sem ela, o m�todo ficaria se repetindo infinitamente
		if(num == 0) {
			return 1;
		}
		
		return num * fatorialRecursivo(num-1);
	}
	

}
