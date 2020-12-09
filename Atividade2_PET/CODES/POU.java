package CODES;

public class POU {

	private int _energiaMaxima, _fomeMaxima , _limpezaMaxima;
	private int _energia , _fome = 0 , _limpeza;
	
	private int _diamantes , _idade;
	private boolean  _estaVivo;
	
	public POU(int energia, int fome , int limpeza) {
		
		this._energiaMaxima = energia;
		this._fomeMaxima = fome;
		this._limpezaMaxima = limpeza;
		
		// aqui setamos a energia e limpeza como a maxima assim que se inicia a classe.
		this._energia = energia;
		this._limpeza = limpeza;
		
		//aqui o POU fica vivo.
		this._estaVivo = true;
	}

	// metodos SetValue em variaveis privadas de controle do jogo.
	
	public void setEnergia (int energia) {
		if(energia > 0) {
			this._energia = energia;
		}else {
			System.out.println("informe um valor maior que 0");
		}
	}
	
	public void setFome(int fome) {
		if(fome > 0) {
			this._fome = fome;
		}else {
			System.out.println("informe um valor maior que 0");
		}
	}
	
	public void setLimpeza (int limpeza) {
		if(limpeza > 0) {
			this._limpeza = limpeza;
		}else {
			System.out.println("informe um valor maior que 0");
		}
		
	}
	//metodos get abaixo
	public int getEnergia() {
		return this._energia;
	}
	
	public int getLimpeza() {
		return this._limpeza;	
	}
	
	public int getFome() {
		return this._fome;
	}
	
	public int getDiamantes() {
		return this._diamantes;
	}
	
	public int getIdade() {
		return this._idade;
	}
	
	//metodos de controle abaixo , traduzi pra tentar deixar mais intuitiva a expêrincia.
	
	public void Jogar() {
		
		if(_estaVivo && (this._energia > 0 && this._limpeza > 0 && this._fome < 100)) {
			System.out.println("SEU PET ESTÁ BRINCANDO!");
			
			this._idade++;
			
			this._diamantes++;
			this._fome++;
			this._energia--;
			this._limpeza--;	
			
			if(this._fome == this._fomeMaxima) {
				this._estaVivo = false;
				System.out.println("SEU PET MORREU DE FOME!");
			}
			if(this._limpeza == 0) {
				System.out.println("SEU PET MORREU PODRE");
			}
			if(this._energia == 0) {
				System.out.println("SEU PET MORREU SEM ENERGIA");
			}
		
		}
		else {
			this._estaVivo = false;
			System.out.println("BICHO MORTO NÃO JOGA!");
		}
	}
	
	public void Banhar() {
		if(_estaVivo && (this._energia > 0 && this._limpeza > 0 && this._fome < 100)) {
			System.out.println("SEU PET ESTÁ TOMANDO BANHO!");
			this._idade++;
			
			this._fome++;
			this._energia--;	
			
			if(this._fome == this._fomeMaxima) {
				this._estaVivo = false;
				System.out.println("SEU PET MORREU DE FOME!");
			}
			
			if(this._limpeza < this._limpezaMaxima) {
				this._limpeza++;				
			}
			if(this._energia == 0) {
				System.out.println("SEU PET MORREU SEM ENERGIA");
			}
	
		}
		else {
			this._estaVivo =false;
			System.out.println("BICHO MORTO NÃO TOMA BANHO!");
		}
	}
	
	public void Comer() {
		
		if(_estaVivo && (this._energia > 0 && this._limpeza > 0 && this._fome < 100)) {
			System.out.println("SEU PET ESTÁ COMENDO!");

			this._idade++;
			
			this._limpeza--;
			
			if(this._energia < this._energiaMaxima){				
				this._energia++;
			}
			
			if(this._limpeza == 0) {
				System.out.println("SEU PET MORREU PODRE");
			}
			
			if(this._fome > 0) {
				this._fome--;				
			}
			
		}
		else {
			this._estaVivo = false;
			System.out.println("BICHO MORTO NÃO COME!");
		}
	}
	
	public void Dormir() {
		if(_estaVivo && (this._energia > 0 && this._limpeza > 0 && this._fome < 100)) {
			System.out.println("SEU PET ESTÁ DORMINDO!");
			
			this._idade++;
			
			if(this._energia < this._energiaMaxima){				
				this._energia++;
			}

		}
		else {
			this._estaVivo =false;
			System.out.println("ELE ESTÁ DORMINDO PARA SEMPRE!");
		}
	}
	
	public void Show() {
		System.out.println("");
		System.out.println("ENERGIA : " + this._energia + " DE : " + this._energiaMaxima);
		System.out.println("FOME : "+ this._fome + " DE : " + this._fomeMaxima);
		System.out.println("LIMPEZA : " + this._limpeza + " DE : " + this._limpezaMaxima);
		System.out.println("DIAMENTES : " + this._diamantes);
		System.out.println("IDADE : " + this._idade + " ANOS");
		System.out.println("");
	}
	
}
