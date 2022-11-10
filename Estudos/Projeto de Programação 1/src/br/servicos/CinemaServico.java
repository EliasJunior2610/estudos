package br.servicos;
import br.entidades.BilheteDeCinema;
public class CinemaServico {
    public void cadastrar(double preço, double horário, int quantidade) {
        try {
            BilheteDeCinema c1 = new BilheteDeCinema(horário, preço, quantidade);
            c1.setHorario(horário);
            c1.setPreço(preço);
            c1.setQuantidade(quantidade);
        } catch (Exception ex) {
            System.out.println("Erro! O item que você digitou não se encontra na lista!");
        }
    }
}
