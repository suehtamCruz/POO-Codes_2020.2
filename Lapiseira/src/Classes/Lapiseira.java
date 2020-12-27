package Classes;

import javax.swing.JOptionPane;

public class Lapiseira {
	private double calibre;
	Grafite grafite = null;
	
	public Lapiseira(double calibre) {
		this.calibre = calibre;
	}
	
	public String inserir(Grafite grafite) {
		if(getCalibre() == grafite._calibre) {
			this.grafite = grafite;
			JOptionPane.showMessageDialog(null,"GRAFITE INSERIDO COM SUCESSO!");
			return "GRAFITE INSERIDO COM SUCESSO!";
		}else {
			JOptionPane.showMessageDialog(null,"INSIRA UM GRAFITE COM CALIBRE COMPATIVEL AO DA LAPISEIRA");
			return "INSIRA UM GRAFITE COM CALIBRE COMPATIVEL AO DA LAPISEIRA";
		}
	}
	public String remover() {
		
		this.grafite = null;
		JOptionPane.showMessageDialog(null, "GRAFITE RETIRADO COM SUCESSO!");	
		return "GRAFITE RETIRADO COM SUCESSO!";
		
}
	
	public String escrever(int pressao) {
		
		if(this.grafite == null) {
			JOptionPane.showMessageDialog(null, "COMO QUE ESCREVE SEM GRAFITE IRMÃO..");
			return "COMO QUE ESCREVE SEM GRAFITE IRMÃO..";
		}
		else{
			pressao *=2;
			int folhas_escritas = 0;
			while(pressao  <= this.grafite._tamanho && this.grafite._tamanho > 0) {
				
				if((this.grafite._tamanho -= pressao) >= 0) {
						this.grafite._tamanho -= pressao;
						folhas_escritas++;
				}else{
					JOptionPane.showMessageDialog(null,"FICOU PELA METADE");
					return "FICOU PELA METADE";
				}
				
			}
			if(this.grafite._tamanho <= 0){
				this.grafite._tamanho = 0;
				this.grafite = null;
				JOptionPane.showMessageDialog(null,"ACABOU O GRAFITE PARÇA");
				return "ACABOU O GRAFITE PARÇA";
			}
			JOptionPane.showMessageDialog(null,"Escrito " + folhas_escritas + " folhas ");
			JOptionPane.showMessageDialog(null,"Restando " + this.grafite._tamanho + " grafite");
			return "Escrito " + folhas_escritas + " folhas. \n Restando " + this.grafite._tamanho + " grafite";
		}
		
	}
	
	public double getCalibre() {
		return calibre;
	}
}
