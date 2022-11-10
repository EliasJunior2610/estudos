package br.repositorios;
import java.util.ArrayList;
public class TeatroRepositorio {
    ArrayList<String> teatroRepositorio;

    public TeatroRepositorio (ArrayList<String> teatroRepositorio) {
        teatroRepositorio = new ArrayList<String>();
    }

    public ArrayList<String> getTeatroRepositorio() {
        return teatroRepositorio;
    }

    public void setTeatroRepositorio (ArrayList<String> teatroRepositorio) {
        this.teatroRepositorio = teatroRepositorio;
    }

    public void addTeatroRepositorio (String t) {
        teatroRepositorio.add(t);
    }

    public void removeTeatroRepositorio (String t) {
        try {
            for (int i = 0; i < teatroRepositorio.size(); i++) {
                if (teatroRepositorio.get(i) == t) {
                    teatroRepositorio.remove(i);
                    break;
                }
            }
        } catch (Exception ex) {
            System.out.println("Erro! O item que você digitou não se encontra na lista!");
        }
    }
}
