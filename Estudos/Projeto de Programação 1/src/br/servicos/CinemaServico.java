package br.servicos;
//irá importar a entidade de bilhetes
import br.entidades.BilheteDeCinema;
public class CinemaServico {
	//criamos um método cadastrar e dentro dele instanciamos um novo bilhete e configuramos os atributos dessa instância
	public void cadastrar(double preço, double horário, int quantidade) {
		// try irá tentar colocar um novo valor para os atributos
		try {
            BilheteDeCinema c1 = new BilheteDeCinema(horário, preço, quantidade);
            c1.setHorario(horário);
            c1.setPreço(preço);
            c1.setQuantidade(quantidade);
        } //catch irá se ativar caso o bloco acima dê erro 
		catch (Exception ex) {
            System.out.println("Erro!");
        }
    }
}
