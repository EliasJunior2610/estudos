package entidades;

public class BilheteDeShow extends Bilhete {

    public String nomeDaBanda;
    public boolean camarote;
    
    public BilheteDeShow(double horário, double preço, int quantidade) {
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
