package aula39.teste;

import aula39.Pessoa;

public class Aluno extends Pessoa {
	
	private String curso;
	private double[] notas;
	
	public Aluno() {
		super();
	}
	
	public Aluno(String nome, String endereco, String telefone, String curso) {
		super(nome, endereco, telefone);
		this.curso = curso;
	}
	
	public void testarModificador() {
		super.nomeVisibilidade = "hewufhnweivjwi";
		this.nomeVisibilidade = "faivmi";
		// a classe reconhece o atributo nomeVisibilidade, que foi declarado como protected
	}

	public String getCurso() {
		return curso;
	}
	public double[] getNotas() {
		return notas;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double calcularMedia() {
		return 0;
	}
	
	public boolean verificarAprovado() {
		return true;
	}
	
	public void metodoQualquer() {
		super.setCpf("84910190");
		this.setCpf("84910190");
	}
	
}
