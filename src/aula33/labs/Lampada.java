package aula33.labs;

//QUESTÃO 1: ESCREVA UMA CLASSE PARA REPRESENTAR UMA LÂMPADA E 
//DESENVOLVA MÉTODOS PARA LIGAR E DESLIGAR A LÂMPADA
//UTILIZE OS CONCEITOS DE ENCAPSULAMENTO, SOBRECARGA E PALAVRA-CHAVE THIS

public class Lampada {
	
	private String modelo;
	private String tensao;
	private int potencia;
	private String cor;
	private String tipoLuz;
	private int garantiaMeses;
	private String[] tipos;
	private boolean tipoAbajour;
	private boolean ligada;
	
	public Lampada() {
		super();
    }
	
	public Lampada(String modelo, String tensao, int potencia, String cor, String tipoLuz, int garantiaMeses,
			String[] tipos, boolean tipoAbajour, boolean ligada) {
		super();
		this.modelo = modelo;
		this.tensao = tensao;
		this.potencia = potencia;
		this.cor = cor;
		this.tipoLuz = tipoLuz;
		this.garantiaMeses = garantiaMeses;
		this.tipos = tipos;
		this.tipoAbajour = tipoAbajour;
		this.ligada = ligada;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public String getTensao() {
		return tensao;
	}
	
	public int getPotencia() {
		return potencia;
	}
	
	public String getCor() {
		return cor;
	}
	
	public String getTipoLuz() {
		return tipoLuz;
	}
	
	public int getGarantiaMeses() {
		return garantiaMeses;
	}
	
	public String[] getTipos() {
		return tipos;
	}
	
	public boolean isTipoAbajour() {
		return tipoAbajour;
	}
	
	public boolean isLigada() {
		return ligada; // return ligada; é o mesmo que return ligada = true;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void setTensao(String tensao) {
		this.tensao = tensao;
	}
	
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void setTipoLuz(String tipoLuz) {
		this.tipoLuz = tipoLuz;
	}
	
	public void setGarantiaMeses(int garantiaMeses) {
		this.garantiaMeses = garantiaMeses;
	}
	
	public void setTipos(String[] tipos) {
		this.tipos = tipos;
	}
	
	public void setTipoAbajour(boolean tipoAbajour) {
		this.tipoAbajour = tipoAbajour;
	}
	
	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
	
	public void ligar() {
		setLigada(true);  // isso é o mesmo que colocar: ligada = true;
	} 
	
	public void desligar() {
		setLigada(false); // isso é o mesmo que colocar: ligada = false;
	}
	
	public void mostrarEstado() {
		if (ligada) {
			System.out.println("A lâmpada está ligada.");
		} else {
			System.out.println("A lâmpada está desligada.");
		}
	}
	
	public void mudarEstado() {
		if (ligada) { // if(ligada) é o mesmo que if(ligada=true)
			desligar();
		} else {
			ligar();
		}
	}
}
