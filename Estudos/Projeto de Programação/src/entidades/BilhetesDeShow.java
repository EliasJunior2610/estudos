package entidades;

public class BilhetesDeShow extends Bilhetes {

    public String nomeDaBanda;
    public boolean camarote;
    
    public BilhetesDeShow(double horário, double preço, int quantidade) {
        super(horário, preço, quantidade);
    }
    public String getNomeDaBanda() {
        return nomeDaBanda;
    }
    public void setNomeDaBanda(String nomeDaBanda) {
        this.nomeDaBanda = nomeDaBanda;
    }
    public boolean isCamarote() {
        return camarote;
    }
    public void setCamarote(boolean camarote) {
        this.camarote = camarote;
    }
    
}
