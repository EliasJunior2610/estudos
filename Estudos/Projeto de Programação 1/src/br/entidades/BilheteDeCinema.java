//nome do pacote;
package br.entidades;
//importações;
import br.interfaces.ICinema;
import java.util.ArrayList;
//inicializando a entidade;
public class BilheteDeCinema extends Bilhete implements ICinema{ 
	//criando o ArrayList;
	private ArrayList<String> bilhete;
	//herdando atributos da entidade mãe;
    public BilheteDeCinema(double horário, double preço, int quantidade) {
        super(horário, preço, quantidade);
    }
    //inicializando o ArrayList;
    private void Bilhete(ArrayList<String> bilhete) {
    	bilhete = new ArrayList<String>();
    }
    //Crud do ArrayList;
    private ArrayList<String> getBilhete() {
        return bilhete;
    }

    private void setBilhete (ArrayList<String> bilhete) {
        this.bilhete = bilhete;
    }

    private void addBilhete (String c) {
    	bilhete.add(c);
    }

    private void removeBilhete (String c) {
        try {
            for (int i = 0; i < bilhete.size(); i++) {
                if (bilhete.get(i) == c) {
                	bilhete.remove(i);
                    break;
                }
            }
        } catch (Exception ex) {
            System.out.println("Erro! O item que você digitou não se encontra na lista!");
        }
    }    
}
