package aula34.labs;

import java.util.Scanner;

// Quest�o 2: Escreva uma classe Calculadora que tenha os seguintes m�todos:
// somar; subtrair; multiplicar; dividir (dois n�meros); elevar � pot�ncia n; 
// Desenvolva um programa para testar essa classe

public class Calculadora {
	
	private static double res;
	private static double numSoma;
	private static double numSub;
	private static double numMult;
	private static double numDiv;
	private static double numPot;

	public Calculadora() {
		super();
	}
	
	public static void lerNumero() {
		Scanner input = new Scanner(System.in);
		System.out.println("Entre com um n�mero:");
		res = input.nextInt();
	}
	
	public static void somar() {
		System.out.println("Entre com um n�mero para somar:");
		Scanner input = new Scanner(System.in);
		numSoma = input.nextInt();
		res += numSoma;
	}
	
	public static void subtrair() {
		System.out.println("Entre com um n�mero para subtrair");
		Scanner input = new Scanner(System.in);
		numSub = input.nextInt();
		res -= numSub;
	}
	
	public static void multiplicar() {
		System.out.println("Entre com um n�mero para multiplicar: ");
		Scanner input = new Scanner(System.in);
		numMult = input.nextInt();
		res *= numMult;
	}
	
	public static void dividir() {
		System.out.println("Ente com um n�mero para dividir:");
		Scanner input = new Scanner(System.in);
		numDiv = input.nextInt();
		res /= numDiv;
	}
	
	public static void elevarPotencia() {
		System.out.println("Entre com um n�mero para fazer a potencia��o: ");
		Scanner input = new Scanner(System.in);
		numPot = input.nextInt();
		res = Math.pow(res, numPot);
	}
	
	public static double mostrarResultado() {
		return res;
	}
	

}
