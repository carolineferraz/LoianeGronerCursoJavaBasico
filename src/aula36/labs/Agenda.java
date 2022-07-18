package aula36.labs;


// Quest�o 01: Escreva uma classe Agenda, que cont�m v�rios contatos do tipo Contato.
// Cada contato possui nome, telefone, e email.
// A Agenda tamb�m possui um nome.
// Crie um programa teste que pe�a para o usu�rio entrar com o nome da Agenda e em seguida 3 contatos.
// Crie m�todos que retornem uma String com a informa��o de cada contato e tamb�m de todos os contatos da Agenda. 

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
