package Questoes;

public class Questao_05 {
	public static void main(String[] args) {
		
		long fatorial = 1;
		
		for(int i = 1 ; i <= 40 ; i++) {
			fatorial *= i;
			if(i == 1) {
				System.out.println("fatorial de " + (i-1) + " � : " + fatorial);
				System.out.println("fatorial de " + i + " � : " + fatorial);
			}else {
				System.out.println("fatorial de " + i + " � : " + fatorial);
			}
		}
	}
	public void ExplicandoLong() {
		
		// O fatorial de 1 - 10 acontece sem problema porem quando esse numero vai ficando muito grande o tipo primitivo int nao 
		// suporta o tamanho do numero que vai originando da opera��o dai temos que utilizar o long q suporta um numero COLOSSAL  
		//e assim nossa aplica��o funcionar� sem nenhum problema a n�o ser n�o saber ler tal numero enorme.
		
		//valor m�ximo do tipo int : 2.147.483.647
		// valor m�ximo do tipo long : 9.223.372.036.854.775.807 (sei nem ler esse n�mero);
	}
}
