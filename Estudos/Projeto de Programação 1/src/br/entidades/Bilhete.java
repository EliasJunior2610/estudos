//nome do pacote;
package br.entidades;
//importação;
import java.util.ArrayList;
//inicializando a entidade;
public class Bilhete {

	//atributos da entidade
	public double horário;
	public double preço;
	public int quantidade;
	//criando o ArrayList;
	private ArrayList<String> bilhete;
	
	//configurando os atributos;
	public Bilhete (double horário, double preço, int quantidade) {
		super();
		this.horário = horário;
		this.preço = preço;
		this.quantidade = quantidade;
	}
	
	//inicializando o ArrayList;
	private Bilhete(ArrayList<String> bilhete) {
        bilhete = new ArrayList<String>();
    }

	//getters e setters;
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
	//Crud do ArrayList;
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
