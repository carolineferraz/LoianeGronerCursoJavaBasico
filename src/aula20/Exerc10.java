package aula20;

import java.util.Scanner;

public class Exerc10 {

	public static void main (String args[]) {
	
	Scanner scan = new Scanner(System.in);
	
	int[] vetorA = new int[10];
	int[] vetorB = new int[10];
	
	for (int i=0; i<vetorA.length; i++) {
		
		System.out.printf("Entre com o valor do Vetor A na posição %d: ",i+1);
		vetorA[i] = scan.nextInt();
	}
	
	for (int i=0; i<vetorB.length; i++) {
		
		vetorB[i] = vetorA[i] % 2;
		System.out.println("O valor do Vetor B na posição "+i+" é: "+vetorB[i]);
	}
	
	
	}

}
