package aula45;

public class Teste2 {

	public static void main(String[] args) {
		
		Object obj1 = obterString();
		String s1 = (String) obj1;
		
		Object obj2 = "Minha String";
		String s2 = (String) obj2;  //downcasting
		
		Object obj3 = new Object();
		String s3 = (String) obj3;  //downcasting com erro de execução
		
		Object obj4 = obterInteiro();
		String s4 = (String) obj4;  /* mais exemplo de casting que não 
		funciona em tempo de execução por se tratar da conversão de um inteiro em
		uma String (não é a maneira correta de fazer isso) */
	}
	
	public static String obterString() {
		return "minha string";
	}
	
	public static int obterInteiro() {
		return 1;
	}

}
