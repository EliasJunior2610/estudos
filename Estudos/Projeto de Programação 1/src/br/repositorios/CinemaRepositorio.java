//nome do pacote;
package br.repositorios;
//importação;
import java.util.ArrayList;
//inicializando o repositório;
public class CinemaRepositorio {
	//criando o ArrayList;
	ArrayList<String> cinemaRepositorio;
	//inicializando o ArrayList;
    public CinemaRepositorio (ArrayList<String> cinemaRepositorio) {
        cinemaRepositorio = new ArrayList<String>();
    }
    //Crud do ArrayList;
    public ArrayList<String> getCinemaRepositorio() {
        return cinemaRepositorio;
    }

    public void setCinemaRepositorio (ArrayList<String> cinemaRepositorio) {
        this.cinemaRepositorio = cinemaRepositorio;
    }

    public void addCinemaRepositorio (String c) {
        cinemaRepositorio.add(c);
    }

    public void removeCinemaRepositorio (String c) {
        try {
            for (int i = 0; i < cinemaRepositorio.size(); i++) {
                if (cinemaRepositorio.get(i) == c) {
                    cinemaRepositorio.remove(i);
                    break;
                }
            }
        } catch (Exception ex) {
            System.out.println("Erro! O item que você digitou não se encontra na lista!");
        }
    }
}
