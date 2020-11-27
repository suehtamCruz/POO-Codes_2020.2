package Questoes;

import java.util.Scanner;

public class Questao_07 {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		//String frase  = scanf.nextLine();		
		String frase = "Testa usando o scanf depois professora! ! ! ! !";
		
		CortaFrase(frase);
		
		scanf.close();
	}
	public static void CortaFrase(String frase) {
		
		String palavras [] = frase.split(" ");
		
		for(int i = palavras.length - 1 ; i >= 0 ; i--) {
			System.out.println(palavras[i]);
		}
		
	}
}
