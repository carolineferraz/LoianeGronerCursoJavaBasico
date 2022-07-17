package aula37;

public class Teste {

	public static void main(String[] args) {
		
		/* Repare que só após nós colocarmos o 'extends Pessoa' nas classes filhas que elas poderão 
		herdar os métodos da classe Pessoa */
		
		/* Aluno aluno = new Aluno();
		
		Professor professor = new Professor();
		
		aluno.setNome("Maria");
		
		professor.setTelefoneCelular("9999-9999"); */
		
		
		/* Também podemos instanciar a classe Aluno ou Professor como sendo do tipo Pessoa. 
		 * Assim ela herdará os atributos e métodos da classe Pessoa, mas não os da própria classe.*/
		
		Pessoa aluno = new Aluno();
		
		aluno.setEndereco("xxxx");

	}

}
