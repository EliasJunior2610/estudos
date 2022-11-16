package br.servicos;
import br.entidades.BilheteDeShow;
public class ShowServico {
	//criamos um método cadastrar e dentro dele, instanciamos um novo bilhete e configuramos os atributos dessa instância
	public void cadastrar(double preço, double horário, int quantidade) {
		// try irá tentar colocar um novo valor para os atributos
		try {
            BilheteDeShow s1 = new BilheteDeShow(horário, preço, quantidade);
            s1.setHorario(horário);
            s1.setPreço(preço);
            s1.setQuantidade(quantidade);
        } //catch irá se ativar caso o bloco acima dê erro
		catch (Exception ex) {
            System.out.println("Erro!");
        }
    }    
}
