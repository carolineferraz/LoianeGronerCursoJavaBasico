package aula47;

public class Excessao {

	public static void main(String[] args) {
		
		/*
		try {
			//bloco que � monitorado para erros
		}
		catch (TipoDaException exception) {
			//tratamento do erro
		}
		*/
		
		try {
			int[] vetor = new int[4];
			
			System.out.println("Antes da exception");
			
			vetor[4] = 1;
			
			System.out.println("Essa string n�o ser� impressa");
		}
		catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Excess�o ao acessar um �ndice que n�o existe dentro de um vetor");
		}
		
		System.out.println("Texto impresso ap�s o tratamento da excess�o");
		
		

	}

}
