package aula22;

import java.util.Random;

public class aula23 {

	public static void main(String[] args) {
		
		int[] notas = new int[10];
		
		Random random = new Random();
		
		System.out.println("Usando for:");
		
		for (int i=0; i<notas.length; i++) {
			notas[i] = random.nextInt(10);
			System.out.println(notas[i]);
		}
		
		System.out.println();
		System.out.println("Usando o for each: ");
		
		for (int nota : notas) {
			System.out.println(nota);
		}
		
		System.out.println();
		System.out.println("Usando for each com array de 2 dimensões: ");
		
		double[][] notasAlunos = new double[2][3];
		
		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 9;
		
		notasAlunos[1][0] = 9;
		notasAlunos[1][1] = 8;
		notasAlunos[1][2] = 9;
		
		for (double[] notasAluno : notasAlunos) {
			for (double nota : notasAluno) {
				System.out.println(nota + " ");
			}
			System.out.println();
		}
		
		
		
	}

}
