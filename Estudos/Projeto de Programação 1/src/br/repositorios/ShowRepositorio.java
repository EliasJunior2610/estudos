//nome do pacote;
package br.repositorios;
//importação;
import java.util.ArrayList;
//inicializando o repositório;
public class ShowRepositorio {
	//criando o ArrayList;
	ArrayList<String> showRepositorio;
	//inicializando o ArrayList;
    public ShowRepositorio (ArrayList<String> showRepositorio) {
        showRepositorio = new ArrayList<String>();
    }
    //Crud do ArrayList;
    public ArrayList<String> getShowRepositorio() {
        return showRepositorio;
    }

    public void setShowRepositorio (ArrayList<String> showRepositorio) {
        this.showRepositorio = showRepositorio;
    }

    public void addShowRepositorio (String s) {
        showRepositorio.add(s);
    }

    public void removeShowRepositorio (String s) {
        try {
            for (int i = 0; i < showRepositorio.size(); i++) {
                if (showRepositorio.get(i) == s) {
                    showRepositorio.remove(i);
                    break;
                }
            }
        } catch (Exception ex) {
            System.out.println("Erro! O item que você digitou não se encontra na lista!");
        }
    }
}
