package aula22;

import java.util.Random;

public class Exerc02 {

	public static void main(String[] args) {
		
		int[][] M = new int[10][10];
		int maiorL5 = 0, menorL5 = 0;
		int maiorC7 = 0, menorC7 = 0;
		
		Random numeroRandom = new Random();
		
		for (int lin=0; lin<M.length; lin++) {
			for (int col=0; col<M.length; col++) {
				M[lin][col] = numeroRandom.nextInt(100);
				if (lin == 5) {
					if (M[lin][col] > maiorL5) {
						maiorL5 = M[lin][col];
					}
					else if (M[lin][col] < menorL5) {
						menorL5 = M[lin][col];
					}
				}
				if (col == 7) {
					if (M[lin][col] > maiorC7) {
						maiorC7 = M[lin][col];
					}
					else if (M[lin][col] < menorC7) {
						menorC7 = M[lin][col];
					}
				}
			}
		}
		
		System.out.println("O maior valor da linha 5 é: "+maiorL5);
		System.out.println("O menor valor da linha 5 é: "+menorL5);
		System.out.println("O maior valor da coluna 7 é: "+maiorC7);
		System.out.println("O menor valor da coluna 7 é: "+menorC7);
		
		
		

	}

}
