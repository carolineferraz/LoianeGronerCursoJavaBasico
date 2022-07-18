package aula36.labs;


// Questão 01: Escreva uma classe Agenda, que contém vários contatos do tipo Contato.
// Cada contato possui nome, telefone, e email.
// A Agenda também possui um nome.
// Crie um programa teste que peça para o usuário entrar com o nome da Agenda e em seguida 3 contatos.
// Crie métodos que retornem uma String com a informação de cada contato e também de todos os contatos da Agenda. 

public class Agenda {
	
	private String nome;
	private Contato[] contatos;	
	
	
	public Agenda() {
		super();
	}
	
	public Agenda(String nome) {
		super();
		this.nome = nome;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public Contato[] getContatos() {
		return contatos;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}
	
	public String mostrarInformacoes() {
		String info = "Nome da Agenda: " + nome + "\n";
		
		if(contatos != null) {
			for(Contato c : contatos) {
				info += c.MostrarInformacoes() + "\n";
			}
		}
		
		return info;
	}
	
}
