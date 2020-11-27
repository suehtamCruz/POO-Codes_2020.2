package Questoes;

public class Questao_06 {
	public static void main(String[] args) {
		
		long  fibonacci [] = new long[100];
		
		fibonacci[0] = 1;
		fibonacci[1] = 1;
		
		for(int i = 2 ; i < 100 ; i ++) {
			fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
		}
		for(int i = 0 ; i < fibonacci.length ; i++) {
			System.out.println( fibonacci[i] );
		}
	}
}
