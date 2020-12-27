package Classes;

import javax.swing.JOptionPane;

public class Interface {
	
	public static void main(String[] args) {
		
		String comando = "";
		
		Grafite grafite = new Grafite(10,"4mm",4);
		Lapiseira lapiseira = new Lapiseira(4);
		
		//interativa pra chamar os metodos da lapiseira
		
		while(!comando.equals("1")) {
			comando = JOptionPane.showInputDialog("DIgite seu comando ou tecle 1 para sair");
			if(comando.equals("")) {
				JOptionPane.showMessageDialog(null,"DIGITA AI NA MORAL");
			}
			else if(comando.equals("1")) {
				JOptionPane.showMessageDialog(null,"VOCÊ ESCOLHEU SAIR..");
			}
			else if(comando.equals("inserir")) {
				lapiseira.inserir(grafite);
			}
			else if(comando.equals("remover")) {
				lapiseira.remover();
			}
			else if(comando.equals("escrever")) {
				int pressao = 0;
				pressao = Integer.parseInt( JOptionPane.showInputDialog("INFORME A PESSAO"));
				lapiseira.escrever(pressao);
			}
			else {
				JOptionPane.showMessageDialog(null, "INFORME UM COMANDO VÁLIDO");
			}
		}
 
	}

}
