package br.entidades;
import java.util.ArrayList;
public class Bilhete {

	public double horário;
	public double preço;
	public int quantidade;
	private ArrayList<String> bilhete;
	
	public Bilhete (double horário, double preço, int quantidade) {
		super();
		this.horário = horário;
		this.preço = preço;
		this.quantidade = quantidade;
	}
	
	private Bilhete(ArrayList<String> bilhete) {
        bilhete = new ArrayList<String>();
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

	private ArrayList<String> getBilhete() {
        return bilhete;
    }

    private void setBilhete (ArrayList<String> bilhete) {
        this.bilhete = bilhete;
    }

    private void addBilhete (String b) {
        bilhete.add(b);
    }

    private void removeBilhete (String b) {
        try {
            for (int i = 0; i < bilhete.size(); i++) {
                if (bilhete.get(i) == b) {
                    bilhete.remove(i);
                    break;
                }
            }
        } catch (Exception ex) {
            System.out.println("Erro! O item que você digitou não se encontra na lista!");
        }
    }
}
