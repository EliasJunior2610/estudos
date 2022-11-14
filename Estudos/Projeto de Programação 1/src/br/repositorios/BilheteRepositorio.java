//nome do pacote;
package br.repositorios;
//importação;
import java.util.ArrayList;
//inicializando o repositório;
public class BilheteRepositorio {
	//criando o ArrayList;
	ArrayList<String> bilheteRepositorio;
	//inicializando o ArrayList;
    public BilheteRepositorio (ArrayList<String> bilheteRepositorio) {
        bilheteRepositorio = new ArrayList<String>();
    }
    //Crud do ArrayList;
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
