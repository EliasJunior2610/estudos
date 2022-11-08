import java.util.ArrayList;

public class Bilhete {

	public double horário;
	public double preço;
	public int quantidade;
	ArrayList<String> listaBil;

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

	public ArrayList<String> getListaBil() {
        return listaBil;
    }

    public void setListaBil (ArrayList<String> listaBil) {
        this.listaBil = listaBil;
    }

    public void addBil (String b) {
        listaBil.add(b);
    }

    public void removeBil (String b) {
        try {
            for (int i = 0; i < (listaBil.size()); i++) {
                if (listaBil.get(i) == b) {
                    listaBil.remove(i);
                    break;
                }
            }
        } catch (Exception ex) {
            System.out.println("Erro! O item que você digitou não se encontra na lista!");
        }
    }
}
