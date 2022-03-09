
public class Ebook {

	private String titulo;
	private String categoria;
	private String editora;
	private String sinopse;
	private Date anoPublicacao;
	private double valorEbook;
	private Escritor autor;
	private Venda[] vendasRealizadas = new Venda[100];
	private int numVenda = 0;
	
	public Ebook() {
		super();
	}
	
	public Ebook (String titu, String cat, String edit, String sinop, Date anoPubli, double valEbook, Escritor escr, int total) {
		titulo = titu;
		categoria = cat;
		editora = edit;
		sinopse = sinop;
		anoPublicacao = anoPubli;
		valorEbook = valEbook;
		autor = escr;
		numVenda = total;
	}

	public Venda[] getVenda() {
		return this.vendasRealizadas;
	}
	
	public void setVenda (Venda [] vend) {
		this.vendasRealizadas = vend;
	}

	public int getNumVenda () {
		return numVenda;
	}

	public void setNumVenda (int numVenda) {
		this.numVenda = numVenda;
	}


	public String getTitulo() {
		return titulo;
	}

	public void setTitulo (String titulo) {
		this.titulo = titulo;
	}

	public String getCategoria () {
		return categoria;
	}

	public void setCategoria (String categoria) {
		this.categoria = categoria;
	}

	public String getEditora () {
		return editora;
	}

	public void setEditora (String editora) {
		this.editora = editora;
	}

	public String getSinopse () {
		return sinopse;
	}

	public void setSinopse (String sinopse) {
		this.sinopse = sinopse;
	}

	public Date getAnoPublicacao () {
		return anoPublicacao;
	}

	public void setAnoPublicacai (Date anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public double getValorEbook () {
		return valorEbook;
	}

	public void setValorEbook (double valorEbook) {
		this.valorEbook = valorEbook;
	}

	public Escritor getAutor () {
		return autor;
	}

	public void setAutor (Escritor autor) {
		this.autor = autor;
	}


	public String toString() {
		return "Nome do titulo: " + titulo + ", valor do Ebook:" + valorEbook;
	}
	
	
	
	public Venda getVenda (int i) {
		return vendasRealizadas[i].getVenda();
	}

	public void setCliente (Venda clienteVen, int i) {
		this.vendasRealizadas[i] = clienteVen;
	}
	
	public String consultarVendasRealizadas () {
		String saida = "***** LISTA VENDAS REALIZADAS ***** \n" ;
		for(int i = 0; i < numVenda; i++) {
			System.out.println(i);
			saida = saida + "\n"+ vendasRealizadas[i].getCliente().toString();
		}
		return saida;
	}	
	
}
