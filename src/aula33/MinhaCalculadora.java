package aula33;

//AULA SOBRE SOBRECARGA
//SOBRECARGA É O ATO DE DE REESCREVER UM MÉTODO PORÉM MUDANDO A ASUA ASSINATURA
//TER UMA ASSINATURA DIFERENTE SIGNIFICA:
//1- TER O TIPO DE DADO DIFERENTE, OU
//2- TER QUANTIDADE DE PARÂMETROS DIFERENTES, OU
//3- TER UM RETORNO (RETURN) DIFERENTE

public class MinhaCalculadora {

	public int soma(int num1, int num2){
		return num1 + num2;
	}
	
	public double soma(double num1, double num2){
		return num1 + num2;
	}
	
	public int soma(int num1, int num2, int num3){
		return num1 + num2 + num3;
	}
	
	public int soma(int[] vetorInteiros){
		
		int total = 0;
		
		for (int i=0; i<vetorInteiros.length; i++){
			total += vetorInteiros[i];
		}
		
		return total;
	}
}
