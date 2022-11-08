import java.util.ArrayList;

public class BilheteDeTeatro extends Bilhete implements ITeatro {
    ArrayList<String> listaTeat;

    public BilheteDeTeatro(double horário, double preço, int quantidade) {
        super(horário, preço, quantidade);
    }
    
    public ArrayList<String> getListaTeat() {
        return listaTeat;
    }

    public void setListaTeat (ArrayList<String> listaTeat) {
        this.listaTeat = listaTeat;
    }

    public void addTeat (String t) {
        listaTeat.add(t);
    }

    public void removeTeat (String t) {
        try {
            for (int i = 0; i < (listaTeat.size()); i++) {
                if (listaTeat.get(i) == t) {
                    listaTeat.remove(i);
                    break;
                }
            }
        } catch (Exception ex) {
            System.out.println("Erro! O item que você digitou não se encontra na lista!");
        }
    }
}