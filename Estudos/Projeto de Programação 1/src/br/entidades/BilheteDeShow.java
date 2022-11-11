package br.entidades;
import br.interfaces.IShow;
import java.util.ArrayList;
public class BilheteDeShow extends Bilhete implements IShow {
	private ArrayList<String> bilhete;
	
    public BilheteDeShow(double horário, double preço, int quantidade) {
        super(horário, preço, quantidade);
    }
    
    private void Bilhete(ArrayList<String> bilhete) {
    	bilhete = new ArrayList<String>();
    }
    
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

