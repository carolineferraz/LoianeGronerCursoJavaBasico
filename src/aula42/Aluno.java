package aula42;

public class Aluno {
	
	private String curso;
	private double[] notas;
	
	public Aluno() {
		super();
	}
	
	public Aluno(String nome, String endereco, String telefone, String curso) {
		//super(nome, endereco, telefone);
		this.curso = curso;
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
		//super.setCpf("84910190");
		//this.setCpf("84910190");
	}
	
	public String obterEtiquetaEndereco() {
		
		String s = "Endere�o do Aluno: ";
		//s += super.getEndereco();
		
		return s;
	}

//	@Override
	public void imprimirEtiquetaEndereco() {
		
		System.out.println("Endere�o do aluno: ");
		//System.out.println(this.getEndereco());
		
	}
	
	
	
}
