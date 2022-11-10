package br.repositorios;
import java.util.ArrayList;
public class FestaRepositorio {
    ArrayList<String> festaRepositorio;

    public FestaRepositorio (ArrayList<String> festaRepositorio) {
        festaRepositorio = new ArrayList<String>();
    }

    public ArrayList<String> getFestaRepositorio() {
        return festaRepositorio;
    }

    public void setFestaRepositorio (ArrayList<String> festaRepositorio) {
        this.festaRepositorio = festaRepositorio;
    }

    public void addFestaRepositorio (String f) {
        festaRepositorio.add(f);
    }

    public void removeFestaRepositorio (String f) {
        try {
            for (int i = 0; i < festaRepositorio.size(); i++) {
                if (festaRepositorio.get(i) == f) {
                    festaRepositorio.remove(i);
                    break;
                }
            }
        } catch (Exception ex) {
            System.out.println("Erro! O item que você digitou não se encontra na lista!");
        }
    }
    
}
