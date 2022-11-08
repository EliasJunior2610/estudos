import java.util.ArrayList;

public class BilheteDeFesta extends Bilhete {

    public boolean camarote;
    ArrayList<String> listaFes;

    public BilheteDeFesta(double horário, double preço, int quantidade) {
        super(horário, preço, quantidade);
        listaFes = new ArrayList<>();
    }

    public boolean isCamarote() {
        return camarote;
    }

    public void setCamarote(boolean camarote) {
        this.camarote = camarote;
    }

    public ArrayList<String> getListaFes() {
        return listaFes;
    }

    public void setListaFes (ArrayList<String> listaFes) {
        this.listaFes = listaFes;
    }

    public void addFes (String f) {
        listaFes.add(f);
    }

    public void removeFes (String f) {
        try {
            for (int i = 0; i < (listaFes.size()); i++) {
                if (listaFes.get(i) == f) {
                    listaFes.remove(i);
                    break;
                }
            }
        } catch (Exception ex) {
            System.out.println("Erro! O item que você digitou não se encontra na lista!");
        }
    }
}
