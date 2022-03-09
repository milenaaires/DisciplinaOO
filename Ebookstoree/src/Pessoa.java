
public abstract class Pessoa {
	
	protected String nome;
	protected String email;
	protected Telefone numTel;
	
	public Pessoa() {
		super();
	}
	
	public String getNome() {
		return nome; 
	}
	
	public void setNome() {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail() {
		this.email = email;
	}
	
	public Telefone getNumTel() {
		return numTel;
	}


	public void setNumTel(Telefone numTel) {
		this.numTel = numTel;
	}


}
