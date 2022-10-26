package entidades;

public class Bilhete {

	
	public double horário;
	public double preço;
	public int quantidade;

	public Bilhete (double horário, double preço, int quantidade) {
		super();
		this.horário = horário;
		this.preço = preço;
		this.quantidade = quantidade;
	}

	public double getHorario() {
		return horário;
	}

	public void setHorario(double horário) {
		this.horário = horário;
	}

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
