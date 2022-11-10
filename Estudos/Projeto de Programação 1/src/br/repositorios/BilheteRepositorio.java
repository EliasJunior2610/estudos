package br.repositorios;
import java.util.ArrayList;
public class BilheteRepositorio {
    ArrayList<String> bilheteRepositorio;

    public BilheteRepositorio (ArrayList<String> bilheteRepositorio) {
        bilheteRepositorio = new ArrayList<String>();
    }

    public ArrayList<String> getBilheteRepositorio() {
        return bilheteRepositorio;
    }

    public void setBilheteRepositorio (ArrayList<String> bilheteRepositorio) {
        this.bilheteRepositorio = bilheteRepositorio;
    }

    public void addBilheteRepositorio (String b) {
        bilheteRepositorio.add(b);
    }

    public void removeBilheteRepositorio (String b) {
        try {
            for (int i = 0; i < bilheteRepositorio.size(); i++) {
                if (bilheteRepositorio.get(i) == b) {
                    bilheteRepositorio.remove(i);
                    break;
                }
            }
        } catch (Exception ex) {
            System.out.println("Erro! O item que você digitou não se encontra na lista!");
        }
    }
}
