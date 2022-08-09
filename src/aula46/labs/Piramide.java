package aula46.labs;

public class Piramide extends Figura3D {
	
	private double altura;
	private double arestaBase;
	private double apotema;
	
	private Figura2D base;

	public double getAltura() {
		return altura;
	}

	public double getArestaBase() {
		return arestaBase;
	}

	public double getApotema() {
		return apotema;
	}

	public Figura2D getBase() {
		return base;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void setArestaBase(double arestaBase) {
		this.arestaBase = arestaBase;
	}

	public void setApotema(double apotema) {
		this.apotema = apotema;
	}

	public void setBase(Figura2D base) {
		this.base = base;
	}

}
