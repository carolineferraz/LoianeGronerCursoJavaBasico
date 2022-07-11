package aula35.labs;

// Quest�o 1/2: Escreva um m�todo recursivo e est�tico que calcule e retorne o N-�simo termo da sequ�ncia de Fibonacci.
// Alguns n�meros dessa sequ�ncia s�o: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89...

public class Calculadora {
    
    public static int fibonacci(int num){
        
        if (num < 2){
            return 1;
        }
        
        return fibonacci(num-1) + fibonacci(num-2);
    }
    
    // 5 = 5 + somatorio(4)
    // 4 = 4 + somatorio(3)
    // 3 = 3 + somatorio(2)
    // 2 = 2 + somatorio(1)
    // 1 = 1
    public static int somatorio(int num){
        
        if (num == 1){
            return 1;
        }
        
        return num + somatorio(num-1);
    }
}