package br.servicos;
import br.entidades.BilheteDeTeatro;
public class TeatroServico {
	//criamos um método cadastrar e dentro dele, instanciamos um novo bilhete e configuramos os atributos dessa instância
	public void cadastrar(double preço, double horário, int quantidade) {
		// try irá tentar colocar um novo valor para os atributos 
		try {
            BilheteDeTeatro t1 = new BilheteDeTeatro(horário, preço, quantidade);
            t1.setHorario(horário);
            t1.setPreço(preço);
            t1.setQuantidade(quantidade);
        } //catch irá se ativar caso o bloco acima dê erro
		catch (Exception ex) {
            System.out.println("Erro!");
        }
    }
}
