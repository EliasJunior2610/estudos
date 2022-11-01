public class BilheteDeFesta extends Bilhete {

    public boolean camarote;

    public BilheteDeFesta(double horário, double preço, int quantidade) {
        super(horário, preço, quantidade);
    }

    public boolean isCamarote() {
        return camarote;
    }

    public void setCamarote(boolean camarote) {
        this.camarote = camarote;
    }

}
