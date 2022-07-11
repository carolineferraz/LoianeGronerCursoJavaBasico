package aula36.labs;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com o nome da Agenda: ");
		String nome = input.nextLine();
		
		Agenda agenda = new Agenda(nome);
		//Agenda agenda = new Agenda();
		//agenda.setNome(nome);
		
		Contato[] contatos = new Contato[3];
		for(int i=0; i<3; i++) {
			System.out.println("Entre com as informações do contato "+ (i+1) +":");
			Contato c = new Contato();
			
			System.out.println("Entre com o nome: ");
			nome = input.nextLine();
			c.setNome(nome);
			
			System.out.println("Entre com o telefone: ");
			String telefone = input.nextLine();
			c.setTelefone(telefone);
			
			System.out.println("Entre com o email: ");
			String email = input.nextLine();
			c.setEmail(email);
			
			contatos[i] = c;
		}
		
		agenda.setContatos(contatos);
		
		if(agenda != null) {
			System.out.println(agenda.mostrarInformacoes());
		}
		
	}

}
