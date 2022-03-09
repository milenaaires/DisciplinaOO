
public class Telefone {

	private int DDD;
	private int numero;
	

	public Telefone(int estado, int num) {
		DDD = estado;
		numero = num;
	}
	
	public Telefone() {
		
	}
	
	public String toString() {
		return "Telefone: (" + DDD + ") " + numero;
	}

	public int getDDD() {
		return DDD;
	}


	public void setDDD(int dDD) {
		DDD = dDD;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}

}
