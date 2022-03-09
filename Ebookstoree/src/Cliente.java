
public class Cliente extends Pessoa {
	
	private String titulosComprados;
	private double valorTituloComprado;
	
	public Cliente(){
		super();
	}
	
	public Cliente (String nom, double val, String email, Telefone t) {
		this.nome = nom;
		this.email= email;
		valorTituloComprado = val;
		this.numTel = t;
	}
	
	public String toString() {
		return "Nome d@ cliente@: " + nome + ", título comprado: " + titulosComprados +", valor do título: R$" + valorTituloComprado;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTitulosComprados() {
		return titulosComprados;
	}
	
	public void setTitulosComprados(String titulosComprados) {
		this.titulosComprados = titulosComprados;
	}
	

	public double getValorTituloComprado() {
		return valorTituloComprado;
	}

	public void setVaorTitulo(double valorTituloComprado) {
		this.valorTituloComprado = valorTituloComprado;
	}

	public Telefone getTel() {
		return numTel;
	}

	public void setTel(Telefone tel) {
		this.numTel = tel;
	}


}
