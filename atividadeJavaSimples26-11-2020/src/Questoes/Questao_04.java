package Questoes;

public class Questao_04 {

	public static void main(String[] args) {
		
		int fatorial = 1 ;
		
		for(int i = 1; i <= 10 ; i++) {
			
			fatorial *= i;
			
			if(i == 1 ){
			
				System.out.println("fatorial de " + (i-1) + " � : " + fatorial);
				System.out.println("fatorial de " + i + " � : " + fatorial);
			
			}else {
				
				System.out.println("fatorial de " + i + " � : " + fatorial);
			}
		}
			
	}

}
