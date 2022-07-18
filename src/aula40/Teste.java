package aula40;

public class Teste {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
		
		pessoa.setEndereco("Rua 1, num 1");
		aluno.setEndereco("Rua 2, num 2");
		professor.setEndereco("Rua 3, num 3");
		
		System.out.println(pessoa.obterEtiquetaEndereco());
		System.out.println(aluno.obterEtiquetaEndereco());
		System.out.println(professor.obterEtiquetaEndereco());
		
		
		// RESUM�O:
		
		/* pessoa � do tipo Pessoa, portanto s� reconhece os m�todos da classe Pessoa
		 * pessoa.obterEtiquetaEndereco() foi instanciado de Pessoa() ent�o recebeu o retorno da classe Pessoa */
		
		/* aluno � do tipo Pessoa, portanto s� reconhece os m�todos da classe Pessoa
		 * aluno.obterEtiquetaEndereco() foi instanciado de Aluno() ent�o recebeu o retorno da classe Aluno */
		
		/* professor � do tipo Pessoa, portanto s� reconhece os m�todos da classe Pessoa
		 * professor.obterEtiquetaEndereco() foi instanciado de Professor() ent�o recebeu o retorno da classe Professor */
		
		/* Apesar de todas as classes s� reconhecerem os m�todos da classe Pessoa, cada uma reescreveu o m�todo 
		 * obterEtiquetaEndereco() com a sua assinatura*/
		
		/* Isso foi um exemplo de POLIMORFISMO (em tempo de execu��o) */

	}

}
