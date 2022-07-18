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
		
		
		// RESUMÃO:
		
		/* pessoa é do tipo Pessoa, portanto só reconhece os métodos da classe Pessoa
		 * pessoa.obterEtiquetaEndereco() foi instanciado de Pessoa() então recebeu o retorno da classe Pessoa */
		
		/* aluno é do tipo Pessoa, portanto só reconhece os métodos da classe Pessoa
		 * aluno.obterEtiquetaEndereco() foi instanciado de Aluno() então recebeu o retorno da classe Aluno */
		
		/* professor é do tipo Pessoa, portanto só reconhece os métodos da classe Pessoa
		 * professor.obterEtiquetaEndereco() foi instanciado de Professor() então recebeu o retorno da classe Professor */
		
		/* Apesar de todas as classes só reconhecerem os métodos da classe Pessoa, cada uma reescreveu o método 
		 * obterEtiquetaEndereco() com a sua assinatura*/
		
		/* Isso foi um exemplo de POLIMORFISMO (em tempo de execução) */

	}

}
