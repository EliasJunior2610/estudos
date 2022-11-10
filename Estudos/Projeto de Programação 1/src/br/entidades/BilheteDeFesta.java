package br.entidades;
import br.interfaces.IFesta;
public class BilheteDeFesta extends Bilhete implements IFesta{
    
    public BilheteDeFesta(double horário, double preço, int quantidade) {
        super(horário, preço, quantidade);     
    }

}
