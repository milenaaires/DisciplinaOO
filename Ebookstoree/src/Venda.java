import java.util.Date;

public class Venda {
	
	private Cliente cliente;
	private Date data;
	private double valorTituloComprado;
	private Ebook ebook;
	
	public Venda (Cliente cli, Date dat, double valortitu, Ebook ebo) {
		cliente = cli; 
		data = dat;
		valorTituloComprado = valortitu;
		ebook = ebo; 
	}


	public void vender () {
		int qtd;
		Ebook ebo = this.getEbook();
		qtd = ebo.getNumEbook();
		ebo.setVenda(this, qtd);
		ebo.setNumVenda(qtd+1);
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente (Cliente cliente) {
		this.cliente = cliente;
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}


	public double getValorTituloComprado() {
		return valorTituloComprado;
	}


	public void setValorTituloComprado (double valorTituloComprado) {
		this.valorTituloComprado = valorTituloComprado;
	}


	public Ebook getEbook() {
		return ebook;
	}


	public void setEbook (Ebook ebook) {
		this.ebook = ebook;
	}



	@Override
	public String toString() {
		return "Cliente pagou " + cliente + " valorTituloComprado R$ " + valorTituloComprado+ 
				" referente ao Ebook " + ebook.getEbook();
	}



}
