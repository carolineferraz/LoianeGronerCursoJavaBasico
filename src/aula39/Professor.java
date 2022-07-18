package aula39;

public class Professor extends Pessoa {
	
	private double salario;
	private String nomeCurso;
	
	
	public void testarModificador() {
		super.nomeVisibilidade = "dvddbsb";
		this.nomeVisibilidade = "hfheuvaicvd";
		// a classe reconhece o atributo nomeVisibilidade, que foi declarado como protected
	}
	
	public double getSalario() {
		return salario;
	}
	
	public String getNomeCurso() {
		return nomeCurso;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
	public double calcularSalarioLiquido() {
		return 0;
	}
}
