package aula33.labs;


public class TesteAluno {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
//		aluno.setNome("");
//		aluno.setMatricula("");
//		aluno.setCurso("");
		aluno.setDisciplinas(args);
		aluno.setNotas(null);
		aluno.mostrarInformacoes(0, 0);
	}

}
