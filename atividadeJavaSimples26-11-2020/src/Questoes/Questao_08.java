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
		int controle = 0;
		int aux1 = 0,aux2=1;
		
		System.out.println(aux1);
		System.out.println(aux2);
		
		for(int i = 2 ; controle < 30 ; i++ ) {
			
			controle = aux1 + aux2;
			aux1 = aux2;
			aux2 = controle;
			
			System.out.println(controle);
		}
	} 
}
