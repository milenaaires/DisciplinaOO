
public class Escritor extends Pessoa {
	
	private String titulosEscritos;
	private double valorTitulo;
	
	public Escritor(){
		super();
	}
	
	public Escritor (String nom, double val, String email, Telefone t) {
		this.nome = nom;
		this.email= email;
		valorTitulo = val;
		this.numTel = t;
	}
	
	public String toString() {
		return "Nome d@ escritor@: " + nome + ", título escrito: " + titulosEscritos +", valor do título: R$" + valorTitulo;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTitulosEscritos() {
		return titulosEscritos;
	}
	
	public void setTitulosEscritos(String titulosEscritos) {
		this.titulosEscritos = titulosEscritos;
	}
	

	public double getValorTitulo() {
		return valorTitulo;
	}

	public void setVaorTitulo(double valorTitulo) {
		this.valorTitulo = valorTitulo;
	}

	public Telefone getTel() {
		return numTel;
	}

	public void setTel(Telefone tel) {
		this.numTel = tel;
	}
		


}
