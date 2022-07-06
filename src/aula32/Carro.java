package aula32;

//AULA SOBRE ENCAPSULAMENTO (M�TODOS GET E SET)

//ENCAPSULAMENTO � UMA FORMA DE CHAMAR UM ATRIBUTO QUE FOI DECLARADO COMO PRIVATO EM ALGUMA CLASSE.
//OS ATRUBUTOS OU M�TODOS DECLARADOS COM O MODIFICADOR DE ACESSO DO TIPO PRIVATE S� PODEM SER
//UTILIZADOS DENTRO DA PR�PRIA CLASSE EM QUE ELES FORAM DECLARADOS.
//COM O ENCAPSULAMENTO, ELES PODEM SER CHAMADOS POR OUTRAS CLASSES ATRAV�S DE SEUS M�TODOS GET E SET

public class Carro {

	private String marca;
	private String modelo;
	private int numPassageiros;
	private double capCombustivel;
	private double consumoCombustivel;
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getNumPassageiros() {
		return numPassageiros;
	}
	public void setNumPassageiros(int numPassageiros) {
		this.numPassageiros = numPassageiros;
	}
	public double getCapCombustivel() {
		return capCombustivel;
	}
	public void setCapCombustivel(double capCombustivel) {
		this.capCombustivel = capCombustivel;
	}
	public double getConsumoCombustivel() {
		return consumoCombustivel;
	}
	public void setConsumoCombustivel(double consumoCombustivel) {
		this.consumoCombustivel = consumoCombustivel;
	}
}
