package entidades;

public class BilhetesDeFesta extends Bilhetes {

    public boolean camarote;

    public BilhetesDeFesta(double horário, double preço, int quantidade) {
        super(horário, preço, quantidade);
    }

    public boolean isCamarote() {
        return camarote;
    }

    public void setCamarote(boolean camarote) {
        this.camarote = camarote;
    }

}
