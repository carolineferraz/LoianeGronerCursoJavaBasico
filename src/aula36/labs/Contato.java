package aula36.labs;

public class Contato {
	
	private String nome;
	private String telefone;
	private String email;
	
	
	public String getNome() {
		return nome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String MostrarInformacoes() {
		return "Nome = " + nome + "; " +
				"Telefone = " + telefone + "; " +
				"Email = " + email + ". ";
	}
	

}
