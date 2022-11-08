import java.util.ArrayList;
public class BilheteDeCinema extends Bilhete implements ICinema{ 
    ArrayList<String> listaCin;
    
    public BilheteDeCinema(double horário, double preço, int quantidade) {
        super(horário, preço, quantidade);
        listaCin = new ArrayList<>();
    }
    
    public ArrayList<String> getListaCin() {
        return listaCin;
    }

    public void setListaCin (ArrayList<String> listaCin) {
        this.listaCin = listaCin;
    }

    public void addCin (String c) {
        listaCin.add(c);
    }

    public void removeCin (String c) {
        try {
            for (int i = 0; i < (listaCin.size()); i++) {
                if (listaCin.get(i) == c) {
                    listaCin.remove(i);
                    break;
                }
            }
        } catch (Exception ex) {
            System.out.println("Erro! O item que você digitou não se encontra na lista!");
        }
    }
}
