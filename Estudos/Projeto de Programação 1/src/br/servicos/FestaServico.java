package br.servicos;
//irá importar a entidade de bilhetes
import br.entidades.BilheteDeFesta;
public class FestaServico {
	//criamos um método cadastrar e dentro dele instanciamos um novo bilhete e configuramos os atributos dessa instância
	public void cadastrar(double preço, double horário, int quantidade) {
		// try irá tentar colocar um novo valor para os atributos
		try {
            BilheteDeFesta f1 = new BilheteDeFesta(horário, preço, quantidade);
            f1.setHorario(horário);
            f1.setPreço(preço);
            f1.setQuantidade(quantidade);
        } //catch irá se ativar caso o bloco acima dê erro
        catch (Exception ex) {
            System.out.println("Erro!");
        }
    }    
}
