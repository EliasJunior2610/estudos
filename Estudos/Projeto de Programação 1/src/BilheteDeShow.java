import java.util.ArrayList;

public class BilheteDeShow extends Bilhete implements IShow {
    ArrayList<String> listaShow;
    
    public BilheteDeShow(double horário, double preço, int quantidade) {
        super(horário, preço, quantidade);
    }
    
    public ArrayList<String> getListaShow() {
        return listaShow;
    }

    public void setListaShow (ArrayList<String> listaShow) {
        this.listaShow = listaShow;
    }

    public void addShow (String s) {
        listaShow.add(s);
    }

    public void removeShow (String s) {
        try {
            for (int i = 0; i < (listaShow.size()); i++) {
                if (listaShow.get(i) == s) {
                    listaShow.remove(i);
                    break;
                }
            }
        } catch (Exception ex) {
            System.out.println("Erro! O item que você digitou não se encontra na lista!");
        }
    }
}

