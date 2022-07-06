package aula33.labs;

import java.util.Scanner;

// QUESTÃO 3: ESCREVA UMA CLASSE PARA REPRESENTAR UM ALUNO.
// ADICIONE ATRIBUTOS RELACIONADOS ÀS CARACTERÍSTICASA DE UM ALUNO, COMO:
// NOME; MATRICULA; CURSO; NOME DE 3 DISCIPLINAS QUE ESTÁ CURSANDO; NOTA DAS DISCIPLINAS.
// DEVOLVA:
// UM MÉTODO PARA VERIFICAR SE O ALUNO ESTÁ APROVADO OU NÃO (NOTA MAIOR OU IGUAL A 7) EM UMA DETERMINADA DISCIPLINA
// ESCREVA UM PROGRAMA PARA: 
// TESTAR ESSA CLASSE, QUE PEDE AS INFORMAÇÕES DO ALUNO AO USUÁRIO E AO FINAL INFORMA 
// OS NOMES DAS DISCIPLINAS, MOSTRA AS NOTAS E MOSTRA SE O ALUNO FOI APROVADO OU NÃO. 

public class Aluno {
	
	Scanner input = new Scanner(System.in);
	
	private String nome;
	private String matricula;
	private String curso;
	private String[] disciplinas = new String [2];
	private double[] notas = new double [2];
	
	public Aluno() {
		super();
	}

	public Aluno(String nome, String matricula, String curso, String[] disciplinas, double[] notas) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
		this.disciplinas = disciplinas;
		this.notas = notas;
	}

	public String getNome() {
		return nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getCurso() {
		return curso;
	}

	public String[] getDisciplinas() {
		return disciplinas;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNome(String nome) {
		this.nome = nome;
		System.out.println("Digite o nome do aluno:");
		nome = input.nextLine();
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
		System.out.println("Digite a matrícula do aluno:");
		matricula = input.nextLine();
	}

	public void setCurso(String curso) {
		this.curso = curso;
		System.out.println("Digite o nome do curso:");
		curso = input.nextLine();
	}

	public void setDisciplinas(String[] disciplinas) {
		this.disciplinas = disciplinas;
		
		for(int d=0;d<3;d++) {
			System.out.printf("Entre com o nome da disciplina %d:",d+1);
			disciplinas[d] = input.nextLine();
		}
	}

	public void setNotas(double[] notas) {
		this.notas = notas;

		
		
//		for(int n=0; n<=2; n++) {
//			System.out.printf("Entre com a nota da disciplina %d",n+1);
//			notas[n] = input.nextDouble();
//		}
	}
	
	public void mostrarInformacoes(int d, int n) {
		
		System.out.printf("Nome do aluno: %s",nome);
		System.out.printf("Matrícula do aluno: %s",matricula);
		System.out.printf("Curso do aluno: %s",curso);
		System.out.printf("Disciplinas e notas:");
		
		for(d=0; d<=2; d++) {
			for(n=0; n<=2; n++) {
				System.out.printf("A nota para a disciplina %s foi %d",disciplinas[d],notas[n]);
				if (notas[n] < 7) {
					System.out.println("O aluno foi reprovado nessa disciplina.");
				} else {
					System.out.println("O aluno foi aprovado nessa disciplina.");
				}
			}
		}
	}
	
	
	
	
	

}
