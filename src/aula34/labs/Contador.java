package aula34.labs;

// Quest�o 01: Escreva uma Classe chamada Contador, que tem um atributo est�tico que � incrementado 
// sempre que a classe for instanciada. Crie m�todos para:
// zerar, incrementar e retornar o valor do contador. Desenvolva um programa para testar a classe. 

public class Contador {
	
	private static int cont;
	
	public static void incrementar() {
		cont++;
	}
	
	public static void zerar() {
		cont = 0;
	}
	
	public static int obterValor() {
		return cont;
	}

}
