package Classes;

public class Grafite {
	protected int _tamanho;
	protected double _calibre;
	private String _dureza;
	
	public Grafite(int tamanho , String dureza , double calibre) {
		this._calibre = calibre;
		this._dureza = dureza;
		this._tamanho = tamanho;
	}
	
	public double getCalibre() {
		return _calibre;
	}
	
	public int getTamanho() {
		return _tamanho;
	}
	
	public String getDureza() {
		return _dureza;
	}
}
