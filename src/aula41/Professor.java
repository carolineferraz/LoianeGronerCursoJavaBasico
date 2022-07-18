package aula41;

public class Professor extends Pessoa {
	
	private double salario;
	private String nomeCurso;
	
	
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
	
	public String obterEtiquetaEndereco() {
		
		String s = "Endereço do Professor: ";
		s += super.getEndereco();
		
		return s;
	}

	@Override
	public void imprimirEtiquetaEndereco() {

		System.out.println("Endereço do aluno: ");
		System.out.println(this.getEndereco());
		
	}
}
