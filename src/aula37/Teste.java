package aula37;

public class Teste {

	public static void main(String[] args) {
		
		/* Repare que s� ap�s n�s colocarmos o 'extends Pessoa' nas classes filhas que elas poder�o 
		herdar os m�todos da classe Pessoa */
		
		/* Aluno aluno = new Aluno();
		
		Professor professor = new Professor();
		
		aluno.setNome("Maria");
		
		professor.setTelefoneCelular("9999-9999"); */
		
		
		/* Tamb�m podemos instanciar a classe Aluno ou Professor como sendo do tipo Pessoa. 
		 * Assim ela herdar� os atributos e m�todos da classe Pessoa, mas n�o os da pr�pria classe.*/
		
		Pessoa aluno = new Aluno();
		
		aluno.setEndereco("xxxx");

	}

}
