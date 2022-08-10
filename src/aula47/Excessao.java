package aula47;

public class Excessao {

	public static void main(String[] args) {
		
		/*
		try {
			//bloco que é monitorado para erros
		}
		catch (TipoDaException exception) {
			//tratamento do erro
		}
		*/
		
		try {
			int[] vetor = new int[4];
			
			System.out.println("Antes da exception");
			
			vetor[4] = 1;
			
			System.out.println("Essa string não será impressa");
		}
		catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Excessão ao acessar um índice que não existe dentro de um vetor");
		}
		
		System.out.println("Texto impresso após o tratamento da excessão");
		
		

	}

}
