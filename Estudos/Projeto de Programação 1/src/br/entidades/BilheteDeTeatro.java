package br.entidades;
import br.interfaces.ITeatro;
public class BilheteDeTeatro extends Bilhete implements ITeatro {

    public BilheteDeTeatro(double horário, double preço, int quantidade) {
        super(horário, preço, quantidade);
    }
    
}