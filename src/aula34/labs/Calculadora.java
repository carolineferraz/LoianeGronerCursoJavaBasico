package aula34.labs;

import java.util.Scanner;

// Questão 2: Escreva uma classe Calculadora que tenha os seguintes métodos:
// somar; subtrair; multiplicar; dividir (dois números); elevar à potência n; 
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
		System.out.println("Entre com um número:");
		res = input.nextInt();
	}
	
	public static void somar() {
		System.out.println("Entre com um número para somar:");
		Scanner input = new Scanner(System.in);
		numSoma = input.nextInt();
		res += numSoma;
	}
	
	public static void subtrair() {
		System.out.println("Entre com um número para subtrair");
		Scanner input = new Scanner(System.in);
		numSub = input.nextInt();
		res -= numSub;
	}
	
	public static void multiplicar() {
		System.out.println("Entre com um número para multiplicar: ");
		Scanner input = new Scanner(System.in);
		numMult = input.nextInt();
		res *= numMult;
	}
	
	public static void dividir() {
		System.out.println("Ente com um número para dividir:");
		Scanner input = new Scanner(System.in);
		numDiv = input.nextInt();
		res /= numDiv;
	}
	
	public static void elevarPotencia() {
		System.out.println("Entre com um número para fazer a potenciação: ");
		Scanner input = new Scanner(System.in);
		numPot = input.nextInt();
		res = Math.pow(res, numPot);
	}
	
	public static double mostrarResultado() {
		return res;
	}
	

}
