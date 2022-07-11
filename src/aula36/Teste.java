package aula36;

public class Teste {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		
		contato.setNome("Tyrion");
		// contato.setEndereco("Kings Landing");
		// contato.setTelefone("81 9 9999 9999");
		
		//relacionamento tem-um endereco:
		Endereco end = new Endereco();
		end.setNomeRua("Rua Game of Thrones");
		end.setNumero("N/A");
		end.setComplemento("-");
		end.setCidade("Kings Landing");
		end.setEstado("Westeros");
		end.setCep("0000-0000");
		
		contato.setEndereco(end);
		
		//relacionamento tem-um telefone:
		Telefone telefone = new Telefone();
		telefone.setTipo("celular");
		telefone.setDdd("81");
		telefone.setNumero("81 9 9999 9999");
		
		Telefone telefone2 = new Telefone();
		telefone2.setTipo("casa");
		telefone2.setDdd("81");
		telefone2.setNumero("81 3333 3333");
		
		//contato.setTelefone(telefone);
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone;
		telefones[1] = telefone2;
		
		contato.setTelefones(telefones);
		
		// Teste saída no console:
		System.out.println(contato.getNome());
		//System.out.println(contato.getTelefone());
		
		if (contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCidade());
		}
		
		/* if (contato != null && contato.getTelefone() != null) {
			System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
		} */
		
		if (contato != null && contato.getTelefones() != null) {
			for (Telefone t : contato.getTelefones()) {
				System.out.println(t.getDdd() + " " + t.getNumero());
			}
		}
		
	}

}
