package ClassesCarro;

public class Carro {

	private int _gas , _gasMax ,_pass , _passMax , _km;
	private static int  _contadorCarros = 0;
	
	
	public Carro() {
		this._gasMax = 100;
		this._passMax = 2;
		Carro._contadorCarros++;
		
		this._km = 0;
		this._gas = 0;
		this._pass = 0;
	}
	
	//GETERS
	public int getPassageiros() {
		return this._pass;
	}
	public int getGasolina() {
		return this._gas;
	}
	public int getKm() {
		return this._km;
	}	
	public int getQuantidadeCarros() {
		return Carro._contadorCarros; 
	}
	
	
	//SETERS
	public void setPassageiros(int pass) {
		if(pass < 0) {
			System.out.println("PASSAGEIRO NEGATIVO?");
			return;
		}
		if(pass <= this._passMax) {
			this._pass = pass;			
		}else {
			System.out.println("MÁXIMO DE PASSAGEIROS : " + this._passMax);
		}
	}
	public void setGasolina(int gas) {
		if(gas < 0) {
			System.out.println("GASOLINA NEGATIVA?");
			return;
		}
		if(gas <= this._gasMax) {
			this._gas = gas;
		}else {
			System.out.println("CAPACIDADE MÁXIMA DO TANQUE : " + this._gasMax);
		}
		
	}
	public void setKm(int km) {
		if(km < 0) {
			System.out.println("KILOMETRAGEM NEGATIVA?");
			return;
		}
		this._km = km;
	}
	
	
	//METODOS DE INTERAÇÃO
	
	public boolean Embarcar() {
		if(this._pass < this._passMax) {
			this._pass++;
			return true;
		}else {
			System.out.println("LIMITE DE PASSAGEIROS ATINGIDO!");
			return false;
		}
	}
	
	public boolean Desemarcar() {
		if(this._pass > 0) {
			this._pass--;
			return true;
		}else {
			System.out.println("EMBARQUE PASSAGEIROS PRIMEIRO");
			return false;
		}
	}

		public void Abastecer(int gas) {
		int gasAbastecida =0;
		
		while((this._gas < this._gasMax) &&( gas > 0)) {
			gas--;
			this._gas++;
			gasAbastecida++;
			if(this._gas == this._gasMax){
				System.out.println("LIMITE DO TANQUE ATINGIDO, FORAM COLOCADOS " + gasAbastecida + " LITROS!");
				return;
			}
		}
	}
	public boolean Dirigir(int km) {
		if(this._gas > 0 && this._pass >=1) {
			int kmRodados=0;
			
			while((km > 0) && ( this._gas > 0 ) && (this._pass >= 1) ) {
				this._km++;
				km--;
				this._gas--;
				kmRodados++;		
			}
			if(this._gas == 0 ) {
				System.out.println("GASOLINA ACABOU BICHO. RODADOS : " + kmRodados);
				return true;
			}else {
				System.out.println("CHEGOU AO FIM DA JORNADA!   ");
				return true;				
			}	
			
		}else {
			if(this._gas == 0) {
				System.out.println("COLOCA GASOLINA AI NA MORAL!");
			}
			if(this._pass<1) {
				System.out.println("TA FALTANDO PASSAGEIRO");
			}
			return false;
		}
	}	
	//esse seria o toString pra mostrar os valores 
	public void Show() {
		System.out.println("");
		System.out.println("QUANTIDADE DE PASSAGEIROS : " + this._pass);	
		System.out.println("QUANTIDADE DE COMBUSTIVEL : " + this._gas);	
		System.out.println("QUANTIDADE DE KM RODADOS : " + this._km);
		System.out.println("");
	}
	
	 
}
