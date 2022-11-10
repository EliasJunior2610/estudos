package br.entidades;
import br.interfaces.ICinema;
public class BilheteDeCinema extends Bilhete implements ICinema{ 
    
    public BilheteDeCinema(double horário, double preço, int quantidade) {
        super(horário, preço, quantidade);
    }
        
}
