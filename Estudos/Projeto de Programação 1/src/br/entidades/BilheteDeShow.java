package br.entidades;
import br.interfaces.IShow;
public class BilheteDeShow extends Bilhete implements IShow {
    
    public BilheteDeShow(double horário, double preço, int quantidade) {
        super(horário, preço, quantidade);
    }
    
}

