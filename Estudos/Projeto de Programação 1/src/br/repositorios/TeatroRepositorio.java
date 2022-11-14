//nome do pacote;
package br.repositorios;
//importação;
import java.util.ArrayList;
//inicializando o repositório;
public class TeatroRepositorio {
	//criando o ArrayList;
    ArrayList<String> teatroRepositorio;
    //inicializando o ArrayList;
    public TeatroRepositorio (ArrayList<String> teatroRepositorio) {
        teatroRepositorio = new ArrayList<String>();
    }
    //Crud do ArrayList;
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
