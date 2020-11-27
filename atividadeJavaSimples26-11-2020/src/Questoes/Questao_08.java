package Questoes;

public class Questao_08 {

	public static void main(String[] args) {
		/*
		int auxiliar = 2;
		int controle = 0;
		System.out.println(auxiliar-1);
		while(controle < 100) {
			controle = (auxiliar-1) + (auxiliar-2);
			
			auxiliar++;
			System.out.println(controle);
		}
		*/
		Fibonacci();
	}
	public static void Fibonacci() {
		long controle = 0;
		System.out.println(1);
		
		for(int i = 2 ; controle < 100 ; i++ ) {
			controle += (i-1) + (i-2);
		
			System.out.println(controle);
		}
	} 
}
