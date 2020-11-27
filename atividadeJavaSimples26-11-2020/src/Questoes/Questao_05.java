package Questoes;

public class Questao_05 {
	public static void main(String[] args) {
		
		long fatorial = 1;
		
		for(int i = 1 ; i <= 40 ; i++) {
			fatorial *= i;
			if(i == 1) {
				System.out.println("fatorial de " + (i-1) + " é : " + fatorial);
				System.out.println("fatorial de " + i + " é : " + fatorial);
			}else {
				System.out.println("fatorial de " + i + " é : " + fatorial);
			}
		}
	}
	public void ExplicandoLong() {
		
		// O fatorial de 1 - 10 acontece sem problema porem quando esse numero vai ficando muito grande o tipo primitivo int nao 
		// suporta o tamanho do numero que vai originando da operação dai temos que utilizar o long q suporta um numero COLOSSAL  
		//e assim nossa aplicação funcionará sem nenhum problema a não ser não saber ler tal numero enorme.
		
		//valor máximo do tipo int : 2.147.483.647
		// valor máximo do tipo long : 9.223.372.036.854.775.807 (sei nem ler esse número);
	}
}
